package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.WhileLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalWhileLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_NOMBRE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "'while'", "'do'", "'od'", "'if'", "'then'", "'else'", "'fi'", "'for'", "':='", "'foreach'", "'in'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'", "'not'", "'=?'", "'and'", "'or'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NOMBRE=6;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_SYMBOL=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalWhileLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWhileLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWhileLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWhileL.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private WhileLGrammarAccess grammarAccess;

        public InternalWhileLParser(TokenStream input, WhileLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected WhileLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalWhileL.g:70:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalWhileL.g:70:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalWhileL.g:71:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalWhileL.g:77:1: ruleProgram returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:83:2: ( ( (lv_functions_0_0= ruleFunction ) )* )
            // InternalWhileL.g:84:2: ( (lv_functions_0_0= ruleFunction ) )*
            {
            // InternalWhileL.g:84:2: ( (lv_functions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWhileL.g:85:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalWhileL.g:85:3: (lv_functions_0_0= ruleFunction )
            	    // InternalWhileL.g:86:4: lv_functions_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getProgramRule());
            	      				}
            	      				add(
            	      					current,
            	      					"functions",
            	      					lv_functions_0_0,
            	      					"org.xtext.WhileL.Function");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalWhileL.g:106:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalWhileL.g:106:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalWhileL.g:107:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalWhileL.g:113:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symbol_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:119:2: ( (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalWhileL.g:120:2: (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalWhileL.g:120:2: (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalWhileL.g:121:3: otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
              		
            }
            // InternalWhileL.g:125:3: ( (lv_symbol_1_0= RULE_SYMBOL ) )
            // InternalWhileL.g:126:4: (lv_symbol_1_0= RULE_SYMBOL )
            {
            // InternalWhileL.g:126:4: (lv_symbol_1_0= RULE_SYMBOL )
            // InternalWhileL.g:127:5: lv_symbol_1_0= RULE_SYMBOL
            {
            lv_symbol_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_symbol_1_0, grammarAccess.getFunctionAccess().getSymbolSYMBOLTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"symbol",
              						lv_symbol_1_0,
              						"org.xtext.WhileL.SYMBOL");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
              		
            }
            // InternalWhileL.g:147:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalWhileL.g:148:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalWhileL.g:148:4: (lv_definition_3_0= ruleDefinition )
            // InternalWhileL.g:149:5: lv_definition_3_0= ruleDefinition
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionRule());
              					}
              					set(
              						current,
              						"definition",
              						lv_definition_3_0,
              						"org.xtext.WhileL.Definition");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalWhileL.g:170:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalWhileL.g:170:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalWhileL.g:171:2: iv_ruleDefinition= ruleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalWhileL.g:177:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_input_1_0 = null;

        EObject lv_commands_3_0 = null;

        EObject lv_output_6_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:183:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            // InternalWhileL.g:184:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            {
            // InternalWhileL.g:184:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            // InternalWhileL.g:185:3: otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
              		
            }
            // InternalWhileL.g:189:3: ( (lv_input_1_0= ruleInput ) )
            // InternalWhileL.g:190:4: (lv_input_1_0= ruleInput )
            {
            // InternalWhileL.g:190:4: (lv_input_1_0= ruleInput )
            // InternalWhileL.g:191:5: lv_input_1_0= ruleInput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_input_1_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"input",
              						lv_input_1_0,
              						"org.xtext.WhileL.Input");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
              		
            }
            // InternalWhileL.g:212:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWhileL.g:213:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalWhileL.g:213:4: (lv_commands_3_0= ruleCommands )
            // InternalWhileL.g:214:5: lv_commands_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_commands_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_3_0,
              						"org.xtext.WhileL.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,18,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
              		
            }
            // InternalWhileL.g:239:3: ( (lv_output_6_0= ruleOutput ) )
            // InternalWhileL.g:240:4: (lv_output_6_0= ruleOutput )
            {
            // InternalWhileL.g:240:4: (lv_output_6_0= ruleOutput )
            // InternalWhileL.g:241:5: lv_output_6_0= ruleOutput
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_output_6_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionRule());
              					}
              					set(
              						current,
              						"output",
              						lv_output_6_0,
              						"org.xtext.WhileL.Output");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalWhileL.g:262:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalWhileL.g:262:46: (iv_ruleInput= ruleInput EOF )
            // InternalWhileL.g:263:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalWhileL.g:269:1: ruleInput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWhileL.g:275:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileL.g:276:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileL.g:276:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWhileL.g:277:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhileL.g:277:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWhileL.g:278:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWhileL.g:278:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWhileL.g:279:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_0_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.WhileL.VARIABLE");
              				
            }

            }


            }

            // InternalWhileL.g:295:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWhileL.g:296:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileL.g:300:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWhileL.g:301:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileL.g:301:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWhileL.g:302:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_2_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getInputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.xtext.WhileL.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalWhileL.g:323:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalWhileL.g:323:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalWhileL.g:324:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalWhileL.g:330:1: ruleOutput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalWhileL.g:336:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileL.g:337:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileL.g:337:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalWhileL.g:338:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhileL.g:338:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalWhileL.g:339:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalWhileL.g:339:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalWhileL.g:340:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vars_0_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOutputRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.WhileL.VARIABLE");
              				
            }

            }


            }

            // InternalWhileL.g:356:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWhileL.g:357:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileL.g:361:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalWhileL.g:362:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileL.g:362:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalWhileL.g:363:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vars_2_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOutputRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vars",
            	      							lv_vars_2_0,
            	      							"org.xtext.WhileL.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalWhileL.g:384:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalWhileL.g:384:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalWhileL.g:385:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalWhileL.g:391:1: ruleCommands returns [EObject current=null] : ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_commands_0_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:397:2: ( ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) )
            // InternalWhileL.g:398:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            {
            // InternalWhileL.g:398:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            // InternalWhileL.g:399:3: ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            {
            // InternalWhileL.g:399:3: ( (lv_commands_0_0= ruleCommand ) )
            // InternalWhileL.g:400:4: (lv_commands_0_0= ruleCommand )
            {
            // InternalWhileL.g:400:4: (lv_commands_0_0= ruleCommand )
            // InternalWhileL.g:401:5: lv_commands_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_commands_0_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCommandsRule());
              					}
              					add(
              						current,
              						"commands",
              						lv_commands_0_0,
              						"org.xtext.WhileL.Command");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileL.g:418:3: (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWhileL.g:419:4: otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileL.g:423:4: ( (lv_commands_2_0= ruleCommand ) )
            	    // InternalWhileL.g:424:5: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalWhileL.g:424:5: (lv_commands_2_0= ruleCommand )
            	    // InternalWhileL.g:425:6: lv_commands_2_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"commands",
            	      							lv_commands_2_0,
            	      							"org.xtext.WhileL.Command");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalWhileL.g:447:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalWhileL.g:447:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalWhileL.g:448:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalWhileL.g:454:1: ruleCommand returns [EObject current=null] : (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | this_NopCommand_5= ruleNopCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_WhileCommand_0 = null;

        EObject this_IfCommand_1 = null;

        EObject this_ForCommand_2 = null;

        EObject this_AffectCommand_3 = null;

        EObject this_ForeachCommand_4 = null;

        EObject this_NopCommand_5 = null;



        	enterRule();

        try {
            // InternalWhileL.g:460:2: ( (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | this_NopCommand_5= ruleNopCommand ) )
            // InternalWhileL.g:461:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | this_NopCommand_5= ruleNopCommand )
            {
            // InternalWhileL.g:461:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | this_NopCommand_5= ruleNopCommand )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=4;
                }
                break;
            case 31:
                {
                alt5=5;
                }
                break;
            case 21:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalWhileL.g:462:3: this_WhileCommand_0= ruleWhileCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getWhileCommandParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_WhileCommand_0=ruleWhileCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_WhileCommand_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalWhileL.g:474:3: this_IfCommand_1= ruleIfCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getIfCommandParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfCommand_1=ruleIfCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfCommand_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalWhileL.g:486:3: this_ForCommand_2= ruleForCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getForCommandParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForCommand_2=ruleForCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForCommand_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalWhileL.g:498:3: this_AffectCommand_3= ruleAffectCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getAffectCommandParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AffectCommand_3=ruleAffectCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AffectCommand_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalWhileL.g:510:3: this_ForeachCommand_4= ruleForeachCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getForeachCommandParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ForeachCommand_4=ruleForeachCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ForeachCommand_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalWhileL.g:522:3: this_NopCommand_5= ruleNopCommand
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getCommandAccess().getNopCommandParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NopCommand_5=ruleNopCommand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NopCommand_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleNopCommand"
    // InternalWhileL.g:537:1: entryRuleNopCommand returns [EObject current=null] : iv_ruleNopCommand= ruleNopCommand EOF ;
    public final EObject entryRuleNopCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNopCommand = null;


        try {
            // InternalWhileL.g:537:51: (iv_ruleNopCommand= ruleNopCommand EOF )
            // InternalWhileL.g:538:2: iv_ruleNopCommand= ruleNopCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNopCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNopCommand=ruleNopCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNopCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNopCommand"


    // $ANTLR start "ruleNopCommand"
    // InternalWhileL.g:544:1: ruleNopCommand returns [EObject current=null] : ( (lv_expr_0_0= 'nop' ) ) ;
    public final EObject ruleNopCommand() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0_0=null;


        	enterRule();

        try {
            // InternalWhileL.g:550:2: ( ( (lv_expr_0_0= 'nop' ) ) )
            // InternalWhileL.g:551:2: ( (lv_expr_0_0= 'nop' ) )
            {
            // InternalWhileL.g:551:2: ( (lv_expr_0_0= 'nop' ) )
            // InternalWhileL.g:552:3: (lv_expr_0_0= 'nop' )
            {
            // InternalWhileL.g:552:3: (lv_expr_0_0= 'nop' )
            // InternalWhileL.g:553:4: lv_expr_0_0= 'nop'
            {
            lv_expr_0_0=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_expr_0_0, grammarAccess.getNopCommandAccess().getExprNopKeyword_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNopCommandRule());
              				}
              				setWithLastConsumed(current, "expr", lv_expr_0_0, "nop");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNopCommand"


    // $ANTLR start "entryRuleWhileCommand"
    // InternalWhileL.g:568:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // InternalWhileL.g:568:53: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // InternalWhileL.g:569:2: iv_ruleWhileCommand= ruleWhileCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileCommand=ruleWhileCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileCommand"


    // $ANTLR start "ruleWhileCommand"
    // InternalWhileL.g:575:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:581:2: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWhileL.g:582:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWhileL.g:582:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWhileL.g:583:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
              		
            }
            // InternalWhileL.g:587:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhileL.g:588:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhileL.g:588:4: (lv_expr_1_0= ruleExpr )
            // InternalWhileL.g:589:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.WhileL.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getWhileCommandAccess().getDoKeyword_2());
              		
            }
            // InternalWhileL.g:610:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWhileL.g:611:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalWhileL.g:611:4: (lv_commands_3_0= ruleCommands )
            // InternalWhileL.g:612:5: lv_commands_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileCommandAccess().getCommandsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_commands_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_3_0,
              						"org.xtext.WhileL.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getWhileCommandAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileCommand"


    // $ANTLR start "entryRuleIfCommand"
    // InternalWhileL.g:637:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // InternalWhileL.g:637:50: (iv_ruleIfCommand= ruleIfCommand EOF )
            // InternalWhileL.g:638:2: iv_ruleIfCommand= ruleIfCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfCommand=ruleIfCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfCommand"


    // $ANTLR start "ruleIfCommand"
    // InternalWhileL.g:644:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
    public final EObject ruleIfCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;

        EObject lv_elsecommands_5_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:650:2: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // InternalWhileL.g:651:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // InternalWhileL.g:651:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // InternalWhileL.g:652:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
              		
            }
            // InternalWhileL.g:656:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhileL.g:657:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhileL.g:657:4: (lv_expr_1_0= ruleExpr )
            // InternalWhileL.g:658:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfCommandAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfCommandRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.WhileL.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIfCommandAccess().getThenKeyword_2());
              		
            }
            // InternalWhileL.g:679:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalWhileL.g:680:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalWhileL.g:680:4: (lv_commands_3_0= ruleCommands )
            // InternalWhileL.g:681:5: lv_commands_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfCommandAccess().getCommandsCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_commands_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfCommandRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_3_0,
              						"org.xtext.WhileL.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileL.g:698:3: (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWhileL.g:699:4: otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getIfCommandAccess().getElseKeyword_4_0());
                      			
                    }
                    // InternalWhileL.g:703:4: ( (lv_elsecommands_5_0= ruleCommands ) )
                    // InternalWhileL.g:704:5: (lv_elsecommands_5_0= ruleCommands )
                    {
                    // InternalWhileL.g:704:5: (lv_elsecommands_5_0= ruleCommands )
                    // InternalWhileL.g:705:6: lv_elsecommands_5_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfCommandAccess().getElsecommandsCommandsParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_elsecommands_5_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfCommandRule());
                      						}
                      						set(
                      							current,
                      							"elsecommands",
                      							lv_elsecommands_5_0,
                      							"org.xtext.WhileL.Commands");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfCommandAccess().getFiKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfCommand"


    // $ANTLR start "entryRuleForCommand"
    // InternalWhileL.g:731:1: entryRuleForCommand returns [EObject current=null] : iv_ruleForCommand= ruleForCommand EOF ;
    public final EObject entryRuleForCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForCommand = null;


        try {
            // InternalWhileL.g:731:51: (iv_ruleForCommand= ruleForCommand EOF )
            // InternalWhileL.g:732:2: iv_ruleForCommand= ruleForCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForCommand=ruleForCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForCommand"


    // $ANTLR start "ruleForCommand"
    // InternalWhileL.g:738:1: ruleForCommand returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleForCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_command_3_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:744:2: ( (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalWhileL.g:745:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalWhileL.g:745:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalWhileL.g:746:3: otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForCommandAccess().getForKeyword_0());
              		
            }
            // InternalWhileL.g:750:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalWhileL.g:751:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalWhileL.g:751:4: (lv_expr_1_0= ruleExpr )
            // InternalWhileL.g:752:5: lv_expr_1_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForCommandAccess().getExprExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_expr_1_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForCommandRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_1_0,
              						"org.xtext.WhileL.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForCommandAccess().getDoKeyword_2());
              		
            }
            // InternalWhileL.g:773:3: ( (lv_command_3_0= ruleCommands ) )
            // InternalWhileL.g:774:4: (lv_command_3_0= ruleCommands )
            {
            // InternalWhileL.g:774:4: (lv_command_3_0= ruleCommands )
            // InternalWhileL.g:775:5: lv_command_3_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForCommandAccess().getCommandCommandsParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_command_3_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForCommandRule());
              					}
              					set(
              						current,
              						"command",
              						lv_command_3_0,
              						"org.xtext.WhileL.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForCommandAccess().getOdKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForCommand"


    // $ANTLR start "entryRuleAffectCommand"
    // InternalWhileL.g:800:1: entryRuleAffectCommand returns [EObject current=null] : iv_ruleAffectCommand= ruleAffectCommand EOF ;
    public final EObject entryRuleAffectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectCommand = null;


        try {
            // InternalWhileL.g:800:54: (iv_ruleAffectCommand= ruleAffectCommand EOF )
            // InternalWhileL.g:801:2: iv_ruleAffectCommand= ruleAffectCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAffectCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAffectCommand=ruleAffectCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAffectCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAffectCommand"


    // $ANTLR start "ruleAffectCommand"
    // InternalWhileL.g:807:1: ruleAffectCommand returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) ) ;
    public final EObject ruleAffectCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:813:2: ( ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) ) )
            // InternalWhileL.g:814:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) )
            {
            // InternalWhileL.g:814:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) )
            // InternalWhileL.g:815:3: ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) )
            {
            // InternalWhileL.g:815:3: ( (lv_vars_0_0= ruleVars ) )
            // InternalWhileL.g:816:4: (lv_vars_0_0= ruleVars )
            {
            // InternalWhileL.g:816:4: (lv_vars_0_0= ruleVars )
            // InternalWhileL.g:817:5: lv_vars_0_0= ruleVars
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAffectCommandAccess().getVarsVarsParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_vars_0_0=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAffectCommandRule());
              					}
              					set(
              						current,
              						"vars",
              						lv_vars_0_0,
              						"org.xtext.WhileL.Vars");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAffectCommandAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalWhileL.g:838:3: ( (lv_exprs_2_0= ruleExprs ) )
            // InternalWhileL.g:839:4: (lv_exprs_2_0= ruleExprs )
            {
            // InternalWhileL.g:839:4: (lv_exprs_2_0= ruleExprs )
            // InternalWhileL.g:840:5: lv_exprs_2_0= ruleExprs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAffectCommandAccess().getExprsExprsParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_exprs_2_0=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAffectCommandRule());
              					}
              					set(
              						current,
              						"exprs",
              						lv_exprs_2_0,
              						"org.xtext.WhileL.Exprs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAffectCommand"


    // $ANTLR start "entryRuleForeachCommand"
    // InternalWhileL.g:861:1: entryRuleForeachCommand returns [EObject current=null] : iv_ruleForeachCommand= ruleForeachCommand EOF ;
    public final EObject entryRuleForeachCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachCommand = null;


        try {
            // InternalWhileL.g:861:55: (iv_ruleForeachCommand= ruleForeachCommand EOF )
            // InternalWhileL.g:862:2: iv_ruleForeachCommand= ruleForeachCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForeachCommandRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForeachCommand=ruleForeachCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForeachCommand; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForeachCommand"


    // $ANTLR start "ruleForeachCommand"
    // InternalWhileL.g:868:1: ruleForeachCommand returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
    public final EObject ruleForeachCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_vars_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:874:2: ( (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // InternalWhileL.g:875:2: (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // InternalWhileL.g:875:2: (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // InternalWhileL.g:876:3: otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForeachCommandAccess().getForeachKeyword_0());
              		
            }
            // InternalWhileL.g:880:3: ( (lv_vars_1_0= ruleVars ) )
            // InternalWhileL.g:881:4: (lv_vars_1_0= ruleVars )
            {
            // InternalWhileL.g:881:4: (lv_vars_1_0= ruleVars )
            // InternalWhileL.g:882:5: lv_vars_1_0= ruleVars
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachCommandAccess().getVarsVarsParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_vars_1_0=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
              					}
              					set(
              						current,
              						"vars",
              						lv_vars_1_0,
              						"org.xtext.WhileL.Vars");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForeachCommandAccess().getInKeyword_2());
              		
            }
            // InternalWhileL.g:903:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalWhileL.g:904:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalWhileL.g:904:4: (lv_expr_3_0= ruleExpr )
            // InternalWhileL.g:905:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachCommandAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_expr_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"org.xtext.WhileL.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForeachCommandAccess().getDoKeyword_4());
              		
            }
            // InternalWhileL.g:926:3: ( (lv_commands_5_0= ruleCommands ) )
            // InternalWhileL.g:927:4: (lv_commands_5_0= ruleCommands )
            {
            // InternalWhileL.g:927:4: (lv_commands_5_0= ruleCommands )
            // InternalWhileL.g:928:5: lv_commands_5_0= ruleCommands
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForeachCommandAccess().getCommandsCommandsParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_commands_5_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
              					}
              					set(
              						current,
              						"commands",
              						lv_commands_5_0,
              						"org.xtext.WhileL.Commands");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForeachCommandAccess().getOdKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForeachCommand"


    // $ANTLR start "entryRuleExprs"
    // InternalWhileL.g:953:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalWhileL.g:953:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalWhileL.g:954:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalWhileL.g:960:1: ruleExprs returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:966:2: ( ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* ) )
            // InternalWhileL.g:967:2: ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* )
            {
            // InternalWhileL.g:967:2: ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* )
            // InternalWhileL.g:968:3: ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )*
            {
            // InternalWhileL.g:968:3: ( (lv_expr_0_0= ruleExpr ) )
            // InternalWhileL.g:969:4: (lv_expr_0_0= ruleExpr )
            {
            // InternalWhileL.g:969:4: (lv_expr_0_0= ruleExpr )
            // InternalWhileL.g:970:5: lv_expr_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_expr_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprsRule());
              					}
              					add(
              						current,
              						"expr",
              						lv_expr_0_0,
              						"org.xtext.WhileL.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalWhileL.g:987:3: (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalWhileL.g:988:4: otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileL.g:992:4: ( (lv_expr_2_0= ruleExpr ) )
            	    // InternalWhileL.g:993:5: (lv_expr_2_0= ruleExpr )
            	    {
            	    // InternalWhileL.g:993:5: (lv_expr_2_0= ruleExpr )
            	    // InternalWhileL.g:994:6: lv_expr_2_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_expr_2_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"expr",
            	      							lv_expr_2_0,
            	      							"org.xtext.WhileL.Expr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleVars"
    // InternalWhileL.g:1016:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalWhileL.g:1016:45: (iv_ruleVars= ruleVars EOF )
            // InternalWhileL.g:1017:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalWhileL.g:1023:1: ruleVars returns [EObject current=null] : ( ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_vari_0_0=null;
        Token otherlv_1=null;
        Token lv_vari_2_0=null;


        	enterRule();

        try {
            // InternalWhileL.g:1029:2: ( ( ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalWhileL.g:1030:2: ( ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalWhileL.g:1030:2: ( ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )* )
            // InternalWhileL.g:1031:3: ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalWhileL.g:1031:3: ( (lv_vari_0_0= RULE_VARIABLE ) )
            // InternalWhileL.g:1032:4: (lv_vari_0_0= RULE_VARIABLE )
            {
            // InternalWhileL.g:1032:4: (lv_vari_0_0= RULE_VARIABLE )
            // InternalWhileL.g:1033:5: lv_vari_0_0= RULE_VARIABLE
            {
            lv_vari_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_vari_0_0, grammarAccess.getVarsAccess().getVariVARIABLETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarsRule());
              					}
              					addWithLastConsumed(
              						current,
              						"vari",
              						lv_vari_0_0,
              						"org.xtext.WhileL.VARIABLE");
              				
            }

            }


            }

            // InternalWhileL.g:1049:3: (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalWhileL.g:1050:4: otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalWhileL.g:1054:4: ( (lv_vari_2_0= RULE_VARIABLE ) )
            	    // InternalWhileL.g:1055:5: (lv_vari_2_0= RULE_VARIABLE )
            	    {
            	    // InternalWhileL.g:1055:5: (lv_vari_2_0= RULE_VARIABLE )
            	    // InternalWhileL.g:1056:6: lv_vari_2_0= RULE_VARIABLE
            	    {
            	    lv_vari_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_vari_2_0, grammarAccess.getVarsAccess().getVariVARIABLETerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getVarsRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"vari",
            	      							lv_vari_2_0,
            	      							"org.xtext.WhileL.VARIABLE");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExpr"
    // InternalWhileL.g:1077:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalWhileL.g:1077:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalWhileL.g:1078:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalWhileL.g:1084:1: ruleExpr returns [EObject current=null] : ( (lv_exprbase_0_0= ruleExprBase ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprbase_0_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:1090:2: ( ( (lv_exprbase_0_0= ruleExprBase ) ) )
            // InternalWhileL.g:1091:2: ( (lv_exprbase_0_0= ruleExprBase ) )
            {
            // InternalWhileL.g:1091:2: ( (lv_exprbase_0_0= ruleExprBase ) )
            // InternalWhileL.g:1092:3: (lv_exprbase_0_0= ruleExprBase )
            {
            // InternalWhileL.g:1092:3: (lv_exprbase_0_0= ruleExprBase )
            // InternalWhileL.g:1093:4: lv_exprbase_0_0= ruleExprBase
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getExprAccess().getExprbaseExprBaseParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_exprbase_0_0=ruleExprBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getExprRule());
              				}
              				set(
              					current,
              					"exprbase",
              					lv_exprbase_0_0,
              					"org.xtext.WhileL.ExprBase");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLExpr"
    // InternalWhileL.g:1113:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // InternalWhileL.g:1113:46: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalWhileL.g:1114:2: iv_ruleLExpr= ruleLExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // InternalWhileL.g:1120:1: ruleLExpr returns [EObject current=null] : ( (lv_expr_0_0= ruleExpr ) )+ ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:1126:2: ( ( (lv_expr_0_0= ruleExpr ) )+ )
            // InternalWhileL.g:1127:2: ( (lv_expr_0_0= ruleExpr ) )+
            {
            // InternalWhileL.g:1127:2: ( (lv_expr_0_0= ruleExpr ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_SYMBOL && LA9_0<=RULE_VARIABLE)||(LA9_0>=33 && LA9_0<=34)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalWhileL.g:1128:3: (lv_expr_0_0= ruleExpr )
            	    {
            	    // InternalWhileL.g:1128:3: (lv_expr_0_0= ruleExpr )
            	    // InternalWhileL.g:1129:4: lv_expr_0_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getLExprAccess().getExprExprParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_expr_0_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getLExprRule());
            	      				}
            	      				add(
            	      					current,
            	      					"expr",
            	      					lv_expr_0_0,
            	      					"org.xtext.WhileL.Expr");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLExpr"


    // $ANTLR start "entryRuleExprBase"
    // InternalWhileL.g:1149:1: entryRuleExprBase returns [EObject current=null] : iv_ruleExprBase= ruleExprBase EOF ;
    public final EObject entryRuleExprBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBase = null;


        try {
            // InternalWhileL.g:1149:49: (iv_ruleExprBase= ruleExprBase EOF )
            // InternalWhileL.g:1150:2: iv_ruleExprBase= ruleExprBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprBaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprBase=ruleExprBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprBase; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprBase"


    // $ANTLR start "ruleExprBase"
    // InternalWhileL.g:1156:1: ruleExprBase returns [EObject current=null] : ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_identitor_20_0= 'not' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_symbol_24_0= RULE_SYMBOL ) ) ( (lv_lexpr_25_0= ruleLExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_expr_28_0= ruleExpr ) ) ( ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) ) ) ( (lv_expr1_30_0= ruleExpr ) ) otherlv_31= ')' ) ) ;
    public final EObject ruleExprBase() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token lv_identitor_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_identitor_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_identitor_12_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_identitor_16_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_identitor_20_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_symbol_24_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_identitor_29_1=null;
        Token lv_identitor_29_2=null;
        Token lv_identitor_29_3=null;
        Token otherlv_31=null;
        EObject lv_lexpr_5_0 = null;

        EObject lv_lexpr_9_0 = null;

        EObject lv_expr_13_0 = null;

        EObject lv_expr_17_0 = null;

        EObject lv_expr_21_0 = null;

        EObject lv_lexpr_25_0 = null;

        EObject lv_expr_28_0 = null;

        EObject lv_expr1_30_0 = null;



        	enterRule();

        try {
            // InternalWhileL.g:1162:2: ( ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_identitor_20_0= 'not' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_symbol_24_0= RULE_SYMBOL ) ) ( (lv_lexpr_25_0= ruleLExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_expr_28_0= ruleExpr ) ) ( ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) ) ) ( (lv_expr1_30_0= ruleExpr ) ) otherlv_31= ')' ) ) )
            // InternalWhileL.g:1163:2: ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_identitor_20_0= 'not' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_symbol_24_0= RULE_SYMBOL ) ) ( (lv_lexpr_25_0= ruleLExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_expr_28_0= ruleExpr ) ) ( ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) ) ) ( (lv_expr1_30_0= ruleExpr ) ) otherlv_31= ')' ) )
            {
            // InternalWhileL.g:1163:2: ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_identitor_20_0= 'not' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_symbol_24_0= RULE_SYMBOL ) ) ( (lv_lexpr_25_0= ruleLExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_expr_28_0= ruleExpr ) ) ( ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) ) ) ( (lv_expr1_30_0= ruleExpr ) ) otherlv_31= ')' ) )
            int alt11=10;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalWhileL.g:1164:3: ( (lv_value_0_0= 'nil' ) )
                    {
                    // InternalWhileL.g:1164:3: ( (lv_value_0_0= 'nil' ) )
                    // InternalWhileL.g:1165:4: (lv_value_0_0= 'nil' )
                    {
                    // InternalWhileL.g:1165:4: (lv_value_0_0= 'nil' )
                    // InternalWhileL.g:1166:5: lv_value_0_0= 'nil'
                    {
                    lv_value_0_0=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_0_0, grammarAccess.getExprBaseAccess().getValueNilKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprBaseRule());
                      					}
                      					setWithLastConsumed(current, "value", lv_value_0_0, "nil");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWhileL.g:1179:3: ( (lv_value_1_0= RULE_VARIABLE ) )
                    {
                    // InternalWhileL.g:1179:3: ( (lv_value_1_0= RULE_VARIABLE ) )
                    // InternalWhileL.g:1180:4: (lv_value_1_0= RULE_VARIABLE )
                    {
                    // InternalWhileL.g:1180:4: (lv_value_1_0= RULE_VARIABLE )
                    // InternalWhileL.g:1181:5: lv_value_1_0= RULE_VARIABLE
                    {
                    lv_value_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_1_0, grammarAccess.getExprBaseAccess().getValueVARIABLETerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprBaseRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"value",
                      						lv_value_1_0,
                      						"org.xtext.WhileL.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalWhileL.g:1198:3: ( (lv_value_2_0= RULE_SYMBOL ) )
                    {
                    // InternalWhileL.g:1198:3: ( (lv_value_2_0= RULE_SYMBOL ) )
                    // InternalWhileL.g:1199:4: (lv_value_2_0= RULE_SYMBOL )
                    {
                    // InternalWhileL.g:1199:4: (lv_value_2_0= RULE_SYMBOL )
                    // InternalWhileL.g:1200:5: lv_value_2_0= RULE_SYMBOL
                    {
                    lv_value_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_value_2_0, grammarAccess.getExprBaseAccess().getValueSYMBOLTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getExprBaseRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"value",
                      						lv_value_2_0,
                      						"org.xtext.WhileL.SYMBOL");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalWhileL.g:1217:3: (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' )
                    {
                    // InternalWhileL.g:1217:3: (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' )
                    // InternalWhileL.g:1218:4: otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalWhileL.g:1222:4: ( (lv_identitor_4_0= 'cons' ) )
                    // InternalWhileL.g:1223:5: (lv_identitor_4_0= 'cons' )
                    {
                    // InternalWhileL.g:1223:5: (lv_identitor_4_0= 'cons' )
                    // InternalWhileL.g:1224:6: lv_identitor_4_0= 'cons'
                    {
                    lv_identitor_4_0=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_identitor_4_0, grammarAccess.getExprBaseAccess().getIdentitorConsKeyword_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprBaseRule());
                      						}
                      						setWithLastConsumed(current, "identitor", lv_identitor_4_0, "cons");
                      					
                    }

                    }


                    }

                    // InternalWhileL.g:1236:4: ( (lv_lexpr_5_0= ruleLExpr ) )
                    // InternalWhileL.g:1237:5: (lv_lexpr_5_0= ruleLExpr )
                    {
                    // InternalWhileL.g:1237:5: (lv_lexpr_5_0= ruleLExpr )
                    // InternalWhileL.g:1238:6: lv_lexpr_5_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_lexpr_5_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                      						}
                      						set(
                      							current,
                      							"lexpr",
                      							lv_lexpr_5_0,
                      							"org.xtext.WhileL.LExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalWhileL.g:1261:3: (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' )
                    {
                    // InternalWhileL.g:1261:3: (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' )
                    // InternalWhileL.g:1262:4: otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalWhileL.g:1266:4: ( (lv_identitor_8_0= 'list' ) )
                    // InternalWhileL.g:1267:5: (lv_identitor_8_0= 'list' )
                    {
                    // InternalWhileL.g:1267:5: (lv_identitor_8_0= 'list' )
                    // InternalWhileL.g:1268:6: lv_identitor_8_0= 'list'
                    {
                    lv_identitor_8_0=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_identitor_8_0, grammarAccess.getExprBaseAccess().getIdentitorListKeyword_4_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprBaseRule());
                      						}
                      						setWithLastConsumed(current, "identitor", lv_identitor_8_0, "list");
                      					
                    }

                    }


                    }

                    // InternalWhileL.g:1280:4: ( (lv_lexpr_9_0= ruleLExpr ) )
                    // InternalWhileL.g:1281:5: (lv_lexpr_9_0= ruleLExpr )
                    {
                    // InternalWhileL.g:1281:5: (lv_lexpr_9_0= ruleLExpr )
                    // InternalWhileL.g:1282:6: lv_lexpr_9_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_lexpr_9_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                      						}
                      						set(
                      							current,
                      							"lexpr",
                      							lv_lexpr_9_0,
                      							"org.xtext.WhileL.LExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalWhileL.g:1305:3: (otherlv_11= '(' ( (lv_identitor_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    {
                    // InternalWhileL.g:1305:3: (otherlv_11= '(' ( (lv_identitor_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    // InternalWhileL.g:1306:4: otherlv_11= '(' ( (lv_identitor_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    // InternalWhileL.g:1310:4: ( (lv_identitor_12_0= 'hd' ) )
                    // InternalWhileL.g:1311:5: (lv_identitor_12_0= 'hd' )
                    {
                    // InternalWhileL.g:1311:5: (lv_identitor_12_0= 'hd' )
                    // InternalWhileL.g:1312:6: lv_identitor_12_0= 'hd'
                    {
                    lv_identitor_12_0=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_identitor_12_0, grammarAccess.getExprBaseAccess().getIdentitorHdKeyword_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprBaseRule());
                      						}
                      						setWithLastConsumed(current, "identitor", lv_identitor_12_0, "hd");
                      					
                    }

                    }


                    }

                    // InternalWhileL.g:1324:4: ( (lv_expr_13_0= ruleExpr ) )
                    // InternalWhileL.g:1325:5: (lv_expr_13_0= ruleExpr )
                    {
                    // InternalWhileL.g:1325:5: (lv_expr_13_0= ruleExpr )
                    // InternalWhileL.g:1326:6: lv_expr_13_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_expr_13_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_13_0,
                      							"org.xtext.WhileL.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalWhileL.g:1349:3: (otherlv_15= '(' ( (lv_identitor_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    {
                    // InternalWhileL.g:1349:3: (otherlv_15= '(' ( (lv_identitor_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    // InternalWhileL.g:1350:4: otherlv_15= '(' ( (lv_identitor_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_6_0());
                      			
                    }
                    // InternalWhileL.g:1354:4: ( (lv_identitor_16_0= 'tl' ) )
                    // InternalWhileL.g:1355:5: (lv_identitor_16_0= 'tl' )
                    {
                    // InternalWhileL.g:1355:5: (lv_identitor_16_0= 'tl' )
                    // InternalWhileL.g:1356:6: lv_identitor_16_0= 'tl'
                    {
                    lv_identitor_16_0=(Token)match(input,39,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_identitor_16_0, grammarAccess.getExprBaseAccess().getIdentitorTlKeyword_6_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprBaseRule());
                      						}
                      						setWithLastConsumed(current, "identitor", lv_identitor_16_0, "tl");
                      					
                    }

                    }


                    }

                    // InternalWhileL.g:1368:4: ( (lv_expr_17_0= ruleExpr ) )
                    // InternalWhileL.g:1369:5: (lv_expr_17_0= ruleExpr )
                    {
                    // InternalWhileL.g:1369:5: (lv_expr_17_0= ruleExpr )
                    // InternalWhileL.g:1370:6: lv_expr_17_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_expr_17_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_17_0,
                      							"org.xtext.WhileL.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_6_3());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalWhileL.g:1393:3: (otherlv_19= '(' ( (lv_identitor_20_0= 'not' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' )
                    {
                    // InternalWhileL.g:1393:3: (otherlv_19= '(' ( (lv_identitor_20_0= 'not' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' )
                    // InternalWhileL.g:1394:4: otherlv_19= '(' ( (lv_identitor_20_0= 'not' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')'
                    {
                    otherlv_19=(Token)match(input,34,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    // InternalWhileL.g:1398:4: ( (lv_identitor_20_0= 'not' ) )
                    // InternalWhileL.g:1399:5: (lv_identitor_20_0= 'not' )
                    {
                    // InternalWhileL.g:1399:5: (lv_identitor_20_0= 'not' )
                    // InternalWhileL.g:1400:6: lv_identitor_20_0= 'not'
                    {
                    lv_identitor_20_0=(Token)match(input,40,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_identitor_20_0, grammarAccess.getExprBaseAccess().getIdentitorNotKeyword_7_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprBaseRule());
                      						}
                      						setWithLastConsumed(current, "identitor", lv_identitor_20_0, "not");
                      					
                    }

                    }


                    }

                    // InternalWhileL.g:1412:4: ( (lv_expr_21_0= ruleExpr ) )
                    // InternalWhileL.g:1413:5: (lv_expr_21_0= ruleExpr )
                    {
                    // InternalWhileL.g:1413:5: (lv_expr_21_0= ruleExpr )
                    // InternalWhileL.g:1414:6: lv_expr_21_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_expr_21_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_21_0,
                      							"org.xtext.WhileL.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_22=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_7_3());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalWhileL.g:1437:3: (otherlv_23= '(' ( (lv_symbol_24_0= RULE_SYMBOL ) ) ( (lv_lexpr_25_0= ruleLExpr ) ) otherlv_26= ')' )
                    {
                    // InternalWhileL.g:1437:3: (otherlv_23= '(' ( (lv_symbol_24_0= RULE_SYMBOL ) ) ( (lv_lexpr_25_0= ruleLExpr ) ) otherlv_26= ')' )
                    // InternalWhileL.g:1438:4: otherlv_23= '(' ( (lv_symbol_24_0= RULE_SYMBOL ) ) ( (lv_lexpr_25_0= ruleLExpr ) ) otherlv_26= ')'
                    {
                    otherlv_23=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_8_0());
                      			
                    }
                    // InternalWhileL.g:1442:4: ( (lv_symbol_24_0= RULE_SYMBOL ) )
                    // InternalWhileL.g:1443:5: (lv_symbol_24_0= RULE_SYMBOL )
                    {
                    // InternalWhileL.g:1443:5: (lv_symbol_24_0= RULE_SYMBOL )
                    // InternalWhileL.g:1444:6: lv_symbol_24_0= RULE_SYMBOL
                    {
                    lv_symbol_24_0=(Token)match(input,RULE_SYMBOL,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_symbol_24_0, grammarAccess.getExprBaseAccess().getSymbolSYMBOLTerminalRuleCall_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExprBaseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"symbol",
                      							lv_symbol_24_0,
                      							"org.xtext.WhileL.SYMBOL");
                      					
                    }

                    }


                    }

                    // InternalWhileL.g:1460:4: ( (lv_lexpr_25_0= ruleLExpr ) )
                    // InternalWhileL.g:1461:5: (lv_lexpr_25_0= ruleLExpr )
                    {
                    // InternalWhileL.g:1461:5: (lv_lexpr_25_0= ruleLExpr )
                    // InternalWhileL.g:1462:6: lv_lexpr_25_0= ruleLExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_lexpr_25_0=ruleLExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                      						}
                      						set(
                      							current,
                      							"lexpr",
                      							lv_lexpr_25_0,
                      							"org.xtext.WhileL.LExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_26=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_8_3());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalWhileL.g:1485:3: (otherlv_27= '(' ( (lv_expr_28_0= ruleExpr ) ) ( ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) ) ) ( (lv_expr1_30_0= ruleExpr ) ) otherlv_31= ')' )
                    {
                    // InternalWhileL.g:1485:3: (otherlv_27= '(' ( (lv_expr_28_0= ruleExpr ) ) ( ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) ) ) ( (lv_expr1_30_0= ruleExpr ) ) otherlv_31= ')' )
                    // InternalWhileL.g:1486:4: otherlv_27= '(' ( (lv_expr_28_0= ruleExpr ) ) ( ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) ) ) ( (lv_expr1_30_0= ruleExpr ) ) otherlv_31= ')'
                    {
                    otherlv_27=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_9_0());
                      			
                    }
                    // InternalWhileL.g:1490:4: ( (lv_expr_28_0= ruleExpr ) )
                    // InternalWhileL.g:1491:5: (lv_expr_28_0= ruleExpr )
                    {
                    // InternalWhileL.g:1491:5: (lv_expr_28_0= ruleExpr )
                    // InternalWhileL.g:1492:6: lv_expr_28_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_expr_28_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_28_0,
                      							"org.xtext.WhileL.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalWhileL.g:1509:4: ( ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) ) )
                    // InternalWhileL.g:1510:5: ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) )
                    {
                    // InternalWhileL.g:1510:5: ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) )
                    // InternalWhileL.g:1511:6: (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' )
                    {
                    // InternalWhileL.g:1511:6: (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' )
                    int alt10=3;
                    switch ( input.LA(1) ) {
                    case 41:
                        {
                        alt10=1;
                        }
                        break;
                    case 42:
                        {
                        alt10=2;
                        }
                        break;
                    case 43:
                        {
                        alt10=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // InternalWhileL.g:1512:7: lv_identitor_29_1= '=?'
                            {
                            lv_identitor_29_1=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_identitor_29_1, grammarAccess.getExprBaseAccess().getIdentitorEqualsSignQuestionMarkKeyword_9_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprBaseRule());
                              							}
                              							setWithLastConsumed(current, "identitor", lv_identitor_29_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalWhileL.g:1523:7: lv_identitor_29_2= 'and'
                            {
                            lv_identitor_29_2=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_identitor_29_2, grammarAccess.getExprBaseAccess().getIdentitorAndKeyword_9_2_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprBaseRule());
                              							}
                              							setWithLastConsumed(current, "identitor", lv_identitor_29_2, null);
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalWhileL.g:1534:7: lv_identitor_29_3= 'or'
                            {
                            lv_identitor_29_3=(Token)match(input,43,FOLLOW_13); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_identitor_29_3, grammarAccess.getExprBaseAccess().getIdentitorOrKeyword_9_2_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExprBaseRule());
                              							}
                              							setWithLastConsumed(current, "identitor", lv_identitor_29_3, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalWhileL.g:1547:4: ( (lv_expr1_30_0= ruleExpr ) )
                    // InternalWhileL.g:1548:5: (lv_expr1_30_0= ruleExpr )
                    {
                    // InternalWhileL.g:1548:5: (lv_expr1_30_0= ruleExpr )
                    // InternalWhileL.g:1549:6: lv_expr1_30_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExprBaseAccess().getExpr1ExprParserRuleCall_9_3_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_expr1_30_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                      						}
                      						set(
                      							current,
                      							"expr1",
                      							lv_expr1_30_0,
                      							"org.xtext.WhileL.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_31=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_9_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprBase"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\2\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\42\3\uffff\1\50\2\uffff\1\53\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\12\1\uffff\1\5\1\4\1\10\1\7\1\11";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\33\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\7\1\6\33\uffff\2\6\1\11\1\uffff\1\10\1\5\1\13\1\12",
            "",
            "",
            "\2\14\33\uffff\2\14\6\uffff\3\6",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1163:2: ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_identitor_20_0= 'not' ) ) ( (lv_expr_21_0= ruleExpr ) ) otherlv_22= ')' ) | (otherlv_23= '(' ( (lv_symbol_24_0= RULE_SYMBOL ) ) ( (lv_lexpr_25_0= ruleLExpr ) ) otherlv_26= ')' ) | (otherlv_27= '(' ( (lv_expr_28_0= ruleExpr ) ) ( ( (lv_identitor_29_1= '=?' | lv_identitor_29_2= 'and' | lv_identitor_29_3= 'or' ) ) ) ( (lv_expr1_30_0= ruleExpr ) ) otherlv_31= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000A2600020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000600000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000600000032L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000E0000000000L});

}