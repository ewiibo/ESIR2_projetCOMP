package org.xtext.generator;

public class OpImpl {
	
	private Op operator;
	private String etiquette;
	

	public OpImpl(Op operator, String etiquette) {
		super();
		this.operator = operator;
		this.etiquette = etiquette;
	}
	public Op getOperator() {
		return operator;
	}
	public void setOperator(Op operator) {
		this.operator = operator;
	}
	public String getEtiquette() {
		return etiquette;
	}
	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}
	
	@Override
	public String toString() {
		//return "OpImpl [operator=" + operator + ", etiquette=" + etiquette + "]";
		return operator.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((etiquette == null) ? 0 : etiquette.hashCode());
		result = prime * result + ((operator == null) ? 0 : operator.hashCode());
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
		OpImpl other = (OpImpl) obj;
		if (etiquette == null) {
			if (other.etiquette != null)
				return false;
		} else if (!etiquette.equals(other.etiquette))
			return false;
		if (operator == null) {
			if (other.operator != null)
				return false;
		} else if (!operator.equals(other.operator))
			return false;
		return true;
	}
	
	
}
