package org.xtext.generator;

public class Fonction {
	//attributs 
	private String nom;
	private String code;
	
	public Fonction (String nom,String code) {
		this.nom=nom;
		this.code=code;		
	}
	public String getNom(){
		return this.nom;	
	}
	
	public String getCode(){
		return this.code;	
	}
	public void setNom(String nom){
		this.nom=nom;	
	}
	public void setCode(String code){
		this.code=code;	
	}
}
