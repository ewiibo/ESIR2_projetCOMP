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
import org.xtext.services.LggeWhileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLggeWhileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "'while'", "'do'", "'od'", "'if'", "'then'", "'else'", "'fi'", "'for'", "':='", "'foreach'", "'in'", "'=?'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLggeWhileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLggeWhileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLggeWhileParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLggeWhile.g"; }



     	private LggeWhileGrammarAccess grammarAccess;

        public InternalLggeWhileParser(TokenStream input, LggeWhileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected LggeWhileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalLggeWhile.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalLggeWhile.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalLggeWhile.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:77:2: ( ( (lv_functions_0_0= ruleFunction ) )* )
            // InternalLggeWhile.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            {
            // InternalLggeWhile.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLggeWhile.g:79:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalLggeWhile.g:79:3: (lv_functions_0_0= ruleFunction )
            	    // InternalLggeWhile.g:80:4: lv_functions_0_0= ruleFunction
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_functions_0_0=ruleFunction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"functions",
            	    					lv_functions_0_0,
            	    					"org.xtext.LggeWhile.Function");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

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
    // InternalLggeWhile.g:100:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalLggeWhile.g:100:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalLggeWhile.g:101:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:107:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symbol_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:113:2: ( (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalLggeWhile.g:114:2: (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalLggeWhile.g:114:2: (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalLggeWhile.g:115:3: otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalLggeWhile.g:119:3: ( (lv_symbol_1_0= RULE_SYMBOL ) )
            // InternalLggeWhile.g:120:4: (lv_symbol_1_0= RULE_SYMBOL )
            {
            // InternalLggeWhile.g:120:4: (lv_symbol_1_0= RULE_SYMBOL )
            // InternalLggeWhile.g:121:5: lv_symbol_1_0= RULE_SYMBOL
            {
            lv_symbol_1_0=(Token)match(input,RULE_SYMBOL,FOLLOW_5); 

            					newLeafNode(lv_symbol_1_0, grammarAccess.getFunctionAccess().getSymbolSYMBOLTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"symbol",
            						lv_symbol_1_0,
            						"org.xtext.LggeWhile.SYMBOL");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
            		
            // InternalLggeWhile.g:141:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalLggeWhile.g:142:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalLggeWhile.g:142:4: (lv_definition_3_0= ruleDefinition )
            // InternalLggeWhile.g:143:5: lv_definition_3_0= ruleDefinition
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_definition_3_0=ruleDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_3_0,
            						"org.xtext.LggeWhile.Definition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:164:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalLggeWhile.g:164:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalLggeWhile.g:165:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:171:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ;
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
            // InternalLggeWhile.g:177:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            // InternalLggeWhile.g:178:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            {
            // InternalLggeWhile.g:178:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            // InternalLggeWhile.g:179:3: otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
            		
            // InternalLggeWhile.g:183:3: ( (lv_input_1_0= ruleInput ) )
            // InternalLggeWhile.g:184:4: (lv_input_1_0= ruleInput )
            {
            // InternalLggeWhile.g:184:4: (lv_input_1_0= ruleInput )
            // InternalLggeWhile.g:185:5: lv_input_1_0= ruleInput
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_input_1_0=ruleInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_1_0,
            						"org.xtext.LggeWhile.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
            		
            // InternalLggeWhile.g:206:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalLggeWhile.g:207:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalLggeWhile.g:207:4: (lv_commands_3_0= ruleCommands )
            // InternalLggeWhile.g:208:5: lv_commands_3_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_commands_3_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"commands",
            						lv_commands_3_0,
            						"org.xtext.LggeWhile.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
            		
            // InternalLggeWhile.g:233:3: ( (lv_output_6_0= ruleOutput ) )
            // InternalLggeWhile.g:234:4: (lv_output_6_0= ruleOutput )
            {
            // InternalLggeWhile.g:234:4: (lv_output_6_0= ruleOutput )
            // InternalLggeWhile.g:235:5: lv_output_6_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_output_6_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinitionRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_6_0,
            						"org.xtext.LggeWhile.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:256:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalLggeWhile.g:256:46: (iv_ruleInput= ruleInput EOF )
            // InternalLggeWhile.g:257:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:263:1: ruleInput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalLggeWhile.g:269:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalLggeWhile.g:270:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalLggeWhile.g:270:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalLggeWhile.g:271:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalLggeWhile.g:271:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalLggeWhile.g:272:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalLggeWhile.g:272:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalLggeWhile.g:273:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            					newLeafNode(lv_vars_0_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"org.xtext.LggeWhile.VARIABLE");
            				

            }


            }

            // InternalLggeWhile.g:289:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLggeWhile.g:290:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLggeWhile.g:294:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalLggeWhile.g:295:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalLggeWhile.g:295:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalLggeWhile.g:296:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            	    						newLeafNode(lv_vars_2_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.LggeWhile.VARIABLE");
            	    					

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


            	leaveRule();

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
    // InternalLggeWhile.g:317:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalLggeWhile.g:317:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalLggeWhile.g:318:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:324:1: ruleOutput returns [EObject current=null] : ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_vars_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalLggeWhile.g:330:2: ( ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalLggeWhile.g:331:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalLggeWhile.g:331:2: ( ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalLggeWhile.g:332:3: ( (lv_vars_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalLggeWhile.g:332:3: ( (lv_vars_0_0= RULE_VARIABLE ) )
            // InternalLggeWhile.g:333:4: (lv_vars_0_0= RULE_VARIABLE )
            {
            // InternalLggeWhile.g:333:4: (lv_vars_0_0= RULE_VARIABLE )
            // InternalLggeWhile.g:334:5: lv_vars_0_0= RULE_VARIABLE
            {
            lv_vars_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            					newLeafNode(lv_vars_0_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"org.xtext.LggeWhile.VARIABLE");
            				

            }


            }

            // InternalLggeWhile.g:350:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLggeWhile.g:351:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLggeWhile.g:355:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalLggeWhile.g:356:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalLggeWhile.g:356:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalLggeWhile.g:357:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            	    						newLeafNode(lv_vars_2_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.LggeWhile.VARIABLE");
            	    					

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


            	leaveRule();

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
    // InternalLggeWhile.g:378:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalLggeWhile.g:378:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalLggeWhile.g:379:2: iv_ruleCommands= ruleCommands EOF
            {
             newCompositeNode(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommands=ruleCommands();

            state._fsp--;

             current =iv_ruleCommands; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:385:1: ruleCommands returns [EObject current=null] : ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_commands_0_0 = null;

        EObject lv_commands_2_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:391:2: ( ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* ) )
            // InternalLggeWhile.g:392:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            {
            // InternalLggeWhile.g:392:2: ( ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )* )
            // InternalLggeWhile.g:393:3: ( (lv_commands_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            {
            // InternalLggeWhile.g:393:3: ( (lv_commands_0_0= ruleCommand ) )
            // InternalLggeWhile.g:394:4: (lv_commands_0_0= ruleCommand )
            {
            // InternalLggeWhile.g:394:4: (lv_commands_0_0= ruleCommand )
            // InternalLggeWhile.g:395:5: lv_commands_0_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_commands_0_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandsRule());
            					}
            					add(
            						current,
            						"commands",
            						lv_commands_0_0,
            						"org.xtext.LggeWhile.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLggeWhile.g:412:3: (otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLggeWhile.g:413:4: otherlv_1= ';' ( (lv_commands_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalLggeWhile.g:417:4: ( (lv_commands_2_0= ruleCommand ) )
            	    // InternalLggeWhile.g:418:5: (lv_commands_2_0= ruleCommand )
            	    {
            	    // InternalLggeWhile.g:418:5: (lv_commands_2_0= ruleCommand )
            	    // InternalLggeWhile.g:419:6: lv_commands_2_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_commands_2_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_2_0,
            	    							"org.xtext.LggeWhile.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

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
    // InternalLggeWhile.g:441:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalLggeWhile.g:441:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalLggeWhile.g:442:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:448:1: ruleCommand returns [EObject current=null] : (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | this_NopCommand_5= ruleNopCommand ) ;
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
            // InternalLggeWhile.g:454:2: ( (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | this_NopCommand_5= ruleNopCommand ) )
            // InternalLggeWhile.g:455:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | this_NopCommand_5= ruleNopCommand )
            {
            // InternalLggeWhile.g:455:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | this_NopCommand_5= ruleNopCommand )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 28:
                {
                alt5=3;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=4;
                }
                break;
            case 30:
                {
                alt5=5;
                }
                break;
            case 20:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLggeWhile.g:456:3: this_WhileCommand_0= ruleWhileCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getWhileCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileCommand_0=ruleWhileCommand();

                    state._fsp--;


                    			current = this_WhileCommand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLggeWhile.g:465:3: this_IfCommand_1= ruleIfCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getIfCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfCommand_1=ruleIfCommand();

                    state._fsp--;


                    			current = this_IfCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLggeWhile.g:474:3: this_ForCommand_2= ruleForCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getForCommandParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForCommand_2=ruleForCommand();

                    state._fsp--;


                    			current = this_ForCommand_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLggeWhile.g:483:3: this_AffectCommand_3= ruleAffectCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getAffectCommandParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AffectCommand_3=ruleAffectCommand();

                    state._fsp--;


                    			current = this_AffectCommand_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLggeWhile.g:492:3: this_ForeachCommand_4= ruleForeachCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getForeachCommandParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForeachCommand_4=ruleForeachCommand();

                    state._fsp--;


                    			current = this_ForeachCommand_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLggeWhile.g:501:3: this_NopCommand_5= ruleNopCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getNopCommandParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_NopCommand_5=ruleNopCommand();

                    state._fsp--;


                    			current = this_NopCommand_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:513:1: entryRuleNopCommand returns [EObject current=null] : iv_ruleNopCommand= ruleNopCommand EOF ;
    public final EObject entryRuleNopCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNopCommand = null;


        try {
            // InternalLggeWhile.g:513:51: (iv_ruleNopCommand= ruleNopCommand EOF )
            // InternalLggeWhile.g:514:2: iv_ruleNopCommand= ruleNopCommand EOF
            {
             newCompositeNode(grammarAccess.getNopCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNopCommand=ruleNopCommand();

            state._fsp--;

             current =iv_ruleNopCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:520:1: ruleNopCommand returns [EObject current=null] : ( (lv_expr_0_0= 'nop' ) ) ;
    public final EObject ruleNopCommand() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0_0=null;


        	enterRule();

        try {
            // InternalLggeWhile.g:526:2: ( ( (lv_expr_0_0= 'nop' ) ) )
            // InternalLggeWhile.g:527:2: ( (lv_expr_0_0= 'nop' ) )
            {
            // InternalLggeWhile.g:527:2: ( (lv_expr_0_0= 'nop' ) )
            // InternalLggeWhile.g:528:3: (lv_expr_0_0= 'nop' )
            {
            // InternalLggeWhile.g:528:3: (lv_expr_0_0= 'nop' )
            // InternalLggeWhile.g:529:4: lv_expr_0_0= 'nop'
            {
            lv_expr_0_0=(Token)match(input,20,FOLLOW_2); 

            				newLeafNode(lv_expr_0_0, grammarAccess.getNopCommandAccess().getExprNopKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNopCommandRule());
            				}
            				setWithLastConsumed(current, "expr", lv_expr_0_0, "nop");
            			

            }


            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:544:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // InternalLggeWhile.g:544:53: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // InternalLggeWhile.g:545:2: iv_ruleWhileCommand= ruleWhileCommand EOF
            {
             newCompositeNode(grammarAccess.getWhileCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileCommand=ruleWhileCommand();

            state._fsp--;

             current =iv_ruleWhileCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:551:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:557:2: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalLggeWhile.g:558:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalLggeWhile.g:558:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalLggeWhile.g:559:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
            		
            // InternalLggeWhile.g:563:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalLggeWhile.g:564:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalLggeWhile.g:564:4: (lv_expr_1_0= ruleExpr )
            // InternalLggeWhile.g:565:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.LggeWhile.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileCommandAccess().getDoKeyword_2());
            		
            // InternalLggeWhile.g:586:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalLggeWhile.g:587:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalLggeWhile.g:587:4: (lv_commands_3_0= ruleCommands )
            // InternalLggeWhile.g:588:5: lv_commands_3_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getWhileCommandAccess().getCommandsCommandsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_commands_3_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            					}
            					set(
            						current,
            						"commands",
            						lv_commands_3_0,
            						"org.xtext.LggeWhile.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileCommandAccess().getOdKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:613:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // InternalLggeWhile.g:613:50: (iv_ruleIfCommand= ruleIfCommand EOF )
            // InternalLggeWhile.g:614:2: iv_ruleIfCommand= ruleIfCommand EOF
            {
             newCompositeNode(grammarAccess.getIfCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfCommand=ruleIfCommand();

            state._fsp--;

             current =iv_ruleIfCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:620:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
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
            // InternalLggeWhile.g:626:2: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // InternalLggeWhile.g:627:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // InternalLggeWhile.g:627:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // InternalLggeWhile.g:628:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
            		
            // InternalLggeWhile.g:632:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalLggeWhile.g:633:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalLggeWhile.g:633:4: (lv_expr_1_0= ruleExpr )
            // InternalLggeWhile.g:634:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getIfCommandAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.LggeWhile.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIfCommandAccess().getThenKeyword_2());
            		
            // InternalLggeWhile.g:655:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalLggeWhile.g:656:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalLggeWhile.g:656:4: (lv_commands_3_0= ruleCommands )
            // InternalLggeWhile.g:657:5: lv_commands_3_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getIfCommandAccess().getCommandsCommandsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_commands_3_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfCommandRule());
            					}
            					set(
            						current,
            						"commands",
            						lv_commands_3_0,
            						"org.xtext.LggeWhile.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLggeWhile.g:674:3: (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLggeWhile.g:675:4: otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfCommandAccess().getElseKeyword_4_0());
                    			
                    // InternalLggeWhile.g:679:4: ( (lv_elsecommands_5_0= ruleCommands ) )
                    // InternalLggeWhile.g:680:5: (lv_elsecommands_5_0= ruleCommands )
                    {
                    // InternalLggeWhile.g:680:5: (lv_elsecommands_5_0= ruleCommands )
                    // InternalLggeWhile.g:681:6: lv_elsecommands_5_0= ruleCommands
                    {

                    						newCompositeNode(grammarAccess.getIfCommandAccess().getElsecommandsCommandsParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_elsecommands_5_0=ruleCommands();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfCommandRule());
                    						}
                    						set(
                    							current,
                    							"elsecommands",
                    							lv_elsecommands_5_0,
                    							"org.xtext.LggeWhile.Commands");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getIfCommandAccess().getFiKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:707:1: entryRuleForCommand returns [EObject current=null] : iv_ruleForCommand= ruleForCommand EOF ;
    public final EObject entryRuleForCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForCommand = null;


        try {
            // InternalLggeWhile.g:707:51: (iv_ruleForCommand= ruleForCommand EOF )
            // InternalLggeWhile.g:708:2: iv_ruleForCommand= ruleForCommand EOF
            {
             newCompositeNode(grammarAccess.getForCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForCommand=ruleForCommand();

            state._fsp--;

             current =iv_ruleForCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:714:1: ruleForCommand returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleForCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_command_3_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:720:2: ( (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalLggeWhile.g:721:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalLggeWhile.g:721:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalLggeWhile.g:722:3: otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getForCommandAccess().getForKeyword_0());
            		
            // InternalLggeWhile.g:726:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalLggeWhile.g:727:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalLggeWhile.g:727:4: (lv_expr_1_0= ruleExpr )
            // InternalLggeWhile.g:728:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getForCommandAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.LggeWhile.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getForCommandAccess().getDoKeyword_2());
            		
            // InternalLggeWhile.g:749:3: ( (lv_command_3_0= ruleCommands ) )
            // InternalLggeWhile.g:750:4: (lv_command_3_0= ruleCommands )
            {
            // InternalLggeWhile.g:750:4: (lv_command_3_0= ruleCommands )
            // InternalLggeWhile.g:751:5: lv_command_3_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getForCommandAccess().getCommandCommandsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_command_3_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForCommandRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_3_0,
            						"org.xtext.LggeWhile.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getForCommandAccess().getOdKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:776:1: entryRuleAffectCommand returns [EObject current=null] : iv_ruleAffectCommand= ruleAffectCommand EOF ;
    public final EObject entryRuleAffectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectCommand = null;


        try {
            // InternalLggeWhile.g:776:54: (iv_ruleAffectCommand= ruleAffectCommand EOF )
            // InternalLggeWhile.g:777:2: iv_ruleAffectCommand= ruleAffectCommand EOF
            {
             newCompositeNode(grammarAccess.getAffectCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffectCommand=ruleAffectCommand();

            state._fsp--;

             current =iv_ruleAffectCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:783:1: ruleAffectCommand returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) ) ;
    public final EObject ruleAffectCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:789:2: ( ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) ) )
            // InternalLggeWhile.g:790:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) )
            {
            // InternalLggeWhile.g:790:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) )
            // InternalLggeWhile.g:791:3: ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) )
            {
            // InternalLggeWhile.g:791:3: ( (lv_vars_0_0= ruleVars ) )
            // InternalLggeWhile.g:792:4: (lv_vars_0_0= ruleVars )
            {
            // InternalLggeWhile.g:792:4: (lv_vars_0_0= ruleVars )
            // InternalLggeWhile.g:793:5: lv_vars_0_0= ruleVars
            {

            					newCompositeNode(grammarAccess.getAffectCommandAccess().getVarsVarsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_vars_0_0=ruleVars();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectCommandRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"org.xtext.LggeWhile.Vars");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAffectCommandAccess().getColonEqualsSignKeyword_1());
            		
            // InternalLggeWhile.g:814:3: ( (lv_exprs_2_0= ruleExprs ) )
            // InternalLggeWhile.g:815:4: (lv_exprs_2_0= ruleExprs )
            {
            // InternalLggeWhile.g:815:4: (lv_exprs_2_0= ruleExprs )
            // InternalLggeWhile.g:816:5: lv_exprs_2_0= ruleExprs
            {

            					newCompositeNode(grammarAccess.getAffectCommandAccess().getExprsExprsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exprs_2_0=ruleExprs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectCommandRule());
            					}
            					set(
            						current,
            						"exprs",
            						lv_exprs_2_0,
            						"org.xtext.LggeWhile.Exprs");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:837:1: entryRuleForeachCommand returns [EObject current=null] : iv_ruleForeachCommand= ruleForeachCommand EOF ;
    public final EObject entryRuleForeachCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachCommand = null;


        try {
            // InternalLggeWhile.g:837:55: (iv_ruleForeachCommand= ruleForeachCommand EOF )
            // InternalLggeWhile.g:838:2: iv_ruleForeachCommand= ruleForeachCommand EOF
            {
             newCompositeNode(grammarAccess.getForeachCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForeachCommand=ruleForeachCommand();

            state._fsp--;

             current =iv_ruleForeachCommand; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:844:1: ruleForeachCommand returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
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
            // InternalLggeWhile.g:850:2: ( (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // InternalLggeWhile.g:851:2: (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // InternalLggeWhile.g:851:2: (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // InternalLggeWhile.g:852:3: otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForeachCommandAccess().getForeachKeyword_0());
            		
            // InternalLggeWhile.g:856:3: ( (lv_vars_1_0= ruleVars ) )
            // InternalLggeWhile.g:857:4: (lv_vars_1_0= ruleVars )
            {
            // InternalLggeWhile.g:857:4: (lv_vars_1_0= ruleVars )
            // InternalLggeWhile.g:858:5: lv_vars_1_0= ruleVars
            {

            					newCompositeNode(grammarAccess.getForeachCommandAccess().getVarsVarsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_vars_1_0=ruleVars();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_1_0,
            						"org.xtext.LggeWhile.Vars");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getForeachCommandAccess().getInKeyword_2());
            		
            // InternalLggeWhile.g:879:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalLggeWhile.g:880:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalLggeWhile.g:880:4: (lv_expr_3_0= ruleExpr )
            // InternalLggeWhile.g:881:5: lv_expr_3_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getForeachCommandAccess().getExprExprParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_expr_3_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"org.xtext.LggeWhile.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getForeachCommandAccess().getDoKeyword_4());
            		
            // InternalLggeWhile.g:902:3: ( (lv_commands_5_0= ruleCommands ) )
            // InternalLggeWhile.g:903:4: (lv_commands_5_0= ruleCommands )
            {
            // InternalLggeWhile.g:903:4: (lv_commands_5_0= ruleCommands )
            // InternalLggeWhile.g:904:5: lv_commands_5_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getForeachCommandAccess().getCommandsCommandsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_commands_5_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
            					}
            					set(
            						current,
            						"commands",
            						lv_commands_5_0,
            						"org.xtext.LggeWhile.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForeachCommandAccess().getOdKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:929:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalLggeWhile.g:929:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalLggeWhile.g:930:2: iv_ruleExprs= ruleExprs EOF
            {
             newCompositeNode(grammarAccess.getExprsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprs=ruleExprs();

            state._fsp--;

             current =iv_ruleExprs; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:936:1: ruleExprs returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:942:2: ( ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* ) )
            // InternalLggeWhile.g:943:2: ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* )
            {
            // InternalLggeWhile.g:943:2: ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* )
            // InternalLggeWhile.g:944:3: ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )*
            {
            // InternalLggeWhile.g:944:3: ( (lv_expr_0_0= ruleExpr ) )
            // InternalLggeWhile.g:945:4: (lv_expr_0_0= ruleExpr )
            {
            // InternalLggeWhile.g:945:4: (lv_expr_0_0= ruleExpr )
            // InternalLggeWhile.g:946:5: lv_expr_0_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_expr_0_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprsRule());
            					}
            					add(
            						current,
            						"expr",
            						lv_expr_0_0,
            						"org.xtext.LggeWhile.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLggeWhile.g:963:3: (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLggeWhile.g:964:4: otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLggeWhile.g:968:4: ( (lv_expr_2_0= ruleExpr ) )
            	    // InternalLggeWhile.g:969:5: (lv_expr_2_0= ruleExpr )
            	    {
            	    // InternalLggeWhile.g:969:5: (lv_expr_2_0= ruleExpr )
            	    // InternalLggeWhile.g:970:6: lv_expr_2_0= ruleExpr
            	    {

            	    						newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_expr_2_0=ruleExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expr",
            	    							lv_expr_2_0,
            	    							"org.xtext.LggeWhile.Expr");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

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
    // InternalLggeWhile.g:992:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalLggeWhile.g:992:45: (iv_ruleVars= ruleVars EOF )
            // InternalLggeWhile.g:993:2: iv_ruleVars= ruleVars EOF
            {
             newCompositeNode(grammarAccess.getVarsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVars=ruleVars();

            state._fsp--;

             current =iv_ruleVars; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:999:1: ruleVars returns [EObject current=null] : ( ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_vari_0_0=null;
        Token otherlv_1=null;
        Token lv_vari_2_0=null;


        	enterRule();

        try {
            // InternalLggeWhile.g:1005:2: ( ( ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalLggeWhile.g:1006:2: ( ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalLggeWhile.g:1006:2: ( ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )* )
            // InternalLggeWhile.g:1007:3: ( (lv_vari_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalLggeWhile.g:1007:3: ( (lv_vari_0_0= RULE_VARIABLE ) )
            // InternalLggeWhile.g:1008:4: (lv_vari_0_0= RULE_VARIABLE )
            {
            // InternalLggeWhile.g:1008:4: (lv_vari_0_0= RULE_VARIABLE )
            // InternalLggeWhile.g:1009:5: lv_vari_0_0= RULE_VARIABLE
            {
            lv_vari_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            					newLeafNode(lv_vari_0_0, grammarAccess.getVarsAccess().getVariVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"vari",
            						lv_vari_0_0,
            						"org.xtext.LggeWhile.VARIABLE");
            				

            }


            }

            // InternalLggeWhile.g:1025:3: (otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLggeWhile.g:1026:4: otherlv_1= ',' ( (lv_vari_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLggeWhile.g:1030:4: ( (lv_vari_2_0= RULE_VARIABLE ) )
            	    // InternalLggeWhile.g:1031:5: (lv_vari_2_0= RULE_VARIABLE )
            	    {
            	    // InternalLggeWhile.g:1031:5: (lv_vari_2_0= RULE_VARIABLE )
            	    // InternalLggeWhile.g:1032:6: lv_vari_2_0= RULE_VARIABLE
            	    {
            	    lv_vari_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            	    						newLeafNode(lv_vari_2_0, grammarAccess.getVarsAccess().getVariVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVarsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vari",
            	    							lv_vari_2_0,
            	    							"org.xtext.LggeWhile.VARIABLE");
            	    					

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


            	leaveRule();

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
    // InternalLggeWhile.g:1053:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalLggeWhile.g:1053:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalLggeWhile.g:1054:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:1060:1: ruleExpr returns [EObject current=null] : ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase1_2_0= ruleExprBase ) ) )? ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprbase_0_0 = null;

        EObject lv_exprbase1_2_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:1066:2: ( ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase1_2_0= ruleExprBase ) ) )? ) )
            // InternalLggeWhile.g:1067:2: ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase1_2_0= ruleExprBase ) ) )? )
            {
            // InternalLggeWhile.g:1067:2: ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase1_2_0= ruleExprBase ) ) )? )
            // InternalLggeWhile.g:1068:3: ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase1_2_0= ruleExprBase ) ) )?
            {
            // InternalLggeWhile.g:1068:3: ( (lv_exprbase_0_0= ruleExprBase ) )
            // InternalLggeWhile.g:1069:4: (lv_exprbase_0_0= ruleExprBase )
            {
            // InternalLggeWhile.g:1069:4: (lv_exprbase_0_0= ruleExprBase )
            // InternalLggeWhile.g:1070:5: lv_exprbase_0_0= ruleExprBase
            {

            					newCompositeNode(grammarAccess.getExprAccess().getExprbaseExprBaseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_exprbase_0_0=ruleExprBase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprRule());
            					}
            					set(
            						current,
            						"exprbase",
            						lv_exprbase_0_0,
            						"org.xtext.LggeWhile.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLggeWhile.g:1087:3: (otherlv_1= '=?' ( (lv_exprbase1_2_0= ruleExprBase ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLggeWhile.g:1088:4: otherlv_1= '=?' ( (lv_exprbase1_2_0= ruleExprBase ) )
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getExprAccess().getEqualsSignQuestionMarkKeyword_1_0());
                    			
                    // InternalLggeWhile.g:1092:4: ( (lv_exprbase1_2_0= ruleExprBase ) )
                    // InternalLggeWhile.g:1093:5: (lv_exprbase1_2_0= ruleExprBase )
                    {
                    // InternalLggeWhile.g:1093:5: (lv_exprbase1_2_0= ruleExprBase )
                    // InternalLggeWhile.g:1094:6: lv_exprbase1_2_0= ruleExprBase
                    {

                    						newCompositeNode(grammarAccess.getExprAccess().getExprbase1ExprBaseParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exprbase1_2_0=ruleExprBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprRule());
                    						}
                    						set(
                    							current,
                    							"exprbase1",
                    							lv_exprbase1_2_0,
                    							"org.xtext.LggeWhile.ExprBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalLggeWhile.g:1116:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // InternalLggeWhile.g:1116:46: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalLggeWhile.g:1117:2: iv_ruleLExpr= ruleLExpr EOF
            {
             newCompositeNode(grammarAccess.getLExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLExpr=ruleLExpr();

            state._fsp--;

             current =iv_ruleLExpr; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:1123:1: ruleLExpr returns [EObject current=null] : ( (lv_expr_0_0= ruleExpr ) )+ ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:1129:2: ( ( (lv_expr_0_0= ruleExpr ) )+ )
            // InternalLggeWhile.g:1130:2: ( (lv_expr_0_0= ruleExpr ) )+
            {
            // InternalLggeWhile.g:1130:2: ( (lv_expr_0_0= ruleExpr ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_SYMBOL && LA10_0<=RULE_VARIABLE)||(LA10_0>=33 && LA10_0<=34)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLggeWhile.g:1131:3: (lv_expr_0_0= ruleExpr )
            	    {
            	    // InternalLggeWhile.g:1131:3: (lv_expr_0_0= ruleExpr )
            	    // InternalLggeWhile.g:1132:4: lv_expr_0_0= ruleExpr
            	    {

            	    				newCompositeNode(grammarAccess.getLExprAccess().getExprExprParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_22);
            	    lv_expr_0_0=ruleExpr();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getLExprRule());
            	    				}
            	    				add(
            	    					current,
            	    					"expr",
            	    					lv_expr_0_0,
            	    					"org.xtext.LggeWhile.Expr");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            	leaveRule();

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
    // InternalLggeWhile.g:1152:1: entryRuleExprBase returns [EObject current=null] : iv_ruleExprBase= ruleExprBase EOF ;
    public final EObject entryRuleExprBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBase = null;


        try {
            // InternalLggeWhile.g:1152:49: (iv_ruleExprBase= ruleExprBase EOF )
            // InternalLggeWhile.g:1153:2: iv_ruleExprBase= ruleExprBase EOF
            {
             newCompositeNode(grammarAccess.getExprBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExprBase=ruleExprBase();

            state._fsp--;

             current =iv_ruleExprBase; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLggeWhile.g:1159:1: ruleExprBase returns [EObject current=null] : ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor1_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor1_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLExpr ) ) otherlv_22= ')' ) ) ;
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
        Token lv_identitor1_12_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_identitor1_16_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_symbol_20_0=null;
        Token otherlv_22=null;
        EObject lv_lexpr_5_0 = null;

        EObject lv_lexpr_9_0 = null;

        EObject lv_expr_13_0 = null;

        EObject lv_expr_17_0 = null;

        EObject lv_lexpr_21_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:1165:2: ( ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor1_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor1_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLExpr ) ) otherlv_22= ')' ) ) )
            // InternalLggeWhile.g:1166:2: ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor1_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor1_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLExpr ) ) otherlv_22= ')' ) )
            {
            // InternalLggeWhile.g:1166:2: ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor1_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor1_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLExpr ) ) otherlv_22= ')' ) )
            int alt11=8;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalLggeWhile.g:1167:3: ( (lv_value_0_0= 'nil' ) )
                    {
                    // InternalLggeWhile.g:1167:3: ( (lv_value_0_0= 'nil' ) )
                    // InternalLggeWhile.g:1168:4: (lv_value_0_0= 'nil' )
                    {
                    // InternalLggeWhile.g:1168:4: (lv_value_0_0= 'nil' )
                    // InternalLggeWhile.g:1169:5: lv_value_0_0= 'nil'
                    {
                    lv_value_0_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getExprBaseAccess().getValueNilKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprBaseRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_0, "nil");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLggeWhile.g:1182:3: ( (lv_value_1_0= RULE_VARIABLE ) )
                    {
                    // InternalLggeWhile.g:1182:3: ( (lv_value_1_0= RULE_VARIABLE ) )
                    // InternalLggeWhile.g:1183:4: (lv_value_1_0= RULE_VARIABLE )
                    {
                    // InternalLggeWhile.g:1183:4: (lv_value_1_0= RULE_VARIABLE )
                    // InternalLggeWhile.g:1184:5: lv_value_1_0= RULE_VARIABLE
                    {
                    lv_value_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getExprBaseAccess().getValueVARIABLETerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprBaseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"org.xtext.LggeWhile.VARIABLE");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLggeWhile.g:1201:3: ( (lv_value_2_0= RULE_SYMBOL ) )
                    {
                    // InternalLggeWhile.g:1201:3: ( (lv_value_2_0= RULE_SYMBOL ) )
                    // InternalLggeWhile.g:1202:4: (lv_value_2_0= RULE_SYMBOL )
                    {
                    // InternalLggeWhile.g:1202:4: (lv_value_2_0= RULE_SYMBOL )
                    // InternalLggeWhile.g:1203:5: lv_value_2_0= RULE_SYMBOL
                    {
                    lv_value_2_0=(Token)match(input,RULE_SYMBOL,FOLLOW_2); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getExprBaseAccess().getValueSYMBOLTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExprBaseRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.LggeWhile.SYMBOL");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLggeWhile.g:1220:3: (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' )
                    {
                    // InternalLggeWhile.g:1220:3: (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' )
                    // InternalLggeWhile.g:1221:4: otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalLggeWhile.g:1225:4: ( (lv_identitor_4_0= 'cons' ) )
                    // InternalLggeWhile.g:1226:5: (lv_identitor_4_0= 'cons' )
                    {
                    // InternalLggeWhile.g:1226:5: (lv_identitor_4_0= 'cons' )
                    // InternalLggeWhile.g:1227:6: lv_identitor_4_0= 'cons'
                    {
                    lv_identitor_4_0=(Token)match(input,35,FOLLOW_13); 

                    						newLeafNode(lv_identitor_4_0, grammarAccess.getExprBaseAccess().getIdentitorConsKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExprBaseRule());
                    						}
                    						setWithLastConsumed(current, "identitor", lv_identitor_4_0, "cons");
                    					

                    }


                    }

                    // InternalLggeWhile.g:1239:4: ( (lv_lexpr_5_0= ruleLExpr ) )
                    // InternalLggeWhile.g:1240:5: (lv_lexpr_5_0= ruleLExpr )
                    {
                    // InternalLggeWhile.g:1240:5: (lv_lexpr_5_0= ruleLExpr )
                    // InternalLggeWhile.g:1241:6: lv_lexpr_5_0= ruleLExpr
                    {

                    						newCompositeNode(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_lexpr_5_0=ruleLExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    						}
                    						set(
                    							current,
                    							"lexpr",
                    							lv_lexpr_5_0,
                    							"org.xtext.LggeWhile.LExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLggeWhile.g:1264:3: (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' )
                    {
                    // InternalLggeWhile.g:1264:3: (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' )
                    // InternalLggeWhile.g:1265:4: otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_25); 

                    				newLeafNode(otherlv_7, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalLggeWhile.g:1269:4: ( (lv_identitor_8_0= 'list' ) )
                    // InternalLggeWhile.g:1270:5: (lv_identitor_8_0= 'list' )
                    {
                    // InternalLggeWhile.g:1270:5: (lv_identitor_8_0= 'list' )
                    // InternalLggeWhile.g:1271:6: lv_identitor_8_0= 'list'
                    {
                    lv_identitor_8_0=(Token)match(input,37,FOLLOW_13); 

                    						newLeafNode(lv_identitor_8_0, grammarAccess.getExprBaseAccess().getIdentitorListKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExprBaseRule());
                    						}
                    						setWithLastConsumed(current, "identitor", lv_identitor_8_0, "list");
                    					

                    }


                    }

                    // InternalLggeWhile.g:1283:4: ( (lv_lexpr_9_0= ruleLExpr ) )
                    // InternalLggeWhile.g:1284:5: (lv_lexpr_9_0= ruleLExpr )
                    {
                    // InternalLggeWhile.g:1284:5: (lv_lexpr_9_0= ruleLExpr )
                    // InternalLggeWhile.g:1285:6: lv_lexpr_9_0= ruleLExpr
                    {

                    						newCompositeNode(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_lexpr_9_0=ruleLExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    						}
                    						set(
                    							current,
                    							"lexpr",
                    							lv_lexpr_9_0,
                    							"org.xtext.LggeWhile.LExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLggeWhile.g:1308:3: (otherlv_11= '(' ( (lv_identitor1_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    {
                    // InternalLggeWhile.g:1308:3: (otherlv_11= '(' ( (lv_identitor1_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' )
                    // InternalLggeWhile.g:1309:4: otherlv_11= '(' ( (lv_identitor1_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')'
                    {
                    otherlv_11=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_11, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalLggeWhile.g:1313:4: ( (lv_identitor1_12_0= 'hd' ) )
                    // InternalLggeWhile.g:1314:5: (lv_identitor1_12_0= 'hd' )
                    {
                    // InternalLggeWhile.g:1314:5: (lv_identitor1_12_0= 'hd' )
                    // InternalLggeWhile.g:1315:6: lv_identitor1_12_0= 'hd'
                    {
                    lv_identitor1_12_0=(Token)match(input,38,FOLLOW_13); 

                    						newLeafNode(lv_identitor1_12_0, grammarAccess.getExprBaseAccess().getIdentitor1HdKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExprBaseRule());
                    						}
                    						setWithLastConsumed(current, "identitor1", lv_identitor1_12_0, "hd");
                    					

                    }


                    }

                    // InternalLggeWhile.g:1327:4: ( (lv_expr_13_0= ruleExpr ) )
                    // InternalLggeWhile.g:1328:5: (lv_expr_13_0= ruleExpr )
                    {
                    // InternalLggeWhile.g:1328:5: (lv_expr_13_0= ruleExpr )
                    // InternalLggeWhile.g:1329:6: lv_expr_13_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_expr_13_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_13_0,
                    							"org.xtext.LggeWhile.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLggeWhile.g:1352:3: (otherlv_15= '(' ( (lv_identitor1_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    {
                    // InternalLggeWhile.g:1352:3: (otherlv_15= '(' ( (lv_identitor1_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' )
                    // InternalLggeWhile.g:1353:4: otherlv_15= '(' ( (lv_identitor1_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_27); 

                    				newLeafNode(otherlv_15, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_6_0());
                    			
                    // InternalLggeWhile.g:1357:4: ( (lv_identitor1_16_0= 'tl' ) )
                    // InternalLggeWhile.g:1358:5: (lv_identitor1_16_0= 'tl' )
                    {
                    // InternalLggeWhile.g:1358:5: (lv_identitor1_16_0= 'tl' )
                    // InternalLggeWhile.g:1359:6: lv_identitor1_16_0= 'tl'
                    {
                    lv_identitor1_16_0=(Token)match(input,39,FOLLOW_13); 

                    						newLeafNode(lv_identitor1_16_0, grammarAccess.getExprBaseAccess().getIdentitor1TlKeyword_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExprBaseRule());
                    						}
                    						setWithLastConsumed(current, "identitor1", lv_identitor1_16_0, "tl");
                    					

                    }


                    }

                    // InternalLggeWhile.g:1371:4: ( (lv_expr_17_0= ruleExpr ) )
                    // InternalLggeWhile.g:1372:5: (lv_expr_17_0= ruleExpr )
                    {
                    // InternalLggeWhile.g:1372:5: (lv_expr_17_0= ruleExpr )
                    // InternalLggeWhile.g:1373:6: lv_expr_17_0= ruleExpr
                    {

                    						newCompositeNode(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_expr_17_0=ruleExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_17_0,
                    							"org.xtext.LggeWhile.Expr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalLggeWhile.g:1396:3: (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLExpr ) ) otherlv_22= ')' )
                    {
                    // InternalLggeWhile.g:1396:3: (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLExpr ) ) otherlv_22= ')' )
                    // InternalLggeWhile.g:1397:4: otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLExpr ) ) otherlv_22= ')'
                    {
                    otherlv_19=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_19, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_7_0());
                    			
                    // InternalLggeWhile.g:1401:4: ( (lv_symbol_20_0= RULE_SYMBOL ) )
                    // InternalLggeWhile.g:1402:5: (lv_symbol_20_0= RULE_SYMBOL )
                    {
                    // InternalLggeWhile.g:1402:5: (lv_symbol_20_0= RULE_SYMBOL )
                    // InternalLggeWhile.g:1403:6: lv_symbol_20_0= RULE_SYMBOL
                    {
                    lv_symbol_20_0=(Token)match(input,RULE_SYMBOL,FOLLOW_13); 

                    						newLeafNode(lv_symbol_20_0, grammarAccess.getExprBaseAccess().getSymbolSYMBOLTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExprBaseRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"symbol",
                    							lv_symbol_20_0,
                    							"org.xtext.LggeWhile.SYMBOL");
                    					

                    }


                    }

                    // InternalLggeWhile.g:1419:4: ( (lv_lexpr_21_0= ruleLExpr ) )
                    // InternalLggeWhile.g:1420:5: (lv_lexpr_21_0= ruleLExpr )
                    {
                    // InternalLggeWhile.g:1420:5: (lv_lexpr_21_0= ruleLExpr )
                    // InternalLggeWhile.g:1421:6: lv_lexpr_21_0= ruleLExpr
                    {

                    						newCompositeNode(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_lexpr_21_0=ruleLExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExprBaseRule());
                    						}
                    						set(
                    							current,
                    							"lexpr",
                    							lv_lexpr_21_0,
                    							"org.xtext.LggeWhile.LExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_7_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\42\3\uffff\1\47\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\10\1\4\1\7\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\33\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\6\36\uffff\1\7\1\uffff\1\5\1\11\1\10",
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
            return "1166:2: ( ( (lv_value_0_0= 'nil' ) ) | ( (lv_value_1_0= RULE_VARIABLE ) ) | ( (lv_value_2_0= RULE_SYMBOL ) ) | (otherlv_3= '(' ( (lv_identitor_4_0= 'cons' ) ) ( (lv_lexpr_5_0= ruleLExpr ) ) otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_identitor_8_0= 'list' ) ) ( (lv_lexpr_9_0= ruleLExpr ) ) otherlv_10= ')' ) | (otherlv_11= '(' ( (lv_identitor1_12_0= 'hd' ) ) ( (lv_expr_13_0= ruleExpr ) ) otherlv_14= ')' ) | (otherlv_15= '(' ( (lv_identitor1_16_0= 'tl' ) ) ( (lv_expr_17_0= ruleExpr ) ) otherlv_18= ')' ) | (otherlv_19= '(' ( (lv_symbol_20_0= RULE_SYMBOL ) ) ( (lv_lexpr_21_0= ruleLExpr ) ) otherlv_22= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000051300020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000600000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000032L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});

}