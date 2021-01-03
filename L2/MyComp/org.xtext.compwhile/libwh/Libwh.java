package libwh;


public class Libwh {

	public Libwh() {
		// TODO Auto-generated constructor stub
	}
	public BinTree hd(BinTree tree) {
		return tree.getLeft();
	}
	public BinTree tl(BinTree tree) {
		return tree.getRigt();
	}
	
	public BinTree cons(BinTree left, BinTree right) {
		return new BinTree("",left,right);
	}
	
	public boolean isTrue(BinTree tree) {
		return true;
	}
	
	public void nop() {
		
	}
}
