
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	static Stack<BinTree> f6 (BinTree gX, BinTree gY){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gP,gR2,gadd,gR3;
	
	Stack<BinTree> temp;  
		gR1 = libwh.nil();
		gP = gR1;
	while(libwh.isTrue(gY)){
			gR2 = libwh.cons(gX, gP);
			gadd = libwh.conste("gadd");
			gR3 = libwh.cons(gadd, gR2);
			gP = gR3;
		gY = libwh.tl(gY);
		}
		sortie.add(gP);
		return sortie;
	}
	
	 static Stack<BinTree> f1 (BinTree gX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	
	Stack<BinTree> temp;  
		libwh.nop();
		sortie.add(gX);
		return sortie;
	}
	
	 static Stack<BinTree> f3 (BinTree gX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gR2;
	
	Stack<BinTree> temp;  
		gR1 = libwh.nil();
		gR2 = libwh.cons(gR1, gX);
		gX = gR2;
		sortie.add(gX);
		return sortie;
	}
	
	 static Stack<BinTree> f2 (BinTree gX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gB,gR2,gR3,gR4;
	
	Stack<BinTree> temp;  
		if( libwh.isTrue(gX)){
				gR1 = libwh.nil();
				gB = gR1;
		}else {
			gR2 = libwh.nil();
			gR3 = libwh.nil();
			gR4 = libwh.cons(gR3, gR2);
			gB = gR4;
				}
		sortie.add(gB);
		return sortie;
	}
	
	 static Stack<BinTree> f0 (BinTree gA){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1;
	
	Stack<BinTree> temp;  
		temp = f4( gA );
				gR1 = temp.pop();
				temp = null;
		gA = gR1;
		sortie.add(gA);
		return sortie;
	}
	
	 static Stack<BinTree> f5 (BinTree gX, BinTree gY){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gS,gR2,gR3,gR4;
	
	Stack<BinTree> temp;  
	
			temp = f2( gY );
				gR1 = temp.pop();
				temp = null;
			if( libwh.isTrue(gR1 )){
				gS = gX;
		}else {
			temp = f4( gY );
				gR2 = temp.pop();
				temp = null;
			temp = f5( gX, gR2  );
				gR3 = temp.pop();
				temp = null;
			temp = f3( gR3  );
				gR4 = temp.pop();
				temp = null;
			gS = gR4;
				}
		sortie.add(gS);
		return sortie;
	}
	
	 static Stack<BinTree> f4 (BinTree gX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1;
	
	Stack<BinTree> temp;  
		gR1 = libwh.tl(gX);
		gX = gR1;
		sortie.add(gX);
		return sortie;
	}
	
	
	public static void main(String[] args){
		List<BinTree> in = libwh.inWh(args);
		List<BinTree> out = f0(in.get(0));
		String outprint = "";
		for(BinTree bin : out){
			outprint+= libwh.toInt(bin)+ " ";
		}
		System.out.println(outprint);
	}
	
}
