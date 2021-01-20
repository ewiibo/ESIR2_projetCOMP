package org.xtext.generator;

import com.google.inject.Inject;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

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
	public static String outputDir ="./";
	public static boolean code = false, tab = false, debug = false, time =false;
	

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
		try {
			if(time) {
				long debut = System.currentTimeMillis();
				main.runGenerator();
				long fin = System.currentTimeMillis();
				System.out.println("[INFO] Time : "+ (fin-debut));
			}else {
				main.runGenerator();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("[Error] "+e.getMessage());
		}
	}
	
	static String stripExtension (String str) {
        if (str == null) return null;
        int pos = str.lastIndexOf(".");
        if (pos == -1) return str;
        return str.substring(0, pos);
    }
	private static int recupParam(String[] args) {
		
		try {
			if(args[0].equals("-help"))
			{
				manuel(); return -1;
			}
			inputFile = args[0];
			for(int i=1; i<args.length; i++) {
				switch (args[i]) {
				case "-d":
					outputDir = args[++i]+"/";
					break;
				case "-code":
					code = true;
					break;
				case "-time":
					time = true;
					break;
				case "-tab":
					tab = true;
					break;
				case "-debug":
					debug = true;
					break;

				default:
					System.out.println("Error in the options entered !");
					System.out.println("whc.exe <inputFile> [-<option>]" );
					System.out.println("For more information : whpp.exe -help");
					break;
				}
			}
			System.out.println("");			
			
			
		}
		catch (NumberFormatException e) {
			System.out.println("Parameter values must be numbers!");
			System.out.println("whpp.exe <inputFile> [-<option> <valeur>]" );
			System.out.println("For more information : whpp.exe -help");
			return -1;
		}
		return 0;
		
	}
	
	private static void manuel() {
		System.out.println("NAME\n"
				+ "\tjava command runs a Java program from a command promt. The basic syntax is : \n\tjava filename [options]\n\tWhen we run the java command, the JRE is loaded along with the class we specify.\r\n"
				+ "\tIt is possible to specify other options using the program options. \n\tThese options are available later in this help. \n"
				+ "	\n"
				+ "SYNOPSIS\n"
				+ "	java -jar whc.jar <InputFile> [-d <destination path>] [-time] [-code] [-tab] [-debug]\n"
				+ "			\n"
				+ "DESCRIPTION\n"
				+"\tjava allows you to compile your file in WHILE LANGUAGE ​​using the following options:\n"
				+ "	-jar       :	\n\t\t Name of the compilator, by default whc.jar\n"
				+ "	-time     :  \n\t\t Display compilation duration\n\n"
				+ "	-code      :  \n\t\t Display the 3 address code\n\n"
				+ "	-tab     :	\n\t\t Display symbol table\n\n"
				+ "	-debug :	\n\t\t Display the all options\n\n"
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
	private WhileLGen generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator() throws Exception {
		// existe du fichier source
		File input = new File(inputFile);
		if(!input.exists()) {
			System.out.println("The file "+ input.getName()+" was not found !");
			return;
		}
		String inputFileWithoutExtension = stripExtension(input.getName());
		inputFileWithoutExtension = inputFileWithoutExtension.substring(0, 1).toUpperCase() + 
				inputFileWithoutExtension.substring(1);
		
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
		fileAccess.setOutputPath(outputDir);
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		generator.doGenerate(resource, fileAccess, context, inputFileWithoutExtension);
		System.out.println("[INFO] Code generation finished.");
		// Ecrire le code qui compile
		
		try{
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("javac "+ outputDir+inputFileWithoutExtension+".java ./libwh/BinTree.java ./libwh/Libwh.java ");
            new Thread(() -> {
                BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                BufferedReader error = new BufferedReader(new InputStreamReader(pr.getErrorStream()));
                String line = null;
                try {
                    while ((line = in.readLine()) != null)
                        System.out.println(line);
                    while ((line = error.readLine()) != null)
                        System.out.println(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            
            pr.waitFor();
        }
        catch(InterruptedException e){
            System.err.println(e);
        }
        catch(IOException e ){
            System.err.println(e);

        }
		
		//Ecrire le code qui execute
		
		/*try{
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("java -cp . Sortie ");
            new Thread(() -> {
                BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
                BufferedReader error = new BufferedReader(new InputStreamReader(pr.getErrorStream()));
                String line = null;

                try {
                    while ((line = in.readLine()) != null)
                        System.out.println(line);
                    while ((line = error.readLine()) != null)
                        System.out.println(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
            
            pr.waitFor();
        }
        catch(InterruptedException e){
            System.err.println(e);
        }
        catch(IOException e ){
            System.err.println(e);

        }
*/
		System.out.println("[INFO] Code compilation finished.");
	}
}