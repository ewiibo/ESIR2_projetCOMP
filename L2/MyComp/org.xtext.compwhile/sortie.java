
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	static Stack<BinTree> f1 (BinTree gA, BinTree gB, BinTree gC){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gR2,gX;
	
	Stack<BinTree> temp;  
		gR1 = libwh.cons(gB, gC);
		gR2 = libwh.cons(gA, gR1);
		gX = gR2;
		sortie.add(gA);
		sortie.add(gX);
		return sortie;
	}
	
	 static Stack<BinTree> f0 (BinTree gA, BinTree gB, BinTree gC, BinTree gD){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gR2,gX,gg,gf,gR3,gR4,gR5,gR6,gb,gR7,ga,gR8,gP;
	
	Stack<BinTree> temp;  
		gR1 = libwh.nil();
		gB = gR1;
		gR2 = libwh.nil();
		gX = gR2;
		gg = libwh.conste("gg");
		gf = libwh.conste("gf");
		gR3 = libwh.cons(gf, gg);
		gR4 = libwh.nil();
		gR5 = libwh.hd(gR4);
		gR6 = libwh.cons(gR5, gR3);
		gb = libwh.conste("gb");
		gR7 = libwh.cons(gb, gR6);
		ga = libwh.conste("ga");
		gR8 = libwh.cons(ga, gR7);
		gP = gR8;
		sortie.add(gX);
		return sortie;
	}
	
	
	public static void main(String[] args){
		System.out.println("dans le main il reste le parseur qui envoie les parametres à f0");
		List<BinTree> in = libwh.inWh(args);
		List<BinTree> out = f0(in[0], in[1], in[2], in[3]);
		String outprint = "";
		for(BinTree bin : out){
			outprint+= libwh.toInt(bin)+ " ";
		}
		System.out.println(outprint);
	}
	
}
