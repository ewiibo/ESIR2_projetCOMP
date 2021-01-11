package org.xtext.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.xtext.whileL.AffectCommand;
import org.xtext.whileL.Command;
import org.xtext.whileL.Commands;
import org.xtext.whileL.Definition;
import org.xtext.whileL.Expr;
import org.xtext.whileL.ExprBase;
import org.xtext.whileL.ForCommand;
import org.xtext.whileL.ForeachCommand;
import org.xtext.whileL.Function;
import org.xtext.whileL.IfCommand;
import org.xtext.whileL.Input;
import org.xtext.whileL.LExpr;
import org.xtext.whileL.Output;
import org.xtext.whileL.Program;
import org.xtext.whileL.WhileCommand;
import org.xtext.whileL.NopCommand;

public class WhileLGen extends AbstractGenerator {

	TableSymbole ts = new TableSymbole();
	TroisAdd code3Add = new TroisAdd();
	Traducteurx trad = new Traducteurx();
	Func func;

	@Override
	public void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		// TODO Auto-generated method stub
		TreeIterator<EObject> asa = input.getAllContents();
		while (asa.hasNext()) {
			EObject prog = (EObject) asa.next();
			if (prog instanceof Program) {
				fillTableSymbFunc((Program) prog);
				generate((Program) prog);
			}
		}
		 System.out.println(code3Add);
		
		trad.Traducteurx(code3Add, ts);
		fsa.generateFile("Sortie.java", trad.translate("Sortie"));
	}
	

	public void generate(Program prog) {
		// TODO Auto-generated method stub
		for (Function func : prog.getFunctions()) {
			generate(func);
			code3Add.saveFunc3Add(func.getSymbol());
		}
	}

	public void generate(Function function) {
		code3Add.putFun(function.getSymbol());
		func = ts.getTableSymbFunc().get(function.getSymbol());
		generate(function.getDefinition(), func);
	}

	private void generate(Input input, Func func) {
		List<String> vars = input.getVars();
		for (String var : vars) {
			func.addVar(var);
			func.varIn.add(var);
			code3Add.putRead(var);
		}
	}

	private void generate(Output output, Func func) {
		List<String> vars = output.getVars();
		for (String var : vars) {
			func.addVar(var);
			func.varOut.add(var);
			code3Add.putWrite(var);
		}
	}

	public void generate(Definition def, Func func) {
		generate(def.getInput(), func);
		code3Add.code3Address.addAll(generate(def.getCommands()));
		generate(def.getOutput(), func);
	}

	// j'ai effac� le param�tre func ici 
	private LinkedList<Quadruplet<OpImpl>> generate(Commands commands) {
		List<Command> coms = commands.getCommands();
		LinkedList<Quadruplet<OpImpl>> code3Address = new LinkedList<Quadruplet<OpImpl>>();
		for (Command com : coms) {
			code3Address.addAll(generate(com));
		}
		return code3Address;
	}

	private LinkedList<Quadruplet<OpImpl>> generate(Command command) {
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
			return null;
		} else {
			return null;
		}
	}

	private LinkedList<Quadruplet<OpImpl>> generate(NopCommand cmd) {
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		code3Adress.add(TroisAdd.nope3Adresse());
		return code3Adress;
	}

	private LinkedList<Quadruplet<OpImpl>> generate(AffectCommand cmd) {
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		// Si il y a autant de variables à gauche que d'elements d'affection à droite
		if (cmd.getExprs().getExpr().size() == cmd.getVars().getVari().size()) {
			ArrayList<String> varRes = new ArrayList<>();
			for (Expr expr : cmd.getExprs().getExpr()) {
				code3Adress.addAll(generate(expr));
				varRes.add(code3Adress.getLast().getResultat());
			}
			for(int i = 0 ; i<cmd.getVars().getVari().size();i++) {
				func.addVar(cmd.getVars().getVari().get(i));
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Affec, ""),
						cmd.getVars().getVari().get(i) , varRes.get(i), ""));
			}
		}

		return code3Adress;
	}

	// J'ai suppos� que on a une seule condition � �valuer (1 expr)
	private LinkedList<Quadruplet<OpImpl>> generate(WhileCommand cmd) {
		LinkedList<Quadruplet<OpImpl>> cond = new LinkedList<Quadruplet<OpImpl>>();
		LinkedList<Quadruplet<OpImpl>> body = new LinkedList<Quadruplet<OpImpl>>();
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		cond=generate(cmd.getExpr());
		body=generate(cmd.getCommands());
		code3Adress.add(new Quadruplet<OpImpl>(new WhileOp(cond, body),"",cond.getLast().getResultat(),""));
		
		return code3Adress;
	}
	private LinkedList<Quadruplet<OpImpl>> generate(IfCommand cmd) {
		IfOp ifop = new IfOp();
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		ifop.setExpr(generate(cmd.getExpr()));
		ifop.setCmds(generate(cmd.getCommands()));
		if(cmd.getElsecommands() != null)
			ifop.setElsecmds(generate(cmd.getElsecommands()));
		code3Adress.add(new Quadruplet<OpImpl>(ifop,"",ifop.getExpr().getLast().getResultat(),""));
		return code3Adress;
	}
	private LinkedList<Quadruplet<OpImpl>> generate(ForCommand cmd) {
		ForOp forOp = new ForOp();
		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();
		forOp.setExpr(generate(cmd.getExpr()));
		forOp.setCmds(generate(cmd.getCommand()));
		code3Adress.add(new Quadruplet<OpImpl>(forOp,"",forOp.getExpr().getLast().getResultat(),""));
		return code3Adress;
	}

	private LinkedList<Quadruplet<OpImpl>> generate(Expr expr) {
		return generate(expr.getExprbase());
	}

	private LinkedList<Quadruplet<OpImpl>> generate(ExprBase exprbase) {
		String value = exprbase.getValue();
		String call = exprbase.getSymbol();
		String identitor = exprbase.getIdentitor();
		Expr expr = exprbase.getExpr();
		LExpr lexpr = exprbase.getLexpr();

		LinkedList<Quadruplet<OpImpl>> code3Adress = new LinkedList<Quadruplet<OpImpl>>();

		if (value != null) {
			// tester si c'est une variable ou pas
			if (value.equals("nil"))
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Nil, ""), func.addVarGenere(), "", ""));
			else if (isVariable(value)) {
				///
				
				// Creer une exception et la lever volontaire et la propager aux parents
				// S'il y a une utilisation d'une variable qui n'existe pas
				
				///
				if (!func.isVarExist(value))
					System.out.println("La variable " + value +" n'existe pas" );
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Var, ""), value, "", ""));
				
					
			}
		} else if (identitor != null) {
			switch (identitor) {
			case "cons" :
				code3Adress.addAll(generate(lexpr.getExpr().get(lexpr.getExpr().size()-1)));
				String arg2 =code3Adress.get(code3Adress.size() - 1).getResultat();
				String arg = "";
				for(int i= lexpr.getExpr().size()-2; i>=0; i--) {
					code3Adress.addAll(generate(lexpr.getExpr().get(i)));
					arg = code3Adress.get(code3Adress.size() - 1).getResultat();
					code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Cons, ""), func.addVarGenere(), arg, arg2));
					arg2 = code3Adress.getLast().getResultat();
				}
				break;
			case "list":
				List<String> arg1 = new LinkedList<String>();
				for (Expr exp : lexpr.getExpr()) {
					code3Adress.addAll(generate(exp));
					arg1.add(code3Adress.get(code3Adress.size() - 1).getResultat());
				}
				System.out.println(arg1);
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.List, ""), func.addVarGenere(), arg1.get(0), arg1.get(1)));
				break;
			case "hd":

				code3Adress.addAll(generate(expr));
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Hd, ""), func.addVarGenere(),
						code3Adress.get(code3Adress.size() - 1).getResultat(), ""));
				break;
			case "tl":

				code3Adress.addAll(generate(expr));
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Tl, ""), func.addVarGenere(),
						code3Adress.get(code3Adress.size() - 1).getResultat(), ""));
				break;
			case "not":

				code3Adress.addAll(generate(expr));
				code3Adress.add(new Quadruplet<OpImpl>(new OpImpl(Op.Not, ""), func.addVarGenere(),
						code3Adress.get(code3Adress.size() - 1).getResultat(), ""));
				break;
			default:
				break;
			}
		} else if (call != null) {
			// appel de foonction pas encore fait
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


	public void fillTableSymbFunc(Program prog) {
		for (Function f : prog.getFunctions()) {
			Func funct = new Func(f.getSymbol());
			if (!Func.isDuplicate(f.getDefinition().getInput().getVars())) {
				funct.setIn(f.getDefinition().getInput().getVars().size());
			} else {
				System.out.println("Les variables d'entree sont dupliquee");
				return;
			}
			if (!Func.isDuplicate(f.getDefinition().getOutput().getVars())) {
				funct.setOut(f.getDefinition().getOutput().getVars().size());
			} else {
				System.out.println("Les variables de sortie sont dupliquee");
				return;
			}
			ts.getNextEtiquette();
			ts.addSymbol(funct);
		}
	}

}
