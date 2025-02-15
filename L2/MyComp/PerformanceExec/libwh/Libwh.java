package libwh;

import java.util.*;

public class Libwh {

	public Libwh() {
		// TODO Auto-generated constructor stub
	}
	public BinTree nil() {
		return null;
	}
	public BinTree hd(BinTree tree) {
		if (tree != null)
			return tree.getLeft();
		return null;
	}

	public BinTree tl(BinTree tree) {
		if (tree != null)
			return tree.getRight();
		return null;
	}

	public BinTree cons(BinTree left, BinTree right) {
		return new BinTree("", left, right);
	}

	public boolean isTrue(BinTree tree) {
		return tree != null;
	}
	public BinTree not(BinTree tree) {
		if(tree == null) {
			return new BinTree("",null,null);
		}
		return null;
	}

	public int toInt(BinTree tree) {

		int compt = 0;
		BinTree Y = tree;
		while (isTrue(Y)) {
			compt++;
			Y = Y.getRight();
		}
		return compt;
	}

	public void nop() {
		
	}

	public BinTree or(BinTree X, BinTree Y) {
		return (isTrue(X) || isTrue(Y)) ? X : null;

	}

	public BinTree and(BinTree X, BinTree Y) {
		return (isTrue(X) && isTrue(Y)) ? X : null;
	}
	
	public BinTree equals(BinTree X, BinTree Y) {
		
		return X.equals(Y) ? X : null;
	}
	public BinTree conste(String symbole) {
		return new BinTree(symbole, null, null);
	}

	public BinTree intToBintree(int a) {
        BinTree res = new BinTree("nil", null, null);
        int aR = Math.abs(a);
		if (aR != 0) {
			for (int i = 1; i < aR; i++) {
				BinTree tmp = new BinTree("nil", null, null);
				res = new BinTree("cons", tmp, res);
			}
        }
		return res;
	}

	public BinTree stringToBintree(String val) {
		BinTree resu = new BinTree("nil", null, null);
		int len = val.length();
		for (int i = len-1; i > -1; i--) {
			BinTree tmp = new BinTree(String.valueOf(val.charAt(i)));
			resu = new BinTree("cons", tmp, resu);
		}
		return resu;
	}
	
	public String bintreeToString(BinTree X) {
		String s="";
		if(X.getData()=="nil") {
			return s;
		}
		if(X.getRight().getData() == "nil") {
			return X.getLeft().getData();
		}
		while (X.getRight() != null) {
			s=s + X.getLeft().getData();
			X=X.getRight();
		}
		return s;
	}

	public List<BinTree> inWh(String[] args){
		List<BinTree> l = new ArrayList<>();

		for (String str : args) {
			boolean isNumeric = true;

			isNumeric = str.matches("-?\\d+");
			if (isNumeric) {
				l.add(intToBintree(Integer.parseInt(str)));
			} else {
				l.add(stringToBintree(str));
			}
		}
		return l;
	}
}
