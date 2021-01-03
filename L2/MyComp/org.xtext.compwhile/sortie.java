
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	public static void main(String[] argv) {
		String vars[] = {"A","iR1","B","iR2","iR3","iR4","iR5","iR6","iR7","iR8","iR9","iR10","iR11","iR12","iR13","iR14","iR15","iR16","iR17","iR18","iR19","iR20","C","iR21","iR22","iR23","iR24"};   
		HashMap<String, BinTree> variables = new HashMap<>();
		for(String var : vars) variables.put(var,null);
		
		variables.put("iR1", null);
		variables.put("A",variables.get("iR1"));
		variables.put("iR2", null);
		variables.put("iR3", libwh.hd(variables.get("iR2")));
		variables.put("iR4", libwh.cons(variables.get("A"),variables.get("iR3")));
		variables.put("B",variables.get("iR4"));
		if( libwh.isTrue(variables.get("B"))){
			variables.put("A",variables.get("B"));
		}else{
			variables.put("iR5", null);
			variables.put("B",variables.get("iR5"));
		}
		variables.put("iR6", null);
		variables.put("iR7", null);
		variables.put("iR8", null);
		variables.put("iR9", null);
		variables.put("iR10", libwh.cons(variables.get("iR8"),variables.get("iR9")));
		variables.put("iR11", libwh.cons(variables.get("iR7"),variables.get("iR10")));
		variables.put("iR12", libwh.cons(variables.get("iR6"),variables.get("iR11")));
		variables.put("B",variables.get("iR12"));
	while( libwh.isTrue(variables.get("B"))){
			variables.put("iR13", libwh.tl(variables.get("B")));
			variables.put("B",variables.get("iR13"));
			variables.put("A",variables.get("B"));
		}
		variables.put("iR14", null);
		variables.put("iR15", null);
		variables.put("iR16", libwh.tl(variables.get("iR15")));
		variables.put("iR17", libwh.hd(variables.get("Y")));
		variables.put("iR18", libwh.cons(variables.get("iR16"),variables.get("iR17")));
		variables.put("iR19", libwh.cons(variables.get("iR14"),variables.get("iR18")));
		variables.put("A",variables.get("iR19"));
		variables.put("iR20", libwh.hd(variables.get("Y")));
		variables.put("B",variables.get("iR20"));
		variables.put("iR21", null);
		variables.put("iR22", null);
		variables.put("iR23", libwh.cons(variables.get("iR21"),variables.get("iR22")));
		variables.put("C",variables.get("iR23"));
	for(int i=0; i< libwh.toInt(variables.get("A")); i++){
			variables.put("iR24", null);
			variables.put("C",variables.get("iR24"));
		}
		if( libwh.isTrue(variables.get("B"))){
			variables.put("A",variables.get("B"));
		}
	}
	
	Stack<BinTree> f1 (BinTree X, BinTree Y){
		Stack<BinTree> sortie = new Stack<BinTree>();
		ArrayList<String> varIn = new ArrayList<>(); varIn.add("X");varIn.add("Y");
		String vars[] = {"T","A","iR1","iR2","iR3","iR4","iR5","iR6","B","iR7","C","iR8","iR9","iR10","iR11"};   
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
	for(int i=0; i< libwh.toInt(variables.get("A")); i++){
			variables.put("iR11", null);
			variables.put("C",variables.get("iR11"));
		}
		sortie.push(variables.get("Y"));
		return sortie;
	}
	
	
}
