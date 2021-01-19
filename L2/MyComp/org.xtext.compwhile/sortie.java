
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	static Stack<BinTree> f8 (BinTree iY, BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iS,iR1;
	
	Stack<BinTree> temp;  
		iS = iX;
	while(libwh.isTrue(iY)){
			temp = f3( iS );
				iR1 = temp.pop();
				temp = null;
			iS = iR1;
		iY = libwh.tl(iY);
		}
		sortie.add(iS);
		return sortie;
	}
	
	 static Stack<BinTree> f7 (BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iR2,iR3,iB,iR4;
	
	Stack<BinTree> temp;  
		if( libwh.isTrue(iX)){
				iR1 = libwh.nil();
				iR2 = libwh.nil();
				iR3 = libwh.cons(iR2, iR1);
				iB = iR3;
		}else {
			iR4 = libwh.nil();
			iB = iR4;
				}
		sortie.add(iB);
		return sortie;
	}
	
	 static Stack<BinTree> f6 (BinTree iY, BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iP,iR2;
	
	Stack<BinTree> temp;  
		iR1 = libwh.nil();
		iP = iR1;
	while(libwh.isTrue(iY)){
			temp = f8( iX, iP );
				iR2 = temp.pop();
				temp = null;
			iP = iR2;
		iY = libwh.tl(iY);
		}
		sortie.add(iP);
		return sortie;
	}
	
	 static Stack<BinTree> f11 (BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iR2,iR3,iF,iR4,iR5,iR6;
	
	Stack<BinTree> temp;  
		iR1 = libwh.nil();
		iR2 = libwh.nil();
		iR3 = libwh.cons(iR2, iR1);
		iF = iR3;
	
			temp = f1( iX );
				iR4 = temp.pop();
				temp = null;
		while( libwh.isTrue(iR4 )){
			temp = f4( iX );
				iR5 = temp.pop();
				temp = null;
			temp = f6( iF, iX );
				iR6 = temp.pop();
				temp = null;
			iX = iR5;
			iF = iR6;
		}
		sortie.add(iF);
		return sortie;
	}
	
	 static Stack<BinTree> f1 (BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	
	Stack<BinTree> temp;  
		libwh.nop();
		sortie.add(iX);
		return sortie;
	}
	
	 static Stack<BinTree> f3 (BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iR2;
	
	Stack<BinTree> temp;  
		iR1 = libwh.nil();
		iR2 = libwh.cons(iR1, iX);
		iX = iR2;
		sortie.add(iX);
		return sortie;
	}
	
	 static Stack<BinTree> f9 (BinTree iY, BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iD,iR1;
	
	Stack<BinTree> temp;  
		iD = iX;
	while(libwh.isTrue(iY)){
			temp = f4( iD );
				iR1 = temp.pop();
				temp = null;
			iD = iR1;
		iY = libwh.tl(iY);
		}
		sortie.add(iD);
		return sortie;
	}
	
	 static Stack<BinTree> f13 (BinTree iY, BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iR2,iR3,iZ;
	
	Stack<BinTree> temp;  
		iR1 = libwh.nil();
		iR2 = libwh.nil();
		iR3 = libwh.cons(iR2, iR1);
		iZ = iR3;
		sortie.add(iX);
		sortie.add(iY);
		sortie.add(iZ);
		return sortie;
	}
	
	 static Stack<BinTree> f15 (BinTree iB, BinTree iE){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	
	Stack<BinTree> temp;  
		libwh.nop();
		sortie.add(iE);
		return sortie;
	}
	
	 static Stack<BinTree> f0 (BinTree iA, BinTree iB, BinTree iC, BinTree iD){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iR2,iX,iR3,iR4,iR5,iR6,iR7,iY,iZ,iU,iR8,iP;
	
	Stack<BinTree> temp;  
		iR1 = libwh.nil();
		iB = iR1;
		iR2 = libwh.nil();
		iX = iR2;
		iR3 = libwh.nil();
		iR4 = libwh.hd(iR3);
		temp = f13( iR4, iB );
				iR7 = temp.pop();
				iR6 = temp.pop();
				iR5 = temp.pop();
				temp = null;
		iY = iR5;
		iZ = iR6;
		iU = iR7;
		iR8 = libwh.nil();
		iP = iR8;
		sortie.add(iX);
		return sortie;
	}
	
	 static Stack<BinTree> f2 (BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iB,iR2,iR3,iR4;
	
	Stack<BinTree> temp;  
		if( libwh.isTrue(iX)){
				iR1 = libwh.nil();
				iB = iR1;
		}else {
			iR2 = libwh.nil();
			iR3 = libwh.nil();
			iR4 = libwh.cons(iR3, iR2);
			iB = iR4;
				}
		sortie.add(iB);
		return sortie;
	}
	
	 static Stack<BinTree> f10 (BinTree iY, BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iR2,iR3,iP,iR4;
	
	Stack<BinTree> temp;  
		iR1 = libwh.nil();
		iR2 = libwh.nil();
		iR3 = libwh.cons(iR2, iR1);
		iP = iR3;
	while(libwh.isTrue(iY)){
			temp = f6( iX, iP );
				iR4 = temp.pop();
				temp = null;
			iP = iR4;
		iY = libwh.tl(iY);
		}
		sortie.add(iP);
		return sortie;
	}
	
	 static Stack<BinTree> f5 (BinTree iY, BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iS,iR2,iR3,iR4;
	
	Stack<BinTree> temp;  
	
			temp = f2( iY );
				iR1 = temp.pop();
				temp = null;
			if( libwh.isTrue(iR1 )){
				iS = iX;
		}else {
			temp = f4( iY );
				iR2 = temp.pop();
				temp = null;
			temp = f5( iX, iR2  );
				iR3 = temp.pop();
				temp = null;
			temp = f3( iR3  );
				iR4 = temp.pop();
				temp = null;
			iS = iR4;
				}
		sortie.add(iS);
		return sortie;
	}
	
	 static Stack<BinTree> f4 (BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1;
	
	Stack<BinTree> temp;  
		iR1 = libwh.tl(iX);
		iX = iR1;
		sortie.add(iX);
		return sortie;
	}
	
	 static Stack<BinTree> f12 (BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();
		
	BinTree iR1,iR2,iF,iR3,iR4,iR5,iR6,iR7,iR8,iR9,iR10,iR11,iR12;
	
	Stack<BinTree> temp;  
	
			temp = f2( iX );
				iR1 = temp.pop();
				temp = null;
			if( libwh.isTrue(iR1 )){
				iR2 = libwh.nil();
				iF = iR2;
		}else {
		
			temp = f7( iX );
				iR3 = temp.pop();
				temp = null;
			if( libwh.isTrue(iR3 )){
				iR4 = libwh.nil();
				iR5 = libwh.nil();
				iR6 = libwh.cons(iR5, iR4);
				iF = iR6;
		}else {
			temp = f4( iX );
				iR7 = temp.pop();
				temp = null;
			temp = f12( iR7  );
				iR8 = temp.pop();
				temp = null;
			temp = f4( iX );
				iR9 = temp.pop();
				temp = null;
			temp = f4( iR9  );
				iR10 = temp.pop();
				temp = null;
			temp = f12( iR10  );
				iR11 = temp.pop();
				temp = null;
			temp = f8( iR8 , iR11  );
				iR12 = temp.pop();
				temp = null;
			iF = iR12;
				}
				}
		sortie.add(iF);
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
