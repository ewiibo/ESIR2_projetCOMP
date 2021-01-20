package org.xtext.generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.whileL.AffectCommand;
import org.xtext.whileL.Command;
import org.xtext.whileL.Commands;
import org.xtext.whileL.Definition;
import org.xtext.whileL.Expr;
import org.xtext.whileL.ExprBase;
import org.xtext.whileL.Exprs;
import org.xtext.whileL.ForCommand;
import org.xtext.whileL.ForeachCommand;
import org.xtext.whileL.Function;
import org.xtext.whileL.IfCommand;
import org.xtext.whileL.Input;
import org.xtext.whileL.LExpr;
import org.xtext.whileL.Output;
import org.xtext.whileL.Program;
import org.xtext.whileL.WhileCommand;

import com.google.common.base.Objects;

import org.xtext.whileL.NopCommand;

public class WhileLGen {

	TableSymbole ts = new TableSymbole();
	TroisAdd code3Add = new TroisAdd();
	Traducteurx trad = new Traducteurx();
	Func func;
	String prefix = "g";

	
	
	public void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context, String output) throws Exception {
		// TODO Auto-generated method stub
		TreeIterator<EObject> asa = input.getAllContents();
		while (asa.hasNext()) {
			EObject prog = (EObject) asa.next();
			if (prog instanceof Program) {
				fillTableSymbFunc((Program) prog);
				generate((Program) prog);
			}
		}
		if(Main.tab || Main.debug)
			System.out.println(ts.toString());
		if(Main.code || Main.debug)
		System.out.println(code3Add);
		
		trad.Traducteurx(code3Add, ts);
		fsa.generateFile(output+".java", trad.translate(output));
	}
	
	public void fillTableSymbFunc(Program prog) throws Exception {
		for (Function f : prog.getFunctions()) {
			String etiquette = f.getSymbol().equals("main") ? "f0":ts.getNextEtiquette();
			Func funct = new Func(etiquette);
			if(ts.getTableSymbFunc().containsKey(f.getSymbol())) {
				throw (new Exception("The function is defined several times"));
			}
			if (!Func.isDuplicate(f.getDefinition().getInput().getVars())) {
				funct.setIn(f.getDefinition().getInput().getVars().size());
			} else {
				throw (new Exception("Input variables are duplicated"));
			}
			if (!Func.isDuplicate(f.getDefinition().getOutput().getVars())) {
				funct.setOut(f.getDefinition().getOutput().getVars().size());
			} else {
				throw (new Exception("Output variables are duplicated"));
			}
			ts.addSymbol(f.getSymbol(), funct);
		}
	}
	

	public void generate(Program prog) throws Exception {
		// TODO Auto-generated method stub
		for (Function func : prog.getFunctions()) {
			generate(func);
			code3Add.saveFunc3Add(func.getSymbol());
		}
	}

	public void generate(Function function) throws Exception {
		code3Add.putFun(function.getSymbol());
		func = ts.getTableSymbFunc().get(function.getSymbol());
		generate(function.getDefinition(), func);
	}

	private void generate(Input input, Func func) {
		List<String> vars = input.getVars();
		for (String var : vars) {
			var=prefix+var;
			func.addVar(var);
			func.varIn.add(var);
			code3Add.putRead(var);
		}
	}

	private void generate(Output output, Func func) throws Exception {
		List<String> vars = output.getVars();
		for (String var : vars) {
			var=prefix+var;
			
			if(!func.isVarExist(var)) 
				throw (new Exception ("The variable "+ var +" is not defined in the function : "+ getKeyFromValueHashMap(func)));
			
			func.varOut.add(var);
			code3Add.putWrite(var);
		}
	}
	
	String getKeyFromValueHashMap(Func func){
		for(Entry<String, Func> entry : ts.getTableSymbFunc().entrySet()) {
			if(Objects.equal(entry.getValue(), func)){
				return entry.getKey();
			}
		}
		return null;
	}

	public void generate(Definition def, Func func) throws Exception {
		generate(def.getInput(), func);
		code3Add.code3Address.addAll(generate(def.getCommands()));
		generate(def.getOutput(), func);
	}

	// j'ai effac� le param�tre func ici 
	private LinkedList<Quadruplet<OpImpl>> generate(Commands commands) throws Exception {
		List<Command> coms = commands.getCommands();
		LinkedList<Quadruplet<OpImpl>> code3Address = new LinkedList<Quadruplet<OpImpl>>();
		for (Command com : coms) {
			code3Address.addAll(generate(com));
		}
		return code3Address;
	}

	private LinkedList<Quadruplet<OpImpl>> generate(Command command) throws Exception {
		if (command instanceof NopCommand) {
			return generate((NopCommand) command);
		} else if (command instanceof AffectCommand) {
			return generate((AffectCommand) command);// code3Add.putAff((AffectCommand)command);
		} else if (command instanceof WhileCommand) {
			return generate((WhileCommand) command);
		} else if (command instanceof IfCommand) {
			return generate((IfCommand)command);
		} else if (command instanceof ForCommand) {
			return generate((ForCommand)command);
		} else if (command instanceof ForeachCommand) {
			return generate((ForeachCommand)command);
		}else {
			return null;
		}
	}

	private LinkedList<Quadruplet<OpImpl>> generate(NopCommand cmd) {
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		code3Adress.add(TroisAdd.nope3Adresse());
		return code3Adress;
	}

	private LinkedList<Quadruplet<OpImpl>> generate(AffectCommand cmd) throws Exception {
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		// Si il y a autant de variables à gauche que d'elements d'affection à droite
		int nb = getNbreOut(cmd.getExprs());
		if (nb == cmd.getVars().getVari().size()) {
			ArrayList<String> varRes = new ArrayList<>();
			for (Expr expr : cmd.getExprs().getExpr()) {
				code3Adress.addAll(generate(expr));
				String[] ll = code3Adress.getLast().getResultat().split("\\s+");
				for(String str : ll) {
					varRes.add(str);
				}
			}
			for(int i = 0 ; i<cmd.getVars().getVari().size();i++) {
				func.addVar(prefix+cmd.getVars().getVari().get(i));
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Affec, ""),
						prefix+cmd.getVars().getVari().get(i) , varRes.get(i), ""));
			}
		}else {
			throw (new Exception ("Not as many variables as there are assignment elements on the right : "+ getKeyFromValueHashMap(func)));
		}

		return code3Adress;
	}

	// J'ai suppos� que on a une seule condition � �valuer (1 expr)
	private LinkedList<Quadruplet<OpImpl>> generate(WhileCommand cmd) throws Exception {
		LinkedList<Quadruplet<OpImpl>> cond = new LinkedList<Quadruplet<OpImpl>>();
		LinkedList<Quadruplet<OpImpl>> body = new LinkedList<Quadruplet<OpImpl>>();
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		cond=generate(cmd.getExpr());
		body=generate(cmd.getCommands());
		code3Adress.add(new Quadruplet<OpImpl>(new WhileOp(cond, body),"",cond.getLast().getResultat(),""));
		
		return code3Adress;
	}
	private LinkedList<Quadruplet<OpImpl>> generate(IfCommand cmd) throws Exception {
		IfOp ifop = new IfOp();
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		ifop.setExpr(generate(cmd.getExpr()));
		ifop.setCmds(generate(cmd.getCommands()));
		if(cmd.getElsecommands() != null)
			ifop.setElsecmds(generate(cmd.getElsecommands()));
		code3Adress.add(new Quadruplet<OpImpl>(ifop,"",ifop.getExpr().getLast().getResultat(),""));
		return code3Adress;
	}
	private LinkedList<Quadruplet<OpImpl>> generate(ForCommand cmd) throws Exception {
		ForOp forOp = new ForOp();
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		forOp.setExpr(generate(cmd.getExpr()));
		forOp.setCmds(generate(cmd.getCommand()));
		code3Adress.add(new Quadruplet<OpImpl>(forOp,"",forOp.getExpr().getLast().getResultat(),""));
		return code3Adress;
	}
	private LinkedList<Quadruplet<OpImpl>> generate(ForeachCommand cmd) throws Exception {
		ForeachOp foreachOp = new ForeachOp();
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		func.addVar(prefix+cmd.getVars().getVari().get(0));
		foreachOp.setVars(prefix+cmd.getVars().getVari().get(0));
		foreachOp.setExpr(generate(cmd.getExpr()));
		foreachOp.setCmds(generate(cmd.getCommands()));
		code3Adress.add(new Quadruplet<OpImpl>(foreachOp,"",foreachOp.getExpr().getLast().getResultat(),foreachOp.getVars()));
		return code3Adress;
	}

	private LinkedList<Quadruplet<OpImpl>> generate(Expr expr) throws Exception {
		
		return generate(expr.getExprbase());
	}

	private LinkedList<Quadruplet<OpImpl>> generate(ExprBase exprbase) throws Exception {
		String value = exprbase.getValue();
		String call = exprbase.getSymbol();
		String identitor = exprbase.getIdentitor();
		Expr expr = exprbase.getExpr();
		Expr expr1 = exprbase.getExpr1();
		LExpr lexpr = exprbase.getLexpr();

		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();

		if (value != null) {
			// tester si c'est une variable ou pas
			if (value.equals("nil"))
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Nil, ""), func.addVarGenere(), "", ""));
			else if (isVariable(value)) {
				if (!func.isVarExist(prefix+value))
					throw (new Exception("The variable "+ value +" is not defined in the function : "+ getKeyFromValueHashMap(func)));

				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Var, ""), prefix+value, "", ""));
					
			} else if(isSymbole(value)) {
				func.addVar(prefix+value);
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Const, prefix+value), prefix+value, "", ""));
			}
		} else if (identitor != null) {
			LinkedList<Quadruplet<OpImpl>> e1 , e2;
			switch (identitor) {
			case "cons" :
				code3Adress.addAll(generate(lexpr.getExpr().get(lexpr.getExpr().size()-1)));
				String arg2 =code3Adress.getLast().getResultat();
				String arg = "";
				for(int i = lexpr.getExpr().size()-2; i>=0; i--) {
					code3Adress.addAll(generate(lexpr.getExpr().get(i)));
					arg = code3Adress.get(code3Adress.size() - 1).getResultat();
					code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Cons, ""), func.addVarGenere(), arg, arg2));
					arg2 = code3Adress.getLast().getResultat();
				}
				break;
			case "list":
                code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Nil, ""), func.addVarGenere(), "", ""));
                arg2 =code3Adress.getLast().getResultat();
                arg = "";
                for(int i= lexpr.getExpr().size()-1; i>=0; i--) {
                    code3Adress.addAll(generate(lexpr.getExpr().get(i)));
                    arg = code3Adress.get(code3Adress.size() - 1).getResultat();
                    code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Cons, ""), func.addVarGenere(), arg, arg2));
                    arg2 = code3Adress.getLast().getResultat();
                }
				break;
			case "hd":

				code3Adress.addAll(generate(expr));
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Hd, ""), func.addVarGenere(),
						code3Adress.getLast().getResultat(), ""));
				break;
			case "tl":

				code3Adress.addAll(generate(expr));
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Tl, ""), func.addVarGenere(),
						code3Adress.getLast().getResultat(), ""));
				break;
			case "not":

				code3Adress.addAll(generate(expr));
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Not, ""), func.addVarGenere(),
						code3Adress.getLast().getResultat(), ""));
				break;
			case "=?":
				
				e1 = generate(expr);
				e2 = generate(expr1);
				code3Adress.addAll(e1);
				code3Adress.addAll(e2);
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Eq,""),func.addVarGenere(),
						e1.getLast().getResultat(),e2.getLast().getResultat()));
				break;
			case "and":
				e1 = generate(expr);
				e2 = generate(expr1);
				code3Adress.addAll(e1);
				code3Adress.addAll(e2);
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.And,""),func.addVarGenere(),
						e1.getLast().getResultat(),e2.getLast().getResultat()));
				break;
			case "or":
				e1 = generate(expr);
				e2 = generate(expr1);
				code3Adress.addAll(e1);
				code3Adress.addAll(e2);
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Or,""),func.addVarGenere(),
						e1.getLast().getResultat(),e2.getLast().getResultat()));
				break;
			default:
				break;
			}
		} else if (call != null) {
			Func fun = ts.getTableSymbFunc().get(call);
			if(fun!=null) {
				List<String> argFunc = new ArrayList<>();
				//verifier le nombre de parametre
				//int nb = getNbreOut(lexpr);
				if(lexpr.getExpr().size()!= ts.getTableSymbFunc().get(call).getIn()) {
					//Lever une exception si la ne recoit pas le bon nombre de parametre
					throw (new Exception("Not the right number of parameters for the function call : "+ call));
				}
				for(Expr exp : lexpr.getExpr()) {
					code3Adress.addAll(generate(exp));
					argFunc.add(code3Adress.getLast().getResultat());
				}
				String param = argFunc.toString().replace('[', ' ').replace(']', ' ');
				String sortie = "";
				for(int i = 0; i<fun.getOut(); i++) {
					sortie +=func.addVarGenere()+" ";  
				}
				
				
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Call, fun.getName()), sortie,
						param, ""));
			}else {
				
				
				code3Adress.addAll(generate(lexpr.getExpr().get(lexpr.getExpr().size()-1)));
				String arg2 = code3Adress.getLast().getResultat();
				String arg = "";
				for(int i= lexpr.getExpr().size()-2; i>=0; i--) {
					code3Adress.addAll(generate(lexpr.getExpr().get(i)));
					arg = code3Adress.get(code3Adress.size() - 1).getResultat();
					code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Cons, ""), func.addVarGenere(), arg, arg2));
					arg2 = code3Adress.getLast().getResultat();
				}
				arg2 = code3Adress.getLast().getResultat();
				//Ajout du call dans la table de symbole
				func.addVar(prefix+call);
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Const,prefix+call), prefix+call, "", ""));
				arg = code3Adress.getLast().getResultat();
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Cons,""), func.addVarGenere(), arg,arg2));
			}
			
		}
		return code3Adress;
	}

	private boolean isVariable(String str) {
		if (str == null) {
			return false;
		}
		String firstChar = str.substring(0, 1);
		return firstChar.equals(firstChar.toUpperCase()); // Is uppercase -> Variable
	}
	
	private boolean isSymbole(String str) {
		if (str == null) {
			return false;
		}
		String firstChar = str.substring(0, 1);
		return firstChar.equals(firstChar.toLowerCase()); // Is lowercase -> symbole
	}
	
	private int getNbreOut(Exprs exprs) {
		int out = 0;
		for(Expr expr : exprs.getExpr()) {
			//verif si  c'est un symbole et si c'est une fonction
			if(isSymbole(expr.getExprbase().getSymbol()) && 
					ts.getTableSymbFunc().get(expr.getExprbase().getSymbol())!=null){
				out+= ts.getTableSymbFunc().get(expr.getExprbase().getSymbol()).getOut();
			}else {
				out++;
			}
		}
		return out;
	}
}
