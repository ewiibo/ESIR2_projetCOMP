package org.xtext.generator;

import java.util.LinkedList;

public class IfOp extends OpImpl {

	
	private LinkedList<Quadruplet<OpImpl>> expr, cmds, elsecmds;
	public IfOp() {
		super(Op.If,"");
	}
	public IfOp(LinkedList<Quadruplet<OpImpl>> expr,LinkedList<Quadruplet<OpImpl>> cmds,LinkedList<Quadruplet<OpImpl>> elsecmds) {
		super(Op.If, "");
		this.expr = expr;
		this.cmds = cmds;
		this.elsecmds = elsecmds;
	}
	public IfOp(OpImpl objet) {
	super(objet);
	if(objet instanceof IfOp) {
		this.expr=((IfOp)objet).getExpr();
		this.cmds=((IfOp)objet).getCmds();
		this.elsecmds = ((IfOp)objet).getElsecmds();
		}
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
	public LinkedList<Quadruplet<OpImpl>> getElsecmds() {
		return elsecmds;
	}
	public void setElsecmds(LinkedList<Quadruplet<OpImpl>> elsecmds) {
		this.elsecmds = elsecmds;
	}
}
