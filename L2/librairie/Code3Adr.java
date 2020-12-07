package librairie;

import java.util.List;

public class Code3Adr {
	String op;
	String addr1;
	String addr2;
	String addr3;
	List<Code3Adr> alors, sinon;

	//Code 3@
	public Code3Adr(String op, String addr1, String addr2, String addr3) {
		super();
		this.op = op;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
		
	}

	public String toString() {
		//return "<" + op + ", " + addr1 + ", " + addr2 + ", " + addr3+ ">";
		return "<" + op +", " + addr1 + ", " + addr2 + ", " + addr3+ ">";
	}

	public String compile() {
		switch(this.op) {
		case "nop" :
			return "libwh.nop();";
		default :
			return "libwh.nonImpl();";
		}
	}
}

