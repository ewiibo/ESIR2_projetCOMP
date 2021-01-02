package org.xtext.generator;

import java.util.LinkedList;

public class WhileOp  extends OpImpl{

	public LinkedList<Quadruplet<OpImpl>> expr = new LinkedList<Quadruplet<OpImpl>>();
	public LinkedList<Quadruplet<OpImpl>> cmds = new LinkedList<Quadruplet<OpImpl>>();
	
	public WhileOp(LinkedList<Quadruplet<OpImpl>> expr,LinkedList<Quadruplet<OpImpl>> cmds) {
		super(Op.While, "");
		this.expr = expr;
		this.cmds = cmds;
	}
	public WhileOp(OpImpl objet) {
	super(objet);
	if(objet instanceof WhileOp) {
		this.expr=((WhileOp)objet).getExpr();
		this.cmds=((WhileOp)objet).getCmds();
		}
	}
	
	public LinkedList<Quadruplet<OpImpl>> getExpr() {
		return expr;
	}
	public void setExpr(LinkedList<Quadruplet<OpImpl>> operator) {
		this.expr = expr;
	}
	public LinkedList<Quadruplet<OpImpl>> getCmds() {
		return cmds;
	}
	public void setCmds(LinkedList<Quadruplet<OpImpl>> cmds) {
		this.cmds = cmds;
	}
}
