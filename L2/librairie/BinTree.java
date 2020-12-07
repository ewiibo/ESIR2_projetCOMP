package librairie;

public class BinTree {

    private String data;
	private BinTree left;
	private BinTree right;

	/**
	 * Constructor of the BinTree class.
	 * 
	 * @param {*} data : Value of the node.
	 * @param {*} leftTree : data's left BinTree.
	 * @param {*} rightTree : data's right BinTree.
	 */
	public BinTree(String data, BinTree leftTree, BinTree rightTree) {
		this.data = data;
		if (this.data != "nil") {
			this.left = leftTree;
			this.right = rightTree;
		} else {
			this.left = null;
			this.right = null;
		}
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


	public void setLeft(BinTree leftTree) {
		if (leftTree.getData() != "nil") {
			this.left = leftTree;
		}
		
	}

	public BinTree getRight() {
		return right;	
	}

	public void setRight(BinTree rightTree) {
		if (rightTree.getData() != "nil") {
			this.right = rightTree;
		}
    }
    

}
