package librairie;

import java.util.List;

public class BinTree {

    private String data;
	private BinTree left;
	private BinTree right;

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

	//Renvoi le sommet du BinTree
	public BinTree head(BinTree tree) {
		if (tree.getLeft() != null) {
			return tree.getLeft();
		}
		return new BinTree("nil", null, null);
	};

	public BinTree tail(BinTree tree) {
		if (tree.getRight() != null) {
			return tree.getRight();
		}
		return new BinTree("nil", null, null);
	};

	public BinTree cons(List<BinTree> args) {
		if (args != null) {
			if (args.size() == 0) {
				return new BinTree("nil", null, null);
			}

			BinTree tree = args.get(0); // retourne le premier element du tableau
			if (args.size() <= 0) {
				return tree;
			} else {
				return new BinTree("cons", tree, cons(args));
			}
		}
		return left;//revoir
	};


	public BinTree list(List<BinTree> args) {
		if (args != null) {
			if (args.size() == 0) {
				return new BinTree("nil", null, null);
			}

			BinTree tree = args.get(0);
			if (args.size() <= 0) {
				return new BinTree("list", tree, new BinTree("nil", null, null));
			} else {
				return new BinTree("list", tree, list(args));
			}
		}
		return null;//revoir
	};


	public BinTree evaluate(String operand,BinTree tree1,BinTree tree2) {
		if (operand == "AND")
		 { 
			 if(tree1.getData() == "nil" || tree2.getData() == "nil")
			 {
				 return new BinTree("nil", null, null);
			 } 
			 else
			 {
				 return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
			 } 
		 }else if(operand == "OR")
		 {
			 if(tree1.getData() == "nil" && tree2.getData() == "nil")
			 {
				return new BinTree("nil", null, null); 
			 } 
			 else
			 {
				 return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
			 }
		 }
		 else if(operand == "EQ"){
			 if( !evaluateEQ(tree1,tree2))
			 {
				 return new BinTree("nil", null, null);
			 }else{
				 return new BinTree("cons", new BinTree("nil", null, null), new BinTree("nil", null, null));
			 }
		 }return null;
 
	 }

	 

		

}
