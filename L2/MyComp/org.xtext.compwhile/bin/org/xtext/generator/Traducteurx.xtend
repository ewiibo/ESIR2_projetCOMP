package org.xtext.generator

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
			var func = ts.tableSymbFunc.get(key)
			for (v : func.varIn)
				func.vars.remove(v)
			if (func.name == "main")
				str+= '''public static void main(String[] argv) {'''
			else 
				str+='''
				Stack<BinTree> �func.name� (�FOR read : func.varIn SEPARATOR ", "�BinTree �read��ENDFOR�){
					Stack<BinTree> sortie = new Stack<BinTree>();'''
			str += '''
			
				�IF func.name != "main"�ArrayList<String> varIn = new ArrayList<>(); �FOR vi : func.varIn�varIn.add("�vi�");�ENDFOR��ENDIF�
				String vars[] = {�FOR vi : func.vars SEPARATOR ","�"�vi�"�ENDFOR�};   
				HashMap<String, BinTree> variables = new HashMap<>();
				for(String var : vars) variables.put(var,null);
				�IF func.name != "main"��FOR vi : func.varIn�variables.put("�vi�", �vi�);�ENDFOR��ENDIF�
				
				�FOR code : code3.code3AddressH.get(key)��IF code.operateur.operator == Op.Write && func.name=="main"����ELSE��translate3Add(code)��ENDIF�
				�ENDFOR�
			''' 
			if(func.name =="main")
				str+="}\n\n"
			else
				str+= "\treturn sortie;\n}\n\n "
		}
		return '''
			
			import java.util.*;
			import libwh.*;
			
			public class �className�{
				
				static Libwh libwh = new Libwh();
				�str�
				
			}
		'''
	}

	def translate3Add(Quadruplet<OpImpl> code) {

		if (code.operateur.operator == Op.Func)
			return '''''';
		if (code.operateur.operator == Op.Read)
			return '''''';
		if (code.operateur.operator == Op.Nop)
			return translateNop(code);
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
	}


	

	def translateNop(Quadruplet<OpImpl> code) {
		return '''	libwh.nop();''';
	}

	def translateWrite(Quadruplet<OpImpl> code) {
		'''	sortie.push(variables.get("�code.resultat�"));'''
	}

	def translateAffect(Quadruplet<OpImpl> code) {
		return '''	variables.put("�code.resultat�",variables.get("�code.arg1�"));'''
	}

	def translateNil(Quadruplet<OpImpl> code) {
		return '''	variables.put("�code.resultat�", null);'''
	}

	def translateTl(Quadruplet<OpImpl> code) {
		return '''	variables.put("�code.resultat�", libwh.tl(variables.get("�code.arg1�")));'''
	}

	def translateHd(Quadruplet<OpImpl> code) {
		return '''	variables.put("�code.resultat�", libwh.hd(variables.get("�code.arg1�")));'''
	}
	def translateCons(Quadruplet<OpImpl> code) {
		return '''	variables.put("�code.resultat�", libwh.cons(variables.get("�code.arg1�"),variables.get("�code.arg2�")));'''
	}
	
	// prob : j ai acc�s qu'au code 3 @ de Expr et Cmds j' ai besoin de leurs valeurs 
	def translateWhile(Quadruplet<OpImpl> code) {
		var opw = new WhileOp(code.getOperateur())
		var code1=new Quadruplet<WhileOp>(opw,code.resultat,code.arg1,code.arg2)
		//print(code1.operateur.expr)
		return
	'''
	�FOR exp :code1.getOperateur().getExpr() SEPARATOR '\n'��translate3Add(exp)��ENDFOR�
	while( libwh.isTrue(variables.get("�code1.arg1�"))){
	�FOR cmd :code1.getOperateur().getCmds()�
	�translate3Add(cmd)�
	�ENDFOR�
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
			if( libwh.isTrue(variables.get("�code1.arg1�"))){
		�FOR cmd :code1.getOperateur().getCmds()�
		�translate3Add(cmd)�
		�ENDFOR�
		}�IF code1.operateur.elsecmds !== null�else{�FOR cmd :code1.operateur.elsecmds�
		�translate3Add(cmd)�
		�ENDFOR�}�ENDIF�
	'''

	}
	def translateFor(Quadruplet<OpImpl> code) {
		var opf = new ForOp(code.getOperateur())
		var code1=new Quadruplet<ForOp>(opf,code.resultat,code.arg1,code.arg2)
		//print(code1.operateur.expr)
		return
	'''
	�FOR exp :code1.getOperateur().getExpr() SEPARATOR '\n'��translate3Add(exp)��ENDFOR�
	for(int i=0; i< libwh.toInt(variables.get("�code1.arg1�")); i++){
	�FOR cmd :code1.getOperateur().getCmds()�
	�translate3Add(cmd)�
	�ENDFOR�
	}
	'''

	}
		


}
