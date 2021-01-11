
import java.util.*;
import libwh.*;

public class Sortie{
	
	static Libwh libwh = new Libwh();
	public static void main(String[] argv) {
						
		BinTree iR1,iR2,iR3,iR4,iR5,iR6,iR7,iR8,iR9,iR10,iR11,A,iR12,iR13,iR14,B,iR15,iR16,iR17,iR18,iR19,iR20,iR21,iR22,iR23,iR24,iR25,iR26,iR27,iR28,iR29,iR30,iR31,iR32,iR33,C,iR34;   
					
		iR1 = libwh.nil();
		iR2 = libwh.nil();
		iR3 = libwh.cons(iR2, iR1);
		iR4 = libwh.nil();
		iR5 = libwh.cons(iR4, iR3);
		iR6 = libwh.nil();
		iR7 = libwh.cons(iR6, iR5);
		iR8 = libwh.nil();
		iR9 = libwh.cons(iR8, iR7);
		iR10 = libwh.nil();
		iR11 = libwh.cons(iR10, iR9);
		A = iR11;
		iR12 = libwh.nil();
		iR13 = libwh.hd(iR12);
		iR14 = libwh.cons(A, iR13);
		B = iR14;
		if( libwh.isTrue(B)){
							A = B;
					}else {
						iR15 = libwh.nil();
						B = iR15;
							}
		iR16 = libwh.nil();
		iR17 = libwh.nil();
		iR18 = libwh.cons(iR17, iR16);
		iR19 = libwh.nil();
		iR20 = libwh.cons(iR19, iR18);
		iR21 = libwh.nil();
		iR22 = libwh.cons(iR21, iR20);
		B = iR22;
	while( libwh.isTrue(B)){
						iR23 = libwh.tl(B);
						B = iR23;
						A = B;
					}
		iR24 = libwh.hd(A);
		iR25 = libwh.nil();
		iR26 = libwh.tl(iR25);
		iR27 = libwh.cons(iR26, iR24);
		iR28 = libwh.nil();
		iR29 = libwh.cons(iR28, iR27);
		A = iR29;
		iR30 = libwh.hd(A);
		iR31 = libwh.nil();
		iR32 = libwh.nil();
		iR33 = libwh.cons(iR32, iR31);
		B = iR30;
		C = iR33;
	while(libwh.isTrue(A)){
						iR34 = libwh.nil();
						C = iR34;
					A = libwh.tl(A);
					}
		if( libwh.isTrue(B)){
							A = B;
					}
	}
	
	Stack<BinTree> f1 (BinTree X, BinTree Y){
		Stack<BinTree> sortie = new Stack<BinTree>();	BinTree iR1,iR2,iR3,T,iR4,iR5,iR6,iR7,iR8,iR9,A,iR10,iR11,iR12,iR13,B,C,iR14;   
					
		libwh.nop();
		iR1 = libwh.nil();
		Y = iR1;
		iR2 = libwh.nil();
		iR3 = libwh.hd(iR2);
		T = iR3;
		iR4 = libwh.nil();
		iR5 = libwh.hd(Y);
		iR6 = libwh.nil();
		iR7 = libwh.tl(iR6);
		iR8 = libwh.cons(iR7, iR5);
		iR9 = libwh.cons(iR8, iR4);
		A = iR9;
		iR10 = libwh.hd(Y);
		iR11 = libwh.nil();
		iR12 = libwh.nil();
		iR13 = libwh.cons(iR12, iR11);
		B = iR10;
		C = iR13;
	while(libwh.isTrue(A)){
						iR14 = libwh.nil();
						C = iR14;
					A = libwh.tl(A);
					}
		sortie.push(Y);
		return sortie;
	}
	
	
}
