package org.xtext.generator;

import java.io.File;

import org.eclipse.xtext.generator.GeneratorContext;
import org.xtext.validation.LggeWhileValidator;


public class PrettyPrinter {
	
	private int iAll, iFor, iWhile, iIf, iForeach, iAffect;
	private String inputFile, outputFile;
	GeneratorContext generator;
	LggeWhileValidator validator;
	
	
	public PrettyPrinter(String input, String output) {
		this.inputFile = input;
		this.outputFile = output;
		iAll = 1;
		iFor = 0;
		iWhile = 0;
		iIf = 0;
		iForeach = 0;
		iAffect = 1;
	}
	public PrettyPrinter(String input, String output, String all, String iFor,String iWhile,  String iIf, String iForeach, String iAffect) {
		
		this.inputFile = input;
		this.outputFile = output.equals("") ? inputFile : output;
		this.iAll = all.equals("") ? 1 : Integer.parseInt(all);
		this.iFor = iFor.equals("") ? 0 : Integer.parseInt(iFor);
		this.iWhile = iWhile.equals("") ? 0 : Integer.parseInt(iWhile);
		this.iIf = iIf.equals("") ? 0 : Integer.parseInt(iIf);
		this.iForeach = iForeach.equals("") ? 0 : Integer.parseInt(iForeach);
		this.iAffect = iAffect.equals("") ? 1 : Integer.parseInt(iAffect);
	}
	

	public void generate() {
		
	}
	
	public static void main(String[] args) {
		File file = new File(".");
		System.out.println(file.getAbsolutePath());
		System.out.println(System.getProperty("java.runtime.version"));
		
	}

}
