/*
 * generated by Xtext 2.23.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.services.WhileLGrammarAccess;
import org.xtext.whileL.AffectCommand;
import org.xtext.whileL.Commands;
import org.xtext.whileL.Definition;
import org.xtext.whileL.Expr;
import org.xtext.whileL.ExprBase;
import org.xtext.whileL.Exprs;
import org.xtext.whileL.ForCommand;
import org.xtext.whileL.ForeachCommand;
import org.xtext.whileL.Function;
import org.xtext.whileL.IfCommand;
import org.xtext.whileL.Input;
import org.xtext.whileL.LExpr;
import org.xtext.whileL.NopCommand;
import org.xtext.whileL.Output;
import org.xtext.whileL.Program;
import org.xtext.whileL.Vars;
import org.xtext.whileL.WhileCommand;
import org.xtext.whileL.WhileLPackage;

@SuppressWarnings("all")
public class WhileLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private WhileLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == WhileLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case WhileLPackage.AFFECT_COMMAND:
				sequence_AffectCommand(context, (AffectCommand) semanticObject); 
				return; 
			case WhileLPackage.COMMANDS:
				sequence_Commands(context, (Commands) semanticObject); 
				return; 
			case WhileLPackage.DEFINITION:
				sequence_Definition(context, (Definition) semanticObject); 
				return; 
			case WhileLPackage.EXPR:
				sequence_Expr(context, (Expr) semanticObject); 
				return; 
			case WhileLPackage.EXPR_BASE:
				sequence_ExprBase(context, (ExprBase) semanticObject); 
				return; 
			case WhileLPackage.EXPRS:
				sequence_Exprs(context, (Exprs) semanticObject); 
				return; 
			case WhileLPackage.FOR_COMMAND:
				sequence_ForCommand(context, (ForCommand) semanticObject); 
				return; 
			case WhileLPackage.FOREACH_COMMAND:
				sequence_ForeachCommand(context, (ForeachCommand) semanticObject); 
				return; 
			case WhileLPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case WhileLPackage.IF_COMMAND:
				sequence_IfCommand(context, (IfCommand) semanticObject); 
				return; 
			case WhileLPackage.INPUT:
				sequence_Input(context, (Input) semanticObject); 
				return; 
			case WhileLPackage.LEXPR:
				sequence_LExpr(context, (LExpr) semanticObject); 
				return; 
			case WhileLPackage.NOP_COMMAND:
				sequence_NopCommand(context, (NopCommand) semanticObject); 
				return; 
			case WhileLPackage.OUTPUT:
				sequence_Output(context, (Output) semanticObject); 
				return; 
			case WhileLPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case WhileLPackage.VARS:
				sequence_Vars(context, (Vars) semanticObject); 
				return; 
			case WhileLPackage.WHILE_COMMAND:
				sequence_WhileCommand(context, (WhileCommand) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Command returns AffectCommand
	 *     AffectCommand returns AffectCommand
	 *
	 * Constraint:
	 *     (vars=Vars exprs=Exprs)
	 */
	protected void sequence_AffectCommand(ISerializationContext context, AffectCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.AFFECT_COMMAND__VARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.AFFECT_COMMAND__VARS));
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.AFFECT_COMMAND__EXPRS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.AFFECT_COMMAND__EXPRS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAffectCommandAccess().getVarsVarsParserRuleCall_0_0(), semanticObject.getVars());
		feeder.accept(grammarAccess.getAffectCommandAccess().getExprsExprsParserRuleCall_2_0(), semanticObject.getExprs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Commands returns Commands
	 *
	 * Constraint:
	 *     (commands+=Command commands+=Command*)
	 */
	protected void sequence_Commands(ISerializationContext context, Commands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Definition returns Definition
	 *
	 * Constraint:
	 *     (input=Input commands=Commands output=Output)
	 */
	protected void sequence_Definition(ISerializationContext context, Definition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.DEFINITION__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.DEFINITION__INPUT));
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.DEFINITION__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.DEFINITION__COMMANDS));
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.DEFINITION__OUTPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.DEFINITION__OUTPUT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0(), semanticObject.getInput());
		feeder.accept(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_3_0(), semanticObject.getCommands());
		feeder.accept(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0(), semanticObject.getOutput());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExprBase returns ExprBase
	 *
	 * Constraint:
	 *     (
	 *         value='nil' | 
	 *         value=VARIABLE | 
	 *         value=SYMBOL | 
	 *         (identitor='cons' lexpr=LExpr) | 
	 *         (identitor='list' lexpr=LExpr) | 
	 *         (identitor='hd' expr=Expr) | 
	 *         (identitor='tl' expr=Expr) | 
	 *         (identitor='not' expr=Expr) | 
	 *         (symbol=SYMBOL lexpr=LExpr) | 
	 *         (expr=Expr (identitor='=?' | identitor='and' | identitor='or') expr1=Expr)
	 *     )
	 */
	protected void sequence_ExprBase(ISerializationContext context, ExprBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expr returns Expr
	 *
	 * Constraint:
	 *     exprbase=ExprBase
	 */
	protected void sequence_Expr(ISerializationContext context, Expr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.EXPR__EXPRBASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.EXPR__EXPRBASE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExprAccess().getExprbaseExprBaseParserRuleCall_0(), semanticObject.getExprbase());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exprs returns Exprs
	 *
	 * Constraint:
	 *     (expr+=Expr expr+=Expr*)
	 */
	protected void sequence_Exprs(ISerializationContext context, Exprs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns ForCommand
	 *     ForCommand returns ForCommand
	 *
	 * Constraint:
	 *     (expr=Expr command=Commands)
	 */
	protected void sequence_ForCommand(ISerializationContext context, ForCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.FOR_COMMAND__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.FOR_COMMAND__EXPR));
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.FOR_COMMAND__COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.FOR_COMMAND__COMMAND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForCommandAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getForCommandAccess().getCommandCommandsParserRuleCall_3_0(), semanticObject.getCommand());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns ForeachCommand
	 *     ForeachCommand returns ForeachCommand
	 *
	 * Constraint:
	 *     (vars=Vars expr=Expr commands=Commands)
	 */
	protected void sequence_ForeachCommand(ISerializationContext context, ForeachCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.FOREACH_COMMAND__VARS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.FOREACH_COMMAND__VARS));
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.FOREACH_COMMAND__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.FOREACH_COMMAND__EXPR));
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.FOREACH_COMMAND__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.FOREACH_COMMAND__COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForeachCommandAccess().getVarsVarsParserRuleCall_1_0(), semanticObject.getVars());
		feeder.accept(grammarAccess.getForeachCommandAccess().getExprExprParserRuleCall_3_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getForeachCommandAccess().getCommandsCommandsParserRuleCall_5_0(), semanticObject.getCommands());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (symbol=SYMBOL definition=Definition)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.FUNCTION__SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.FUNCTION__SYMBOL));
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.FUNCTION__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.FUNCTION__DEFINITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionAccess().getSymbolSYMBOLTerminalRuleCall_1_0(), semanticObject.getSymbol());
		feeder.accept(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Command returns IfCommand
	 *     IfCommand returns IfCommand
	 *
	 * Constraint:
	 *     (expr=Expr commands=Commands elsecommands=Commands?)
	 */
	protected void sequence_IfCommand(ISerializationContext context, IfCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Input returns Input
	 *
	 * Constraint:
	 *     (vars+=VARIABLE vars+=VARIABLE*)
	 */
	protected void sequence_Input(ISerializationContext context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LExpr returns LExpr
	 *
	 * Constraint:
	 *     expr+=Expr+
	 */
	protected void sequence_LExpr(ISerializationContext context, LExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns NopCommand
	 *     NopCommand returns NopCommand
	 *
	 * Constraint:
	 *     expr='nop'
	 */
	protected void sequence_NopCommand(ISerializationContext context, NopCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.NOP_COMMAND__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.NOP_COMMAND__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNopCommandAccess().getExprNopKeyword_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Output returns Output
	 *
	 * Constraint:
	 *     (vars+=VARIABLE vars+=VARIABLE*)
	 */
	protected void sequence_Output(ISerializationContext context, Output semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     functions+=Function+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Vars returns Vars
	 *
	 * Constraint:
	 *     (vari+=VARIABLE vari+=VARIABLE*)
	 */
	protected void sequence_Vars(ISerializationContext context, Vars semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns WhileCommand
	 *     WhileCommand returns WhileCommand
	 *
	 * Constraint:
	 *     (expr=Expr commands=Commands)
	 */
	protected void sequence_WhileCommand(ISerializationContext context, WhileCommand semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.WHILE_COMMAND__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.WHILE_COMMAND__EXPR));
			if (transientValues.isValueTransient(semanticObject, WhileLPackage.Literals.WHILE_COMMAND__COMMANDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, WhileLPackage.Literals.WHILE_COMMAND__COMMANDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.accept(grammarAccess.getWhileCommandAccess().getCommandsCommandsParserRuleCall_3_0(), semanticObject.getCommands());
		feeder.finish();
	}
	
	
}
