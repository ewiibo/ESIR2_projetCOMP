package org.xtext.generator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.xtext.whileL.AffectCommand;

public class TroisAdd {

	private HashMap<String, LinkedList<Quadruplet<OpImpl>>> code3AddressH = new HashMap<String, LinkedList<Quadruplet<OpImpl>>>();
	public LinkedList<Quadruplet<OpImpl>> code3Address = new LinkedList<Quadruplet<OpImpl>>();
	
	
	public LinkedList<Quadruplet<OpImpl>> getCode3Address() {
		return code3Address;
	}
	
	public void saveFunc3Add(String funcName) {
		code3AddressH.put(funcName, code3Address); /*getEtiquetteSuiv()*/
		code3Address = new LinkedList<Quadruplet<OpImpl>>();
	}
	public HashMap<String, LinkedList<Quadruplet<OpImpl>>> getCode3AddressH() {
		return code3AddressH;
	}

	public void setCode3AddressH(HashMap<String, LinkedList<Quadruplet<OpImpl>>> code3AddressH) {
		this.code3AddressH = code3AddressH;
	}

	public void setCode3Address(LinkedList<Quadruplet<OpImpl>> code3Address) {
		this.code3Address = code3Address;
	}
	
	//Methode d'Ajout d'un code 3 adresse
	public void addCode3Address(Quadruplet<OpImpl> quad) {
		this.code3Address.add(quad);
	}
	public void addCode3Address(Op op, String res , String arg1, String arg2) {
		addCode3Address(new Quadruplet<OpImpl>(new OpImpl(op,""), res, arg1, arg2));
	}
	public void addCode3Address(Op op, String et, String res , String arg1, String arg2) {
		addCode3Address(new Quadruplet<OpImpl>(new OpImpl(op,et), res, arg1, arg2));
	}
	public void addCode3Adress(OpImpl op , String res, String arg1, String arg2) {
		addCode3Address(new Quadruplet<OpImpl>(op, res, arg1, arg2));
	}
	
	//Gestion des etiquettes
	public String getEtiquette() {
		return "L"+ code3AddressH.size();
	}
	public String getEtiquetteSuiv() {
		return "L"+ code3AddressH.size()+1;
	}
	public String getEtiquettePrec() {
		return  "L"+(code3AddressH.size()-1);
	}
	
	
	// Ajout des opérations dans la liste des codes 3 adresses
	
	public void putFun(String name) {
		addCode3Address(Op.Func, name, "", "" );
	}
	public static Quadruplet<OpImpl> nope3Adresse() {
		return new Quadruplet<OpImpl>(new OpImpl(Op.Nop, ""), "", "", "");
	}
	public static Quadruplet<OpImpl> nil3Adresse(){
		return new Quadruplet<OpImpl>(new OpImpl(Op.Nil, ""), "", "", "");
	}
	public static Quadruplet<OpImpl> var3Adresse(){
		return new Quadruplet<OpImpl>(new OpImpl(Op.Affec, ""), "", "", "");
	}
	public void putRead(String res) {
		addCode3Address(Op.Read, res, "", "");
	}
	public void putWrite(String res) {
		addCode3Address(Op.Write, res, "", "");
	}
	
	//Gerer les affectations
	public void putAff(AffectCommand com) {
		System.out.println(com.getVars().getVari().size());
		System.out.println(com.getExprs().getExpr().size());
		if(com.getVars().getVari().size()==com.getExprs().getExpr().size()) {
			Iterator<?> itv = com.getVars().getVari().iterator();
			Iterator<?> ite = com.getExprs().getExpr().iterator();
			while(itv.hasNext()) {
				System.out.println(itv.next());
				System.out.println(ite.next());
			}
		}
		
	}
	@Override
	public String toString() {
		String code3Add = "Code3Addresse : \n\n";
		for (String key : code3AddressH.keySet()) {
			LinkedList<Quadruplet<OpImpl>>codes = code3AddressH.get(key);
			for(Quadruplet<OpImpl> code: codes) {
				code3Add+=code.toString();
				code3Add+="\n";
			}
		}
		return code3Add;
	}
}

