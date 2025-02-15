package org.xtext.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Func {
	
	private int in, out;
	private String name;
	private ArrayList<String> vars;
	private int varCount = 0;
	
	public Func(String name) {
		super();
		this.name = name;
		vars = new ArrayList<String>();
	}
	public Func(int in, int out, String name) {
		super();
		this.in = in;
		this.out = out;
		this.name = name;
	}
	public Func(int in, int out, String name, ArrayList<String>vars) {
		super();
		this.in = in;
		this.out = out;
		this.name = name;
		this.vars = new ArrayList<String>();
	}
	public int getIn() {
		return in;
	}
	public void setIn(int in) {
		this.in = in;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = out;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<String> getVars() {
		return vars;
	}
	public void setVars(ArrayList<String> vars) {
		this.vars = vars;
	}
	public void addVar(String var) {
		if(!vars.contains(var)) vars.add(var);
		
	}
	
	public boolean isVarExist(String var) {
		return vars.contains(var) ? true : false;
	}
	public int getVarCount() {
		return varCount;
	}
	public void setVarCount(int varCount) {
		this.varCount = varCount;
	}
	
	public String addVarGenere() {
		this.varCount++;
		this.addVar("gR"+this.varCount);
		return vars.get(vars.size()-1);
	}
	public String getVarGenere() {
		this.varCount++;
		return "gR"+this.varCount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + in;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + out;
		result = prime * result + ((vars == null) ? 0 : vars.hashCode());
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
		Func other = (Func) obj;
		if (in != other.in)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (out != other.out)
			return false;
		if (vars == null) {
			if (other.vars != null)
				return false;
		} else if (!vars.equals(other.vars))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Func [ name=" + name + ", in=" + in + ", out=" + out + ", vars=" + vars.toString() + "]";
	}
	public static <T> boolean isDuplicate(Collection<T> collection) {
		Set<T> set = new HashSet<T>(collection);
		if(set.size()<collection.size())
			return true;
		else
			return false;
		
	}

	public Set<String> varIn = new HashSet<>();
	public Set<String> varOut = new HashSet<>();

}
