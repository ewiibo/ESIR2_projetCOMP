/*
 * generated by Xtext 2.23.0
 */
package org.xtext.generator;

import com.google.inject.Inject;
import java.io.File;
import com.google.inject.Injector;
import com.google.inject.Provider;

import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.LggeWhileStandaloneSetup;

public class Main {
	
	public static String inputFile= "",  outputFile = "" ;
	public static int iAll = 2, iFor = 0, iWhile = 0, iIf = 0, iForeach=0, iAffect=0;
	

	public static void main(String[] args) {
		if (args.length == 0) {
			//System.err.println("Aborting: no path to EMF resource provided!");
			manuel();
			return;
		}
		//File file = new File(".");
		//System.out.println(file.getAbsolutePath());
		Injector injector = new LggeWhileStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		
		if(recupParam(args)==-1) return;
		main.runGenerator();
	}
	
	private static int recupParam(String[] args) {
		
		try {
			if(args[0].equals("-help"))
			{
				manuel(); return -1;
			}
			inputFile = args[0];
			//System.out.println(inputFile);
			
			// recuperation des parametres passées par commande
			for(int i=1; i<args.length; i++) {
				switch (args[i]) {
				case "-o":
					outputFile = args[++i];
					break;
				case "-all":
					iAll = Integer.parseInt(args[++i]);
					break;
				case "-for":
					iFor = Integer.parseInt(args[++i]);
					break;
				case "-while":
					iWhile = Integer.parseInt(args[++i]);
					break;
				case "-if":
					iIf = Integer.parseInt(args[++i]);
					break;
				case "-foreach":
					iForeach = Integer.parseInt(args[++i]);
					break;
				case "-affect":
					iAffect = Integer.parseInt(args[++i]);
					break;

				default:
					System.out.println("Error in the options entered !");
					System.out.println("whpp.exe <inputFile> [-<option> <value>]" );
					System.out.println("For more information : whpp.exe -help");
					break;
				}
			}
			
			// Affectation des valeurs par defaut
			if(iFor == 0) iFor = iAll;
			if(iWhile == 0) iWhile = iAll;
			if(iIf == 0) iIf = iAll;
			if(iForeach == 0) iForeach = iAll;
			if(iAffect == 0) iAffect = iAll;
		}
		catch (NumberFormatException e) {
			System.out.println("Parameter values must be numbers!");
			System.out.println("whpp.exe <inputFile> [-<option> <valeur>]" );
			System.out.println("For more information : whpp.exe -help");
			return -1;
		}
		catch (Exception e) {
			System.out.println("Error in the parameters entered !\n");
			manuel();
			return -1;
		}
		return 0;
		
	}
	
	private static void manuel() {
		System.out.println("NAME\n"
				+ "\twhpp reads a syntactically correct while file and returns a syntactically equivalent\n\twhile file but nicely composed with spaces, indetations and newlines.\r\n"
				+ "\tIt is possible to specify identations to it by passing values ​​to it using the program options. \n\tThese options are available later in this help. \n"
				+ "	\n"
				+ "SYNOPSIS\n"
				+ "	whpp <InputFile> [-o <OutputFile>] [-all <number>] [-if <number>] [-for <number>]\n\t [-foreach <number>] [-while <number>]\n"
				+ "			\n"
				+ "DESCRIPTION\n"
				+"\twhpp allows you to change the indentation values ​​using the following options:\n"
				+ "	-o       :	\n\t\t Name of the output file, by default <InputFile>.whpp\n"
				+ "	-all     :  \n\t\t Indentation value to be applied to the whole document, by default, it is 2\n\n"
				+ "	-if      :  \n\t\t Indentation value specific to if\n\n"
				+ "	-for     :	\n\t\t Indentation value specific to for\n\n"
				+ "	-foreach :	\n\t\t Indentation value specific to foreach\n\n"
				+ "	-while   :	\n\t\t Indentation value specific to while\n\n"
				+ "	\n"
				+ "AUTHORS	\n"
				+ "	Written by ANFANE Saoussane , BEN ISHAK Nawel Sirine, ILLIASSOU ZOUGAOU Ibrahim​,\n"
				+ "\tAGUERDOUM EL IDRISSI Anas and ​N'GORAN Jean Paul Kotcheko\n"
				+ "\n"
				+ "\n"
				+ "");
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private LggeWhileGenerator generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator() {
		// existe du fichier source
		File input = new File(inputFile);
		if(!input.exists()) {
			System.out.println("The file "+ input.getName()+" was not found !");
			return;
		}
		
		// nom du fichier dest
		if(outputFile.equals(""))
			outputFile = inputFile;//.split(".")[0] + "whpp";
		
		
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(inputFile), true);

		// Validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			System.out.println("There are errors in the program .WHILE program synthaxically incorrect");
			for (Issue issue : list) {
				System.out.println(issue);
			}
			return;
		}

		// Configure and start the generator
		fileAccess.setOutputPath("./");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		generator.doGenerate(resource, fileAccess, context, outputFile, iAll, iAffect, iIf,iFor, iWhile, iForeach );

		System.out.println("Code generation finished.");
	}
}
