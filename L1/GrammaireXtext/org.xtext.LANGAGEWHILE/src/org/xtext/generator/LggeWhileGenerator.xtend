/*
 * generated by Xtext 2.23.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.lggeWhile.Function
import org.xtext.lggeWhile.Program
import org.xtext.lggeWhile.Definition
import org.xtext.lggeWhile.WhileCommand
import org.xtext.lggeWhile.IfCommand
import org.xtext.lggeWhile.ForCommand
import org.xtext.lggeWhile.AffectCommand
import org.xtext.lggeWhile.ForeachCommand
import org.xtext.lggeWhile.NopCommand
import org.xtext.lggeWhile.Command

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LggeWhileGenerator extends AbstractGenerator {

	int all;int iAffect; int iIf
	int iFor; int iWhile;int iForeach
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
	}
	
	def doGenerate(Resource resource , IFileSystemAccess2 fsa, IGeneratorContext context, String outputfile, int all, int iAffect,  int iIf, int iFor, int iWhile, int iForeach){
		this.all = all
		this.iAffect = iAffect
		this.iIf = iIf
		this.iFor = iFor
		this.iWhile = iWhile
		this.iForeach = iForeach
		for (p : resource.allContents.toIterable.filter(Program)) {
			fsa.generateFile(outputfile,p.compile())
		}
	}
	
	def compile(Program prog){
		var functi =''''''
		
		for (func : prog.functions){
			functi += func.compile()
		}
		return functi
		
	}
	
	def compile(Function func){
		return '''
		function �func.symbol�:
		�func.definition.compile()�
		'''
	}
	
	def compile (Definition d){
		'''
		read �FOR param: d.input.vars SEPARATOR ', '��param��ENDFOR�
		%
		�var space = ""��for (var i = 0 ; i <all ; i++) space += ' '��FOR com : d.commands.commands SEPARATOR ';\n'��com.compile(space)��ENDFOR�
		%
		write �FOR param: d.output.vars SEPARATOR ', '��param��ENDFOR�
		
		'''
	}
	
	def compile(Command c, String space){
		if(c instanceof WhileCommand) return c.compile(space)
		if(c instanceof IfCommand) return c.compile(space)
		if(c instanceof ForCommand) return c.compile(space)
		if(c instanceof AffectCommand) return c.compile(space)
		if(c instanceof ForeachCommand) return c.compile(space)
		if(c instanceof NopCommand) {return '''�space�nop'''}
	}
	/*def compile(Commands cs, int all, int iAffect, int iIf, int iFor, int iWhile, int iForeach){
		var csVal = ""
		for (comd : cs.commands){
			if(comd instanceof WhileCommand) csVal += comd.compile(all,iAffect,iIf,iFor,iWhile,iForeach)
			if(comd instanceof IfCommand) csVal += comd.compile(all,iAffect,iIf,iFor,iWhile,iForeach)
			if(comd instanceof ForCommand) csVal += comd.compile(all,iAffect,iIf,iFor,iWhile,iForeach)
			if(comd instanceof AffectCommand) csVal += comd.compile(all,iAffect,iIf,iFor,iWhile,iForeach)
			if(comd instanceof ForeachCommand) csVal += comd.compile(all,iAffect,iIf,iFor,iWhile,iForeach)
			if(comd instanceof NopCommand) csVal += '''nop'''
		}
		'''
		�csVal�
		'''
	}*/
	def compile(WhileCommand w, String space){
		
		var spaceW = ""
		for (var i = 0 ; i <iWhile ; i++) spaceW += ' '
		spaceW = spaceW+space
		var content = ""
		for(com : w.commands.commands){
			content += com.compile(spaceW)
		}
		
		return '''
		�space�while �w.expr� do
		�FOR com : w.commands.commands SEPARATOR ";\n"��com.compile(spaceW)��ENDFOR�
		�space�od
		'''
	}
	
	def compile(IfCommand i, String space){
		var spaceI = ""
		for (var j = 0 ; j <iIf ; j++) spaceI += ' '
		spaceI = spaceI+space
		var content = ""
		for(com : i.commands.commands){
			content += com.compile(spaceI)
		}
		
		return '''
		�space�if �i.expr� then
		�FOR com : i.commands.commands SEPARATOR ";\n"��com.compile(spaceI)��ENDFOR�
		�space�fi
		'''
	}
	
	def compile(ForCommand f, String space){
		var spaceF = ""
		for (var j = 0 ; j <iFor ; j++) spaceF += ' '
		spaceF = spaceF+space
		var content = ""
		for(com : f.command.commands){
			content += com.compile(spaceF)
		}
		
		return '''
		�space�For �f.expr� do
		�FOR com : f.command.commands SEPARATOR ";\n"��com.compile(spaceF)��ENDFOR�
		�space�od
		'''
	}
	def compile(ForeachCommand f, String space){
		var spaceF = ""
		for (var j = 0 ; j <iForeach ; j++) spaceF += ' '
		spaceF = spaceF+space
		var content = ""
		for(com : f.commands.commands){
			content += com.compile(spaceF)
		}
		
		return '''
		�space�Foreach �f.vars� in �f.expr� do
		�FOR com : f.commands.commands SEPARATOR ";\n"��com.compile(spaceF)��ENDFOR�
		�space�od
		'''
	}
	def compile(AffectCommand a, String space){
		var spaceA = ""
		var size = iAffect-space.length
		for (var j = 0 ; j <size ; j++) spaceA += ' '
		'''
		�space��spaceA��FOR param : a.vars.vari SEPARATOR ', '��param��ENDFOR� := �FOR param : a.exprs.expr SEPARATOR ', '��param��ENDFOR�
		'''
	}
	
}

