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
import org.xtext.WhileLStandaloneSetup;

public class Main {
	
	public static String inputFile= "";
	

	public static void main(String[] args) {
		if (args.length == 0) {
			//System.err.println("Aborting: no path to EMF resource provided!");
			manuel();
			return;
		}
		//File file = new File(".");
		//System.out.println(file.getAbsolutePath());
		Injector injector = new WhileLStandaloneSetup().createInjectorAndDoEMFRegistration();
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
		
		}
		catch (Exception e) {
			System.out.println("Error in the parameters entered !\n");
			manuel();
			return -1;
		}
		return 0;
		
	}
	
	private static void manuel() {
		System.out.println("Dans le help");
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private WhileLGen generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator() {
		// existe du fichier source
		File input = new File(inputFile);
		if(!input.exists()) {
			System.out.println("The file "+ input.getName()+" was not found !");
			return;
		}
		
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
		generator.doGenerate(resource, fileAccess, context);

		System.out.println("Code generation finished.");
		
		// Ecrire le code qui compile
		
		
		//Ecrire le code qui execute
		
		
		
	}
}