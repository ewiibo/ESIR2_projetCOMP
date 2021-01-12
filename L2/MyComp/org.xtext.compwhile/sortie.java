
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	static Stack<BinTree> f (BinTree X, BinTree Y){
		Stack<BinTree> sortie = new Stack<BinTree>();	BinTree iR1,iR2,iR3,Z; 
				Stack<BinTree> temp;  
		iR1 = libwh.nil();
		iR2 = libwh.nil();
		iR3 = libwh.cons(iR2, iR1);
		Z = iR3;
		sortie.add(X);
		sortie.add(Y);
		sortie.add(Z);
		return sortie;
	}
	
	 public static void main(String[] argv) {
						
		BinTree iR1,B,iR2,iR3,iR4,iR5,iR6,Y,Z,U,iR7,P,X; 
				Stack<BinTree> temp;  
		iR1 = libwh.nil();
		B = iR1;
		iR2 = libwh.nil();
		iR3 = libwh.hd(iR2);
		temp = f( iR3, B );
		System.out.println(temp);
							iR6 = temp.pop();
							iR5 = temp.pop();
							iR4 = temp.pop();
		Y = iR4;
		Z = iR5;
		U = iR6;
		System.out.println(U);
		iR7 = libwh.nil();
		P = iR7;
	}
	
	
}
