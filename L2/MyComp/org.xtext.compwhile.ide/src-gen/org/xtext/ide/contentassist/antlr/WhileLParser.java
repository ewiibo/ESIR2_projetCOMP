/*
 * generated by Xtext 2.23.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalWhileLParser;
import org.xtext.services.WhileLGrammarAccess;

public class WhileLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(WhileLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, WhileLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
			builder.put(grammarAccess.getExprAccess().getOpeAlternatives_1_0_0(), "rule__Expr__OpeAlternatives_1_0_0");
			builder.put(grammarAccess.getExprBaseAccess().getAlternatives(), "rule__ExprBase__Alternatives");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup(), "rule__Input__Group__0");
			builder.put(grammarAccess.getInputAccess().getGroup_1(), "rule__Input__Group_1__0");
			builder.put(grammarAccess.getOutputAccess().getGroup(), "rule__Output__Group__0");
			builder.put(grammarAccess.getOutputAccess().getGroup_1(), "rule__Output__Group_1__0");
			builder.put(grammarAccess.getCommandsAccess().getGroup(), "rule__Commands__Group__0");
			builder.put(grammarAccess.getCommandsAccess().getGroup_1(), "rule__Commands__Group_1__0");
			builder.put(grammarAccess.getWhileCommandAccess().getGroup(), "rule__WhileCommand__Group__0");
			builder.put(grammarAccess.getIfCommandAccess().getGroup(), "rule__IfCommand__Group__0");
			builder.put(grammarAccess.getIfCommandAccess().getGroup_4(), "rule__IfCommand__Group_4__0");
			builder.put(grammarAccess.getForCommandAccess().getGroup(), "rule__ForCommand__Group__0");
			builder.put(grammarAccess.getAffectCommandAccess().getGroup(), "rule__AffectCommand__Group__0");
			builder.put(grammarAccess.getForeachCommandAccess().getGroup(), "rule__ForeachCommand__Group__0");
			builder.put(grammarAccess.getExprsAccess().getGroup(), "rule__Exprs__Group__0");
			builder.put(grammarAccess.getExprsAccess().getGroup_1(), "rule__Exprs__Group_1__0");
			builder.put(grammarAccess.getVarsAccess().getGroup(), "rule__Vars__Group__0");
			builder.put(grammarAccess.getVarsAccess().getGroup_1(), "rule__Vars__Group_1__0");
			builder.put(grammarAccess.getExprAccess().getGroup(), "rule__Expr__Group__0");
			builder.put(grammarAccess.getExprAccess().getGroup_1(), "rule__Expr__Group_1__0");
			builder.put(grammarAccess.getExprBaseAccess().getGroup_4(), "rule__ExprBase__Group_4__0");
			builder.put(grammarAccess.getExprBaseAccess().getGroup_5(), "rule__ExprBase__Group_5__0");
			builder.put(grammarAccess.getExprBaseAccess().getGroup_6(), "rule__ExprBase__Group_6__0");
			builder.put(grammarAccess.getExprBaseAccess().getGroup_7(), "rule__ExprBase__Group_7__0");
			builder.put(grammarAccess.getExprBaseAccess().getGroup_8(), "rule__ExprBase__Group_8__0");
			builder.put(grammarAccess.getExprBaseAccess().getGroup_9(), "rule__ExprBase__Group_9__0");
			builder.put(grammarAccess.getProgramAccess().getFunctionsAssignment(), "rule__Program__FunctionsAssignment");
			builder.put(grammarAccess.getFunctionAccess().getSymbolAssignment_1(), "rule__Function__SymbolAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getDefinitionAssignment_3(), "rule__Function__DefinitionAssignment_3");
			builder.put(grammarAccess.getDefinitionAccess().getInputAssignment_1(), "rule__Definition__InputAssignment_1");
			builder.put(grammarAccess.getDefinitionAccess().getCommandsAssignment_3(), "rule__Definition__CommandsAssignment_3");
			builder.put(grammarAccess.getDefinitionAccess().getOutputAssignment_6(), "rule__Definition__OutputAssignment_6");
			builder.put(grammarAccess.getInputAccess().getVarsAssignment_0(), "rule__Input__VarsAssignment_0");
			builder.put(grammarAccess.getInputAccess().getVarsAssignment_1_1(), "rule__Input__VarsAssignment_1_1");
			builder.put(grammarAccess.getOutputAccess().getVarsAssignment_0(), "rule__Output__VarsAssignment_0");
			builder.put(grammarAccess.getOutputAccess().getVarsAssignment_1_1(), "rule__Output__VarsAssignment_1_1");
			builder.put(grammarAccess.getCommandsAccess().getCommandsAssignment_0(), "rule__Commands__CommandsAssignment_0");
			builder.put(grammarAccess.getCommandsAccess().getCommandsAssignment_1_1(), "rule__Commands__CommandsAssignment_1_1");
			builder.put(grammarAccess.getNopCommandAccess().getExprAssignment(), "rule__NopCommand__ExprAssignment");
			builder.put(grammarAccess.getWhileCommandAccess().getExprAssignment_1(), "rule__WhileCommand__ExprAssignment_1");
			builder.put(grammarAccess.getWhileCommandAccess().getCommandsAssignment_3(), "rule__WhileCommand__CommandsAssignment_3");
			builder.put(grammarAccess.getIfCommandAccess().getExprAssignment_1(), "rule__IfCommand__ExprAssignment_1");
			builder.put(grammarAccess.getIfCommandAccess().getCommandsAssignment_3(), "rule__IfCommand__CommandsAssignment_3");
			builder.put(grammarAccess.getIfCommandAccess().getElsecommandsAssignment_4_1(), "rule__IfCommand__ElsecommandsAssignment_4_1");
			builder.put(grammarAccess.getForCommandAccess().getExprAssignment_1(), "rule__ForCommand__ExprAssignment_1");
			builder.put(grammarAccess.getForCommandAccess().getCommandAssignment_3(), "rule__ForCommand__CommandAssignment_3");
			builder.put(grammarAccess.getAffectCommandAccess().getVarsAssignment_0(), "rule__AffectCommand__VarsAssignment_0");
			builder.put(grammarAccess.getAffectCommandAccess().getExprsAssignment_2(), "rule__AffectCommand__ExprsAssignment_2");
			builder.put(grammarAccess.getForeachCommandAccess().getVarsAssignment_1(), "rule__ForeachCommand__VarsAssignment_1");
			builder.put(grammarAccess.getForeachCommandAccess().getExprAssignment_3(), "rule__ForeachCommand__ExprAssignment_3");
			builder.put(grammarAccess.getForeachCommandAccess().getCommandsAssignment_5(), "rule__ForeachCommand__CommandsAssignment_5");
			builder.put(grammarAccess.getExprsAccess().getExprAssignment_0(), "rule__Exprs__ExprAssignment_0");
			builder.put(grammarAccess.getExprsAccess().getExprAssignment_1_1(), "rule__Exprs__ExprAssignment_1_1");
			builder.put(grammarAccess.getVarsAccess().getVariAssignment_0(), "rule__Vars__VariAssignment_0");
			builder.put(grammarAccess.getVarsAccess().getVariAssignment_1_1(), "rule__Vars__VariAssignment_1_1");
			builder.put(grammarAccess.getExprAccess().getExprbaseAssignment_0(), "rule__Expr__ExprbaseAssignment_0");
			builder.put(grammarAccess.getExprAccess().getOpeAssignment_1_0(), "rule__Expr__OpeAssignment_1_0");
			builder.put(grammarAccess.getExprAccess().getExprbase1Assignment_1_1(), "rule__Expr__Exprbase1Assignment_1_1");
			builder.put(grammarAccess.getLExprAccess().getExprAssignment(), "rule__LExpr__ExprAssignment");
			builder.put(grammarAccess.getExprBaseAccess().getValueAssignment_0(), "rule__ExprBase__ValueAssignment_0");
			builder.put(grammarAccess.getExprBaseAccess().getValueAssignment_1(), "rule__ExprBase__ValueAssignment_1");
			builder.put(grammarAccess.getExprBaseAccess().getValueAssignment_2(), "rule__ExprBase__ValueAssignment_2");
			builder.put(grammarAccess.getExprBaseAccess().getValueAssignment_3(), "rule__ExprBase__ValueAssignment_3");
			builder.put(grammarAccess.getExprBaseAccess().getIdentitorAssignment_4_1(), "rule__ExprBase__IdentitorAssignment_4_1");
			builder.put(grammarAccess.getExprBaseAccess().getLexprAssignment_4_2(), "rule__ExprBase__LexprAssignment_4_2");
			builder.put(grammarAccess.getExprBaseAccess().getIdentitorAssignment_5_1(), "rule__ExprBase__IdentitorAssignment_5_1");
			builder.put(grammarAccess.getExprBaseAccess().getLexprAssignment_5_2(), "rule__ExprBase__LexprAssignment_5_2");
			builder.put(grammarAccess.getExprBaseAccess().getIdentitorAssignment_6_1(), "rule__ExprBase__IdentitorAssignment_6_1");
			builder.put(grammarAccess.getExprBaseAccess().getExprAssignment_6_2(), "rule__ExprBase__ExprAssignment_6_2");
			builder.put(grammarAccess.getExprBaseAccess().getIdentitorAssignment_7_1(), "rule__ExprBase__IdentitorAssignment_7_1");
			builder.put(grammarAccess.getExprBaseAccess().getExprAssignment_7_2(), "rule__ExprBase__ExprAssignment_7_2");
			builder.put(grammarAccess.getExprBaseAccess().getIdentitorAssignment_8_1(), "rule__ExprBase__IdentitorAssignment_8_1");
			builder.put(grammarAccess.getExprBaseAccess().getExprAssignment_8_2(), "rule__ExprBase__ExprAssignment_8_2");
			builder.put(grammarAccess.getExprBaseAccess().getSymbolAssignment_9_1(), "rule__ExprBase__SymbolAssignment_9_1");
			builder.put(grammarAccess.getExprBaseAccess().getLexprAssignment_9_2(), "rule__ExprBase__LexprAssignment_9_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private WhileLGrammarAccess grammarAccess;

	@Override
	protected InternalWhileLParser createParser() {
		InternalWhileLParser result = new InternalWhileLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public WhileLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(WhileLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
