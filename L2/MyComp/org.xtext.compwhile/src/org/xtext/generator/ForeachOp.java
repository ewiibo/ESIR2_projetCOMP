package org.xtext.generator;

import java.util.LinkedList;

public class ForeachOp extends OpImpl {

	private LinkedList<Quadruplet<OpImpl>> expr, cmds;
	private String vars;
	public ForeachOp() {
		super(Op.Foreach,"");
	}
	public ForeachOp(String vars,LinkedList<Quadruplet<OpImpl>> expr,LinkedList<Quadruplet<OpImpl>> cmds) {
		super(Op.Foreach, "");
		this.vars = vars;
		this.expr = expr;
		this.cmds = cmds;
	}
	public ForeachOp(OpImpl objet) {
	super(objet);
	if(objet instanceof ForeachOp) {
		this.vars=((ForeachOp)objet).getVars();
		this.expr=((ForeachOp)objet).getExpr();
		this.cmds=((ForeachOp)objet).getCmds();
		}
	}
	
	public String getVars() {
		return vars;
	}
	public void setVars(String vars) {
		this.vars=vars;
	}
	public LinkedList<Quadruplet<OpImpl>> getExpr() {
		return expr;
	}
	public void setExpr(LinkedList<Quadruplet<OpImpl>> expr) {
		this.expr = expr;
	}
	public LinkedList<Quadruplet<OpImpl>> getCmds() {
		return cmds;
	}
	public void setCmds(LinkedList<Quadruplet<OpImpl>> cmds) {
		this.cmds = cmds;
	}

}
