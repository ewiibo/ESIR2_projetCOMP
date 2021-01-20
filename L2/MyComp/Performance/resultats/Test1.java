
import java.util.*;
import libwh.*;

public class Test1{
	
	static Libwh libwh = new Libwh();
	static Stack<BinTree> f7 (BinTree gX, BinTree gY){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gS,gR1;
	
	Stack<BinTree> temp;  
		gS = gX;
	while(libwh.isTrue(gY)){
			temp = f3( gS );
				gR1 = temp.pop();
				temp = null;
			gS = gR1;
		gY = libwh.tl(gY);
		}
		sortie.add(gS);
		return sortie;
	}
	
	 static Stack<BinTree> f6 (BinTree gX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gR2,gR3,gR4,gR5,gR6,gR7,gB,gR8;
	
	Stack<BinTree> temp;  
	
			gR1 = libwh.nil();
			gR2 = libwh.nil();
			gR3 = libwh.cons(gR2, gR1);
		gR4=libwh.equals(gX,gR3);
			if( libwh.isTrue(gR4)){
				gR5 = libwh.nil();
				gR6 = libwh.nil();
				gR7 = libwh.cons(gR6, gR5);
				gB = gR7;
		}else {
			gR8 = libwh.nil();
			gB = gR8;
				}
		sortie.add(gB);
		return sortie;
	}
	
	 static Stack<BinTree> f5 (BinTree gX, BinTree gY){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gP,gR2;
	
	Stack<BinTree> temp;  
		gR1 = libwh.nil();
		gP = gR1;
	while(libwh.isTrue(gY)){
			temp = f7( gX, gP );
				gR2 = temp.pop();
				temp = null;
			gP = gR2;
		gY = libwh.tl(gY);
		}
		sortie.add(gP);
		return sortie;
	}
	
	 static Stack<BinTree> f12 (BinTree gX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gR2,gR3,gF,gR4,gR5,gR6;
	
	Stack<BinTree> temp;  
		gR1 = libwh.nil();
		gR2 = libwh.nil();
		gR3 = libwh.cons(gR2, gR1);
		gF = gR3;
	
			temp = f1( gX );
				gR4 = temp.pop();
				temp = null;
		while( libwh.isTrue(gR4 )){
			temp = f4( gX );
				gR5 = temp.pop();
				temp = null;
			temp = f5( gF, gX );
				gR6 = temp.pop();
				temp = null;
			gX = gR5;
			gF = gR6;
		
			temp = f1( gX );
				gR4 = temp.pop();
				temp = null;
		}
		sortie.add(gF);
		return sortie;
	}
	
	 static Stack<BinTree> f1 (BinTree gX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1;
	
	Stack<BinTree> temp;  
		gR1 = libwh.nil();
		gX = gR1;
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
	
	 static Stack<BinTree> f8 (BinTree gX, BinTree gY){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gD,gR1;
	
	Stack<BinTree> temp;  
		gD = gX;
	while(libwh.isTrue(gY)){
			temp = f4( gD );
				gR1 = temp.pop();
				temp = null;
			gD = gR1;
		gY = libwh.tl(gY);
		}
		sortie.add(gD);
		return sortie;
	}
	
	 static Stack<BinTree> f13 (BinTree gX, BinTree gY){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gR2,gQ,gR,gR3,gR4,gGCD;
	
	Stack<BinTree> temp;  
		temp = f11( gX, gY );
				gR2 = temp.pop();
				gR1 = temp.pop();
				temp = null;
		gQ = gR1;
		gR = gR2;
	
			temp = f1( gR );
				gR3 = temp.pop();
				temp = null;
			if( libwh.isTrue(gR3 )){
				temp = f13( gY, gR );
					gR4 = temp.pop();
					temp = null;
				gGCD = gR4;
		}else {
			gGCD = gY;
				}
		sortie.add(gGCD);
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
	
	 static Stack<BinTree> f11 (BinTree gX, BinTree gY){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gQ,gR,gR2,gR3,gR4,gR5,gR6;
	
	Stack<BinTree> temp;  
		gR1 = libwh.nil();
		gQ = gR1;
		gR = gX;
	
		
			temp = f10( gR, gY );
				gR2 = temp.pop();
				temp = null;
		
		
		
		gR3=libwh.equals(gR,gY);
		gR4=libwh.or(gR2 ,gR3);
		while( libwh.isTrue(gR4)){
			temp = f8( gR, gY );
				gR5 = temp.pop();
				temp = null;
			gR = gR5;
			temp = f3( gQ );
				gR6 = temp.pop();
				temp = null;
			gQ = gR6;
		
		
			temp = f10( gR, gY );
				gR2 = temp.pop();
				temp = null;
		
		
		
		gR3=libwh.equals(gR,gY);
		gR4=libwh.or(gR2 ,gR3);
		}
		sortie.add(gQ);
		sortie.add(gR);
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
	
	 static Stack<BinTree> f9 (BinTree gX, BinTree gY){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gR2,gR3,gP,gR4;
	
	Stack<BinTree> temp;  
		gR1 = libwh.nil();
		gR2 = libwh.nil();
		gR3 = libwh.cons(gR2, gR1);
		gP = gR3;
	while(libwh.isTrue(gY)){
			temp = f5( gX, gP );
				gR4 = temp.pop();
				temp = null;
			gP = gR4;
		gY = libwh.tl(gY);
		}
		sortie.add(gP);
		return sortie;
	}
	
	 static Stack<BinTree> f10 (BinTree gX, BinTree gY){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gR2,gR,gR3,gR4,gR5,gR6,gR7,gR8,gR9,gR10,gR11,gR12,gR13,gR14,gR15,gR16,gR17;
	
	Stack<BinTree> temp;  
	
		
		gR1=libwh.equals(gX,gY);
			if( libwh.isTrue(gR1)){
				gR2 = libwh.nil();
				gR = gR2;
		}else {
		
			gR3 = libwh.nil();
		gR4=libwh.equals(gX,gR3);
			gR5 = libwh.not(gR4);
		
			gR6 = libwh.nil();
		gR7=libwh.equals(gY,gR6);
			gR8 = libwh.not(gR7);
		gR9=libwh.and(gR5,gR8);
		while( libwh.isTrue(gR9)){
			gR10 = libwh.tl(gX);
			gX = gR10;
			gR11 = libwh.tl(gY);
			gY = gR11;
		
			gR3 = libwh.nil();
		gR4=libwh.equals(gX,gR3);
			gR5 = libwh.not(gR4);
		
			gR6 = libwh.nil();
		gR7=libwh.equals(gY,gR6);
			gR8 = libwh.not(gR7);
		gR9=libwh.and(gR5,gR8);
		}
		
			gR12 = libwh.nil();
		gR13=libwh.equals(gX,gR12);
			if( libwh.isTrue(gR13)){
				gR14 = libwh.nil();
				gR = gR14;
		}else {
			gR15 = libwh.nil();
			gR16 = libwh.nil();
			gR17 = libwh.cons(gR16, gR15);
			gR = gR17;
				}
				}
		sortie.add(gR);
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
	
	 static Stack<BinTree> f14 (BinTree gX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree gR1,gR2,gF,gR3,gR4,gR5,gR6,gR7,gR8,gR9,gR10,gR11,gR12;
	
	Stack<BinTree> temp;  
	
			temp = f2( gX );
				gR1 = temp.pop();
				temp = null;
			if( libwh.isTrue(gR1 )){
				gR2 = libwh.nil();
				gF = gR2;
		}else {
		
			temp = f6( gX );
				gR3 = temp.pop();
				temp = null;
			if( libwh.isTrue(gR3 )){
				gR4 = libwh.nil();
				gR5 = libwh.nil();
				gR6 = libwh.cons(gR5, gR4);
				gF = gR6;
		}else {
			temp = f4( gX );
				gR7 = temp.pop();
				temp = null;
			temp = f14( gR7  );
				gR8 = temp.pop();
				temp = null;
			temp = f4( gX );
				gR9 = temp.pop();
				temp = null;
			temp = f4( gR9  );
				gR10 = temp.pop();
				temp = null;
			temp = f14( gR10  );
				gR11 = temp.pop();
				temp = null;
			temp = f7( gR8 , gR11  );
				gR12 = temp.pop();
				temp = null;
			gF = gR12;
				}
				}
		sortie.add(gF);
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
