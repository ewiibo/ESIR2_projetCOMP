package org.xtext.tests;

import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;
import org.xtext.generator.Main;


public class PrettyPrinterTest {
	String pathCourant = "../../Scripts Test et Comparateur/";
	String dossierOriginaux = pathCourant + "originaux/";
	String dossierResultat = pathCourant+ "resultats/";
	String dossierAttendus = pathCourant + "attendus/";
	
	
	//source, dest, all, for, if , while , affect , foreach
	@Test
	public void function1() {
		String source = dossierOriginaux+ "function1.wh";
		String dest = dossierResultat + "function1.wh";
		String args[] = {source,dest,"1","0","0","0","2","0"};
		generiqueTest(args);
	}
	
	public String[] genParam(String[] args) {
		String[] params = {args[0], "-o", args[1], "-all", args[2], "-for", args[3], "-if", args[4],
				"-while", args[5], "-affect", args[6], "-foreach", args[7]};
		return params;
	}
	
	public void generiqueTest(String [] args) {
		// existance des fichiers
		File original = new File(args[0]);
		assertTrue("Le fichier original : "+ original.getName() + " n'existe pas",original.exists());
		
		Main.main(genParam(args));
		
		File resultat = new File(args[1]);
		
		assertTrue("Le fichier resultat : "+ resultat.getName() + " n'existe pas", resultat.exists());
		File attendu  = new File(dossierAttendus + args[1]);
		
		assertTrue("Le fichier attendu : "+ attendu.getName() + " n'existe pas", attendu.exists());
		
		// Comparaison des fichiers
		//assertSame("Le nom du fichier resultat est different ",attendu.getName(), resultat.getName());
		
		try {
			Scanner scResultat = new Scanner(resultat);
			Scanner scAttendu = new Scanner (attendu);
			String contenuResultat = "", contenuAttendu = "";
			int compteur = 0;
			while(scResultat.hasNext() && scAttendu.hasNext()) {
				compteur++;
				contenuResultat = scResultat.nextLine();
				contenuAttendu = scAttendu.nextLine();
				assertSame("Le contenu des fichiers "+ resultat.getName() + " sont different à la ligne "+ compteur, contenuAttendu, contenuResultat);
				break;
				
			}
			scResultat.close();
			scAttendu.close();
			
			assertTrue("Le fichier "+ resultat.getName() +" n'a pas pu etre supprime ", resultat.delete());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// suppression du fichier resultat
		assertTrue("Le fichier "+ resultat.getName() +" n'a pas pu etre supprime ", resultat.delete());
		
		
	}
	

}
