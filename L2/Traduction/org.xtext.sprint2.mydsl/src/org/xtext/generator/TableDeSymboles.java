package org.xtext.generator;
import java.util.HashMap;


public class TableDeSymboles {
	//attributs
	private HashMap<String, Fonction> Table_Symboles_Def ; /// table de symboles définis (fonctions)
	private HashMap<String, String> Table_Symboles_NonDef; // table de symboles non définis (variables globales et autres )	
	int compteur_f;
	int compteur_symb;
	
	public TableDeSymboles()
	{
		this.Table_Symboles_Def = new HashMap<String, Fonction>();
		this.Table_Symboles_NonDef = new HashMap<String, String>();
		this.compteur_f = 0;
		this.compteur_symb = 0;
	}
	//  fonctions

	public String add_Function(Fonction value, String key)
	{
		if(!this.Table_Symboles_Def.containsKey(key)) {
			String nomFonction = "f" + this.compteur_f;
			value.setNom(nomFonction);
			this.Table_Symboles_Def.put(key,value);
			compteur_f++;
		}
		else {
			this.Table_Symboles_Def.get(key).setCode(value.getCode());
		}
		
		return key;
	}
	// Autres symboles 
	public String add_Symb(String key)
	{
		String value = "s"+this.compteur_symb;
		this.Table_Symboles_NonDef.put(key,value);
		compteur_symb++;
		return value;
	}

	@Override
	public String toString()
	{
		return "Table des Fonctions : \n\n" + Table_Symboles_Def.toString() + "\nTable des Symboles : \n\n\n" + 
				Table_Symboles_NonDef.toString();
	}
	

}
