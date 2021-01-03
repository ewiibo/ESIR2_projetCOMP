package libwh;

public class BinTree {
	String data;
	BinTree left, rigt;
	public BinTree(String data) {
		this.data = data;
		this.left = null;
		this.rigt = null;
	}
	
	public BinTree(String data, BinTree left, BinTree rigt) {
		this.data = data;
		this.left = left;
		this.rigt = rigt;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public BinTree getLeft() {
		return left;
	}
	public void setLeft(BinTree left) {
		this.left = left;
	}
	public BinTree getRigt() {
		return rigt;
	}
	public void setRigt(BinTree rigt) {
		this.rigt = rigt;
	}
	@Override
	public String toString() {
		return "BinTree [data=" + data + ", left=" + left + ", rigt=" + rigt + "]";
	}
}
