package org.xtext.generator;

import java.util.HashMap;

public class TableSymbole {
	

	private HashMap<String, Func> tableSymbFunc;

	public TableSymbole() {
		super();
		tableSymbFunc = new HashMap<String, Func>();
	}
	public void addSymbol(Func entry) {
		tableSymbFunc.put(entry.getName(), entry);
	}
	public void addSymbol(String string, Func entry) {
		tableSymbFunc.put(string, entry);
	}
	
	public String getEtiquette() {
		return "f"+(tableSymbFunc.size());
	}
	public String getNextEtiquette() {
		return "f"+(tableSymbFunc.size()+1);
	}
	public String getPrevEtiquette() {
		return "f"+ (tableSymbFunc.size()-1);
	}
	public  HashMap<String, Func> getTableSymbFunc() {
		return tableSymbFunc;
	}
	public  void setTableSymbFunc(HashMap<String, Func> tableSymbFunc) {
		this.tableSymbFunc = tableSymbFunc;
	}
	
	@Override
	public String toString() {
		return "TableSymbole [\ntableSymbFunc=" + tableSymbFunc +"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tableSymbFunc == null) ? 0 : tableSymbFunc.hashCode());
		return result;
	}
}
