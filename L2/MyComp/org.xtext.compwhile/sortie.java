
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	public static void main(String[] argv) {
		String vars[] = {"iR1","iR2","iR3","iR4","iR5","iR6","iR7","iR8","iR9","iR10","iR11","A","iR12","iR13","iR14","B","iR15","iR16","iR17","iR18","iR19","iR20","iR21","iR22","iR23","iR24","iR25","iR26","iR27","iR28","iR29","iR30","iR31","iR32","iR33","C","iR34"};   
		HashMap<String, BinTree> variables = new HashMap<>();
		for(String var : vars) variables.put(var,null);
		
		variables.put("iR1", null);
		variables.put("iR2", null);
		variables.put("iR3", libwh.cons(variables.get("iR2"),variables.get("iR1")));
		variables.put("iR4", null);
		variables.put("iR5", libwh.cons(variables.get("iR4"),variables.get("iR3")));
		variables.put("iR6", null);
		variables.put("iR7", libwh.cons(variables.get("iR6"),variables.get("iR5")));
		variables.put("iR8", null);
		variables.put("iR9", libwh.cons(variables.get("iR8"),variables.get("iR7")));
		variables.put("iR10", null);
		variables.put("iR11", libwh.cons(variables.get("iR10"),variables.get("iR9")));
		variables.put("A",variables.get("iR11"));
		variables.put("iR12", null);
		variables.put("iR13", libwh.hd(variables.get("iR12")));
		variables.put("iR14", libwh.cons(variables.get("A"),variables.get("iR13")));
		variables.put("B",variables.get("iR14"));
		if( libwh.isTrue(variables.get("B"))){
			variables.put("A",variables.get("B"));
		}else{
			variables.put("iR15", null);
			variables.put("B",variables.get("iR15"));
		}
		variables.put("iR16", null);
		variables.put("iR17", null);
		variables.put("iR18", libwh.cons(variables.get("iR17"),variables.get("iR16")));
		variables.put("iR19", null);
		variables.put("iR20", libwh.cons(variables.get("iR19"),variables.get("iR18")));
		variables.put("iR21", null);
		variables.put("iR22", libwh.cons(variables.get("iR21"),variables.get("iR20")));
		variables.put("B",variables.get("iR22"));
	while( libwh.isTrue(variables.get("B"))){
			variables.put("iR23", libwh.tl(variables.get("B")));
			variables.put("B",variables.get("iR23"));
			variables.put("A",variables.get("B"));
		}
		variables.put("iR24", libwh.hd(variables.get("Y")));
		variables.put("iR25", null);
		variables.put("iR26", libwh.tl(variables.get("iR25")));
		variables.put("iR27", libwh.cons(variables.get("iR26"),variables.get("iR24")));
		variables.put("iR28", null);
		variables.put("iR29", libwh.cons(variables.get("iR28"),variables.get("iR27")));
		variables.put("A",variables.get("iR29"));
		variables.put("iR30", libwh.hd(variables.get("Y")));
		variables.put("iR31", null);
		variables.put("iR32", null);
		variables.put("iR33", libwh.cons(variables.get("iR32"),variables.get("iR31")));
		variables.put("B",variables.get("iR30"));
		variables.put("C",variables.get("iR33"));
	while(libwh.isTrue(variables.get("A"))){
			variables.put("iR34", null);
			variables.put("C",variables.get("iR34"));
		variables.put("A", libwh.tl(variables.get("A")));
		}
		if( libwh.isTrue(variables.get("B"))){
			variables.put("A",variables.get("B"));
		}
	}
	
	Stack<BinTree> f1 (BinTree X, BinTree Y){
		Stack<BinTree> sortie = new Stack<BinTree>();
		ArrayList<String> varIn = new ArrayList<>(); varIn.add("X");varIn.add("Y");
		String vars[] = {"T","iR1","iR2","iR3","iR4","iR5","iR6","A","iR7","iR8","iR9","iR10","B","C","iR11"};   
		HashMap<String, BinTree> variables = new HashMap<>();
		for(String var : vars) variables.put(var,null);
		variables.put("X", X);variables.put("Y", Y);
		
		libwh.nop();
		variables.put("T",variables.get("Z"));
		variables.put("iR1", null);
		variables.put("iR2", libwh.hd(variables.get("Y")));
		variables.put("iR3", null);
		variables.put("iR4", libwh.tl(variables.get("iR3")));
		variables.put("iR5", libwh.cons(variables.get("iR4"),variables.get("iR2")));
		variables.put("iR6", libwh.cons(variables.get("iR5"),variables.get("iR1")));
		variables.put("A",variables.get("iR6"));
		variables.put("iR7", libwh.hd(variables.get("Y")));
		variables.put("iR8", null);
		variables.put("iR9", null);
		variables.put("iR10", libwh.cons(variables.get("iR9"),variables.get("iR8")));
		variables.put("B",variables.get("iR7"));
		variables.put("C",variables.get("iR10"));
	while(libwh.isTrue(variables.get("A"))){
			variables.put("iR11", null);
			variables.put("C",variables.get("iR11"));
		variables.put("A", libwh.tl(variables.get("A")));
		}
		sortie.push(variables.get("Y"));
		return sortie;
	}
	
	
}
