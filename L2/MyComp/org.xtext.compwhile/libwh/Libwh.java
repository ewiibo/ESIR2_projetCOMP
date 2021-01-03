package libwh;

public class Libwh {

	public Libwh() {
		// TODO Auto-generated constructor stub
	}
	public BinTree hd(BinTree tree) {
		if(tree != null)
			return tree.getLeft();
		return null;
	}
	public BinTree tl(BinTree tree) {
		if(tree!=null)
			return tree.getRigt();
		return null;
	}
	
	public BinTree cons(BinTree left, BinTree right) {
		return new BinTree("",left,right);
	}
	
	public boolean isTrue(BinTree tree) {
		return tree != null;
	}
	public int toInt(BinTree tree) {
		
		int compt = 0;
		BinTree Y = tree;
		while(isTrue(Y)) {
			compt++;
			Y = Y.getRigt();
		}
		return compt;
	}
	
	public void nop() {
		
	}
}
