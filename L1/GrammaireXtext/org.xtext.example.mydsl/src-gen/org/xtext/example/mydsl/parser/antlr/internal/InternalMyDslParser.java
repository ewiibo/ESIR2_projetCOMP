package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "';'", "'nop'", "'while'", "'do'", "'od'", "'if'", "'then'", "'else'", "'fi'", "'for'", "':='", "'foreach'", "'in'", "','", "'=?'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'"
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:65:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalMyDsl.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_functions_0_0= ruleFunction ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_functions_0_0= ruleFunction ) )* )
            // InternalMyDsl.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_functions_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_functions_0_0= ruleFunction )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_functions_0_0= ruleFunction )
            	    // InternalMyDsl.g:80:4: lv_functions_0_0= ruleFunction
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
            	    					"org.xtext.example.mydsl.MyDsl.Function");
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
    // InternalMyDsl.g:100:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:101:2: iv_ruleFunction= ruleFunction EOF
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
    // InternalMyDsl.g:107:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_symbol_1_0=null;
        Token otherlv_2=null;
        EObject lv_definition_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) ) )
            // InternalMyDsl.g:115:3: otherlv_0= 'function' ( (lv_symbol_1_0= RULE_SYMBOL ) ) otherlv_2= ':' ( (lv_definition_3_0= ruleDefinition ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_symbol_1_0= RULE_SYMBOL ) )
            // InternalMyDsl.g:120:4: (lv_symbol_1_0= RULE_SYMBOL )
            {
            // InternalMyDsl.g:120:4: (lv_symbol_1_0= RULE_SYMBOL )
            // InternalMyDsl.g:121:5: lv_symbol_1_0= RULE_SYMBOL
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
            						"org.xtext.example.mydsl.MyDsl.SYMBOL");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:141:3: ( (lv_definition_3_0= ruleDefinition ) )
            // InternalMyDsl.g:142:4: (lv_definition_3_0= ruleDefinition )
            {
            // InternalMyDsl.g:142:4: (lv_definition_3_0= ruleDefinition )
            // InternalMyDsl.g:143:5: lv_definition_3_0= ruleDefinition
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
            						"org.xtext.example.mydsl.MyDsl.Definition");
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
    // InternalMyDsl.g:164:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalMyDsl.g:164:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMyDsl.g:165:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalMyDsl.g:171:1: ruleDefinition returns [EObject current=null] : (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) ;
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
            // InternalMyDsl.g:177:2: ( (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) ) )
            // InternalMyDsl.g:178:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            {
            // InternalMyDsl.g:178:2: (otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) ) )
            // InternalMyDsl.g:179:3: otherlv_0= 'read' ( (lv_input_1_0= ruleInput ) ) otherlv_2= '%' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= '%' otherlv_5= 'write' ( (lv_output_6_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getReadKeyword_0());
            		
            // InternalMyDsl.g:183:3: ( (lv_input_1_0= ruleInput ) )
            // InternalMyDsl.g:184:4: (lv_input_1_0= ruleInput )
            {
            // InternalMyDsl.g:184:4: (lv_input_1_0= ruleInput )
            // InternalMyDsl.g:185:5: lv_input_1_0= ruleInput
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
            						"org.xtext.example.mydsl.MyDsl.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinitionAccess().getPercentSignKeyword_2());
            		
            // InternalMyDsl.g:206:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalMyDsl.g:207:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalMyDsl.g:207:4: (lv_commands_3_0= ruleCommands )
            // InternalMyDsl.g:208:5: lv_commands_3_0= ruleCommands
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
            						"org.xtext.example.mydsl.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getPercentSignKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getWriteKeyword_5());
            		
            // InternalMyDsl.g:233:3: ( (lv_output_6_0= ruleOutput ) )
            // InternalMyDsl.g:234:4: (lv_output_6_0= ruleOutput )
            {
            // InternalMyDsl.g:234:4: (lv_output_6_0= ruleOutput )
            // InternalMyDsl.g:235:5: lv_output_6_0= ruleOutput
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
            						"org.xtext.example.mydsl.MyDsl.Output");
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


    // $ANTLR start "entryRuleCommands"
    // InternalMyDsl.g:256:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // InternalMyDsl.g:256:49: (iv_ruleCommands= ruleCommands EOF )
            // InternalMyDsl.g:257:2: iv_ruleCommands= ruleCommands EOF
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
    // InternalMyDsl.g:263:1: ruleCommands returns [EObject current=null] : ( ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_othercommand_2_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_command_0_0 = null;

        EObject lv_othercommand_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:269:2: ( ( ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_othercommand_2_0= ruleCommand ) ) )* ) )
            // InternalMyDsl.g:270:2: ( ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_othercommand_2_0= ruleCommand ) ) )* )
            {
            // InternalMyDsl.g:270:2: ( ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_othercommand_2_0= ruleCommand ) ) )* )
            // InternalMyDsl.g:271:3: ( (lv_command_0_0= ruleCommand ) ) (otherlv_1= ';' ( (lv_othercommand_2_0= ruleCommand ) ) )*
            {
            // InternalMyDsl.g:271:3: ( (lv_command_0_0= ruleCommand ) )
            // InternalMyDsl.g:272:4: (lv_command_0_0= ruleCommand )
            {
            // InternalMyDsl.g:272:4: (lv_command_0_0= ruleCommand )
            // InternalMyDsl.g:273:5: lv_command_0_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getCommandsAccess().getCommandCommandParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_command_0_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommandsRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"org.xtext.example.mydsl.MyDsl.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:290:3: (otherlv_1= ';' ( (lv_othercommand_2_0= ruleCommand ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:291:4: otherlv_1= ';' ( (lv_othercommand_2_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:295:4: ( (lv_othercommand_2_0= ruleCommand ) )
            	    // InternalMyDsl.g:296:5: (lv_othercommand_2_0= ruleCommand )
            	    {
            	    // InternalMyDsl.g:296:5: (lv_othercommand_2_0= ruleCommand )
            	    // InternalMyDsl.g:297:6: lv_othercommand_2_0= ruleCommand
            	    {

            	    						newCompositeNode(grammarAccess.getCommandsAccess().getOthercommandCommandParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_othercommand_2_0=ruleCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCommandsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"othercommand",
            	    							lv_othercommand_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.Command");
            	    						afterParserOrEnumRuleCall();
            	    					

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
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalMyDsl.g:319:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalMyDsl.g:319:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalMyDsl.g:320:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalMyDsl.g:326:1: ruleCommand returns [EObject current=null] : (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | ( () otherlv_6= 'nop' ) ) ;
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
            // InternalMyDsl.g:332:2: ( (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | ( () otherlv_6= 'nop' ) ) )
            // InternalMyDsl.g:333:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | ( () otherlv_6= 'nop' ) )
            {
            // InternalMyDsl.g:333:2: (this_WhileCommand_0= ruleWhileCommand | this_IfCommand_1= ruleIfCommand | this_ForCommand_2= ruleForCommand | this_AffectCommand_3= ruleAffectCommand | this_ForeachCommand_4= ruleForeachCommand | ( () otherlv_6= 'nop' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            case RULE_VARIABLE:
                {
                alt3=4;
                }
                break;
            case 29:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:334:3: this_WhileCommand_0= ruleWhileCommand
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
                    // InternalMyDsl.g:343:3: this_IfCommand_1= ruleIfCommand
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
                    // InternalMyDsl.g:352:3: this_ForCommand_2= ruleForCommand
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
                    // InternalMyDsl.g:361:3: this_AffectCommand_3= ruleAffectCommand
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
                    // InternalMyDsl.g:370:3: this_ForeachCommand_4= ruleForeachCommand
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
                    // InternalMyDsl.g:379:3: ( () otherlv_6= 'nop' )
                    {
                    // InternalMyDsl.g:379:3: ( () otherlv_6= 'nop' )
                    // InternalMyDsl.g:380:4: () otherlv_6= 'nop'
                    {
                    // InternalMyDsl.g:380:4: ()
                    // InternalMyDsl.g:381:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommandAccess().getCommandAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:396:1: entryRuleWhileCommand returns [EObject current=null] : iv_ruleWhileCommand= ruleWhileCommand EOF ;
    public final EObject entryRuleWhileCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileCommand = null;


        try {
            // InternalMyDsl.g:396:53: (iv_ruleWhileCommand= ruleWhileCommand EOF )
            // InternalMyDsl.g:397:2: iv_ruleWhileCommand= ruleWhileCommand EOF
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
    // InternalMyDsl.g:403:1: ruleWhileCommand returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleWhileCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:409:2: ( (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalMyDsl.g:410:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalMyDsl.g:410:2: (otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalMyDsl.g:411:3: otherlv_0= 'while' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_commands_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileCommandAccess().getWhileKeyword_0());
            		
            // InternalMyDsl.g:415:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalMyDsl.g:416:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalMyDsl.g:416:4: (lv_expr_1_0= ruleExpr )
            // InternalMyDsl.g:417:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileCommandAccess().getDoKeyword_2());
            		
            // InternalMyDsl.g:438:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalMyDsl.g:439:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalMyDsl.g:439:4: (lv_commands_3_0= ruleCommands )
            // InternalMyDsl.g:440:5: lv_commands_3_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getWhileCommandAccess().getCommandsCommandsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_commands_3_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileCommandRule());
            					}
            					set(
            						current,
            						"commands",
            						lv_commands_3_0,
            						"org.xtext.example.mydsl.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:465:1: entryRuleIfCommand returns [EObject current=null] : iv_ruleIfCommand= ruleIfCommand EOF ;
    public final EObject entryRuleIfCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfCommand = null;


        try {
            // InternalMyDsl.g:465:50: (iv_ruleIfCommand= ruleIfCommand EOF )
            // InternalMyDsl.g:466:2: iv_ruleIfCommand= ruleIfCommand EOF
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
    // InternalMyDsl.g:472:1: ruleIfCommand returns [EObject current=null] : (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) ;
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
            // InternalMyDsl.g:478:2: ( (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' ) )
            // InternalMyDsl.g:479:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            {
            // InternalMyDsl.g:479:2: (otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi' )
            // InternalMyDsl.g:480:3: otherlv_0= 'if' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'then' ( (lv_commands_3_0= ruleCommands ) ) (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )? otherlv_6= 'fi'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getIfCommandAccess().getIfKeyword_0());
            		
            // InternalMyDsl.g:484:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalMyDsl.g:485:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalMyDsl.g:485:4: (lv_expr_1_0= ruleExpr )
            // InternalMyDsl.g:486:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getIfCommandAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getIfCommandAccess().getThenKeyword_2());
            		
            // InternalMyDsl.g:507:3: ( (lv_commands_3_0= ruleCommands ) )
            // InternalMyDsl.g:508:4: (lv_commands_3_0= ruleCommands )
            {
            // InternalMyDsl.g:508:4: (lv_commands_3_0= ruleCommands )
            // InternalMyDsl.g:509:5: lv_commands_3_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getIfCommandAccess().getCommandsCommandsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_commands_3_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfCommandRule());
            					}
            					set(
            						current,
            						"commands",
            						lv_commands_3_0,
            						"org.xtext.example.mydsl.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:526:3: (otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:527:4: otherlv_4= 'else' ( (lv_elsecommands_5_0= ruleCommands ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getIfCommandAccess().getElseKeyword_4_0());
                    			
                    // InternalMyDsl.g:531:4: ( (lv_elsecommands_5_0= ruleCommands ) )
                    // InternalMyDsl.g:532:5: (lv_elsecommands_5_0= ruleCommands )
                    {
                    // InternalMyDsl.g:532:5: (lv_elsecommands_5_0= ruleCommands )
                    // InternalMyDsl.g:533:6: lv_elsecommands_5_0= ruleCommands
                    {

                    						newCompositeNode(grammarAccess.getIfCommandAccess().getElsecommandsCommandsParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_elsecommands_5_0=ruleCommands();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfCommandRule());
                    						}
                    						set(
                    							current,
                    							"elsecommands",
                    							lv_elsecommands_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Commands");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FOLLOW_2); 

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
    // InternalMyDsl.g:559:1: entryRuleForCommand returns [EObject current=null] : iv_ruleForCommand= ruleForCommand EOF ;
    public final EObject entryRuleForCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForCommand = null;


        try {
            // InternalMyDsl.g:559:51: (iv_ruleForCommand= ruleForCommand EOF )
            // InternalMyDsl.g:560:2: iv_ruleForCommand= ruleForCommand EOF
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
    // InternalMyDsl.g:566:1: ruleForCommand returns [EObject current=null] : (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' ) ;
    public final EObject ruleForCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_1_0 = null;

        EObject lv_command_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:572:2: ( (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' ) )
            // InternalMyDsl.g:573:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' )
            {
            // InternalMyDsl.g:573:2: (otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od' )
            // InternalMyDsl.g:574:3: otherlv_0= 'for' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= 'do' ( (lv_command_3_0= ruleCommands ) ) otherlv_4= 'od'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getForCommandAccess().getForKeyword_0());
            		
            // InternalMyDsl.g:578:3: ( (lv_expr_1_0= ruleExpr ) )
            // InternalMyDsl.g:579:4: (lv_expr_1_0= ruleExpr )
            {
            // InternalMyDsl.g:579:4: (lv_expr_1_0= ruleExpr )
            // InternalMyDsl.g:580:5: lv_expr_1_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getForCommandAccess().getExprExprParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getForCommandAccess().getDoKeyword_2());
            		
            // InternalMyDsl.g:601:3: ( (lv_command_3_0= ruleCommands ) )
            // InternalMyDsl.g:602:4: (lv_command_3_0= ruleCommands )
            {
            // InternalMyDsl.g:602:4: (lv_command_3_0= ruleCommands )
            // InternalMyDsl.g:603:5: lv_command_3_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getForCommandAccess().getCommandCommandsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_command_3_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForCommandRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_3_0,
            						"org.xtext.example.mydsl.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:628:1: entryRuleAffectCommand returns [EObject current=null] : iv_ruleAffectCommand= ruleAffectCommand EOF ;
    public final EObject entryRuleAffectCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectCommand = null;


        try {
            // InternalMyDsl.g:628:54: (iv_ruleAffectCommand= ruleAffectCommand EOF )
            // InternalMyDsl.g:629:2: iv_ruleAffectCommand= ruleAffectCommand EOF
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
    // InternalMyDsl.g:635:1: ruleAffectCommand returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) ) ;
    public final EObject ruleAffectCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:641:2: ( ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) ) )
            // InternalMyDsl.g:642:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) )
            {
            // InternalMyDsl.g:642:2: ( ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) ) )
            // InternalMyDsl.g:643:3: ( (lv_vars_0_0= ruleVars ) ) otherlv_1= ':=' ( (lv_exprs_2_0= ruleExprs ) )
            {
            // InternalMyDsl.g:643:3: ( (lv_vars_0_0= ruleVars ) )
            // InternalMyDsl.g:644:4: (lv_vars_0_0= ruleVars )
            {
            // InternalMyDsl.g:644:4: (lv_vars_0_0= ruleVars )
            // InternalMyDsl.g:645:5: lv_vars_0_0= ruleVars
            {

            					newCompositeNode(grammarAccess.getAffectCommandAccess().getVarsVarsParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_vars_0_0=ruleVars();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAffectCommandRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"org.xtext.example.mydsl.MyDsl.Vars");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAffectCommandAccess().getColonEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:666:3: ( (lv_exprs_2_0= ruleExprs ) )
            // InternalMyDsl.g:667:4: (lv_exprs_2_0= ruleExprs )
            {
            // InternalMyDsl.g:667:4: (lv_exprs_2_0= ruleExprs )
            // InternalMyDsl.g:668:5: lv_exprs_2_0= ruleExprs
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
            						"org.xtext.example.mydsl.MyDsl.Exprs");
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
    // InternalMyDsl.g:689:1: entryRuleForeachCommand returns [EObject current=null] : iv_ruleForeachCommand= ruleForeachCommand EOF ;
    public final EObject entryRuleForeachCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForeachCommand = null;


        try {
            // InternalMyDsl.g:689:55: (iv_ruleForeachCommand= ruleForeachCommand EOF )
            // InternalMyDsl.g:690:2: iv_ruleForeachCommand= ruleForeachCommand EOF
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
    // InternalMyDsl.g:696:1: ruleForeachCommand returns [EObject current=null] : (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) ;
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
            // InternalMyDsl.g:702:2: ( (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' ) )
            // InternalMyDsl.g:703:2: (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            {
            // InternalMyDsl.g:703:2: (otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od' )
            // InternalMyDsl.g:704:3: otherlv_0= 'foreach' ( (lv_vars_1_0= ruleVars ) ) otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= 'do' ( (lv_commands_5_0= ruleCommands ) ) otherlv_6= 'od'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getForeachCommandAccess().getForeachKeyword_0());
            		
            // InternalMyDsl.g:708:3: ( (lv_vars_1_0= ruleVars ) )
            // InternalMyDsl.g:709:4: (lv_vars_1_0= ruleVars )
            {
            // InternalMyDsl.g:709:4: (lv_vars_1_0= ruleVars )
            // InternalMyDsl.g:710:5: lv_vars_1_0= ruleVars
            {

            					newCompositeNode(grammarAccess.getForeachCommandAccess().getVarsVarsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_vars_1_0=ruleVars();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
            					}
            					set(
            						current,
            						"vars",
            						lv_vars_1_0,
            						"org.xtext.example.mydsl.MyDsl.Vars");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getForeachCommandAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:731:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalMyDsl.g:732:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalMyDsl.g:732:4: (lv_expr_3_0= ruleExpr )
            // InternalMyDsl.g:733:5: lv_expr_3_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getForeachCommandAccess().getExprExprParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_expr_3_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"org.xtext.example.mydsl.MyDsl.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getForeachCommandAccess().getDoKeyword_4());
            		
            // InternalMyDsl.g:754:3: ( (lv_commands_5_0= ruleCommands ) )
            // InternalMyDsl.g:755:4: (lv_commands_5_0= ruleCommands )
            {
            // InternalMyDsl.g:755:4: (lv_commands_5_0= ruleCommands )
            // InternalMyDsl.g:756:5: lv_commands_5_0= ruleCommands
            {

            					newCompositeNode(grammarAccess.getForeachCommandAccess().getCommandsCommandsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_commands_5_0=ruleCommands();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForeachCommandRule());
            					}
            					set(
            						current,
            						"commands",
            						lv_commands_5_0,
            						"org.xtext.example.mydsl.MyDsl.Commands");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:781:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // InternalMyDsl.g:781:46: (iv_ruleExprs= ruleExprs EOF )
            // InternalMyDsl.g:782:2: iv_ruleExprs= ruleExprs EOF
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
    // InternalMyDsl.g:788:1: ruleExprs returns [EObject current=null] : ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_0_0 = null;

        EObject lv_exprs_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:794:2: ( ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* ) )
            // InternalMyDsl.g:795:2: ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* )
            {
            // InternalMyDsl.g:795:2: ( ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )* )
            // InternalMyDsl.g:796:3: ( (lv_expr_0_0= ruleExpr ) ) (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )*
            {
            // InternalMyDsl.g:796:3: ( (lv_expr_0_0= ruleExpr ) )
            // InternalMyDsl.g:797:4: (lv_expr_0_0= ruleExpr )
            {
            // InternalMyDsl.g:797:4: (lv_expr_0_0= ruleExpr )
            // InternalMyDsl.g:798:5: lv_expr_0_0= ruleExpr
            {

            					newCompositeNode(grammarAccess.getExprsAccess().getExprExprParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_expr_0_0=ruleExpr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExprsRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_0_0,
            						"org.xtext.example.mydsl.MyDsl.Expr");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:815:3: (otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:816:4: otherlv_1= ',' ( (lv_exprs_2_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:820:4: ( (lv_exprs_2_0= ruleExpr ) )
            	    // InternalMyDsl.g:821:5: (lv_exprs_2_0= ruleExpr )
            	    {
            	    // InternalMyDsl.g:821:5: (lv_exprs_2_0= ruleExpr )
            	    // InternalMyDsl.g:822:6: lv_exprs_2_0= ruleExpr
            	    {

            	    						newCompositeNode(grammarAccess.getExprsAccess().getExprsExprParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_exprs_2_0=ruleExpr();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprs",
            	    							lv_exprs_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.Expr");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalMyDsl.g:844:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // InternalMyDsl.g:844:45: (iv_ruleVars= ruleVars EOF )
            // InternalMyDsl.g:845:2: iv_ruleVars= ruleVars EOF
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
    // InternalMyDsl.g:851:1: ruleVars returns [EObject current=null] : ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:857:2: ( ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalMyDsl.g:858:2: ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalMyDsl.g:858:2: ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalMyDsl.g:859:3: ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalMyDsl.g:859:3: ( (lv_var_0_0= RULE_VARIABLE ) )
            // InternalMyDsl.g:860:4: (lv_var_0_0= RULE_VARIABLE )
            {
            // InternalMyDsl.g:860:4: (lv_var_0_0= RULE_VARIABLE )
            // InternalMyDsl.g:861:5: lv_var_0_0= RULE_VARIABLE
            {
            lv_var_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_20); 

            					newLeafNode(lv_var_0_0, grammarAccess.getVarsAccess().getVarVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.example.mydsl.MyDsl.VARIABLE");
            				

            }


            }

            // InternalMyDsl.g:877:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:878:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:882:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalMyDsl.g:883:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalMyDsl.g:883:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalMyDsl.g:884:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_20); 

            	    						newLeafNode(lv_vars_2_0, grammarAccess.getVarsAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVarsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.VARIABLE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalMyDsl.g:905:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalMyDsl.g:905:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalMyDsl.g:906:2: iv_ruleExpr= ruleExpr EOF
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
    // InternalMyDsl.g:912:1: ruleExpr returns [EObject current=null] : ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbases_2_0= ruleExprBase ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprbase_0_0 = null;

        EObject lv_exprbases_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:918:2: ( ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbases_2_0= ruleExprBase ) ) )* ) )
            // InternalMyDsl.g:919:2: ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbases_2_0= ruleExprBase ) ) )* )
            {
            // InternalMyDsl.g:919:2: ( ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbases_2_0= ruleExprBase ) ) )* )
            // InternalMyDsl.g:920:3: ( (lv_exprbase_0_0= ruleExprBase ) ) (otherlv_1= '=?' ( (lv_exprbases_2_0= ruleExprBase ) ) )*
            {
            // InternalMyDsl.g:920:3: ( (lv_exprbase_0_0= ruleExprBase ) )
            // InternalMyDsl.g:921:4: (lv_exprbase_0_0= ruleExprBase )
            {
            // InternalMyDsl.g:921:4: (lv_exprbase_0_0= ruleExprBase )
            // InternalMyDsl.g:922:5: lv_exprbase_0_0= ruleExprBase
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
            						"org.xtext.example.mydsl.MyDsl.ExprBase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:939:3: (otherlv_1= '=?' ( (lv_exprbases_2_0= ruleExprBase ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:940:4: otherlv_1= '=?' ( (lv_exprbases_2_0= ruleExprBase ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExprAccess().getEqualsSignQuestionMarkKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:944:4: ( (lv_exprbases_2_0= ruleExprBase ) )
            	    // InternalMyDsl.g:945:5: (lv_exprbases_2_0= ruleExprBase )
            	    {
            	    // InternalMyDsl.g:945:5: (lv_exprbases_2_0= ruleExprBase )
            	    // InternalMyDsl.g:946:6: lv_exprbases_2_0= ruleExprBase
            	    {

            	    						newCompositeNode(grammarAccess.getExprAccess().getExprbasesExprBaseParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_exprbases_2_0=ruleExprBase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExprRule());
            	    						}
            	    						add(
            	    							current,
            	    							"exprbases",
            	    							lv_exprbases_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.ExprBase");
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLExpr"
    // InternalMyDsl.g:968:1: entryRuleLExpr returns [EObject current=null] : iv_ruleLExpr= ruleLExpr EOF ;
    public final EObject entryRuleLExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpr = null;


        try {
            // InternalMyDsl.g:968:46: (iv_ruleLExpr= ruleLExpr EOF )
            // InternalMyDsl.g:969:2: iv_ruleLExpr= ruleLExpr EOF
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
    // InternalMyDsl.g:975:1: ruleLExpr returns [EObject current=null] : ( (lv_expr_0_0= ruleExpr ) )+ ;
    public final EObject ruleLExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:981:2: ( ( (lv_expr_0_0= ruleExpr ) )+ )
            // InternalMyDsl.g:982:2: ( (lv_expr_0_0= ruleExpr ) )+
            {
            // InternalMyDsl.g:982:2: ( (lv_expr_0_0= ruleExpr ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_SYMBOL && LA8_0<=RULE_VARIABLE)||(LA8_0>=33 && LA8_0<=34)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:983:3: (lv_expr_0_0= ruleExpr )
            	    {
            	    // InternalMyDsl.g:983:3: (lv_expr_0_0= ruleExpr )
            	    // InternalMyDsl.g:984:4: lv_expr_0_0= ruleExpr
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
            	    					"org.xtext.example.mydsl.MyDsl.Expr");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
    // InternalMyDsl.g:1004:1: entryRuleExprBase returns [EObject current=null] : iv_ruleExprBase= ruleExprBase EOF ;
    public final EObject entryRuleExprBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprBase = null;


        try {
            // InternalMyDsl.g:1004:49: (iv_ruleExprBase= ruleExprBase EOF )
            // InternalMyDsl.g:1005:2: iv_ruleExprBase= ruleExprBase EOF
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
    // InternalMyDsl.g:1011:1: ruleExprBase returns [EObject current=null] : ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) ) ;
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
            // InternalMyDsl.g:1017:2: ( ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) ) )
            // InternalMyDsl.g:1018:2: ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) )
            {
            // InternalMyDsl.g:1018:2: ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) )
            int alt9=8;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1019:3: ( () otherlv_1= 'nil' )
                    {
                    // InternalMyDsl.g:1019:3: ( () otherlv_1= 'nil' )
                    // InternalMyDsl.g:1020:4: () otherlv_1= 'nil'
                    {
                    // InternalMyDsl.g:1020:4: ()
                    // InternalMyDsl.g:1021:5: 
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
                    // InternalMyDsl.g:1033:3: ( () this_VARIABLE_3= RULE_VARIABLE )
                    {
                    // InternalMyDsl.g:1033:3: ( () this_VARIABLE_3= RULE_VARIABLE )
                    // InternalMyDsl.g:1034:4: () this_VARIABLE_3= RULE_VARIABLE
                    {
                    // InternalMyDsl.g:1034:4: ()
                    // InternalMyDsl.g:1035:5: 
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
                    // InternalMyDsl.g:1047:3: ( () this_SYMBOL_5= RULE_SYMBOL )
                    {
                    // InternalMyDsl.g:1047:3: ( () this_SYMBOL_5= RULE_SYMBOL )
                    // InternalMyDsl.g:1048:4: () this_SYMBOL_5= RULE_SYMBOL
                    {
                    // InternalMyDsl.g:1048:4: ()
                    // InternalMyDsl.g:1049:5: 
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
                    // InternalMyDsl.g:1061:3: (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' )
                    {
                    // InternalMyDsl.g:1061:3: (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' )
                    // InternalMyDsl.g:1062:4: otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_7=(Token)match(input,35,FOLLOW_12); 

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
                    // InternalMyDsl.g:1084:3: (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' )
                    {
                    // InternalMyDsl.g:1084:3: (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' )
                    // InternalMyDsl.g:1085:4: otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')'
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_25); 

                    				newLeafNode(otherlv_10, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_4_0());
                    			
                    otherlv_11=(Token)match(input,37,FOLLOW_12); 

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
                    // InternalMyDsl.g:1107:3: (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' )
                    {
                    // InternalMyDsl.g:1107:3: (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' )
                    // InternalMyDsl.g:1108:4: otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')'
                    {
                    otherlv_14=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_14, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_5_0());
                    			
                    otherlv_15=(Token)match(input,38,FOLLOW_12); 

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
                    // InternalMyDsl.g:1130:3: (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' )
                    {
                    // InternalMyDsl.g:1130:3: (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' )
                    // InternalMyDsl.g:1131:4: otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')'
                    {
                    otherlv_18=(Token)match(input,34,FOLLOW_27); 

                    				newLeafNode(otherlv_18, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_6_0());
                    			
                    otherlv_19=(Token)match(input,39,FOLLOW_12); 

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
                    // InternalMyDsl.g:1153:3: (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' )
                    {
                    // InternalMyDsl.g:1153:3: (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' )
                    // InternalMyDsl.g:1154:4: otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')'
                    {
                    otherlv_22=(Token)match(input,34,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_7_0());
                    			
                    this_SYMBOL_23=(Token)match(input,RULE_SYMBOL,FOLLOW_12); 

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


    // $ANTLR start "entryRuleInput"
    // InternalMyDsl.g:1179:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalMyDsl.g:1179:46: (iv_ruleInput= ruleInput EOF )
            // InternalMyDsl.g:1180:2: iv_ruleInput= ruleInput EOF
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
    // InternalMyDsl.g:1186:1: ruleInput returns [EObject current=null] : ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1192:2: ( ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalMyDsl.g:1193:2: ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalMyDsl.g:1193:2: ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalMyDsl.g:1194:3: ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalMyDsl.g:1194:3: ( (lv_var_0_0= RULE_VARIABLE ) )
            // InternalMyDsl.g:1195:4: (lv_var_0_0= RULE_VARIABLE )
            {
            // InternalMyDsl.g:1195:4: (lv_var_0_0= RULE_VARIABLE )
            // InternalMyDsl.g:1196:5: lv_var_0_0= RULE_VARIABLE
            {
            lv_var_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_20); 

            					newLeafNode(lv_var_0_0, grammarAccess.getInputAccess().getVarVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.example.mydsl.MyDsl.VARIABLE");
            				

            }


            }

            // InternalMyDsl.g:1212:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1213:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1217:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalMyDsl.g:1218:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalMyDsl.g:1218:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalMyDsl.g:1219:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_20); 

            	    						newLeafNode(lv_vars_2_0, grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getInputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.VARIABLE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:1240:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalMyDsl.g:1240:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalMyDsl.g:1241:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalMyDsl.g:1247:1: ruleOutput returns [EObject current=null] : ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token otherlv_1=null;
        Token lv_vars_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1253:2: ( ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* ) )
            // InternalMyDsl.g:1254:2: ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            {
            // InternalMyDsl.g:1254:2: ( ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )* )
            // InternalMyDsl.g:1255:3: ( (lv_var_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            {
            // InternalMyDsl.g:1255:3: ( (lv_var_0_0= RULE_VARIABLE ) )
            // InternalMyDsl.g:1256:4: (lv_var_0_0= RULE_VARIABLE )
            {
            // InternalMyDsl.g:1256:4: (lv_var_0_0= RULE_VARIABLE )
            // InternalMyDsl.g:1257:5: lv_var_0_0= RULE_VARIABLE
            {
            lv_var_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_20); 

            					newLeafNode(lv_var_0_0, grammarAccess.getOutputAccess().getVarVARIABLETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_0_0,
            						"org.xtext.example.mydsl.MyDsl.VARIABLE");
            				

            }


            }

            // InternalMyDsl.g:1273:3: (otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1274:4: otherlv_1= ',' ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1278:4: ( (lv_vars_2_0= RULE_VARIABLE ) )
            	    // InternalMyDsl.g:1279:5: (lv_vars_2_0= RULE_VARIABLE )
            	    {
            	    // InternalMyDsl.g:1279:5: (lv_vars_2_0= RULE_VARIABLE )
            	    // InternalMyDsl.g:1280:6: lv_vars_2_0= RULE_VARIABLE
            	    {
            	    lv_vars_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_20); 

            	    						newLeafNode(lv_vars_2_0, grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOutputRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.VARIABLE");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\42\3\uffff\1\47\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\10\1\5\1\6\1\7\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\33\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\5\36\uffff\1\11\1\uffff\1\6\1\7\1\10",
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

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1018:2: ( ( () otherlv_1= 'nil' ) | ( () this_VARIABLE_3= RULE_VARIABLE ) | ( () this_SYMBOL_5= RULE_SYMBOL ) | (otherlv_6= '(' otherlv_7= 'cons' this_LExpr_8= ruleLExpr otherlv_9= ')' ) | (otherlv_10= '(' otherlv_11= 'list' this_LExpr_12= ruleLExpr otherlv_13= ')' ) | (otherlv_14= '(' otherlv_15= 'hd' this_Expr_16= ruleExpr otherlv_17= ')' ) | (otherlv_18= '(' otherlv_19= 'tl' this_Expr_20= ruleExpr otherlv_21= ')' ) | (otherlv_22= '(' this_SYMBOL_23= RULE_SYMBOL this_LExpr_24= ruleLExpr otherlv_25= ')' ) )";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000028980020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000600000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000032L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});

}