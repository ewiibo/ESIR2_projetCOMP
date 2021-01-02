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
				BinTree «func.name» («FOR read : func.varIn SEPARATOR ", "»BinTree «read»«ENDFOR»){'''
			str += '''
			
				«IF func.name != "main"»ArrayList<String> varIn = new ArrayList<>(); «FOR vi : func.varIn»varIn.add("«vi»");«ENDFOR»«ENDIF»
				String vars[] = {«FOR vi : func.vars SEPARATOR ","»"«vi»"«ENDFOR»};   
				HashMap<String, BinTree> variables = new HashMap<>();
				for(String var : vars) variables.put(var,null);
				«IF func.name != "main"»«FOR vi : func.varIn»variables.put("«vi»", «vi»);«ENDFOR»«ENDIF»
				
				«FOR code : code3.code3AddressH.get(key)»«translate3Add(code)»
				«ENDFOR»
			''' + "}\n\n"
		}
		return '''
			package test;
			
			import java.util.HashMap;
			import org.xtext.generator.BinTree;
			
			public class «className»{
				«str»
				
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
	}


	

	def translateNop(Quadruplet<OpImpl> code) {
		return '''	libwh.nop();''';
	}

	def translateWrite(Quadruplet<OpImpl> code) {
		''''''
	}

	def translateAffect(Quadruplet<OpImpl> code) {
		return '''	variables.put("«code.resultat»",variables.get("«code.arg1»"));'''
	}

	def translateNil(Quadruplet<OpImpl> code) {
		return '''	variables.put("«code.resultat»", null);'''
	}

	def translateTl(Quadruplet<OpImpl> code) {
		return '''	variables.put("«code.resultat»", libwh.tl(variables.get("«code.arg1»")));'''
	}

	def translateHd(Quadruplet<OpImpl> code) {
		return '''	variables.put("«code.resultat»", libwh.hd(variables.get("«code.arg1»")));'''
	}
	def translateCons(Quadruplet<OpImpl> code) {
		return '''	variables.put("«code.resultat»", libwh.cons(variables.get("«code.arg1»"),variables.get("«code.arg2»")));'''
	}
	
	// prob : j ai accés qu'au code 3 @ de Expr et Cmds j' ai besoin de leurs valeurs 
	def translateWhile(Quadruplet<OpImpl> code) {
		var opw = new WhileOp(code.getOperateur())
		var code1=new Quadruplet<WhileOp>(opw,code.resultat,code.arg1,code.arg2)
		//print(code1.operateur.expr)
				return '''
	******debutWhile******
		«FOR exp :code1.getOperateur().getExpr()»
		«translate3Add(exp)»
		«ENDFOR»
	While( libwh.isTrue(«code1.arg1»)){
		«FOR cmd :code1.getOperateur().getCmds()»
		«translate3Add(cmd)»
		«ENDFOR»
			}
		'''
	}
		


}
