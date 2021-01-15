package org.xtext.generator;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

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
		
		return "TableSymbole [\n"+ mapToString(tableSymbFunc) +"]";
	}
	
	public static String mapToString(Map<String, Func> map) {  
		   StringBuilder stringBuilder = new StringBuilder();  
		  
		   for (String key : map.keySet()) {  
		    
		    Func value = map.get(key);  
		     stringBuilder.append("\t"+(key != null ? key : ""));  
		     stringBuilder.append(" = ");  
		     stringBuilder.append(value != null ? value.toString() : "");  
		     stringBuilder.append("\n");
		   
		   }  
		  
		   return stringBuilder.toString();  
		  }  
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tableSymbFunc == null) ? 0 : tableSymbFunc.hashCode());
		return result;
	}
}
