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
    // InternalLggeWhile.g:448:1: ruleCommand returns [EObject current=null] : (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | ( () otherlv_6= 'nop' ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        EObject this_WhileCommand_0 = null;

        EObject this_IfCommand_1 = null;

        EObject this_ForCommand_2 = null;

        EObject this_AffectCommand_3 = null;

        EObject this_ForeachCommand_4 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:454:2: ( (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | ( () otherlv_6= 'nop' ) ) )
            // InternalLggeWhile.g:455:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | ( () otherlv_6= 'nop' ) )
            {
            // InternalLggeWhile.g:455:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | ( () otherlv_6= 'nop' ) )
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
                    // InternalLggeWhile.g:501:3: ( () otherlv_6= 'nop' )
                    {
                    // InternalLggeWhile.g:501:3: ( () otherlv_6= 'nop' )
                    // InternalLggeWhile.g:502:4: () otherlv_6= 'nop'
                    {
                    // InternalLggeWhile.g:502:4: ()
                    // InternalLggeWhile.g:503:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getCommandAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getNopKeyword_5_1());
                    			

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleWhileCommand"
    // InternalLggeWhile.g:518:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // InternalLggeWhile.g:518:53: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // InternalLggeWhile.g:519:2: iv_ruleWhileCommand= ruleWhileCommand EOF
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
    // InternalLggeWhile.g:525:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:531:2: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalLggeWhile.g:532:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalLggeWhile.g:532:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalLggeWhile.g:533:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
            		
            // InternalLggeWhile.g:537:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalLggeWhile.g:538:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalLggeWhile.g:538:4: (lv_expr_1_0= ruleExpr )
            // InternalLggeWhile.g:539:5: lv_expr_1_0= ruleExpr
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
            		
            // InternalLggeWhile.g:560:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalLggeWhile.g:561:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalLggeWhile.g:561:4: (lv_commands_3_0= ruleCommands )
            // InternalLggeWhile.g:562:5: lv_commands_3_0= ruleCommands
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
    // InternalLggeWhile.g:587:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // InternalLggeWhile.g:587:50: (iv_ruleIfCommand= ruleIfCommand EOF )
            // InternalLggeWhile.g:588:2: iv_ruleIfCommand= ruleIfCommand EOF
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
    // InternalLggeWhile.g:594:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
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
            // InternalLggeWhile.g:600:2: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // InternalLggeWhile.g:601:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // InternalLggeWhile.g:601:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // InternalLggeWhile.g:602:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
            		
            // InternalLggeWhile.g:606:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalLggeWhile.g:607:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalLggeWhile.g:607:4: (lv_expr_1_0= ruleExpr )
            // InternalLggeWhile.g:608:5: lv_expr_1_0= ruleExpr
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
            		
            // InternalLggeWhile.g:629:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalLggeWhile.g:630:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalLggeWhile.g:630:4: (lv_commands_3_0= ruleCommands )
            // InternalLggeWhile.g:631:5: lv_commands_3_0= ruleCommands
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

            // InternalLggeWhile.g:648:3: (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLggeWhile.g:649:4: otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfCommandAccess().getElseKeyword_4_0());
                    			
                    // InternalLggeWhile.g:653:4: ( (lv_elsecommands_5_0= ruleCommands ) )
                    // InternalLggeWhile.g:654:5: (lv_elsecommands_5_0= ruleCommands )
                    {
                    // InternalLggeWhile.g:654:5: (lv_elsecommands_5_0= ruleCommands )
                    // InternalLggeWhile.g:655:6: lv_elsecommands_5_0= ruleCommands
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
    // InternalLggeWhile.g:681:1: entryRuleForCommand returns [EObject current=null] : iv_ruleForCommand= ruleForCommand EOF ;
    public final EObject entryRuleForCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForCommand = null;


        try {
            // InternalLggeWhile.g:681:51: (iv_ruleForCommand= ruleForCommand EOF )
            // InternalLggeWhile.g:682:2: iv_ruleForCommand= ruleForCommand EOF
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
    // InternalLggeWhile.g:688:1: ruleForCommand returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleForCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_command_3_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:694:2: ( (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalLggeWhile.g:695:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalLggeWhile.g:695:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalLggeWhile.g:696:3: otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getForCommandAccess().getForKeyword_0());
            		
            // InternalLggeWhile.g:700:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalLggeWhile.g:701:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalLggeWhile.g:701:4: (lv_expr_1_0= ruleExpr )
            // InternalLggeWhile.g:702:5: lv_expr_1_0= ruleExpr
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
            		
            // InternalLggeWhile.g:723:3: ( (lv_command_3_0= ruleCommands ) )
            // InternalLggeWhile.g:724:4: (lv_command_3_0= ruleCommands )
            {
            // InternalLggeWhile.g:724:4: (lv_command_3_0= ruleCommands )
            // InternalLggeWhile.g:725:5: lv_command_3_0= ruleCommands
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
    // InternalLggeWhile.g:750:1: entryRuleAffectCommand returns [EObject current=null] : iv_ruleAffectCommand= ruleAffectCommand EOF ;
    public final EObject entryRuleAffectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectCommand = null;


        try {
            // InternalLggeWhile.g:750:54: (iv_ruleAffectCommand= ruleAffectCommand EOF )
            // InternalLggeWhile.g:751:2: iv_ruleAffectCommand= ruleAffectCommand EOF
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
    // InternalLggeWhile.g:757:1: ruleAffectCommand returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) ) ;
    public final EObject ruleAffectCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:763:2: ( ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) ) )
            // InternalLggeWhile.g:764:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) )
            {
            // InternalLggeWhile.g:764:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) )
            // InternalLggeWhile.g:765:3: ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) )
            {
            // InternalLggeWhile.g:765:3: ( (lv_vars_0_0= ruleVars ) )
            // InternalLggeWhile.g:766:4: (lv_vars_0_0= ruleVars )
            {
            // InternalLggeWhile.g:766:4: (lv_vars_0_0= ruleVars )
            // InternalLggeWhile.g:767:5: lv_vars_0_0= ruleVars
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
            		
            // InternalLggeWhile.g:788:3: ( (lv_exprs_2_0= ruleExprs ) )
            // InternalLggeWhile.g:789:4: (lv_exprs_2_0= ruleExprs )
            {
            // InternalLggeWhile.g:789:4: (lv_exprs_2_0= ruleExprs )
            // InternalLggeWhile.g:790:5: lv_exprs_2_0= ruleExprs
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
    // InternalLggeWhile.g:811:1: entryRuleForeachCommand returns [EObject current=null] : iv_ruleForeachCommand= ruleForeachCommand EOF ;
    public final EObject entryRuleForeachCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachCommand = null;


        try {
            // InternalLggeWhile.g:811:55: (iv_ruleForeachCommand= ruleForeachCommand EOF )
            // InternalLggeWhile.g:812:2: iv_ruleForeachCommand= ruleForeachCommand EOF
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
    // InternalLggeWhile.g:818:1: ruleForeachCommand returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
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
            // InternalLggeWhile.g:824:2: ( (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // InternalLggeWhile.g:825:2: (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // InternalLggeWhile.g:825:2: (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // InternalLggeWhile.g:826:3: otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForeachCommandAccess().getForeachKeyword_0());
            		
            // InternalLggeWhile.g:830:3: ( (lv_vars_1_0= ruleVars ) )
            // InternalLggeWhile.g:831:4: (lv_vars_1_0= ruleVars )
            {
            // InternalLggeWhile.g:831:4: (lv_vars_1_0= ruleVars )
            // InternalLggeWhile.g:832:5: lv_vars_1_0= ruleVars
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
            		
            // InternalLggeWhile.g:853:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalLggeWhile.g:854:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalLggeWhile.g:854:4: (lv_expr_3_0= ruleExpr )
            // InternalLggeWhile.g:855:5: lv_expr_3_0= ruleExpr
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
            		
            // InternalLggeWhile.g:876:3: ( (lv_commands_5_0= ruleCommands ) )
            // InternalLggeWhile.g:877:4: (lv_commands_5_0= ruleCommands )
            {
            // InternalLggeWhile.g:877:4: (lv_commands_5_0= ruleCommands )
            // InternalLggeWhile.g:878:5: lv_commands_5_0= ruleCommands
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
    // InternalLggeWhile.g:903:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalLggeWhile.g:903:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalLggeWhile.g:904:2: iv_ruleExprs= ruleExprs EOF
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
    // InternalLggeWhile.g:910:1: ruleExprs returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:916:2: ( ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* ) )
            // InternalLggeWhile.g:917:2: ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* )
            {
            // InternalLggeWhile.g:917:2: ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )* )
            // InternalLggeWhile.g:918:3: ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )*
            {
            // InternalLggeWhile.g:918:3: ( (lv_expr_0_0= ruleExpr ) )
            // InternalLggeWhile.g:919:4: (lv_expr_0_0= ruleExpr )
            {
            // InternalLggeWhile.g:919:4: (lv_expr_0_0= ruleExpr )
            // InternalLggeWhile.g:920:5: lv_expr_0_0= ruleExpr
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

            // InternalLggeWhile.g:937:3: (otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLggeWhile.g:938:4: otherlv_1= ',' ( (lv_expr_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLggeWhile.g:942:4: ( (lv_expr_2_0= ruleExpr ) )
            	    // InternalLggeWhile.g:943:5: (lv_expr_2_0= ruleExpr )
            	    {
            	    // InternalLggeWhile.g:943:5: (lv_expr_2_0= ruleExpr )
            	    // InternalLggeWhile.g:944:6: lv_expr_2_0= ruleExpr
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
    // InternalLggeWhile.g:966:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalLggeWhile.g:966:45: (iv_ruleVars= ruleVars EOF )
            // InternalLggeWhile.g:967:2: iv_ruleVars= ruleVars EOF
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
    // InternalLggeWhile.g:973:1: ruleVars returns [EObject current=null] : ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_var_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token lv_var_2_0=null;


        	enterRule();

        try {
            // InternalLggeWhile.g:979:2: ( ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_var_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalLggeWhile.g:980:2: ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_var_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalLggeWhile.g:980:2: ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_var_2_0= RULE_VARIABLE ) ) )* )
            // InternalLggeWhile.g:981:3: ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_var_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalLggeWhile.g:981:3: ( (lv_var_0_0= RULE_VARIABLE ) )
            // InternalLggeWhile.g:982:4: (lv_var_0_0= RULE_VARIABLE )
            {
            // InternalLggeWhile.g:982:4: (lv_var_0_0= RULE_VARIABLE )
            // InternalLggeWhile.g:983:5: lv_var_0_0= RULE_VARIABLE
            {
            lv_var_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            					newLeafNode(lv_var_0_0, grammarAccess.getVarsAccess().getVarVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.LggeWhile.VARIABLE");
            				

            }


            }

            // InternalLggeWhile.g:999:3: (otherlv_1= ',' ( (lv_var_2_0= RULE_VARIABLE ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLggeWhile.g:1000:4: otherlv_1= ',' ( (lv_var_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalLggeWhile.g:1004:4: ( (lv_var_2_0= RULE_VARIABLE ) )
            	    // InternalLggeWhile.g:1005:5: (lv_var_2_0= RULE_VARIABLE )
            	    {
            	    // InternalLggeWhile.g:1005:5: (lv_var_2_0= RULE_VARIABLE )
            	    // InternalLggeWhile.g:1006:6: lv_var_2_0= RULE_VARIABLE
            	    {
            	    lv_var_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_11); 

            	    						newLeafNode(lv_var_2_0, grammarAccess.getVarsAccess().getVarVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVarsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"var",
            	    							lv_var_2_0,
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
    // InternalLggeWhile.g:1027:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalLggeWhile.g:1027:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalLggeWhile.g:1028:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalLggeWhile.g:1034:1: ruleExpr returns [EObject current=null] : ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase_2_0= ruleExprBase ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprbase_0_0 = null;

        EObject lv_exprbase_2_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:1040:2: ( ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase_2_0= ruleExprBase ) ) )* ) )
            // InternalLggeWhile.g:1041:2: ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase_2_0= ruleExprBase ) ) )* )
            {
            // InternalLggeWhile.g:1041:2: ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase_2_0= ruleExprBase ) ) )* )
            // InternalLggeWhile.g:1042:3: ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbase_2_0= ruleExprBase ) ) )*
            {
            // InternalLggeWhile.g:1042:3: ( (lv_exprbase_0_0= ruleExprBase ) )
            // InternalLggeWhile.g:1043:4: (lv_exprbase_0_0= ruleExprBase )
            {
            // InternalLggeWhile.g:1043:4: (lv_exprbase_0_0= ruleExprBase )
            // InternalLggeWhile.g:1044:5: lv_exprbase_0_0= ruleExprBase
            {

            					newCompositeNode(grammarAccess.getExprAccess().getExprbaseExprBaseParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_exprbase_0_0=ruleExprBase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprRule());
            					}
            					add(
            						current,
            						"exprbase",
            						lv_exprbase_0_0,
            						"org.xtext.LggeWhile.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLggeWhile.g:1061:3: (otherlv_1= '=?' ( (lv_exprbase_2_0= ruleExprBase ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLggeWhile.g:1062:4: otherlv_1= '=?' ( (lv_exprbase_2_0= ruleExprBase ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_13); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExprAccess().getEqualsSignQuestionMarkKeyword_1_0());
            	    			
            	    // InternalLggeWhile.g:1066:4: ( (lv_exprbase_2_0= ruleExprBase ) )
            	    // InternalLggeWhile.g:1067:5: (lv_exprbase_2_0= ruleExprBase )
            	    {
            	    // InternalLggeWhile.g:1067:5: (lv_exprbase_2_0= ruleExprBase )
            	    // InternalLggeWhile.g:1068:6: lv_exprbase_2_0= ruleExprBase
            	    {

            	    						newCompositeNode(grammarAccess.getExprAccess().getExprbaseExprBaseParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_exprbase_2_0=ruleExprBase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprbase",
            	    							lv_exprbase_2_0,
            	    							"org.xtext.LggeWhile.ExprBase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLExpr"
    // InternalLggeWhile.g:1090:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // InternalLggeWhile.g:1090:46: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalLggeWhile.g:1091:2: iv_ruleLExpr= ruleLExpr EOF
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
    // InternalLggeWhile.g:1097:1: ruleLExpr returns [EObject current=null] : ( (lv_expr_0_0= ruleExpr ) )+ ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:1103:2: ( ( (lv_expr_0_0= ruleExpr ) )+ )
            // InternalLggeWhile.g:1104:2: ( (lv_expr_0_0= ruleExpr ) )+
            {
            // InternalLggeWhile.g:1104:2: ( (lv_expr_0_0= ruleExpr ) )+
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
            	    // InternalLggeWhile.g:1105:3: (lv_expr_0_0= ruleExpr )
            	    {
            	    // InternalLggeWhile.g:1105:3: (lv_expr_0_0= ruleExpr )
            	    // InternalLggeWhile.g:1106:4: lv_expr_0_0= ruleExpr
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
    // InternalLggeWhile.g:1126:1: entryRuleExprBase returns [EObject current=null] : iv_ruleExprBase= ruleExprBase EOF ;
    public final EObject entryRuleExprBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBase = null;


        try {
            // InternalLggeWhile.g:1126:49: (iv_ruleExprBase= ruleExprBase EOF )
            // InternalLggeWhile.g:1127:2: iv_ruleExprBase= ruleExprBase EOF
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
    // InternalLggeWhile.g:1133:1: ruleExprBase returns [EObject current=null] : ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) ) ;
    public final EObject ruleExprBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_VARIABLE_3=null;
        Token this_SYMBOL_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token this_SYMBOL_23=null;
        Token otherlv_25=null;
        EObject this_LExpr_8 = null;

        EObject this_LExpr_12 = null;

        EObject this_Expr_16 = null;

        EObject this_Expr_20 = null;

        EObject this_LExpr_24 = null;



        	enterRule();

        try {
            // InternalLggeWhile.g:1139:2: ( ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) ) )
            // InternalLggeWhile.g:1140:2: ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) )
            {
            // InternalLggeWhile.g:1140:2: ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) )
            int alt11=8;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalLggeWhile.g:1141:3: ( () otherlv_1= 'nil' )
                    {
                    // InternalLggeWhile.g:1141:3: ( () otherlv_1= 'nil' )
                    // InternalLggeWhile.g:1142:4: () otherlv_1= 'nil'
                    {
                    // InternalLggeWhile.g:1142:4: ()
                    // InternalLggeWhile.g:1143:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExprBaseAccess().getExprBaseAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExprBaseAccess().getNilKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLggeWhile.g:1155:3: ( () this_VARIABLE_3= RULE_VARIABLE )
                    {
                    // InternalLggeWhile.g:1155:3: ( () this_VARIABLE_3= RULE_VARIABLE )
                    // InternalLggeWhile.g:1156:4: () this_VARIABLE_3= RULE_VARIABLE
                    {
                    // InternalLggeWhile.g:1156:4: ()
                    // InternalLggeWhile.g:1157:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExprBaseAccess().getExprBaseAction_1_0(),
                    						current);
                    				

                    }

                    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

                    				newLeafNode(this_VARIABLE_3, grammarAccess.getExprBaseAccess().getVARIABLETerminalRuleCall_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLggeWhile.g:1169:3: ( () this_SYMBOL_5= RULE_SYMBOL )
                    {
                    // InternalLggeWhile.g:1169:3: ( () this_SYMBOL_5= RULE_SYMBOL )
                    // InternalLggeWhile.g:1170:4: () this_SYMBOL_5= RULE_SYMBOL
                    {
                    // InternalLggeWhile.g:1170:4: ()
                    // InternalLggeWhile.g:1171:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExprBaseAccess().getExprBaseAction_2_0(),
                    						current);
                    				

                    }

                    this_SYMBOL_5=(Token)match(input,RULE_SYMBOL,FOLLOW_2); 

                    				newLeafNode(this_SYMBOL_5, grammarAccess.getExprBaseAccess().getSYMBOLTerminalRuleCall_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLggeWhile.g:1183:3: (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' )
                    {
                    // InternalLggeWhile.g:1183:3: (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' )
                    // InternalLggeWhile.g:1184:4: otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_7=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getExprBaseAccess().getConsKeyword_3_1());
                    			

                    				newCompositeNode(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_3_2());
                    			
                    pushFollow(FOLLOW_24);
                    this_LExpr_8=ruleLExpr();

                    state._fsp--;


                    				current = this_LExpr_8;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_9=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLggeWhile.g:1206:3: (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' )
                    {
                    // InternalLggeWhile.g:1206:3: (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' )
                    // InternalLggeWhile.g:1207:4: otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')'
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_11=(Token)match(input,37,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getExprBaseAccess().getListKeyword_4_1());
                    			

                    				newCompositeNode(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_4_2());
                    			
                    pushFollow(FOLLOW_24);
                    this_LExpr_12=ruleLExpr();

                    state._fsp--;


                    				current = this_LExpr_12;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_13=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalLggeWhile.g:1229:3: (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' )
                    {
                    // InternalLggeWhile.g:1229:3: (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' )
                    // InternalLggeWhile.g:1230:4: otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')'
                    {
                    otherlv_14=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_14, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_5_0());
                    			
                    otherlv_15=(Token)match(input,38,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getExprBaseAccess().getHdKeyword_5_1());
                    			

                    				newCompositeNode(grammarAccess.getExprBaseAccess().getExprParserRuleCall_5_2());
                    			
                    pushFollow(FOLLOW_24);
                    this_Expr_16=ruleExpr();

                    state._fsp--;


                    				current = this_Expr_16;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_17=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalLggeWhile.g:1252:3: (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' )
                    {
                    // InternalLggeWhile.g:1252:3: (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' )
                    // InternalLggeWhile.g:1253:4: otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')'
                    {
                    otherlv_18=(Token)match(input,34,FOLLOW_27); 

                    				newLeafNode(otherlv_18, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_6_0());
                    			
                    otherlv_19=(Token)match(input,39,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getExprBaseAccess().getTlKeyword_6_1());
                    			

                    				newCompositeNode(grammarAccess.getExprBaseAccess().getExprParserRuleCall_6_2());
                    			
                    pushFollow(FOLLOW_24);
                    this_Expr_20=ruleExpr();

                    state._fsp--;


                    				current = this_Expr_20;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_21=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_6_3());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalLggeWhile.g:1275:3: (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' )
                    {
                    // InternalLggeWhile.g:1275:3: (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' )
                    // InternalLggeWhile.g:1276:4: otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')'
                    {
                    otherlv_22=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_7_0());
                    			
                    this_SYMBOL_23=(Token)match(input,RULE_SYMBOL,FOLLOW_13); 

                    				newLeafNode(this_SYMBOL_23, grammarAccess.getExprBaseAccess().getSYMBOLTerminalRuleCall_7_1());
                    			

                    				newCompositeNode(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_7_2());
                    			
                    pushFollow(FOLLOW_24);
                    this_LExpr_24=ruleLExpr();

                    state._fsp--;


                    				current = this_LExpr_24;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_25=(Token)match(input,36,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_7_3());
                    			

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
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\7\1\4\1\10\1\5\1\6";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\33\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\7\36\uffff\1\6\1\uffff\1\10\1\11\1\5",
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
            return "1140:2: ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) )";
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