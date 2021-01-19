package org.xtext.generator.libwh;

public class BinTree {
	
	String data;
	BinTree left, right;
	public BinTree(String data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BinTree(String data, BinTree left, BinTree right) {
		this.data = data;
		this.left = left;
		this.right = right;
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
	public BinTree getRight() {
		return right;
	}
	public void setRight(BinTree right) {
		this.right = right;
	}
	@Override
	public String toString() {
		return "BinTree [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinTree other = (BinTree) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}
}
