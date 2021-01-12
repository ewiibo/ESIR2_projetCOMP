
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	static Stack<BinTree> f1 (BinTree iY, BinTree iX){
		Stack<BinTree> sortie = new Stack<BinTree>();	BinTree iR1,iR2,iR3,iZ; 
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
	
	 static Stack<BinTree> f3 (BinTree iB, BinTree iE){
		Stack<BinTree> sortie = new Stack<BinTree>();			Stack<BinTree> temp;  
		libwh.nop();
		sortie.add(iE);
		return sortie;
	}
	
	 public static void main(String[] argv) {
						
		BinTree iR1,iB,iR2,iR3,iR4,iR5,iR6,iY,iZ,iU,iR7,iP,iX; 
				Stack<BinTree> temp;  
		iR1 = libwh.nil();
		iB = iR1;
		iR2 = libwh.nil();
		iR3 = libwh.hd(iR2);
		temp = f1( iR3, iB );
							iR6 = temp.pop();
							iR5 = temp.pop();
							iR4 = temp.pop();
		iY = iR4;
		iZ = iR5;
		iU = iR6;
		iR7 = libwh.nil();
		iP = iR7;
	}
	
	
}
