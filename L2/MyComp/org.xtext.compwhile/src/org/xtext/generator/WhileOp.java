package org.xtext.generator;

import java.util.LinkedList;

public class WhileOp  extends OpImpl{

	public LinkedList<Quadruplet<OpImpl>> expr = new LinkedList<Quadruplet<OpImpl>>();
	public LinkedList<Quadruplet<OpImpl>> cmds = new LinkedList<Quadruplet<OpImpl>>();
	public WhileOp() {
		super(Op.While, "");
		// TODO Auto-generated constructor stub
	}
	
	
}
