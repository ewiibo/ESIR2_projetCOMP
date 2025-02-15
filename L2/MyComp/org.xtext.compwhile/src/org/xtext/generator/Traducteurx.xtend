package org.xtext.generator

import java.util.ArrayList


class Traducteurx {
	TroisAdd code3
	TableSymbole ts

	def Traducteurx(TroisAdd code3, TableSymbole ts) {
		this.code3 = code3
		this.ts = ts
	}

	def translate(String className) {
		var str = ""
		for (key : code3.code3AddressH.keySet) {
			var func = ts.getTableSymbFunc().get(key)
			for (v : func.varIn)
				func.vars.remove(v)
			if (func.name == "main")
				str+= '''public static void main(String[] argv) {
					
				'''
			else 
				str+='''
				static Stack<BinTree> �func.name� (�FOR read : func.varIn SEPARATOR ", "�BinTree �read��ENDFOR�){
					Stack<BinTree> sortie = new Stack<BinTree>();
					
				'''
					
			str += '''
			�IF func.vars.size != 0�BinTree �FOR vi : func.vars SEPARATOR ","��vi��ENDFOR�;�ENDIF�
			
			Stack<BinTree> temp;  
				�FOR code : code3.code3AddressH.get(key)��IF code.operateur.operator == Op.Write && func.name=="main"����ELSE��translate3Add(code)��ENDIF�
				�ENDFOR�
			''' 
			if(func.name =="main")
				str+="}\n\n"
			else
				str+= "\treturn sortie;\n}\n\n "
		}
		var appel= new ArrayList<String>;
		
		for(var i = 0; i<ts.tableSymbFunc.get("main").in; i++){
			appel.add("in.get("+i+")") 
		}
		
		
		
		return '''
			
			import java.util.*;
			import libwh.*;
			import java.lang.IndexOutOfBoundsException;
			
			public class �className�{
				
				static Libwh libwh = new Libwh();
				�str�
				
				�IF ts.tableSymbFunc.get('main') !== null�
				public static void main(String[] args){
					try{
						List<BinTree> in = libwh.inWh(args);
						List<BinTree> out = f0(�FOR arg : appel SEPARATOR ', '��arg��ENDFOR�);
						String outprint = "";
						for(BinTree bin : out){
							outprint+= libwh.toInt(bin)+ " ";
						}
						System.out.println(outprint);
					}catch(IndexOutOfBoundsException e){
						System.out.println("[Error] Pas le bon nombre de parametre!");
					}catch(Exception e){
						System.out.println("[Error] "+ e.getMessage());
					}
				}
				�ENDIF�
				
			}
		'''
	}

	def translate3Add(Quadruplet<OpImpl> code) {

		if (code.operateur.operator == Op.Func)
			return ''''''
		if (code.operateur.operator == Op.Read)
			return ''''''
		if (code.operateur.operator == Op.Nop)
			return translateNop(code)
		if (code.operateur.operator == Op.Write)
			return translateWrite(code)
		if (code.operateur.operator == Op.Affec)
			return translateAffect(code)
		if (code.operateur.operator == Op.Nil)
			return translateNil(code)
		if (code.operateur.operator == Op.Tl)
			return translateTl(code)
		if (code.operateur.operator == Op.Hd)
			return translateHd(code)
		if (code.operateur.operator == Op.Cons)
			return translateCons(code)
		if (code.operateur.operator == Op.While)
			return translateWhile(code)
		if (code.operateur.operator == Op.If)
			return translateIf(code)
		if (code.operateur.operator == Op.For)
			return translateFor(code)
		if (code.operateur.operator == Op.Foreach)
			return translateForeach(code)
		if (code.operateur.operator == Op.Call)
			return translateCall(code)
		if (code.operateur.operator == Op.Not)
			return translateNot(code)
		if(code.operateur.operator == Op.Const)
			return translateConst(code)
		if(code.operateur.operator == Op.Eq)
			return translateEq(code)
		if(code.operateur.operator == Op.And)
			return translateAnd(code)
		if(code.operateur.operator == Op.Or)
			return translateOr(code)
	}

	def translateConst(Quadruplet<OpImpl>code){
		return '''	�code.resultat� = libwh.conste("�code.resultat�");'''
	}
	def translateNot(Quadruplet<OpImpl>code){
		return '''	�code.resultat� = libwh.not(�code.arg1�);'''
	}
	
	def translateCall(Quadruplet<OpImpl> code){
		var ss =""
		for (i : code.resultat.split(" ").size >.. 0){
			ss+= code.resultat.split(" ").get(i) + " = temp.pop();\n"
		}
		return '''	temp = �code.operateur.etiquette�(�code.arg1�);
		�ss�
		temp = null;
		''';
	}
	
	def translateNop(Quadruplet<OpImpl> code) {
		return '''	libwh.nop();''';
	}

	def translateWrite(Quadruplet<OpImpl> code) {
		'''	sortie.add(�code.resultat�);'''
	}

	def translateAffect(Quadruplet<OpImpl> code) {
		return '''	�code.resultat� = �code.arg1�;'''
	}

	def translateNil(Quadruplet<OpImpl> code) {
		return '''	�code.resultat� = libwh.nil();'''
	}

	def translateTl(Quadruplet<OpImpl> code) {
		return '''	�code.resultat� = libwh.tl(�code.arg1�);'''
	}

	def translateHd(Quadruplet<OpImpl> code) {
		return '''	�code.resultat� = libwh.hd(�code.arg1�);'''
	}
	def translateCons(Quadruplet<OpImpl> code) {
		return '''	�code.resultat� = libwh.cons(�code.arg1�, �code.arg2�);'''
	}
	
	// prob : j ai acc�s qu'au code 3 @ de Expr et Cmds j' ai besoin de leurs valeurs 
	def translateWhile(Quadruplet<OpImpl> code) {
		var opw = new WhileOp(code.getOperateur())
		var code1=new Quadruplet<WhileOp>(opw,code.resultat,code.arg1,code.arg2)
		//print(code1.operateur.expr)
		return
	'''
	�FOR exp :code1.getOperateur().getExpr() SEPARATOR '\n'��translate3Add(exp)��ENDFOR�
	while( libwh.isTrue(�code1.arg1�)){
	�FOR cmd :code1.getOperateur().getCmds()�
	�translate3Add(cmd)�
	�ENDFOR�
	�FOR exp :code1.getOperateur().getExpr() SEPARATOR '\n'��translate3Add(exp)��ENDFOR�
	}
	'''

	}
	
	def translateIf(Quadruplet<OpImpl> code) {
		var opif = new IfOp(code.getOperateur())
		var code1=new Quadruplet<IfOp>(opif,code.resultat,code.arg1,code.arg2)
		//print(code1.operateur.expr)
		return
	'''
		�FOR exp :code1.getOperateur().getExpr() SEPARATOR '\n'��translate3Add(exp)��ENDFOR�
			if( libwh.isTrue(�code1.arg1�)){�FOR cmd :code1.getOperateur().getCmds()�
				�translate3Add(cmd)�
		�ENDFOR�
		}�IF code1.operateur.elsecmds !== null�else {�FOR cmd :code1.operateur.elsecmds�
			�translate3Add(cmd)�
		�ENDFOR�}�ENDIF�
	'''

	}
	
	
	def translateFor(Quadruplet<OpImpl> code) {
		var opf = new ForOp(code.getOperateur())
		var code1=new Quadruplet<ForOp>(opf,code.resultat,code.arg1,code.arg2)
		return
'''�FOR exp :code1.getOperateur().getExpr() SEPARATOR '\n'��translate3Add(exp)��ENDFOR�
while(libwh.isTrue(�code1.arg1�)){�FOR cmd :code1.getOperateur().getCmds()�
�translate3Add(cmd)��ENDFOR�
�code1.arg1� = libwh.tl(�code1.arg1�);
}
'''
	}
	
	def translateForeach(Quadruplet<OpImpl> code) {
		var opfe = new ForeachOp(code.getOperateur())
		var code1=new Quadruplet<ForeachOp>(opfe,code.resultat,code.arg1,code.arg2)
		return
'''�FOR exp :code1.getOperateur().getExpr() SEPARATOR '\n'��translate3Add(exp)��ENDFOR�
while(�code1.arg1�!=null){�code1.arg2� = libwh.hd(�code1.arg1�);�FOR cmd :code1.getOperateur().getCmds()�
�translate3Add(cmd)��ENDFOR�
�code1.arg1� = libwh.tl(�code1.arg1�);
}
'''
	}
	def translateEq(Quadruplet<OpImpl> code){
		return'''�code.resultat�=libwh.equals(�code.arg1�,�code.arg2�);'''
	}
	def translateAnd(Quadruplet<OpImpl> code){
		return'''�code.resultat�=libwh.and(�code.arg1�,�code.arg2�);'''
	}
	def translateOr(Quadruplet<OpImpl> code){
		return'''�code.resultat�=libwh.or(�code.arg1�,�code.arg2�);'''
	}
	
		


}
