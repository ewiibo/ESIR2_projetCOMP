package org.xtext.generator;

import java.util.LinkedList;

public class ForOp extends OpImpl {

	private LinkedList<Quadruplet<OpImpl>> expr, cmds;
	public ForOp() {
		super(Op.For,"");
	}
	public ForOp(LinkedList<Quadruplet<OpImpl>> expr,LinkedList<Quadruplet<OpImpl>> cmds) {
		super(Op.For, "");
		this.expr = expr;
		this.cmds = cmds;
	}
	public ForOp(OpImpl objet) {
	super(objet);
	if(objet instanceof ForOp) {
		this.expr=((ForOp)objet).getExpr();
		this.cmds=((ForOp)objet).getCmds();
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

}
