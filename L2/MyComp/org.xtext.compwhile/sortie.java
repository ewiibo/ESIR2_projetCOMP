
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	public static void main(String[] argv) {
		String vars[] = {"A","iR1","B","iR2","iR3","iR4","iR5","iR6","iR7","iR8","iR9","iR10"};   
		HashMap<String, BinTree> variables = new HashMap<>();
		for(String var : vars) variables.put(var,null);
		
		variables.put("iR1", null);
		variables.put("A",variables.get("iR1"));
		variables.put("iR2", null);
		variables.put("iR3", libwh.hd(variables.get("iR2")));
		variables.put("iR4", libwh.cons(variables.get("A"),variables.get("iR3")));
		variables.put("B",variables.get("iR4"));
	//******debutWhile******
				variables.put("iR5", null);
				variables.put("iR6", null);
				variables.put("iR7", libwh.cons(variables.get("iR5"),variables.get("iR6")));
		while( libwh.isTrue(variables.get("iR7"))){
				variables.put("iR8", null);
				variables.put("iR9", null);
				variables.put("iR10", libwh.cons(variables.get("iR8"),variables.get("iR9")));
				variables.put("B",variables.get("iR10"));
				variables.put("A",variables.get("B"));
				}
	}
	
	Stack<BinTree> f1 (BinTree X, BinTree Y){
		Stack<BinTree> sortie = new Stack<BinTree>();
		ArrayList<String> varIn = new ArrayList<>(); varIn.add("X");varIn.add("Y");
		String vars[] = {"T","A","iR1","iR2","iR3","iR4","iR5","iR6","B","iR7","C","iR8","iR9","iR10"};   
		HashMap<String, BinTree> variables = new HashMap<>();
		for(String var : vars) variables.put(var,null);
		variables.put("X", X);variables.put("Y", Y);
		
		libwh.nop();
		variables.put("T",variables.get("Z"));
		variables.put("iR1", null);
		variables.put("iR2", libwh.tl(variables.get("iR1")));
		variables.put("iR3", libwh.hd(variables.get("Y")));
		variables.put("iR4", libwh.cons(variables.get("iR2"),variables.get("iR3")));
		variables.put("iR5", null);
		variables.put("iR6", libwh.cons(variables.get("iR4"),variables.get("iR5")));
		variables.put("A",variables.get("iR6"));
		variables.put("iR7", libwh.hd(variables.get("Y")));
		variables.put("B",variables.get("iR7"));
		variables.put("iR8", null);
		variables.put("iR9", null);
		variables.put("iR10", libwh.cons(variables.get("iR8"),variables.get("iR9")));
		variables.put("C",variables.get("iR10"));
		sortie.push(variables.get("Y"));
		return sortie;
	}
	
	
}
