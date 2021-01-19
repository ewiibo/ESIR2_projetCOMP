
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	static Stack<BinTree> f0 (BinTree gA, BinTree gB, BinTree gC, BinTree gD){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gS,gR1,gR2,gR3,gR4,gR5,gR6,gR7,gR8,gR9,gR10,gR11,gR12,gR13;
	
	Stack<BinTree> temp;  
		gR1 = libwh.nil();
			gR2 = libwh.nil();
			gR3 = libwh.cons(gR2, gR1);
			gR4 = libwh.nil();
			gR5 = libwh.cons(gR4, gR3);
			gR6 = libwh.nil();
			gR7 = libwh.cons(gR6, gR5);
			gR8 = libwh.nil();
			gR9 = libwh.cons(gR8, gR7);
		while(gR9!=null){gS = libwh.hd(gR9);
			libwh.nop();
			gR10 = libwh.hd(gS);
			gR11 = libwh.nil();
			gR12 = libwh.cons(gR11, gA);
			gR13 = libwh.cons(gR12, gR10);
			gA = gR13;
		gR9 = libwh.tl(gR9);
		}
	while(gD!=null){gB = libwh.hd(gD);
			libwh.nop();
		gD = libwh.tl(gD);
		}
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
