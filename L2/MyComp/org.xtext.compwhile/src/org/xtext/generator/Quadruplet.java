package org.xtext.generator;

public class Quadruplet<T>{
	private T operateur;
	private String resultat;
	private String arg1;
	private String arg2;
	
	
	public Quadruplet(T operateur, String resultat, String arg1, String arg2) {
		super();
		this.operateur = operateur;
		this.resultat = resultat;
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	
	public T getOperateur() {
		return operateur;
	}

	public void setOperateur(T operateur) {
		this.operateur = operateur;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public String getArg1() {
		return arg1;
	}

	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}

	public String getArg2() {
		return arg2;
	}

	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}

	@Override
	public String toString() {
		return "<" + operateur.toString() + ", '" + resultat + "', '" + arg1 + "', '" + arg2 + "'>";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arg1 == null) ? 0 : arg1.hashCode());
		result = prime * result + ((arg2 == null) ? 0 : arg2.hashCode());
		result = prime * result + ((operateur == null) ? 0 : operateur.hashCode());
		result = prime * result + ((resultat == null) ? 0 : resultat.hashCode());
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
		Quadruplet<?> other = (Quadruplet<?>) obj;
		if (arg1 == null) {
			if (other.arg1 != null)
				return false;
		} else if (!arg1.equals(other.arg1))
			return false;
		if (arg2 == null) {
			if (other.arg2 != null)
				return false;
		} else if (!arg2.equals(other.arg2))
			return false;
		if (operateur == null) {
			if (other.operateur != null)
				return false;
		} else if (!operateur.equals(other.operateur))
			return false;
		if (resultat == null) {
			if (other.resultat != null)
				return false;
		} else if (!resultat.equals(other.resultat))
			return false;
		return true;
	}
	
}
