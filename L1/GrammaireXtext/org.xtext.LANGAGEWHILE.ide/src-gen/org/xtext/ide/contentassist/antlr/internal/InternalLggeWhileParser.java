package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.LggeWhileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLggeWhileParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'while'", "'do'", "'od'", "'if'", "'then'", "'fi'", "'else'", "'for'", "':='", "'foreach'", "'in'", "'=?'", "'('", "')'", "'nop'", "'nil'", "'cons'", "'list'", "'hd'", "'tl'"
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

    	public void setGrammarAccess(LggeWhileGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalLggeWhile.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalLggeWhile.g:54:1: ( ruleProgram EOF )
            // InternalLggeWhile.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalLggeWhile.g:62:1: ruleProgram : ( ( rule__Program__FunctionsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:66:2: ( ( ( rule__Program__FunctionsAssignment )* ) )
            // InternalLggeWhile.g:67:2: ( ( rule__Program__FunctionsAssignment )* )
            {
            // InternalLggeWhile.g:67:2: ( ( rule__Program__FunctionsAssignment )* )
            // InternalLggeWhile.g:68:3: ( rule__Program__FunctionsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getFunctionsAssignment()); 
            // InternalLggeWhile.g:69:3: ( rule__Program__FunctionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLggeWhile.g:69:4: rule__Program__FunctionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__FunctionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getFunctionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFunction"
    // InternalLggeWhile.g:78:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalLggeWhile.g:79:1: ( ruleFunction EOF )
            // InternalLggeWhile.g:80:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalLggeWhile.g:87:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:91:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalLggeWhile.g:92:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalLggeWhile.g:92:2: ( ( rule__Function__Group__0 ) )
            // InternalLggeWhile.g:93:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalLggeWhile.g:94:3: ( rule__Function__Group__0 )
            // InternalLggeWhile.g:94:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefinition"
    // InternalLggeWhile.g:103:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalLggeWhile.g:104:1: ( ruleDefinition EOF )
            // InternalLggeWhile.g:105:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalLggeWhile.g:112:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:116:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalLggeWhile.g:117:2: ( ( rule__Definition__Group__0 ) )
            {
            // InternalLggeWhile.g:117:2: ( ( rule__Definition__Group__0 ) )
            // InternalLggeWhile.g:118:3: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalLggeWhile.g:119:3: ( rule__Definition__Group__0 )
            // InternalLggeWhile.g:119:4: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleInput"
    // InternalLggeWhile.g:128:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalLggeWhile.g:129:1: ( ruleInput EOF )
            // InternalLggeWhile.g:130:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalLggeWhile.g:137:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:141:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalLggeWhile.g:142:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalLggeWhile.g:142:2: ( ( rule__Input__Group__0 ) )
            // InternalLggeWhile.g:143:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalLggeWhile.g:144:3: ( rule__Input__Group__0 )
            // InternalLggeWhile.g:144:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // InternalLggeWhile.g:153:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalLggeWhile.g:154:1: ( ruleOutput EOF )
            // InternalLggeWhile.g:155:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalLggeWhile.g:162:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:166:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalLggeWhile.g:167:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalLggeWhile.g:167:2: ( ( rule__Output__Group__0 ) )
            // InternalLggeWhile.g:168:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalLggeWhile.g:169:3: ( rule__Output__Group__0 )
            // InternalLggeWhile.g:169:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // InternalLggeWhile.g:178:1: entryRuleCommands : ruleCommands EOF ;
    public final void entryRuleCommands() throws RecognitionException {
        try {
            // InternalLggeWhile.g:179:1: ( ruleCommands EOF )
            // InternalLggeWhile.g:180:1: ruleCommands EOF
            {
             before(grammarAccess.getCommandsRule()); 
            pushFollow(FOLLOW_1);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getCommandsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // InternalLggeWhile.g:187:1: ruleCommands : ( ( rule__Commands__Group__0 ) ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:191:2: ( ( ( rule__Commands__Group__0 ) ) )
            // InternalLggeWhile.g:192:2: ( ( rule__Commands__Group__0 ) )
            {
            // InternalLggeWhile.g:192:2: ( ( rule__Commands__Group__0 ) )
            // InternalLggeWhile.g:193:3: ( rule__Commands__Group__0 )
            {
             before(grammarAccess.getCommandsAccess().getGroup()); 
            // InternalLggeWhile.g:194:3: ( rule__Commands__Group__0 )
            // InternalLggeWhile.g:194:4: rule__Commands__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Commands__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommandsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleCommand"
    // InternalLggeWhile.g:203:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:204:1: ( ruleCommand EOF )
            // InternalLggeWhile.g:205:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalLggeWhile.g:212:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:216:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalLggeWhile.g:217:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalLggeWhile.g:217:2: ( ( rule__Command__Alternatives ) )
            // InternalLggeWhile.g:218:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalLggeWhile.g:219:3: ( rule__Command__Alternatives )
            // InternalLggeWhile.g:219:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleNopCommand"
    // InternalLggeWhile.g:228:1: entryRuleNopCommand : ruleNopCommand EOF ;
    public final void entryRuleNopCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:229:1: ( ruleNopCommand EOF )
            // InternalLggeWhile.g:230:1: ruleNopCommand EOF
            {
             before(grammarAccess.getNopCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleNopCommand();

            state._fsp--;

             after(grammarAccess.getNopCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNopCommand"


    // $ANTLR start "ruleNopCommand"
    // InternalLggeWhile.g:237:1: ruleNopCommand : ( ( rule__NopCommand__ExprAssignment ) ) ;
    public final void ruleNopCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:241:2: ( ( ( rule__NopCommand__ExprAssignment ) ) )
            // InternalLggeWhile.g:242:2: ( ( rule__NopCommand__ExprAssignment ) )
            {
            // InternalLggeWhile.g:242:2: ( ( rule__NopCommand__ExprAssignment ) )
            // InternalLggeWhile.g:243:3: ( rule__NopCommand__ExprAssignment )
            {
             before(grammarAccess.getNopCommandAccess().getExprAssignment()); 
            // InternalLggeWhile.g:244:3: ( rule__NopCommand__ExprAssignment )
            // InternalLggeWhile.g:244:4: rule__NopCommand__ExprAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NopCommand__ExprAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNopCommandAccess().getExprAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNopCommand"


    // $ANTLR start "entryRuleWhileCommand"
    // InternalLggeWhile.g:253:1: entryRuleWhileCommand : ruleWhileCommand EOF ;
    public final void entryRuleWhileCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:254:1: ( ruleWhileCommand EOF )
            // InternalLggeWhile.g:255:1: ruleWhileCommand EOF
            {
             before(grammarAccess.getWhileCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleWhileCommand();

            state._fsp--;

             after(grammarAccess.getWhileCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhileCommand"


    // $ANTLR start "ruleWhileCommand"
    // InternalLggeWhile.g:262:1: ruleWhileCommand : ( ( rule__WhileCommand__Group__0 ) ) ;
    public final void ruleWhileCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:266:2: ( ( ( rule__WhileCommand__Group__0 ) ) )
            // InternalLggeWhile.g:267:2: ( ( rule__WhileCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:267:2: ( ( rule__WhileCommand__Group__0 ) )
            // InternalLggeWhile.g:268:3: ( rule__WhileCommand__Group__0 )
            {
             before(grammarAccess.getWhileCommandAccess().getGroup()); 
            // InternalLggeWhile.g:269:3: ( rule__WhileCommand__Group__0 )
            // InternalLggeWhile.g:269:4: rule__WhileCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileCommand"


    // $ANTLR start "entryRuleIfCommand"
    // InternalLggeWhile.g:278:1: entryRuleIfCommand : ruleIfCommand EOF ;
    public final void entryRuleIfCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:279:1: ( ruleIfCommand EOF )
            // InternalLggeWhile.g:280:1: ruleIfCommand EOF
            {
             before(grammarAccess.getIfCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleIfCommand();

            state._fsp--;

             after(grammarAccess.getIfCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfCommand"


    // $ANTLR start "ruleIfCommand"
    // InternalLggeWhile.g:287:1: ruleIfCommand : ( ( rule__IfCommand__Group__0 ) ) ;
    public final void ruleIfCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:291:2: ( ( ( rule__IfCommand__Group__0 ) ) )
            // InternalLggeWhile.g:292:2: ( ( rule__IfCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:292:2: ( ( rule__IfCommand__Group__0 ) )
            // InternalLggeWhile.g:293:3: ( rule__IfCommand__Group__0 )
            {
             before(grammarAccess.getIfCommandAccess().getGroup()); 
            // InternalLggeWhile.g:294:3: ( rule__IfCommand__Group__0 )
            // InternalLggeWhile.g:294:4: rule__IfCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfCommand"


    // $ANTLR start "entryRuleForCommand"
    // InternalLggeWhile.g:303:1: entryRuleForCommand : ruleForCommand EOF ;
    public final void entryRuleForCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:304:1: ( ruleForCommand EOF )
            // InternalLggeWhile.g:305:1: ruleForCommand EOF
            {
             before(grammarAccess.getForCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleForCommand();

            state._fsp--;

             after(grammarAccess.getForCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForCommand"


    // $ANTLR start "ruleForCommand"
    // InternalLggeWhile.g:312:1: ruleForCommand : ( ( rule__ForCommand__Group__0 ) ) ;
    public final void ruleForCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:316:2: ( ( ( rule__ForCommand__Group__0 ) ) )
            // InternalLggeWhile.g:317:2: ( ( rule__ForCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:317:2: ( ( rule__ForCommand__Group__0 ) )
            // InternalLggeWhile.g:318:3: ( rule__ForCommand__Group__0 )
            {
             before(grammarAccess.getForCommandAccess().getGroup()); 
            // InternalLggeWhile.g:319:3: ( rule__ForCommand__Group__0 )
            // InternalLggeWhile.g:319:4: rule__ForCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForCommand"


    // $ANTLR start "entryRuleAffectCommand"
    // InternalLggeWhile.g:328:1: entryRuleAffectCommand : ruleAffectCommand EOF ;
    public final void entryRuleAffectCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:329:1: ( ruleAffectCommand EOF )
            // InternalLggeWhile.g:330:1: ruleAffectCommand EOF
            {
             before(grammarAccess.getAffectCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleAffectCommand();

            state._fsp--;

             after(grammarAccess.getAffectCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAffectCommand"


    // $ANTLR start "ruleAffectCommand"
    // InternalLggeWhile.g:337:1: ruleAffectCommand : ( ( rule__AffectCommand__Group__0 ) ) ;
    public final void ruleAffectCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:341:2: ( ( ( rule__AffectCommand__Group__0 ) ) )
            // InternalLggeWhile.g:342:2: ( ( rule__AffectCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:342:2: ( ( rule__AffectCommand__Group__0 ) )
            // InternalLggeWhile.g:343:3: ( rule__AffectCommand__Group__0 )
            {
             before(grammarAccess.getAffectCommandAccess().getGroup()); 
            // InternalLggeWhile.g:344:3: ( rule__AffectCommand__Group__0 )
            // InternalLggeWhile.g:344:4: rule__AffectCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AffectCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAffectCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAffectCommand"


    // $ANTLR start "entryRuleForeachCommand"
    // InternalLggeWhile.g:353:1: entryRuleForeachCommand : ruleForeachCommand EOF ;
    public final void entryRuleForeachCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:354:1: ( ruleForeachCommand EOF )
            // InternalLggeWhile.g:355:1: ruleForeachCommand EOF
            {
             before(grammarAccess.getForeachCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleForeachCommand();

            state._fsp--;

             after(grammarAccess.getForeachCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForeachCommand"


    // $ANTLR start "ruleForeachCommand"
    // InternalLggeWhile.g:362:1: ruleForeachCommand : ( ( rule__ForeachCommand__Group__0 ) ) ;
    public final void ruleForeachCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:366:2: ( ( ( rule__ForeachCommand__Group__0 ) ) )
            // InternalLggeWhile.g:367:2: ( ( rule__ForeachCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:367:2: ( ( rule__ForeachCommand__Group__0 ) )
            // InternalLggeWhile.g:368:3: ( rule__ForeachCommand__Group__0 )
            {
             before(grammarAccess.getForeachCommandAccess().getGroup()); 
            // InternalLggeWhile.g:369:3: ( rule__ForeachCommand__Group__0 )
            // InternalLggeWhile.g:369:4: rule__ForeachCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForeachCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForeachCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForeachCommand"


    // $ANTLR start "entryRuleExprs"
    // InternalLggeWhile.g:378:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // InternalLggeWhile.g:379:1: ( ruleExprs EOF )
            // InternalLggeWhile.g:380:1: ruleExprs EOF
            {
             before(grammarAccess.getExprsRule()); 
            pushFollow(FOLLOW_1);
            ruleExprs();

            state._fsp--;

             after(grammarAccess.getExprsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // InternalLggeWhile.g:387:1: ruleExprs : ( ( rule__Exprs__Group__0 ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:391:2: ( ( ( rule__Exprs__Group__0 ) ) )
            // InternalLggeWhile.g:392:2: ( ( rule__Exprs__Group__0 ) )
            {
            // InternalLggeWhile.g:392:2: ( ( rule__Exprs__Group__0 ) )
            // InternalLggeWhile.g:393:3: ( rule__Exprs__Group__0 )
            {
             before(grammarAccess.getExprsAccess().getGroup()); 
            // InternalLggeWhile.g:394:3: ( rule__Exprs__Group__0 )
            // InternalLggeWhile.g:394:4: rule__Exprs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exprs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExprsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleVars"
    // InternalLggeWhile.g:403:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // InternalLggeWhile.g:404:1: ( ruleVars EOF )
            // InternalLggeWhile.g:405:1: ruleVars EOF
            {
             before(grammarAccess.getVarsRule()); 
            pushFollow(FOLLOW_1);
            ruleVars();

            state._fsp--;

             after(grammarAccess.getVarsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // InternalLggeWhile.g:412:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:416:2: ( ( ( rule__Vars__Group__0 ) ) )
            // InternalLggeWhile.g:417:2: ( ( rule__Vars__Group__0 ) )
            {
            // InternalLggeWhile.g:417:2: ( ( rule__Vars__Group__0 ) )
            // InternalLggeWhile.g:418:3: ( rule__Vars__Group__0 )
            {
             before(grammarAccess.getVarsAccess().getGroup()); 
            // InternalLggeWhile.g:419:3: ( rule__Vars__Group__0 )
            // InternalLggeWhile.g:419:4: rule__Vars__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vars__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExpr"
    // InternalLggeWhile.g:428:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalLggeWhile.g:429:1: ( ruleExpr EOF )
            // InternalLggeWhile.g:430:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalLggeWhile.g:437:1: ruleExpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:441:2: ( ( ( rule__Expr__Group__0 ) ) )
            // InternalLggeWhile.g:442:2: ( ( rule__Expr__Group__0 ) )
            {
            // InternalLggeWhile.g:442:2: ( ( rule__Expr__Group__0 ) )
            // InternalLggeWhile.g:443:3: ( rule__Expr__Group__0 )
            {
             before(grammarAccess.getExprAccess().getGroup()); 
            // InternalLggeWhile.g:444:3: ( rule__Expr__Group__0 )
            // InternalLggeWhile.g:444:4: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLExpr"
    // InternalLggeWhile.g:453:1: entryRuleLExpr : ruleLExpr EOF ;
    public final void entryRuleLExpr() throws RecognitionException {
        try {
            // InternalLggeWhile.g:454:1: ( ruleLExpr EOF )
            // InternalLggeWhile.g:455:1: ruleLExpr EOF
            {
             before(grammarAccess.getLExprRule()); 
            pushFollow(FOLLOW_1);
            ruleLExpr();

            state._fsp--;

             after(grammarAccess.getLExprRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLExpr"


    // $ANTLR start "ruleLExpr"
    // InternalLggeWhile.g:462:1: ruleLExpr : ( ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* ) ) ;
    public final void ruleLExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:466:2: ( ( ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* ) ) )
            // InternalLggeWhile.g:467:2: ( ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* ) )
            {
            // InternalLggeWhile.g:467:2: ( ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* ) )
            // InternalLggeWhile.g:468:3: ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* )
            {
            // InternalLggeWhile.g:468:3: ( ( rule__LExpr__ExprAssignment ) )
            // InternalLggeWhile.g:469:4: ( rule__LExpr__ExprAssignment )
            {
             before(grammarAccess.getLExprAccess().getExprAssignment()); 
            // InternalLggeWhile.g:470:4: ( rule__LExpr__ExprAssignment )
            // InternalLggeWhile.g:470:5: rule__LExpr__ExprAssignment
            {
            pushFollow(FOLLOW_4);
            rule__LExpr__ExprAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLExprAccess().getExprAssignment()); 

            }

            // InternalLggeWhile.g:473:3: ( ( rule__LExpr__ExprAssignment )* )
            // InternalLggeWhile.g:474:4: ( rule__LExpr__ExprAssignment )*
            {
             before(grammarAccess.getLExprAccess().getExprAssignment()); 
            // InternalLggeWhile.g:475:4: ( rule__LExpr__ExprAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_SYMBOL && LA2_0<=RULE_VARIABLE)||LA2_0==32||LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLggeWhile.g:475:5: rule__LExpr__ExprAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__LExpr__ExprAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getLExprAccess().getExprAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLExpr"


    // $ANTLR start "entryRuleExprBase"
    // InternalLggeWhile.g:485:1: entryRuleExprBase : ruleExprBase EOF ;
    public final void entryRuleExprBase() throws RecognitionException {
        try {
            // InternalLggeWhile.g:486:1: ( ruleExprBase EOF )
            // InternalLggeWhile.g:487:1: ruleExprBase EOF
            {
             before(grammarAccess.getExprBaseRule()); 
            pushFollow(FOLLOW_1);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getExprBaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprBase"


    // $ANTLR start "ruleExprBase"
    // InternalLggeWhile.g:494:1: ruleExprBase : ( ( rule__ExprBase__Alternatives ) ) ;
    public final void ruleExprBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:498:2: ( ( ( rule__ExprBase__Alternatives ) ) )
            // InternalLggeWhile.g:499:2: ( ( rule__ExprBase__Alternatives ) )
            {
            // InternalLggeWhile.g:499:2: ( ( rule__ExprBase__Alternatives ) )
            // InternalLggeWhile.g:500:3: ( rule__ExprBase__Alternatives )
            {
             before(grammarAccess.getExprBaseAccess().getAlternatives()); 
            // InternalLggeWhile.g:501:3: ( rule__ExprBase__Alternatives )
            // InternalLggeWhile.g:501:4: rule__ExprBase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprBase"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalLggeWhile.g:509:1: rule__Command__Alternatives : ( ( ruleWhileCommand ) | ( ruleIfCommand ) | ( ruleForCommand ) | ( ruleAffectCommand ) | ( ruleForeachCommand ) | ( ruleNopCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:513:1: ( ( ruleWhileCommand ) | ( ruleIfCommand ) | ( ruleForCommand ) | ( ruleAffectCommand ) | ( ruleForeachCommand ) | ( ruleNopCommand ) )
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
            case 34:
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
                    // InternalLggeWhile.g:514:2: ( ruleWhileCommand )
                    {
                    // InternalLggeWhile.g:514:2: ( ruleWhileCommand )
                    // InternalLggeWhile.g:515:3: ruleWhileCommand
                    {
                     before(grammarAccess.getCommandAccess().getWhileCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWhileCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getWhileCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLggeWhile.g:520:2: ( ruleIfCommand )
                    {
                    // InternalLggeWhile.g:520:2: ( ruleIfCommand )
                    // InternalLggeWhile.g:521:3: ruleIfCommand
                    {
                     before(grammarAccess.getCommandAccess().getIfCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIfCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getIfCommandParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLggeWhile.g:526:2: ( ruleForCommand )
                    {
                    // InternalLggeWhile.g:526:2: ( ruleForCommand )
                    // InternalLggeWhile.g:527:3: ruleForCommand
                    {
                     before(grammarAccess.getCommandAccess().getForCommandParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getForCommandParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLggeWhile.g:532:2: ( ruleAffectCommand )
                    {
                    // InternalLggeWhile.g:532:2: ( ruleAffectCommand )
                    // InternalLggeWhile.g:533:3: ruleAffectCommand
                    {
                     before(grammarAccess.getCommandAccess().getAffectCommandParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAffectCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getAffectCommandParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLggeWhile.g:538:2: ( ruleForeachCommand )
                    {
                    // InternalLggeWhile.g:538:2: ( ruleForeachCommand )
                    // InternalLggeWhile.g:539:3: ruleForeachCommand
                    {
                     before(grammarAccess.getCommandAccess().getForeachCommandParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleForeachCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getForeachCommandParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLggeWhile.g:544:2: ( ruleNopCommand )
                    {
                    // InternalLggeWhile.g:544:2: ( ruleNopCommand )
                    // InternalLggeWhile.g:545:3: ruleNopCommand
                    {
                     before(grammarAccess.getCommandAccess().getNopCommandParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleNopCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getNopCommandParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__ExprBase__Alternatives"
    // InternalLggeWhile.g:554:1: rule__ExprBase__Alternatives : ( ( ( rule__ExprBase__ValueAssignment_0 ) ) | ( ( rule__ExprBase__ValueAssignment_1 ) ) | ( ( rule__ExprBase__ValueAssignment_2 ) ) | ( ( rule__ExprBase__Group_3__0 ) ) | ( ( rule__ExprBase__Group_4__0 ) ) | ( ( rule__ExprBase__Group_5__0 ) ) | ( ( rule__ExprBase__Group_6__0 ) ) | ( ( rule__ExprBase__Group_7__0 ) ) );
    public final void rule__ExprBase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:558:1: ( ( ( rule__ExprBase__ValueAssignment_0 ) ) | ( ( rule__ExprBase__ValueAssignment_1 ) ) | ( ( rule__ExprBase__ValueAssignment_2 ) ) | ( ( rule__ExprBase__Group_3__0 ) ) | ( ( rule__ExprBase__Group_4__0 ) ) | ( ( rule__ExprBase__Group_5__0 ) ) | ( ( rule__ExprBase__Group_6__0 ) ) | ( ( rule__ExprBase__Group_7__0 ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalLggeWhile.g:559:2: ( ( rule__ExprBase__ValueAssignment_0 ) )
                    {
                    // InternalLggeWhile.g:559:2: ( ( rule__ExprBase__ValueAssignment_0 ) )
                    // InternalLggeWhile.g:560:3: ( rule__ExprBase__ValueAssignment_0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getValueAssignment_0()); 
                    // InternalLggeWhile.g:561:3: ( rule__ExprBase__ValueAssignment_0 )
                    // InternalLggeWhile.g:561:4: rule__ExprBase__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLggeWhile.g:565:2: ( ( rule__ExprBase__ValueAssignment_1 ) )
                    {
                    // InternalLggeWhile.g:565:2: ( ( rule__ExprBase__ValueAssignment_1 ) )
                    // InternalLggeWhile.g:566:3: ( rule__ExprBase__ValueAssignment_1 )
                    {
                     before(grammarAccess.getExprBaseAccess().getValueAssignment_1()); 
                    // InternalLggeWhile.g:567:3: ( rule__ExprBase__ValueAssignment_1 )
                    // InternalLggeWhile.g:567:4: rule__ExprBase__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLggeWhile.g:571:2: ( ( rule__ExprBase__ValueAssignment_2 ) )
                    {
                    // InternalLggeWhile.g:571:2: ( ( rule__ExprBase__ValueAssignment_2 ) )
                    // InternalLggeWhile.g:572:3: ( rule__ExprBase__ValueAssignment_2 )
                    {
                     before(grammarAccess.getExprBaseAccess().getValueAssignment_2()); 
                    // InternalLggeWhile.g:573:3: ( rule__ExprBase__ValueAssignment_2 )
                    // InternalLggeWhile.g:573:4: rule__ExprBase__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLggeWhile.g:577:2: ( ( rule__ExprBase__Group_3__0 ) )
                    {
                    // InternalLggeWhile.g:577:2: ( ( rule__ExprBase__Group_3__0 ) )
                    // InternalLggeWhile.g:578:3: ( rule__ExprBase__Group_3__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_3()); 
                    // InternalLggeWhile.g:579:3: ( rule__ExprBase__Group_3__0 )
                    // InternalLggeWhile.g:579:4: rule__ExprBase__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLggeWhile.g:583:2: ( ( rule__ExprBase__Group_4__0 ) )
                    {
                    // InternalLggeWhile.g:583:2: ( ( rule__ExprBase__Group_4__0 ) )
                    // InternalLggeWhile.g:584:3: ( rule__ExprBase__Group_4__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_4()); 
                    // InternalLggeWhile.g:585:3: ( rule__ExprBase__Group_4__0 )
                    // InternalLggeWhile.g:585:4: rule__ExprBase__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalLggeWhile.g:589:2: ( ( rule__ExprBase__Group_5__0 ) )
                    {
                    // InternalLggeWhile.g:589:2: ( ( rule__ExprBase__Group_5__0 ) )
                    // InternalLggeWhile.g:590:3: ( rule__ExprBase__Group_5__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_5()); 
                    // InternalLggeWhile.g:591:3: ( rule__ExprBase__Group_5__0 )
                    // InternalLggeWhile.g:591:4: rule__ExprBase__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalLggeWhile.g:595:2: ( ( rule__ExprBase__Group_6__0 ) )
                    {
                    // InternalLggeWhile.g:595:2: ( ( rule__ExprBase__Group_6__0 ) )
                    // InternalLggeWhile.g:596:3: ( rule__ExprBase__Group_6__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_6()); 
                    // InternalLggeWhile.g:597:3: ( rule__ExprBase__Group_6__0 )
                    // InternalLggeWhile.g:597:4: rule__ExprBase__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalLggeWhile.g:601:2: ( ( rule__ExprBase__Group_7__0 ) )
                    {
                    // InternalLggeWhile.g:601:2: ( ( rule__ExprBase__Group_7__0 ) )
                    // InternalLggeWhile.g:602:3: ( rule__ExprBase__Group_7__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_7()); 
                    // InternalLggeWhile.g:603:3: ( rule__ExprBase__Group_7__0 )
                    // InternalLggeWhile.g:603:4: rule__ExprBase__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getGroup_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Alternatives"


    // $ANTLR start "rule__Function__Group__0"
    // InternalLggeWhile.g:611:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:615:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalLggeWhile.g:616:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalLggeWhile.g:623:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:627:1: ( ( 'function' ) )
            // InternalLggeWhile.g:628:1: ( 'function' )
            {
            // InternalLggeWhile.g:628:1: ( 'function' )
            // InternalLggeWhile.g:629:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalLggeWhile.g:638:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:642:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalLggeWhile.g:643:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalLggeWhile.g:650:1: rule__Function__Group__1__Impl : ( ( rule__Function__SymbolAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:654:1: ( ( ( rule__Function__SymbolAssignment_1 ) ) )
            // InternalLggeWhile.g:655:1: ( ( rule__Function__SymbolAssignment_1 ) )
            {
            // InternalLggeWhile.g:655:1: ( ( rule__Function__SymbolAssignment_1 ) )
            // InternalLggeWhile.g:656:2: ( rule__Function__SymbolAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getSymbolAssignment_1()); 
            // InternalLggeWhile.g:657:2: ( rule__Function__SymbolAssignment_1 )
            // InternalLggeWhile.g:657:3: rule__Function__SymbolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__SymbolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getSymbolAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalLggeWhile.g:665:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:669:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalLggeWhile.g:670:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalLggeWhile.g:677:1: rule__Function__Group__2__Impl : ( ':' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:681:1: ( ( ':' ) )
            // InternalLggeWhile.g:682:1: ( ':' )
            {
            // InternalLggeWhile.g:682:1: ( ':' )
            // InternalLggeWhile.g:683:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalLggeWhile.g:692:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:696:1: ( rule__Function__Group__3__Impl )
            // InternalLggeWhile.g:697:2: rule__Function__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalLggeWhile.g:703:1: rule__Function__Group__3__Impl : ( ( rule__Function__DefinitionAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:707:1: ( ( ( rule__Function__DefinitionAssignment_3 ) ) )
            // InternalLggeWhile.g:708:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            {
            // InternalLggeWhile.g:708:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            // InternalLggeWhile.g:709:2: ( rule__Function__DefinitionAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 
            // InternalLggeWhile.g:710:2: ( rule__Function__DefinitionAssignment_3 )
            // InternalLggeWhile.g:710:3: rule__Function__DefinitionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__DefinitionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // InternalLggeWhile.g:719:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:723:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalLggeWhile.g:724:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // InternalLggeWhile.g:731:1: rule__Definition__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:735:1: ( ( 'read' ) )
            // InternalLggeWhile.g:736:1: ( 'read' )
            {
            // InternalLggeWhile.g:736:1: ( 'read' )
            // InternalLggeWhile.g:737:2: 'read'
            {
             before(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getReadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // InternalLggeWhile.g:746:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:750:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalLggeWhile.g:751:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // InternalLggeWhile.g:758:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__InputAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:762:1: ( ( ( rule__Definition__InputAssignment_1 ) ) )
            // InternalLggeWhile.g:763:1: ( ( rule__Definition__InputAssignment_1 ) )
            {
            // InternalLggeWhile.g:763:1: ( ( rule__Definition__InputAssignment_1 ) )
            // InternalLggeWhile.g:764:2: ( rule__Definition__InputAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getInputAssignment_1()); 
            // InternalLggeWhile.g:765:2: ( rule__Definition__InputAssignment_1 )
            // InternalLggeWhile.g:765:3: rule__Definition__InputAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__InputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getInputAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // InternalLggeWhile.g:773:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:777:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // InternalLggeWhile.g:778:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // InternalLggeWhile.g:785:1: rule__Definition__Group__2__Impl : ( '%' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:789:1: ( ( '%' ) )
            // InternalLggeWhile.g:790:1: ( '%' )
            {
            // InternalLggeWhile.g:790:1: ( '%' )
            // InternalLggeWhile.g:791:2: '%'
            {
             before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group__3"
    // InternalLggeWhile.g:800:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:804:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // InternalLggeWhile.g:805:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3"


    // $ANTLR start "rule__Definition__Group__3__Impl"
    // InternalLggeWhile.g:812:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__CommandsAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:816:1: ( ( ( rule__Definition__CommandsAssignment_3 ) ) )
            // InternalLggeWhile.g:817:1: ( ( rule__Definition__CommandsAssignment_3 ) )
            {
            // InternalLggeWhile.g:817:1: ( ( rule__Definition__CommandsAssignment_3 ) )
            // InternalLggeWhile.g:818:2: ( rule__Definition__CommandsAssignment_3 )
            {
             before(grammarAccess.getDefinitionAccess().getCommandsAssignment_3()); 
            // InternalLggeWhile.g:819:2: ( rule__Definition__CommandsAssignment_3 )
            // InternalLggeWhile.g:819:3: rule__Definition__CommandsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__CommandsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getCommandsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__3__Impl"


    // $ANTLR start "rule__Definition__Group__4"
    // InternalLggeWhile.g:827:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:831:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // InternalLggeWhile.g:832:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Definition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4"


    // $ANTLR start "rule__Definition__Group__4__Impl"
    // InternalLggeWhile.g:839:1: rule__Definition__Group__4__Impl : ( '%' ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:843:1: ( ( '%' ) )
            // InternalLggeWhile.g:844:1: ( '%' )
            {
            // InternalLggeWhile.g:844:1: ( '%' )
            // InternalLggeWhile.g:845:2: '%'
            {
             before(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getPercentSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__4__Impl"


    // $ANTLR start "rule__Definition__Group__5"
    // InternalLggeWhile.g:854:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl rule__Definition__Group__6 ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:858:1: ( rule__Definition__Group__5__Impl rule__Definition__Group__6 )
            // InternalLggeWhile.g:859:2: rule__Definition__Group__5__Impl rule__Definition__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__5"


    // $ANTLR start "rule__Definition__Group__5__Impl"
    // InternalLggeWhile.g:866:1: rule__Definition__Group__5__Impl : ( 'write' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:870:1: ( ( 'write' ) )
            // InternalLggeWhile.g:871:1: ( 'write' )
            {
            // InternalLggeWhile.g:871:1: ( 'write' )
            // InternalLggeWhile.g:872:2: 'write'
            {
             before(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getWriteKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__5__Impl"


    // $ANTLR start "rule__Definition__Group__6"
    // InternalLggeWhile.g:881:1: rule__Definition__Group__6 : rule__Definition__Group__6__Impl ;
    public final void rule__Definition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:885:1: ( rule__Definition__Group__6__Impl )
            // InternalLggeWhile.g:886:2: rule__Definition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__6"


    // $ANTLR start "rule__Definition__Group__6__Impl"
    // InternalLggeWhile.g:892:1: rule__Definition__Group__6__Impl : ( ( rule__Definition__OutputAssignment_6 ) ) ;
    public final void rule__Definition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:896:1: ( ( ( rule__Definition__OutputAssignment_6 ) ) )
            // InternalLggeWhile.g:897:1: ( ( rule__Definition__OutputAssignment_6 ) )
            {
            // InternalLggeWhile.g:897:1: ( ( rule__Definition__OutputAssignment_6 ) )
            // InternalLggeWhile.g:898:2: ( rule__Definition__OutputAssignment_6 )
            {
             before(grammarAccess.getDefinitionAccess().getOutputAssignment_6()); 
            // InternalLggeWhile.g:899:2: ( rule__Definition__OutputAssignment_6 )
            // InternalLggeWhile.g:899:3: rule__Definition__OutputAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Definition__OutputAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getOutputAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__6__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // InternalLggeWhile.g:908:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:912:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalLggeWhile.g:913:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalLggeWhile.g:920:1: rule__Input__Group__0__Impl : ( ( rule__Input__VarsAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:924:1: ( ( ( rule__Input__VarsAssignment_0 ) ) )
            // InternalLggeWhile.g:925:1: ( ( rule__Input__VarsAssignment_0 ) )
            {
            // InternalLggeWhile.g:925:1: ( ( rule__Input__VarsAssignment_0 ) )
            // InternalLggeWhile.g:926:2: ( rule__Input__VarsAssignment_0 )
            {
             before(grammarAccess.getInputAccess().getVarsAssignment_0()); 
            // InternalLggeWhile.g:927:2: ( rule__Input__VarsAssignment_0 )
            // InternalLggeWhile.g:927:3: rule__Input__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Input__VarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getVarsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalLggeWhile.g:935:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:939:1: ( rule__Input__Group__1__Impl )
            // InternalLggeWhile.g:940:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalLggeWhile.g:946:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:950:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // InternalLggeWhile.g:951:1: ( ( rule__Input__Group_1__0 )* )
            {
            // InternalLggeWhile.g:951:1: ( ( rule__Input__Group_1__0 )* )
            // InternalLggeWhile.g:952:2: ( rule__Input__Group_1__0 )*
            {
             before(grammarAccess.getInputAccess().getGroup_1()); 
            // InternalLggeWhile.g:953:2: ( rule__Input__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLggeWhile.g:953:3: rule__Input__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Input__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group_1__0"
    // InternalLggeWhile.g:962:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:966:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // InternalLggeWhile.g:967:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Input__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__0"


    // $ANTLR start "rule__Input__Group_1__0__Impl"
    // InternalLggeWhile.g:974:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:978:1: ( ( ',' ) )
            // InternalLggeWhile.g:979:1: ( ',' )
            {
            // InternalLggeWhile.g:979:1: ( ',' )
            // InternalLggeWhile.g:980:2: ','
            {
             before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__0__Impl"


    // $ANTLR start "rule__Input__Group_1__1"
    // InternalLggeWhile.g:989:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:993:1: ( rule__Input__Group_1__1__Impl )
            // InternalLggeWhile.g:994:2: rule__Input__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__1"


    // $ANTLR start "rule__Input__Group_1__1__Impl"
    // InternalLggeWhile.g:1000:1: rule__Input__Group_1__1__Impl : ( ( rule__Input__VarsAssignment_1_1 ) ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1004:1: ( ( ( rule__Input__VarsAssignment_1_1 ) ) )
            // InternalLggeWhile.g:1005:1: ( ( rule__Input__VarsAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:1005:1: ( ( rule__Input__VarsAssignment_1_1 ) )
            // InternalLggeWhile.g:1006:2: ( rule__Input__VarsAssignment_1_1 )
            {
             before(grammarAccess.getInputAccess().getVarsAssignment_1_1()); 
            // InternalLggeWhile.g:1007:2: ( rule__Input__VarsAssignment_1_1 )
            // InternalLggeWhile.g:1007:3: rule__Input__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Input__VarsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getVarsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalLggeWhile.g:1016:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1020:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalLggeWhile.g:1021:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalLggeWhile.g:1028:1: rule__Output__Group__0__Impl : ( ( rule__Output__VarsAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1032:1: ( ( ( rule__Output__VarsAssignment_0 ) ) )
            // InternalLggeWhile.g:1033:1: ( ( rule__Output__VarsAssignment_0 ) )
            {
            // InternalLggeWhile.g:1033:1: ( ( rule__Output__VarsAssignment_0 ) )
            // InternalLggeWhile.g:1034:2: ( rule__Output__VarsAssignment_0 )
            {
             before(grammarAccess.getOutputAccess().getVarsAssignment_0()); 
            // InternalLggeWhile.g:1035:2: ( rule__Output__VarsAssignment_0 )
            // InternalLggeWhile.g:1035:3: rule__Output__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Output__VarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getVarsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalLggeWhile.g:1043:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1047:1: ( rule__Output__Group__1__Impl )
            // InternalLggeWhile.g:1048:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalLggeWhile.g:1054:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1058:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // InternalLggeWhile.g:1059:1: ( ( rule__Output__Group_1__0 )* )
            {
            // InternalLggeWhile.g:1059:1: ( ( rule__Output__Group_1__0 )* )
            // InternalLggeWhile.g:1060:2: ( rule__Output__Group_1__0 )*
            {
             before(grammarAccess.getOutputAccess().getGroup_1()); 
            // InternalLggeWhile.g:1061:2: ( rule__Output__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLggeWhile.g:1061:3: rule__Output__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Output__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getOutputAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group_1__0"
    // InternalLggeWhile.g:1070:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1074:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // InternalLggeWhile.g:1075:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Output__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__0"


    // $ANTLR start "rule__Output__Group_1__0__Impl"
    // InternalLggeWhile.g:1082:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1086:1: ( ( ',' ) )
            // InternalLggeWhile.g:1087:1: ( ',' )
            {
            // InternalLggeWhile.g:1087:1: ( ',' )
            // InternalLggeWhile.g:1088:2: ','
            {
             before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__0__Impl"


    // $ANTLR start "rule__Output__Group_1__1"
    // InternalLggeWhile.g:1097:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1101:1: ( rule__Output__Group_1__1__Impl )
            // InternalLggeWhile.g:1102:2: rule__Output__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__1"


    // $ANTLR start "rule__Output__Group_1__1__Impl"
    // InternalLggeWhile.g:1108:1: rule__Output__Group_1__1__Impl : ( ( rule__Output__VarsAssignment_1_1 ) ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1112:1: ( ( ( rule__Output__VarsAssignment_1_1 ) ) )
            // InternalLggeWhile.g:1113:1: ( ( rule__Output__VarsAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:1113:1: ( ( rule__Output__VarsAssignment_1_1 ) )
            // InternalLggeWhile.g:1114:2: ( rule__Output__VarsAssignment_1_1 )
            {
             before(grammarAccess.getOutputAccess().getVarsAssignment_1_1()); 
            // InternalLggeWhile.g:1115:2: ( rule__Output__VarsAssignment_1_1 )
            // InternalLggeWhile.g:1115:3: rule__Output__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__VarsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getVarsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__1__Impl"


    // $ANTLR start "rule__Commands__Group__0"
    // InternalLggeWhile.g:1124:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1128:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // InternalLggeWhile.g:1129:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Commands__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__0"


    // $ANTLR start "rule__Commands__Group__0__Impl"
    // InternalLggeWhile.g:1136:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__CommandsAssignment_0 ) ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1140:1: ( ( ( rule__Commands__CommandsAssignment_0 ) ) )
            // InternalLggeWhile.g:1141:1: ( ( rule__Commands__CommandsAssignment_0 ) )
            {
            // InternalLggeWhile.g:1141:1: ( ( rule__Commands__CommandsAssignment_0 ) )
            // InternalLggeWhile.g:1142:2: ( rule__Commands__CommandsAssignment_0 )
            {
             before(grammarAccess.getCommandsAccess().getCommandsAssignment_0()); 
            // InternalLggeWhile.g:1143:2: ( rule__Commands__CommandsAssignment_0 )
            // InternalLggeWhile.g:1143:3: rule__Commands__CommandsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Commands__CommandsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommandsAccess().getCommandsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__0__Impl"


    // $ANTLR start "rule__Commands__Group__1"
    // InternalLggeWhile.g:1151:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1155:1: ( rule__Commands__Group__1__Impl )
            // InternalLggeWhile.g:1156:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commands__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__1"


    // $ANTLR start "rule__Commands__Group__1__Impl"
    // InternalLggeWhile.g:1162:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )* ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1166:1: ( ( ( rule__Commands__Group_1__0 )* ) )
            // InternalLggeWhile.g:1167:1: ( ( rule__Commands__Group_1__0 )* )
            {
            // InternalLggeWhile.g:1167:1: ( ( rule__Commands__Group_1__0 )* )
            // InternalLggeWhile.g:1168:2: ( rule__Commands__Group_1__0 )*
            {
             before(grammarAccess.getCommandsAccess().getGroup_1()); 
            // InternalLggeWhile.g:1169:2: ( rule__Commands__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLggeWhile.g:1169:3: rule__Commands__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Commands__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCommandsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__1__Impl"


    // $ANTLR start "rule__Commands__Group_1__0"
    // InternalLggeWhile.g:1178:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1182:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // InternalLggeWhile.g:1183:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Commands__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Commands__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__0"


    // $ANTLR start "rule__Commands__Group_1__0__Impl"
    // InternalLggeWhile.g:1190:1: rule__Commands__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1194:1: ( ( ';' ) )
            // InternalLggeWhile.g:1195:1: ( ';' )
            {
            // InternalLggeWhile.g:1195:1: ( ';' )
            // InternalLggeWhile.g:1196:2: ';'
            {
             before(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__0__Impl"


    // $ANTLR start "rule__Commands__Group_1__1"
    // InternalLggeWhile.g:1205:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1209:1: ( rule__Commands__Group_1__1__Impl )
            // InternalLggeWhile.g:1210:2: rule__Commands__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Commands__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__1"


    // $ANTLR start "rule__Commands__Group_1__1__Impl"
    // InternalLggeWhile.g:1216:1: rule__Commands__Group_1__1__Impl : ( ( rule__Commands__CommandsAssignment_1_1 ) ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1220:1: ( ( ( rule__Commands__CommandsAssignment_1_1 ) ) )
            // InternalLggeWhile.g:1221:1: ( ( rule__Commands__CommandsAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:1221:1: ( ( rule__Commands__CommandsAssignment_1_1 ) )
            // InternalLggeWhile.g:1222:2: ( rule__Commands__CommandsAssignment_1_1 )
            {
             before(grammarAccess.getCommandsAccess().getCommandsAssignment_1_1()); 
            // InternalLggeWhile.g:1223:2: ( rule__Commands__CommandsAssignment_1_1 )
            // InternalLggeWhile.g:1223:3: rule__Commands__CommandsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Commands__CommandsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCommandsAccess().getCommandsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__1__Impl"


    // $ANTLR start "rule__WhileCommand__Group__0"
    // InternalLggeWhile.g:1232:1: rule__WhileCommand__Group__0 : rule__WhileCommand__Group__0__Impl rule__WhileCommand__Group__1 ;
    public final void rule__WhileCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1236:1: ( rule__WhileCommand__Group__0__Impl rule__WhileCommand__Group__1 )
            // InternalLggeWhile.g:1237:2: rule__WhileCommand__Group__0__Impl rule__WhileCommand__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__WhileCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__0"


    // $ANTLR start "rule__WhileCommand__Group__0__Impl"
    // InternalLggeWhile.g:1244:1: rule__WhileCommand__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1248:1: ( ( 'while' ) )
            // InternalLggeWhile.g:1249:1: ( 'while' )
            {
            // InternalLggeWhile.g:1249:1: ( 'while' )
            // InternalLggeWhile.g:1250:2: 'while'
            {
             before(grammarAccess.getWhileCommandAccess().getWhileKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWhileCommandAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__0__Impl"


    // $ANTLR start "rule__WhileCommand__Group__1"
    // InternalLggeWhile.g:1259:1: rule__WhileCommand__Group__1 : rule__WhileCommand__Group__1__Impl rule__WhileCommand__Group__2 ;
    public final void rule__WhileCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1263:1: ( rule__WhileCommand__Group__1__Impl rule__WhileCommand__Group__2 )
            // InternalLggeWhile.g:1264:2: rule__WhileCommand__Group__1__Impl rule__WhileCommand__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__WhileCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__1"


    // $ANTLR start "rule__WhileCommand__Group__1__Impl"
    // InternalLggeWhile.g:1271:1: rule__WhileCommand__Group__1__Impl : ( ( rule__WhileCommand__ExprAssignment_1 ) ) ;
    public final void rule__WhileCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1275:1: ( ( ( rule__WhileCommand__ExprAssignment_1 ) ) )
            // InternalLggeWhile.g:1276:1: ( ( rule__WhileCommand__ExprAssignment_1 ) )
            {
            // InternalLggeWhile.g:1276:1: ( ( rule__WhileCommand__ExprAssignment_1 ) )
            // InternalLggeWhile.g:1277:2: ( rule__WhileCommand__ExprAssignment_1 )
            {
             before(grammarAccess.getWhileCommandAccess().getExprAssignment_1()); 
            // InternalLggeWhile.g:1278:2: ( rule__WhileCommand__ExprAssignment_1 )
            // InternalLggeWhile.g:1278:3: rule__WhileCommand__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhileCommand__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhileCommandAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__1__Impl"


    // $ANTLR start "rule__WhileCommand__Group__2"
    // InternalLggeWhile.g:1286:1: rule__WhileCommand__Group__2 : rule__WhileCommand__Group__2__Impl rule__WhileCommand__Group__3 ;
    public final void rule__WhileCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1290:1: ( rule__WhileCommand__Group__2__Impl rule__WhileCommand__Group__3 )
            // InternalLggeWhile.g:1291:2: rule__WhileCommand__Group__2__Impl rule__WhileCommand__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__WhileCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileCommand__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__2"


    // $ANTLR start "rule__WhileCommand__Group__2__Impl"
    // InternalLggeWhile.g:1298:1: rule__WhileCommand__Group__2__Impl : ( 'do' ) ;
    public final void rule__WhileCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1302:1: ( ( 'do' ) )
            // InternalLggeWhile.g:1303:1: ( 'do' )
            {
            // InternalLggeWhile.g:1303:1: ( 'do' )
            // InternalLggeWhile.g:1304:2: 'do'
            {
             before(grammarAccess.getWhileCommandAccess().getDoKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWhileCommandAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__2__Impl"


    // $ANTLR start "rule__WhileCommand__Group__3"
    // InternalLggeWhile.g:1313:1: rule__WhileCommand__Group__3 : rule__WhileCommand__Group__3__Impl rule__WhileCommand__Group__4 ;
    public final void rule__WhileCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1317:1: ( rule__WhileCommand__Group__3__Impl rule__WhileCommand__Group__4 )
            // InternalLggeWhile.g:1318:2: rule__WhileCommand__Group__3__Impl rule__WhileCommand__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__WhileCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileCommand__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__3"


    // $ANTLR start "rule__WhileCommand__Group__3__Impl"
    // InternalLggeWhile.g:1325:1: rule__WhileCommand__Group__3__Impl : ( ( rule__WhileCommand__CommandsAssignment_3 ) ) ;
    public final void rule__WhileCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1329:1: ( ( ( rule__WhileCommand__CommandsAssignment_3 ) ) )
            // InternalLggeWhile.g:1330:1: ( ( rule__WhileCommand__CommandsAssignment_3 ) )
            {
            // InternalLggeWhile.g:1330:1: ( ( rule__WhileCommand__CommandsAssignment_3 ) )
            // InternalLggeWhile.g:1331:2: ( rule__WhileCommand__CommandsAssignment_3 )
            {
             before(grammarAccess.getWhileCommandAccess().getCommandsAssignment_3()); 
            // InternalLggeWhile.g:1332:2: ( rule__WhileCommand__CommandsAssignment_3 )
            // InternalLggeWhile.g:1332:3: rule__WhileCommand__CommandsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__WhileCommand__CommandsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWhileCommandAccess().getCommandsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__3__Impl"


    // $ANTLR start "rule__WhileCommand__Group__4"
    // InternalLggeWhile.g:1340:1: rule__WhileCommand__Group__4 : rule__WhileCommand__Group__4__Impl ;
    public final void rule__WhileCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1344:1: ( rule__WhileCommand__Group__4__Impl )
            // InternalLggeWhile.g:1345:2: rule__WhileCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileCommand__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__4"


    // $ANTLR start "rule__WhileCommand__Group__4__Impl"
    // InternalLggeWhile.g:1351:1: rule__WhileCommand__Group__4__Impl : ( 'od' ) ;
    public final void rule__WhileCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1355:1: ( ( 'od' ) )
            // InternalLggeWhile.g:1356:1: ( 'od' )
            {
            // InternalLggeWhile.g:1356:1: ( 'od' )
            // InternalLggeWhile.g:1357:2: 'od'
            {
             before(grammarAccess.getWhileCommandAccess().getOdKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWhileCommandAccess().getOdKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__Group__4__Impl"


    // $ANTLR start "rule__IfCommand__Group__0"
    // InternalLggeWhile.g:1367:1: rule__IfCommand__Group__0 : rule__IfCommand__Group__0__Impl rule__IfCommand__Group__1 ;
    public final void rule__IfCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1371:1: ( rule__IfCommand__Group__0__Impl rule__IfCommand__Group__1 )
            // InternalLggeWhile.g:1372:2: rule__IfCommand__Group__0__Impl rule__IfCommand__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__IfCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__0"


    // $ANTLR start "rule__IfCommand__Group__0__Impl"
    // InternalLggeWhile.g:1379:1: rule__IfCommand__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1383:1: ( ( 'if' ) )
            // InternalLggeWhile.g:1384:1: ( 'if' )
            {
            // InternalLggeWhile.g:1384:1: ( 'if' )
            // InternalLggeWhile.g:1385:2: 'if'
            {
             before(grammarAccess.getIfCommandAccess().getIfKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIfCommandAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__0__Impl"


    // $ANTLR start "rule__IfCommand__Group__1"
    // InternalLggeWhile.g:1394:1: rule__IfCommand__Group__1 : rule__IfCommand__Group__1__Impl rule__IfCommand__Group__2 ;
    public final void rule__IfCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1398:1: ( rule__IfCommand__Group__1__Impl rule__IfCommand__Group__2 )
            // InternalLggeWhile.g:1399:2: rule__IfCommand__Group__1__Impl rule__IfCommand__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__IfCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__1"


    // $ANTLR start "rule__IfCommand__Group__1__Impl"
    // InternalLggeWhile.g:1406:1: rule__IfCommand__Group__1__Impl : ( ( rule__IfCommand__ExprAssignment_1 ) ) ;
    public final void rule__IfCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1410:1: ( ( ( rule__IfCommand__ExprAssignment_1 ) ) )
            // InternalLggeWhile.g:1411:1: ( ( rule__IfCommand__ExprAssignment_1 ) )
            {
            // InternalLggeWhile.g:1411:1: ( ( rule__IfCommand__ExprAssignment_1 ) )
            // InternalLggeWhile.g:1412:2: ( rule__IfCommand__ExprAssignment_1 )
            {
             before(grammarAccess.getIfCommandAccess().getExprAssignment_1()); 
            // InternalLggeWhile.g:1413:2: ( rule__IfCommand__ExprAssignment_1 )
            // InternalLggeWhile.g:1413:3: rule__IfCommand__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IfCommand__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfCommandAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__1__Impl"


    // $ANTLR start "rule__IfCommand__Group__2"
    // InternalLggeWhile.g:1421:1: rule__IfCommand__Group__2 : rule__IfCommand__Group__2__Impl rule__IfCommand__Group__3 ;
    public final void rule__IfCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1425:1: ( rule__IfCommand__Group__2__Impl rule__IfCommand__Group__3 )
            // InternalLggeWhile.g:1426:2: rule__IfCommand__Group__2__Impl rule__IfCommand__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__IfCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCommand__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__2"


    // $ANTLR start "rule__IfCommand__Group__2__Impl"
    // InternalLggeWhile.g:1433:1: rule__IfCommand__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1437:1: ( ( 'then' ) )
            // InternalLggeWhile.g:1438:1: ( 'then' )
            {
            // InternalLggeWhile.g:1438:1: ( 'then' )
            // InternalLggeWhile.g:1439:2: 'then'
            {
             before(grammarAccess.getIfCommandAccess().getThenKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIfCommandAccess().getThenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__2__Impl"


    // $ANTLR start "rule__IfCommand__Group__3"
    // InternalLggeWhile.g:1448:1: rule__IfCommand__Group__3 : rule__IfCommand__Group__3__Impl rule__IfCommand__Group__4 ;
    public final void rule__IfCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1452:1: ( rule__IfCommand__Group__3__Impl rule__IfCommand__Group__4 )
            // InternalLggeWhile.g:1453:2: rule__IfCommand__Group__3__Impl rule__IfCommand__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__IfCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCommand__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__3"


    // $ANTLR start "rule__IfCommand__Group__3__Impl"
    // InternalLggeWhile.g:1460:1: rule__IfCommand__Group__3__Impl : ( ( rule__IfCommand__CommandsAssignment_3 ) ) ;
    public final void rule__IfCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1464:1: ( ( ( rule__IfCommand__CommandsAssignment_3 ) ) )
            // InternalLggeWhile.g:1465:1: ( ( rule__IfCommand__CommandsAssignment_3 ) )
            {
            // InternalLggeWhile.g:1465:1: ( ( rule__IfCommand__CommandsAssignment_3 ) )
            // InternalLggeWhile.g:1466:2: ( rule__IfCommand__CommandsAssignment_3 )
            {
             before(grammarAccess.getIfCommandAccess().getCommandsAssignment_3()); 
            // InternalLggeWhile.g:1467:2: ( rule__IfCommand__CommandsAssignment_3 )
            // InternalLggeWhile.g:1467:3: rule__IfCommand__CommandsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IfCommand__CommandsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfCommandAccess().getCommandsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__3__Impl"


    // $ANTLR start "rule__IfCommand__Group__4"
    // InternalLggeWhile.g:1475:1: rule__IfCommand__Group__4 : rule__IfCommand__Group__4__Impl rule__IfCommand__Group__5 ;
    public final void rule__IfCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1479:1: ( rule__IfCommand__Group__4__Impl rule__IfCommand__Group__5 )
            // InternalLggeWhile.g:1480:2: rule__IfCommand__Group__4__Impl rule__IfCommand__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__IfCommand__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCommand__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__4"


    // $ANTLR start "rule__IfCommand__Group__4__Impl"
    // InternalLggeWhile.g:1487:1: rule__IfCommand__Group__4__Impl : ( ( rule__IfCommand__Group_4__0 )? ) ;
    public final void rule__IfCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1491:1: ( ( ( rule__IfCommand__Group_4__0 )? ) )
            // InternalLggeWhile.g:1492:1: ( ( rule__IfCommand__Group_4__0 )? )
            {
            // InternalLggeWhile.g:1492:1: ( ( rule__IfCommand__Group_4__0 )? )
            // InternalLggeWhile.g:1493:2: ( rule__IfCommand__Group_4__0 )?
            {
             before(grammarAccess.getIfCommandAccess().getGroup_4()); 
            // InternalLggeWhile.g:1494:2: ( rule__IfCommand__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLggeWhile.g:1494:3: rule__IfCommand__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IfCommand__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfCommandAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__4__Impl"


    // $ANTLR start "rule__IfCommand__Group__5"
    // InternalLggeWhile.g:1502:1: rule__IfCommand__Group__5 : rule__IfCommand__Group__5__Impl ;
    public final void rule__IfCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1506:1: ( rule__IfCommand__Group__5__Impl )
            // InternalLggeWhile.g:1507:2: rule__IfCommand__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfCommand__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__5"


    // $ANTLR start "rule__IfCommand__Group__5__Impl"
    // InternalLggeWhile.g:1513:1: rule__IfCommand__Group__5__Impl : ( 'fi' ) ;
    public final void rule__IfCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1517:1: ( ( 'fi' ) )
            // InternalLggeWhile.g:1518:1: ( 'fi' )
            {
            // InternalLggeWhile.g:1518:1: ( 'fi' )
            // InternalLggeWhile.g:1519:2: 'fi'
            {
             before(grammarAccess.getIfCommandAccess().getFiKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIfCommandAccess().getFiKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group__5__Impl"


    // $ANTLR start "rule__IfCommand__Group_4__0"
    // InternalLggeWhile.g:1529:1: rule__IfCommand__Group_4__0 : rule__IfCommand__Group_4__0__Impl rule__IfCommand__Group_4__1 ;
    public final void rule__IfCommand__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1533:1: ( rule__IfCommand__Group_4__0__Impl rule__IfCommand__Group_4__1 )
            // InternalLggeWhile.g:1534:2: rule__IfCommand__Group_4__0__Impl rule__IfCommand__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__IfCommand__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfCommand__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group_4__0"


    // $ANTLR start "rule__IfCommand__Group_4__0__Impl"
    // InternalLggeWhile.g:1541:1: rule__IfCommand__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__IfCommand__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1545:1: ( ( 'else' ) )
            // InternalLggeWhile.g:1546:1: ( 'else' )
            {
            // InternalLggeWhile.g:1546:1: ( 'else' )
            // InternalLggeWhile.g:1547:2: 'else'
            {
             before(grammarAccess.getIfCommandAccess().getElseKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getIfCommandAccess().getElseKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group_4__0__Impl"


    // $ANTLR start "rule__IfCommand__Group_4__1"
    // InternalLggeWhile.g:1556:1: rule__IfCommand__Group_4__1 : rule__IfCommand__Group_4__1__Impl ;
    public final void rule__IfCommand__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1560:1: ( rule__IfCommand__Group_4__1__Impl )
            // InternalLggeWhile.g:1561:2: rule__IfCommand__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfCommand__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group_4__1"


    // $ANTLR start "rule__IfCommand__Group_4__1__Impl"
    // InternalLggeWhile.g:1567:1: rule__IfCommand__Group_4__1__Impl : ( ( rule__IfCommand__ElsecommandsAssignment_4_1 ) ) ;
    public final void rule__IfCommand__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1571:1: ( ( ( rule__IfCommand__ElsecommandsAssignment_4_1 ) ) )
            // InternalLggeWhile.g:1572:1: ( ( rule__IfCommand__ElsecommandsAssignment_4_1 ) )
            {
            // InternalLggeWhile.g:1572:1: ( ( rule__IfCommand__ElsecommandsAssignment_4_1 ) )
            // InternalLggeWhile.g:1573:2: ( rule__IfCommand__ElsecommandsAssignment_4_1 )
            {
             before(grammarAccess.getIfCommandAccess().getElsecommandsAssignment_4_1()); 
            // InternalLggeWhile.g:1574:2: ( rule__IfCommand__ElsecommandsAssignment_4_1 )
            // InternalLggeWhile.g:1574:3: rule__IfCommand__ElsecommandsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__IfCommand__ElsecommandsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIfCommandAccess().getElsecommandsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__Group_4__1__Impl"


    // $ANTLR start "rule__ForCommand__Group__0"
    // InternalLggeWhile.g:1583:1: rule__ForCommand__Group__0 : rule__ForCommand__Group__0__Impl rule__ForCommand__Group__1 ;
    public final void rule__ForCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1587:1: ( rule__ForCommand__Group__0__Impl rule__ForCommand__Group__1 )
            // InternalLggeWhile.g:1588:2: rule__ForCommand__Group__0__Impl rule__ForCommand__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ForCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__0"


    // $ANTLR start "rule__ForCommand__Group__0__Impl"
    // InternalLggeWhile.g:1595:1: rule__ForCommand__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1599:1: ( ( 'for' ) )
            // InternalLggeWhile.g:1600:1: ( 'for' )
            {
            // InternalLggeWhile.g:1600:1: ( 'for' )
            // InternalLggeWhile.g:1601:2: 'for'
            {
             before(grammarAccess.getForCommandAccess().getForKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getForCommandAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__0__Impl"


    // $ANTLR start "rule__ForCommand__Group__1"
    // InternalLggeWhile.g:1610:1: rule__ForCommand__Group__1 : rule__ForCommand__Group__1__Impl rule__ForCommand__Group__2 ;
    public final void rule__ForCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1614:1: ( rule__ForCommand__Group__1__Impl rule__ForCommand__Group__2 )
            // InternalLggeWhile.g:1615:2: rule__ForCommand__Group__1__Impl rule__ForCommand__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ForCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__1"


    // $ANTLR start "rule__ForCommand__Group__1__Impl"
    // InternalLggeWhile.g:1622:1: rule__ForCommand__Group__1__Impl : ( ( rule__ForCommand__ExprAssignment_1 ) ) ;
    public final void rule__ForCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1626:1: ( ( ( rule__ForCommand__ExprAssignment_1 ) ) )
            // InternalLggeWhile.g:1627:1: ( ( rule__ForCommand__ExprAssignment_1 ) )
            {
            // InternalLggeWhile.g:1627:1: ( ( rule__ForCommand__ExprAssignment_1 ) )
            // InternalLggeWhile.g:1628:2: ( rule__ForCommand__ExprAssignment_1 )
            {
             before(grammarAccess.getForCommandAccess().getExprAssignment_1()); 
            // InternalLggeWhile.g:1629:2: ( rule__ForCommand__ExprAssignment_1 )
            // InternalLggeWhile.g:1629:3: rule__ForCommand__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForCommand__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForCommandAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__1__Impl"


    // $ANTLR start "rule__ForCommand__Group__2"
    // InternalLggeWhile.g:1637:1: rule__ForCommand__Group__2 : rule__ForCommand__Group__2__Impl rule__ForCommand__Group__3 ;
    public final void rule__ForCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1641:1: ( rule__ForCommand__Group__2__Impl rule__ForCommand__Group__3 )
            // InternalLggeWhile.g:1642:2: rule__ForCommand__Group__2__Impl rule__ForCommand__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ForCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForCommand__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__2"


    // $ANTLR start "rule__ForCommand__Group__2__Impl"
    // InternalLggeWhile.g:1649:1: rule__ForCommand__Group__2__Impl : ( 'do' ) ;
    public final void rule__ForCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1653:1: ( ( 'do' ) )
            // InternalLggeWhile.g:1654:1: ( 'do' )
            {
            // InternalLggeWhile.g:1654:1: ( 'do' )
            // InternalLggeWhile.g:1655:2: 'do'
            {
             before(grammarAccess.getForCommandAccess().getDoKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getForCommandAccess().getDoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__2__Impl"


    // $ANTLR start "rule__ForCommand__Group__3"
    // InternalLggeWhile.g:1664:1: rule__ForCommand__Group__3 : rule__ForCommand__Group__3__Impl rule__ForCommand__Group__4 ;
    public final void rule__ForCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1668:1: ( rule__ForCommand__Group__3__Impl rule__ForCommand__Group__4 )
            // InternalLggeWhile.g:1669:2: rule__ForCommand__Group__3__Impl rule__ForCommand__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ForCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForCommand__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__3"


    // $ANTLR start "rule__ForCommand__Group__3__Impl"
    // InternalLggeWhile.g:1676:1: rule__ForCommand__Group__3__Impl : ( ( rule__ForCommand__CommandAssignment_3 ) ) ;
    public final void rule__ForCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1680:1: ( ( ( rule__ForCommand__CommandAssignment_3 ) ) )
            // InternalLggeWhile.g:1681:1: ( ( rule__ForCommand__CommandAssignment_3 ) )
            {
            // InternalLggeWhile.g:1681:1: ( ( rule__ForCommand__CommandAssignment_3 ) )
            // InternalLggeWhile.g:1682:2: ( rule__ForCommand__CommandAssignment_3 )
            {
             before(grammarAccess.getForCommandAccess().getCommandAssignment_3()); 
            // InternalLggeWhile.g:1683:2: ( rule__ForCommand__CommandAssignment_3 )
            // InternalLggeWhile.g:1683:3: rule__ForCommand__CommandAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForCommand__CommandAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForCommandAccess().getCommandAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__3__Impl"


    // $ANTLR start "rule__ForCommand__Group__4"
    // InternalLggeWhile.g:1691:1: rule__ForCommand__Group__4 : rule__ForCommand__Group__4__Impl ;
    public final void rule__ForCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1695:1: ( rule__ForCommand__Group__4__Impl )
            // InternalLggeWhile.g:1696:2: rule__ForCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForCommand__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__4"


    // $ANTLR start "rule__ForCommand__Group__4__Impl"
    // InternalLggeWhile.g:1702:1: rule__ForCommand__Group__4__Impl : ( 'od' ) ;
    public final void rule__ForCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1706:1: ( ( 'od' ) )
            // InternalLggeWhile.g:1707:1: ( 'od' )
            {
            // InternalLggeWhile.g:1707:1: ( 'od' )
            // InternalLggeWhile.g:1708:2: 'od'
            {
             before(grammarAccess.getForCommandAccess().getOdKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getForCommandAccess().getOdKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__Group__4__Impl"


    // $ANTLR start "rule__AffectCommand__Group__0"
    // InternalLggeWhile.g:1718:1: rule__AffectCommand__Group__0 : rule__AffectCommand__Group__0__Impl rule__AffectCommand__Group__1 ;
    public final void rule__AffectCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1722:1: ( rule__AffectCommand__Group__0__Impl rule__AffectCommand__Group__1 )
            // InternalLggeWhile.g:1723:2: rule__AffectCommand__Group__0__Impl rule__AffectCommand__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__AffectCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AffectCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectCommand__Group__0"


    // $ANTLR start "rule__AffectCommand__Group__0__Impl"
    // InternalLggeWhile.g:1730:1: rule__AffectCommand__Group__0__Impl : ( ( rule__AffectCommand__VarsAssignment_0 ) ) ;
    public final void rule__AffectCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1734:1: ( ( ( rule__AffectCommand__VarsAssignment_0 ) ) )
            // InternalLggeWhile.g:1735:1: ( ( rule__AffectCommand__VarsAssignment_0 ) )
            {
            // InternalLggeWhile.g:1735:1: ( ( rule__AffectCommand__VarsAssignment_0 ) )
            // InternalLggeWhile.g:1736:2: ( rule__AffectCommand__VarsAssignment_0 )
            {
             before(grammarAccess.getAffectCommandAccess().getVarsAssignment_0()); 
            // InternalLggeWhile.g:1737:2: ( rule__AffectCommand__VarsAssignment_0 )
            // InternalLggeWhile.g:1737:3: rule__AffectCommand__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AffectCommand__VarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAffectCommandAccess().getVarsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectCommand__Group__0__Impl"


    // $ANTLR start "rule__AffectCommand__Group__1"
    // InternalLggeWhile.g:1745:1: rule__AffectCommand__Group__1 : rule__AffectCommand__Group__1__Impl rule__AffectCommand__Group__2 ;
    public final void rule__AffectCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1749:1: ( rule__AffectCommand__Group__1__Impl rule__AffectCommand__Group__2 )
            // InternalLggeWhile.g:1750:2: rule__AffectCommand__Group__1__Impl rule__AffectCommand__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__AffectCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AffectCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectCommand__Group__1"


    // $ANTLR start "rule__AffectCommand__Group__1__Impl"
    // InternalLggeWhile.g:1757:1: rule__AffectCommand__Group__1__Impl : ( ':=' ) ;
    public final void rule__AffectCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1761:1: ( ( ':=' ) )
            // InternalLggeWhile.g:1762:1: ( ':=' )
            {
            // InternalLggeWhile.g:1762:1: ( ':=' )
            // InternalLggeWhile.g:1763:2: ':='
            {
             before(grammarAccess.getAffectCommandAccess().getColonEqualsSignKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAffectCommandAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectCommand__Group__1__Impl"


    // $ANTLR start "rule__AffectCommand__Group__2"
    // InternalLggeWhile.g:1772:1: rule__AffectCommand__Group__2 : rule__AffectCommand__Group__2__Impl ;
    public final void rule__AffectCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1776:1: ( rule__AffectCommand__Group__2__Impl )
            // InternalLggeWhile.g:1777:2: rule__AffectCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AffectCommand__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectCommand__Group__2"


    // $ANTLR start "rule__AffectCommand__Group__2__Impl"
    // InternalLggeWhile.g:1783:1: rule__AffectCommand__Group__2__Impl : ( ( rule__AffectCommand__ExprsAssignment_2 ) ) ;
    public final void rule__AffectCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1787:1: ( ( ( rule__AffectCommand__ExprsAssignment_2 ) ) )
            // InternalLggeWhile.g:1788:1: ( ( rule__AffectCommand__ExprsAssignment_2 ) )
            {
            // InternalLggeWhile.g:1788:1: ( ( rule__AffectCommand__ExprsAssignment_2 ) )
            // InternalLggeWhile.g:1789:2: ( rule__AffectCommand__ExprsAssignment_2 )
            {
             before(grammarAccess.getAffectCommandAccess().getExprsAssignment_2()); 
            // InternalLggeWhile.g:1790:2: ( rule__AffectCommand__ExprsAssignment_2 )
            // InternalLggeWhile.g:1790:3: rule__AffectCommand__ExprsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AffectCommand__ExprsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAffectCommandAccess().getExprsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectCommand__Group__2__Impl"


    // $ANTLR start "rule__ForeachCommand__Group__0"
    // InternalLggeWhile.g:1799:1: rule__ForeachCommand__Group__0 : rule__ForeachCommand__Group__0__Impl rule__ForeachCommand__Group__1 ;
    public final void rule__ForeachCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1803:1: ( rule__ForeachCommand__Group__0__Impl rule__ForeachCommand__Group__1 )
            // InternalLggeWhile.g:1804:2: rule__ForeachCommand__Group__0__Impl rule__ForeachCommand__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ForeachCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeachCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__0"


    // $ANTLR start "rule__ForeachCommand__Group__0__Impl"
    // InternalLggeWhile.g:1811:1: rule__ForeachCommand__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForeachCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1815:1: ( ( 'foreach' ) )
            // InternalLggeWhile.g:1816:1: ( 'foreach' )
            {
            // InternalLggeWhile.g:1816:1: ( 'foreach' )
            // InternalLggeWhile.g:1817:2: 'foreach'
            {
             before(grammarAccess.getForeachCommandAccess().getForeachKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getForeachCommandAccess().getForeachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__0__Impl"


    // $ANTLR start "rule__ForeachCommand__Group__1"
    // InternalLggeWhile.g:1826:1: rule__ForeachCommand__Group__1 : rule__ForeachCommand__Group__1__Impl rule__ForeachCommand__Group__2 ;
    public final void rule__ForeachCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1830:1: ( rule__ForeachCommand__Group__1__Impl rule__ForeachCommand__Group__2 )
            // InternalLggeWhile.g:1831:2: rule__ForeachCommand__Group__1__Impl rule__ForeachCommand__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ForeachCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeachCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__1"


    // $ANTLR start "rule__ForeachCommand__Group__1__Impl"
    // InternalLggeWhile.g:1838:1: rule__ForeachCommand__Group__1__Impl : ( ( rule__ForeachCommand__VarsAssignment_1 ) ) ;
    public final void rule__ForeachCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1842:1: ( ( ( rule__ForeachCommand__VarsAssignment_1 ) ) )
            // InternalLggeWhile.g:1843:1: ( ( rule__ForeachCommand__VarsAssignment_1 ) )
            {
            // InternalLggeWhile.g:1843:1: ( ( rule__ForeachCommand__VarsAssignment_1 ) )
            // InternalLggeWhile.g:1844:2: ( rule__ForeachCommand__VarsAssignment_1 )
            {
             before(grammarAccess.getForeachCommandAccess().getVarsAssignment_1()); 
            // InternalLggeWhile.g:1845:2: ( rule__ForeachCommand__VarsAssignment_1 )
            // InternalLggeWhile.g:1845:3: rule__ForeachCommand__VarsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForeachCommand__VarsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForeachCommandAccess().getVarsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__1__Impl"


    // $ANTLR start "rule__ForeachCommand__Group__2"
    // InternalLggeWhile.g:1853:1: rule__ForeachCommand__Group__2 : rule__ForeachCommand__Group__2__Impl rule__ForeachCommand__Group__3 ;
    public final void rule__ForeachCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1857:1: ( rule__ForeachCommand__Group__2__Impl rule__ForeachCommand__Group__3 )
            // InternalLggeWhile.g:1858:2: rule__ForeachCommand__Group__2__Impl rule__ForeachCommand__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ForeachCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeachCommand__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__2"


    // $ANTLR start "rule__ForeachCommand__Group__2__Impl"
    // InternalLggeWhile.g:1865:1: rule__ForeachCommand__Group__2__Impl : ( 'in' ) ;
    public final void rule__ForeachCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1869:1: ( ( 'in' ) )
            // InternalLggeWhile.g:1870:1: ( 'in' )
            {
            // InternalLggeWhile.g:1870:1: ( 'in' )
            // InternalLggeWhile.g:1871:2: 'in'
            {
             before(grammarAccess.getForeachCommandAccess().getInKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getForeachCommandAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__2__Impl"


    // $ANTLR start "rule__ForeachCommand__Group__3"
    // InternalLggeWhile.g:1880:1: rule__ForeachCommand__Group__3 : rule__ForeachCommand__Group__3__Impl rule__ForeachCommand__Group__4 ;
    public final void rule__ForeachCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1884:1: ( rule__ForeachCommand__Group__3__Impl rule__ForeachCommand__Group__4 )
            // InternalLggeWhile.g:1885:2: rule__ForeachCommand__Group__3__Impl rule__ForeachCommand__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ForeachCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeachCommand__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__3"


    // $ANTLR start "rule__ForeachCommand__Group__3__Impl"
    // InternalLggeWhile.g:1892:1: rule__ForeachCommand__Group__3__Impl : ( ( rule__ForeachCommand__ExprAssignment_3 ) ) ;
    public final void rule__ForeachCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1896:1: ( ( ( rule__ForeachCommand__ExprAssignment_3 ) ) )
            // InternalLggeWhile.g:1897:1: ( ( rule__ForeachCommand__ExprAssignment_3 ) )
            {
            // InternalLggeWhile.g:1897:1: ( ( rule__ForeachCommand__ExprAssignment_3 ) )
            // InternalLggeWhile.g:1898:2: ( rule__ForeachCommand__ExprAssignment_3 )
            {
             before(grammarAccess.getForeachCommandAccess().getExprAssignment_3()); 
            // InternalLggeWhile.g:1899:2: ( rule__ForeachCommand__ExprAssignment_3 )
            // InternalLggeWhile.g:1899:3: rule__ForeachCommand__ExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForeachCommand__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForeachCommandAccess().getExprAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__3__Impl"


    // $ANTLR start "rule__ForeachCommand__Group__4"
    // InternalLggeWhile.g:1907:1: rule__ForeachCommand__Group__4 : rule__ForeachCommand__Group__4__Impl rule__ForeachCommand__Group__5 ;
    public final void rule__ForeachCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1911:1: ( rule__ForeachCommand__Group__4__Impl rule__ForeachCommand__Group__5 )
            // InternalLggeWhile.g:1912:2: rule__ForeachCommand__Group__4__Impl rule__ForeachCommand__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ForeachCommand__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeachCommand__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__4"


    // $ANTLR start "rule__ForeachCommand__Group__4__Impl"
    // InternalLggeWhile.g:1919:1: rule__ForeachCommand__Group__4__Impl : ( 'do' ) ;
    public final void rule__ForeachCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1923:1: ( ( 'do' ) )
            // InternalLggeWhile.g:1924:1: ( 'do' )
            {
            // InternalLggeWhile.g:1924:1: ( 'do' )
            // InternalLggeWhile.g:1925:2: 'do'
            {
             before(grammarAccess.getForeachCommandAccess().getDoKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getForeachCommandAccess().getDoKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__4__Impl"


    // $ANTLR start "rule__ForeachCommand__Group__5"
    // InternalLggeWhile.g:1934:1: rule__ForeachCommand__Group__5 : rule__ForeachCommand__Group__5__Impl rule__ForeachCommand__Group__6 ;
    public final void rule__ForeachCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1938:1: ( rule__ForeachCommand__Group__5__Impl rule__ForeachCommand__Group__6 )
            // InternalLggeWhile.g:1939:2: rule__ForeachCommand__Group__5__Impl rule__ForeachCommand__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ForeachCommand__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForeachCommand__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__5"


    // $ANTLR start "rule__ForeachCommand__Group__5__Impl"
    // InternalLggeWhile.g:1946:1: rule__ForeachCommand__Group__5__Impl : ( ( rule__ForeachCommand__CommandsAssignment_5 ) ) ;
    public final void rule__ForeachCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1950:1: ( ( ( rule__ForeachCommand__CommandsAssignment_5 ) ) )
            // InternalLggeWhile.g:1951:1: ( ( rule__ForeachCommand__CommandsAssignment_5 ) )
            {
            // InternalLggeWhile.g:1951:1: ( ( rule__ForeachCommand__CommandsAssignment_5 ) )
            // InternalLggeWhile.g:1952:2: ( rule__ForeachCommand__CommandsAssignment_5 )
            {
             before(grammarAccess.getForeachCommandAccess().getCommandsAssignment_5()); 
            // InternalLggeWhile.g:1953:2: ( rule__ForeachCommand__CommandsAssignment_5 )
            // InternalLggeWhile.g:1953:3: rule__ForeachCommand__CommandsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForeachCommand__CommandsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForeachCommandAccess().getCommandsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__5__Impl"


    // $ANTLR start "rule__ForeachCommand__Group__6"
    // InternalLggeWhile.g:1961:1: rule__ForeachCommand__Group__6 : rule__ForeachCommand__Group__6__Impl ;
    public final void rule__ForeachCommand__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1965:1: ( rule__ForeachCommand__Group__6__Impl )
            // InternalLggeWhile.g:1966:2: rule__ForeachCommand__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForeachCommand__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__6"


    // $ANTLR start "rule__ForeachCommand__Group__6__Impl"
    // InternalLggeWhile.g:1972:1: rule__ForeachCommand__Group__6__Impl : ( 'od' ) ;
    public final void rule__ForeachCommand__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1976:1: ( ( 'od' ) )
            // InternalLggeWhile.g:1977:1: ( 'od' )
            {
            // InternalLggeWhile.g:1977:1: ( 'od' )
            // InternalLggeWhile.g:1978:2: 'od'
            {
             before(grammarAccess.getForeachCommandAccess().getOdKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getForeachCommandAccess().getOdKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__Group__6__Impl"


    // $ANTLR start "rule__Exprs__Group__0"
    // InternalLggeWhile.g:1988:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1992:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // InternalLggeWhile.g:1993:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Exprs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exprs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0"


    // $ANTLR start "rule__Exprs__Group__0__Impl"
    // InternalLggeWhile.g:2000:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__ExprAssignment_0 ) ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2004:1: ( ( ( rule__Exprs__ExprAssignment_0 ) ) )
            // InternalLggeWhile.g:2005:1: ( ( rule__Exprs__ExprAssignment_0 ) )
            {
            // InternalLggeWhile.g:2005:1: ( ( rule__Exprs__ExprAssignment_0 ) )
            // InternalLggeWhile.g:2006:2: ( rule__Exprs__ExprAssignment_0 )
            {
             before(grammarAccess.getExprsAccess().getExprAssignment_0()); 
            // InternalLggeWhile.g:2007:2: ( rule__Exprs__ExprAssignment_0 )
            // InternalLggeWhile.g:2007:3: rule__Exprs__ExprAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Exprs__ExprAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExprsAccess().getExprAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0__Impl"


    // $ANTLR start "rule__Exprs__Group__1"
    // InternalLggeWhile.g:2015:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2019:1: ( rule__Exprs__Group__1__Impl )
            // InternalLggeWhile.g:2020:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exprs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1"


    // $ANTLR start "rule__Exprs__Group__1__Impl"
    // InternalLggeWhile.g:2026:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )* ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2030:1: ( ( ( rule__Exprs__Group_1__0 )* ) )
            // InternalLggeWhile.g:2031:1: ( ( rule__Exprs__Group_1__0 )* )
            {
            // InternalLggeWhile.g:2031:1: ( ( rule__Exprs__Group_1__0 )* )
            // InternalLggeWhile.g:2032:2: ( rule__Exprs__Group_1__0 )*
            {
             before(grammarAccess.getExprsAccess().getGroup_1()); 
            // InternalLggeWhile.g:2033:2: ( rule__Exprs__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLggeWhile.g:2033:3: rule__Exprs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Exprs__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExprsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1__Impl"


    // $ANTLR start "rule__Exprs__Group_1__0"
    // InternalLggeWhile.g:2042:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2046:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // InternalLggeWhile.g:2047:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exprs__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__0"


    // $ANTLR start "rule__Exprs__Group_1__0__Impl"
    // InternalLggeWhile.g:2054:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2058:1: ( ( ',' ) )
            // InternalLggeWhile.g:2059:1: ( ',' )
            {
            // InternalLggeWhile.g:2059:1: ( ',' )
            // InternalLggeWhile.g:2060:2: ','
            {
             before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__0__Impl"


    // $ANTLR start "rule__Exprs__Group_1__1"
    // InternalLggeWhile.g:2069:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2073:1: ( rule__Exprs__Group_1__1__Impl )
            // InternalLggeWhile.g:2074:2: rule__Exprs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exprs__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__1"


    // $ANTLR start "rule__Exprs__Group_1__1__Impl"
    // InternalLggeWhile.g:2080:1: rule__Exprs__Group_1__1__Impl : ( ( rule__Exprs__ExprAssignment_1_1 ) ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2084:1: ( ( ( rule__Exprs__ExprAssignment_1_1 ) ) )
            // InternalLggeWhile.g:2085:1: ( ( rule__Exprs__ExprAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:2085:1: ( ( rule__Exprs__ExprAssignment_1_1 ) )
            // InternalLggeWhile.g:2086:2: ( rule__Exprs__ExprAssignment_1_1 )
            {
             before(grammarAccess.getExprsAccess().getExprAssignment_1_1()); 
            // InternalLggeWhile.g:2087:2: ( rule__Exprs__ExprAssignment_1_1 )
            // InternalLggeWhile.g:2087:3: rule__Exprs__ExprAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exprs__ExprAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExprsAccess().getExprAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__1__Impl"


    // $ANTLR start "rule__Vars__Group__0"
    // InternalLggeWhile.g:2096:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2100:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // InternalLggeWhile.g:2101:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Vars__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vars__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0"


    // $ANTLR start "rule__Vars__Group__0__Impl"
    // InternalLggeWhile.g:2108:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__VariAssignment_0 ) ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2112:1: ( ( ( rule__Vars__VariAssignment_0 ) ) )
            // InternalLggeWhile.g:2113:1: ( ( rule__Vars__VariAssignment_0 ) )
            {
            // InternalLggeWhile.g:2113:1: ( ( rule__Vars__VariAssignment_0 ) )
            // InternalLggeWhile.g:2114:2: ( rule__Vars__VariAssignment_0 )
            {
             before(grammarAccess.getVarsAccess().getVariAssignment_0()); 
            // InternalLggeWhile.g:2115:2: ( rule__Vars__VariAssignment_0 )
            // InternalLggeWhile.g:2115:3: rule__Vars__VariAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Vars__VariAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarsAccess().getVariAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0__Impl"


    // $ANTLR start "rule__Vars__Group__1"
    // InternalLggeWhile.g:2123:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2127:1: ( rule__Vars__Group__1__Impl )
            // InternalLggeWhile.g:2128:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vars__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1"


    // $ANTLR start "rule__Vars__Group__1__Impl"
    // InternalLggeWhile.g:2134:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )* ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2138:1: ( ( ( rule__Vars__Group_1__0 )* ) )
            // InternalLggeWhile.g:2139:1: ( ( rule__Vars__Group_1__0 )* )
            {
            // InternalLggeWhile.g:2139:1: ( ( rule__Vars__Group_1__0 )* )
            // InternalLggeWhile.g:2140:2: ( rule__Vars__Group_1__0 )*
            {
             before(grammarAccess.getVarsAccess().getGroup_1()); 
            // InternalLggeWhile.g:2141:2: ( rule__Vars__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLggeWhile.g:2141:3: rule__Vars__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Vars__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getVarsAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1__Impl"


    // $ANTLR start "rule__Vars__Group_1__0"
    // InternalLggeWhile.g:2150:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2154:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // InternalLggeWhile.g:2155:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vars__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__0"


    // $ANTLR start "rule__Vars__Group_1__0__Impl"
    // InternalLggeWhile.g:2162:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2166:1: ( ( ',' ) )
            // InternalLggeWhile.g:2167:1: ( ',' )
            {
            // InternalLggeWhile.g:2167:1: ( ',' )
            // InternalLggeWhile.g:2168:2: ','
            {
             before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__0__Impl"


    // $ANTLR start "rule__Vars__Group_1__1"
    // InternalLggeWhile.g:2177:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2181:1: ( rule__Vars__Group_1__1__Impl )
            // InternalLggeWhile.g:2182:2: rule__Vars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vars__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__1"


    // $ANTLR start "rule__Vars__Group_1__1__Impl"
    // InternalLggeWhile.g:2188:1: rule__Vars__Group_1__1__Impl : ( ( rule__Vars__VariAssignment_1_1 ) ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2192:1: ( ( ( rule__Vars__VariAssignment_1_1 ) ) )
            // InternalLggeWhile.g:2193:1: ( ( rule__Vars__VariAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:2193:1: ( ( rule__Vars__VariAssignment_1_1 ) )
            // InternalLggeWhile.g:2194:2: ( rule__Vars__VariAssignment_1_1 )
            {
             before(grammarAccess.getVarsAccess().getVariAssignment_1_1()); 
            // InternalLggeWhile.g:2195:2: ( rule__Vars__VariAssignment_1_1 )
            // InternalLggeWhile.g:2195:3: rule__Vars__VariAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Vars__VariAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarsAccess().getVariAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__1__Impl"


    // $ANTLR start "rule__Expr__Group__0"
    // InternalLggeWhile.g:2204:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2208:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // InternalLggeWhile.g:2209:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0"


    // $ANTLR start "rule__Expr__Group__0__Impl"
    // InternalLggeWhile.g:2216:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__ExprbaseAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2220:1: ( ( ( rule__Expr__ExprbaseAssignment_0 ) ) )
            // InternalLggeWhile.g:2221:1: ( ( rule__Expr__ExprbaseAssignment_0 ) )
            {
            // InternalLggeWhile.g:2221:1: ( ( rule__Expr__ExprbaseAssignment_0 ) )
            // InternalLggeWhile.g:2222:2: ( rule__Expr__ExprbaseAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getExprbaseAssignment_0()); 
            // InternalLggeWhile.g:2223:2: ( rule__Expr__ExprbaseAssignment_0 )
            // InternalLggeWhile.g:2223:3: rule__Expr__ExprbaseAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expr__ExprbaseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getExprbaseAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__0__Impl"


    // $ANTLR start "rule__Expr__Group__1"
    // InternalLggeWhile.g:2231:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2235:1: ( rule__Expr__Group__1__Impl )
            // InternalLggeWhile.g:2236:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1"


    // $ANTLR start "rule__Expr__Group__1__Impl"
    // InternalLggeWhile.g:2242:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )? ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2246:1: ( ( ( rule__Expr__Group_1__0 )? ) )
            // InternalLggeWhile.g:2247:1: ( ( rule__Expr__Group_1__0 )? )
            {
            // InternalLggeWhile.g:2247:1: ( ( rule__Expr__Group_1__0 )? )
            // InternalLggeWhile.g:2248:2: ( rule__Expr__Group_1__0 )?
            {
             before(grammarAccess.getExprAccess().getGroup_1()); 
            // InternalLggeWhile.g:2249:2: ( rule__Expr__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLggeWhile.g:2249:3: rule__Expr__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expr__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__0"
    // InternalLggeWhile.g:2258:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2262:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // InternalLggeWhile.g:2263:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0"


    // $ANTLR start "rule__Expr__Group_1__0__Impl"
    // InternalLggeWhile.g:2270:1: rule__Expr__Group_1__0__Impl : ( '=?' ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2274:1: ( ( '=?' ) )
            // InternalLggeWhile.g:2275:1: ( '=?' )
            {
            // InternalLggeWhile.g:2275:1: ( '=?' )
            // InternalLggeWhile.g:2276:2: '=?'
            {
             before(grammarAccess.getExprAccess().getEqualsSignQuestionMarkKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExprAccess().getEqualsSignQuestionMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__0__Impl"


    // $ANTLR start "rule__Expr__Group_1__1"
    // InternalLggeWhile.g:2285:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2289:1: ( rule__Expr__Group_1__1__Impl )
            // InternalLggeWhile.g:2290:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1"


    // $ANTLR start "rule__Expr__Group_1__1__Impl"
    // InternalLggeWhile.g:2296:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__Exprbase1Assignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2300:1: ( ( ( rule__Expr__Exprbase1Assignment_1_1 ) ) )
            // InternalLggeWhile.g:2301:1: ( ( rule__Expr__Exprbase1Assignment_1_1 ) )
            {
            // InternalLggeWhile.g:2301:1: ( ( rule__Expr__Exprbase1Assignment_1_1 ) )
            // InternalLggeWhile.g:2302:2: ( rule__Expr__Exprbase1Assignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getExprbase1Assignment_1_1()); 
            // InternalLggeWhile.g:2303:2: ( rule__Expr__Exprbase1Assignment_1_1 )
            // InternalLggeWhile.g:2303:3: rule__Expr__Exprbase1Assignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expr__Exprbase1Assignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getExprbase1Assignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Group_1__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_3__0"
    // InternalLggeWhile.g:2312:1: rule__ExprBase__Group_3__0 : rule__ExprBase__Group_3__0__Impl rule__ExprBase__Group_3__1 ;
    public final void rule__ExprBase__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2316:1: ( rule__ExprBase__Group_3__0__Impl rule__ExprBase__Group_3__1 )
            // InternalLggeWhile.g:2317:2: rule__ExprBase__Group_3__0__Impl rule__ExprBase__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__ExprBase__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_3__0"


    // $ANTLR start "rule__ExprBase__Group_3__0__Impl"
    // InternalLggeWhile.g:2324:1: rule__ExprBase__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2328:1: ( ( '(' ) )
            // InternalLggeWhile.g:2329:1: ( '(' )
            {
            // InternalLggeWhile.g:2329:1: ( '(' )
            // InternalLggeWhile.g:2330:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_3__0__Impl"


    // $ANTLR start "rule__ExprBase__Group_3__1"
    // InternalLggeWhile.g:2339:1: rule__ExprBase__Group_3__1 : rule__ExprBase__Group_3__1__Impl rule__ExprBase__Group_3__2 ;
    public final void rule__ExprBase__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2343:1: ( rule__ExprBase__Group_3__1__Impl rule__ExprBase__Group_3__2 )
            // InternalLggeWhile.g:2344:2: rule__ExprBase__Group_3__1__Impl rule__ExprBase__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ExprBase__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_3__1"


    // $ANTLR start "rule__ExprBase__Group_3__1__Impl"
    // InternalLggeWhile.g:2351:1: rule__ExprBase__Group_3__1__Impl : ( ( rule__ExprBase__IdentitorAssignment_3_1 ) ) ;
    public final void rule__ExprBase__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2355:1: ( ( ( rule__ExprBase__IdentitorAssignment_3_1 ) ) )
            // InternalLggeWhile.g:2356:1: ( ( rule__ExprBase__IdentitorAssignment_3_1 ) )
            {
            // InternalLggeWhile.g:2356:1: ( ( rule__ExprBase__IdentitorAssignment_3_1 ) )
            // InternalLggeWhile.g:2357:2: ( rule__ExprBase__IdentitorAssignment_3_1 )
            {
             before(grammarAccess.getExprBaseAccess().getIdentitorAssignment_3_1()); 
            // InternalLggeWhile.g:2358:2: ( rule__ExprBase__IdentitorAssignment_3_1 )
            // InternalLggeWhile.g:2358:3: rule__ExprBase__IdentitorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__IdentitorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getIdentitorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_3__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_3__2"
    // InternalLggeWhile.g:2366:1: rule__ExprBase__Group_3__2 : rule__ExprBase__Group_3__2__Impl rule__ExprBase__Group_3__3 ;
    public final void rule__ExprBase__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2370:1: ( rule__ExprBase__Group_3__2__Impl rule__ExprBase__Group_3__3 )
            // InternalLggeWhile.g:2371:2: rule__ExprBase__Group_3__2__Impl rule__ExprBase__Group_3__3
            {
            pushFollow(FOLLOW_25);
            rule__ExprBase__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_3__2"


    // $ANTLR start "rule__ExprBase__Group_3__2__Impl"
    // InternalLggeWhile.g:2378:1: rule__ExprBase__Group_3__2__Impl : ( ( rule__ExprBase__LexprAssignment_3_2 ) ) ;
    public final void rule__ExprBase__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2382:1: ( ( ( rule__ExprBase__LexprAssignment_3_2 ) ) )
            // InternalLggeWhile.g:2383:1: ( ( rule__ExprBase__LexprAssignment_3_2 ) )
            {
            // InternalLggeWhile.g:2383:1: ( ( rule__ExprBase__LexprAssignment_3_2 ) )
            // InternalLggeWhile.g:2384:2: ( rule__ExprBase__LexprAssignment_3_2 )
            {
             before(grammarAccess.getExprBaseAccess().getLexprAssignment_3_2()); 
            // InternalLggeWhile.g:2385:2: ( rule__ExprBase__LexprAssignment_3_2 )
            // InternalLggeWhile.g:2385:3: rule__ExprBase__LexprAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__LexprAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getLexprAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_3__2__Impl"


    // $ANTLR start "rule__ExprBase__Group_3__3"
    // InternalLggeWhile.g:2393:1: rule__ExprBase__Group_3__3 : rule__ExprBase__Group_3__3__Impl ;
    public final void rule__ExprBase__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2397:1: ( rule__ExprBase__Group_3__3__Impl )
            // InternalLggeWhile.g:2398:2: rule__ExprBase__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_3__3"


    // $ANTLR start "rule__ExprBase__Group_3__3__Impl"
    // InternalLggeWhile.g:2404:1: rule__ExprBase__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2408:1: ( ( ')' ) )
            // InternalLggeWhile.g:2409:1: ( ')' )
            {
            // InternalLggeWhile.g:2409:1: ( ')' )
            // InternalLggeWhile.g:2410:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_3_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_3__3__Impl"


    // $ANTLR start "rule__ExprBase__Group_4__0"
    // InternalLggeWhile.g:2420:1: rule__ExprBase__Group_4__0 : rule__ExprBase__Group_4__0__Impl rule__ExprBase__Group_4__1 ;
    public final void rule__ExprBase__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2424:1: ( rule__ExprBase__Group_4__0__Impl rule__ExprBase__Group_4__1 )
            // InternalLggeWhile.g:2425:2: rule__ExprBase__Group_4__0__Impl rule__ExprBase__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__ExprBase__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_4__0"


    // $ANTLR start "rule__ExprBase__Group_4__0__Impl"
    // InternalLggeWhile.g:2432:1: rule__ExprBase__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2436:1: ( ( '(' ) )
            // InternalLggeWhile.g:2437:1: ( '(' )
            {
            // InternalLggeWhile.g:2437:1: ( '(' )
            // InternalLggeWhile.g:2438:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_4__0__Impl"


    // $ANTLR start "rule__ExprBase__Group_4__1"
    // InternalLggeWhile.g:2447:1: rule__ExprBase__Group_4__1 : rule__ExprBase__Group_4__1__Impl rule__ExprBase__Group_4__2 ;
    public final void rule__ExprBase__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2451:1: ( rule__ExprBase__Group_4__1__Impl rule__ExprBase__Group_4__2 )
            // InternalLggeWhile.g:2452:2: rule__ExprBase__Group_4__1__Impl rule__ExprBase__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__ExprBase__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_4__1"


    // $ANTLR start "rule__ExprBase__Group_4__1__Impl"
    // InternalLggeWhile.g:2459:1: rule__ExprBase__Group_4__1__Impl : ( ( rule__ExprBase__IdentitorAssignment_4_1 ) ) ;
    public final void rule__ExprBase__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2463:1: ( ( ( rule__ExprBase__IdentitorAssignment_4_1 ) ) )
            // InternalLggeWhile.g:2464:1: ( ( rule__ExprBase__IdentitorAssignment_4_1 ) )
            {
            // InternalLggeWhile.g:2464:1: ( ( rule__ExprBase__IdentitorAssignment_4_1 ) )
            // InternalLggeWhile.g:2465:2: ( rule__ExprBase__IdentitorAssignment_4_1 )
            {
             before(grammarAccess.getExprBaseAccess().getIdentitorAssignment_4_1()); 
            // InternalLggeWhile.g:2466:2: ( rule__ExprBase__IdentitorAssignment_4_1 )
            // InternalLggeWhile.g:2466:3: rule__ExprBase__IdentitorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__IdentitorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getIdentitorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_4__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_4__2"
    // InternalLggeWhile.g:2474:1: rule__ExprBase__Group_4__2 : rule__ExprBase__Group_4__2__Impl rule__ExprBase__Group_4__3 ;
    public final void rule__ExprBase__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2478:1: ( rule__ExprBase__Group_4__2__Impl rule__ExprBase__Group_4__3 )
            // InternalLggeWhile.g:2479:2: rule__ExprBase__Group_4__2__Impl rule__ExprBase__Group_4__3
            {
            pushFollow(FOLLOW_25);
            rule__ExprBase__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_4__2"


    // $ANTLR start "rule__ExprBase__Group_4__2__Impl"
    // InternalLggeWhile.g:2486:1: rule__ExprBase__Group_4__2__Impl : ( ( rule__ExprBase__LexprAssignment_4_2 ) ) ;
    public final void rule__ExprBase__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2490:1: ( ( ( rule__ExprBase__LexprAssignment_4_2 ) ) )
            // InternalLggeWhile.g:2491:1: ( ( rule__ExprBase__LexprAssignment_4_2 ) )
            {
            // InternalLggeWhile.g:2491:1: ( ( rule__ExprBase__LexprAssignment_4_2 ) )
            // InternalLggeWhile.g:2492:2: ( rule__ExprBase__LexprAssignment_4_2 )
            {
             before(grammarAccess.getExprBaseAccess().getLexprAssignment_4_2()); 
            // InternalLggeWhile.g:2493:2: ( rule__ExprBase__LexprAssignment_4_2 )
            // InternalLggeWhile.g:2493:3: rule__ExprBase__LexprAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__LexprAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getLexprAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_4__2__Impl"


    // $ANTLR start "rule__ExprBase__Group_4__3"
    // InternalLggeWhile.g:2501:1: rule__ExprBase__Group_4__3 : rule__ExprBase__Group_4__3__Impl ;
    public final void rule__ExprBase__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2505:1: ( rule__ExprBase__Group_4__3__Impl )
            // InternalLggeWhile.g:2506:2: rule__ExprBase__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_4__3"


    // $ANTLR start "rule__ExprBase__Group_4__3__Impl"
    // InternalLggeWhile.g:2512:1: rule__ExprBase__Group_4__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2516:1: ( ( ')' ) )
            // InternalLggeWhile.g:2517:1: ( ')' )
            {
            // InternalLggeWhile.g:2517:1: ( ')' )
            // InternalLggeWhile.g:2518:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_4_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_4__3__Impl"


    // $ANTLR start "rule__ExprBase__Group_5__0"
    // InternalLggeWhile.g:2528:1: rule__ExprBase__Group_5__0 : rule__ExprBase__Group_5__0__Impl rule__ExprBase__Group_5__1 ;
    public final void rule__ExprBase__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2532:1: ( rule__ExprBase__Group_5__0__Impl rule__ExprBase__Group_5__1 )
            // InternalLggeWhile.g:2533:2: rule__ExprBase__Group_5__0__Impl rule__ExprBase__Group_5__1
            {
            pushFollow(FOLLOW_27);
            rule__ExprBase__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_5__0"


    // $ANTLR start "rule__ExprBase__Group_5__0__Impl"
    // InternalLggeWhile.g:2540:1: rule__ExprBase__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2544:1: ( ( '(' ) )
            // InternalLggeWhile.g:2545:1: ( '(' )
            {
            // InternalLggeWhile.g:2545:1: ( '(' )
            // InternalLggeWhile.g:2546:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_5__0__Impl"


    // $ANTLR start "rule__ExprBase__Group_5__1"
    // InternalLggeWhile.g:2555:1: rule__ExprBase__Group_5__1 : rule__ExprBase__Group_5__1__Impl rule__ExprBase__Group_5__2 ;
    public final void rule__ExprBase__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2559:1: ( rule__ExprBase__Group_5__1__Impl rule__ExprBase__Group_5__2 )
            // InternalLggeWhile.g:2560:2: rule__ExprBase__Group_5__1__Impl rule__ExprBase__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__ExprBase__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_5__1"


    // $ANTLR start "rule__ExprBase__Group_5__1__Impl"
    // InternalLggeWhile.g:2567:1: rule__ExprBase__Group_5__1__Impl : ( ( rule__ExprBase__Identitor1Assignment_5_1 ) ) ;
    public final void rule__ExprBase__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2571:1: ( ( ( rule__ExprBase__Identitor1Assignment_5_1 ) ) )
            // InternalLggeWhile.g:2572:1: ( ( rule__ExprBase__Identitor1Assignment_5_1 ) )
            {
            // InternalLggeWhile.g:2572:1: ( ( rule__ExprBase__Identitor1Assignment_5_1 ) )
            // InternalLggeWhile.g:2573:2: ( rule__ExprBase__Identitor1Assignment_5_1 )
            {
             before(grammarAccess.getExprBaseAccess().getIdentitor1Assignment_5_1()); 
            // InternalLggeWhile.g:2574:2: ( rule__ExprBase__Identitor1Assignment_5_1 )
            // InternalLggeWhile.g:2574:3: rule__ExprBase__Identitor1Assignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Identitor1Assignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getIdentitor1Assignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_5__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_5__2"
    // InternalLggeWhile.g:2582:1: rule__ExprBase__Group_5__2 : rule__ExprBase__Group_5__2__Impl rule__ExprBase__Group_5__3 ;
    public final void rule__ExprBase__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2586:1: ( rule__ExprBase__Group_5__2__Impl rule__ExprBase__Group_5__3 )
            // InternalLggeWhile.g:2587:2: rule__ExprBase__Group_5__2__Impl rule__ExprBase__Group_5__3
            {
            pushFollow(FOLLOW_25);
            rule__ExprBase__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_5__2"


    // $ANTLR start "rule__ExprBase__Group_5__2__Impl"
    // InternalLggeWhile.g:2594:1: rule__ExprBase__Group_5__2__Impl : ( ( rule__ExprBase__ExprAssignment_5_2 ) ) ;
    public final void rule__ExprBase__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2598:1: ( ( ( rule__ExprBase__ExprAssignment_5_2 ) ) )
            // InternalLggeWhile.g:2599:1: ( ( rule__ExprBase__ExprAssignment_5_2 ) )
            {
            // InternalLggeWhile.g:2599:1: ( ( rule__ExprBase__ExprAssignment_5_2 ) )
            // InternalLggeWhile.g:2600:2: ( rule__ExprBase__ExprAssignment_5_2 )
            {
             before(grammarAccess.getExprBaseAccess().getExprAssignment_5_2()); 
            // InternalLggeWhile.g:2601:2: ( rule__ExprBase__ExprAssignment_5_2 )
            // InternalLggeWhile.g:2601:3: rule__ExprBase__ExprAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__ExprAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getExprAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_5__2__Impl"


    // $ANTLR start "rule__ExprBase__Group_5__3"
    // InternalLggeWhile.g:2609:1: rule__ExprBase__Group_5__3 : rule__ExprBase__Group_5__3__Impl ;
    public final void rule__ExprBase__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2613:1: ( rule__ExprBase__Group_5__3__Impl )
            // InternalLggeWhile.g:2614:2: rule__ExprBase__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_5__3"


    // $ANTLR start "rule__ExprBase__Group_5__3__Impl"
    // InternalLggeWhile.g:2620:1: rule__ExprBase__Group_5__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2624:1: ( ( ')' ) )
            // InternalLggeWhile.g:2625:1: ( ')' )
            {
            // InternalLggeWhile.g:2625:1: ( ')' )
            // InternalLggeWhile.g:2626:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_5_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_5__3__Impl"


    // $ANTLR start "rule__ExprBase__Group_6__0"
    // InternalLggeWhile.g:2636:1: rule__ExprBase__Group_6__0 : rule__ExprBase__Group_6__0__Impl rule__ExprBase__Group_6__1 ;
    public final void rule__ExprBase__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2640:1: ( rule__ExprBase__Group_6__0__Impl rule__ExprBase__Group_6__1 )
            // InternalLggeWhile.g:2641:2: rule__ExprBase__Group_6__0__Impl rule__ExprBase__Group_6__1
            {
            pushFollow(FOLLOW_28);
            rule__ExprBase__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_6__0"


    // $ANTLR start "rule__ExprBase__Group_6__0__Impl"
    // InternalLggeWhile.g:2648:1: rule__ExprBase__Group_6__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2652:1: ( ( '(' ) )
            // InternalLggeWhile.g:2653:1: ( '(' )
            {
            // InternalLggeWhile.g:2653:1: ( '(' )
            // InternalLggeWhile.g:2654:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_6__0__Impl"


    // $ANTLR start "rule__ExprBase__Group_6__1"
    // InternalLggeWhile.g:2663:1: rule__ExprBase__Group_6__1 : rule__ExprBase__Group_6__1__Impl rule__ExprBase__Group_6__2 ;
    public final void rule__ExprBase__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2667:1: ( rule__ExprBase__Group_6__1__Impl rule__ExprBase__Group_6__2 )
            // InternalLggeWhile.g:2668:2: rule__ExprBase__Group_6__1__Impl rule__ExprBase__Group_6__2
            {
            pushFollow(FOLLOW_16);
            rule__ExprBase__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_6__1"


    // $ANTLR start "rule__ExprBase__Group_6__1__Impl"
    // InternalLggeWhile.g:2675:1: rule__ExprBase__Group_6__1__Impl : ( ( rule__ExprBase__Identitor1Assignment_6_1 ) ) ;
    public final void rule__ExprBase__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2679:1: ( ( ( rule__ExprBase__Identitor1Assignment_6_1 ) ) )
            // InternalLggeWhile.g:2680:1: ( ( rule__ExprBase__Identitor1Assignment_6_1 ) )
            {
            // InternalLggeWhile.g:2680:1: ( ( rule__ExprBase__Identitor1Assignment_6_1 ) )
            // InternalLggeWhile.g:2681:2: ( rule__ExprBase__Identitor1Assignment_6_1 )
            {
             before(grammarAccess.getExprBaseAccess().getIdentitor1Assignment_6_1()); 
            // InternalLggeWhile.g:2682:2: ( rule__ExprBase__Identitor1Assignment_6_1 )
            // InternalLggeWhile.g:2682:3: rule__ExprBase__Identitor1Assignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Identitor1Assignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getIdentitor1Assignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_6__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_6__2"
    // InternalLggeWhile.g:2690:1: rule__ExprBase__Group_6__2 : rule__ExprBase__Group_6__2__Impl rule__ExprBase__Group_6__3 ;
    public final void rule__ExprBase__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2694:1: ( rule__ExprBase__Group_6__2__Impl rule__ExprBase__Group_6__3 )
            // InternalLggeWhile.g:2695:2: rule__ExprBase__Group_6__2__Impl rule__ExprBase__Group_6__3
            {
            pushFollow(FOLLOW_25);
            rule__ExprBase__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_6__2"


    // $ANTLR start "rule__ExprBase__Group_6__2__Impl"
    // InternalLggeWhile.g:2702:1: rule__ExprBase__Group_6__2__Impl : ( ( rule__ExprBase__ExprAssignment_6_2 ) ) ;
    public final void rule__ExprBase__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2706:1: ( ( ( rule__ExprBase__ExprAssignment_6_2 ) ) )
            // InternalLggeWhile.g:2707:1: ( ( rule__ExprBase__ExprAssignment_6_2 ) )
            {
            // InternalLggeWhile.g:2707:1: ( ( rule__ExprBase__ExprAssignment_6_2 ) )
            // InternalLggeWhile.g:2708:2: ( rule__ExprBase__ExprAssignment_6_2 )
            {
             before(grammarAccess.getExprBaseAccess().getExprAssignment_6_2()); 
            // InternalLggeWhile.g:2709:2: ( rule__ExprBase__ExprAssignment_6_2 )
            // InternalLggeWhile.g:2709:3: rule__ExprBase__ExprAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__ExprAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getExprAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_6__2__Impl"


    // $ANTLR start "rule__ExprBase__Group_6__3"
    // InternalLggeWhile.g:2717:1: rule__ExprBase__Group_6__3 : rule__ExprBase__Group_6__3__Impl ;
    public final void rule__ExprBase__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2721:1: ( rule__ExprBase__Group_6__3__Impl )
            // InternalLggeWhile.g:2722:2: rule__ExprBase__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_6__3"


    // $ANTLR start "rule__ExprBase__Group_6__3__Impl"
    // InternalLggeWhile.g:2728:1: rule__ExprBase__Group_6__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2732:1: ( ( ')' ) )
            // InternalLggeWhile.g:2733:1: ( ')' )
            {
            // InternalLggeWhile.g:2733:1: ( ')' )
            // InternalLggeWhile.g:2734:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_6_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_6__3__Impl"


    // $ANTLR start "rule__ExprBase__Group_7__0"
    // InternalLggeWhile.g:2744:1: rule__ExprBase__Group_7__0 : rule__ExprBase__Group_7__0__Impl rule__ExprBase__Group_7__1 ;
    public final void rule__ExprBase__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2748:1: ( rule__ExprBase__Group_7__0__Impl rule__ExprBase__Group_7__1 )
            // InternalLggeWhile.g:2749:2: rule__ExprBase__Group_7__0__Impl rule__ExprBase__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__ExprBase__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_7__0"


    // $ANTLR start "rule__ExprBase__Group_7__0__Impl"
    // InternalLggeWhile.g:2756:1: rule__ExprBase__Group_7__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2760:1: ( ( '(' ) )
            // InternalLggeWhile.g:2761:1: ( '(' )
            {
            // InternalLggeWhile.g:2761:1: ( '(' )
            // InternalLggeWhile.g:2762:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_7__0__Impl"


    // $ANTLR start "rule__ExprBase__Group_7__1"
    // InternalLggeWhile.g:2771:1: rule__ExprBase__Group_7__1 : rule__ExprBase__Group_7__1__Impl rule__ExprBase__Group_7__2 ;
    public final void rule__ExprBase__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2775:1: ( rule__ExprBase__Group_7__1__Impl rule__ExprBase__Group_7__2 )
            // InternalLggeWhile.g:2776:2: rule__ExprBase__Group_7__1__Impl rule__ExprBase__Group_7__2
            {
            pushFollow(FOLLOW_16);
            rule__ExprBase__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_7__1"


    // $ANTLR start "rule__ExprBase__Group_7__1__Impl"
    // InternalLggeWhile.g:2783:1: rule__ExprBase__Group_7__1__Impl : ( ( rule__ExprBase__SymbolAssignment_7_1 ) ) ;
    public final void rule__ExprBase__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2787:1: ( ( ( rule__ExprBase__SymbolAssignment_7_1 ) ) )
            // InternalLggeWhile.g:2788:1: ( ( rule__ExprBase__SymbolAssignment_7_1 ) )
            {
            // InternalLggeWhile.g:2788:1: ( ( rule__ExprBase__SymbolAssignment_7_1 ) )
            // InternalLggeWhile.g:2789:2: ( rule__ExprBase__SymbolAssignment_7_1 )
            {
             before(grammarAccess.getExprBaseAccess().getSymbolAssignment_7_1()); 
            // InternalLggeWhile.g:2790:2: ( rule__ExprBase__SymbolAssignment_7_1 )
            // InternalLggeWhile.g:2790:3: rule__ExprBase__SymbolAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__SymbolAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getSymbolAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_7__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_7__2"
    // InternalLggeWhile.g:2798:1: rule__ExprBase__Group_7__2 : rule__ExprBase__Group_7__2__Impl rule__ExprBase__Group_7__3 ;
    public final void rule__ExprBase__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2802:1: ( rule__ExprBase__Group_7__2__Impl rule__ExprBase__Group_7__3 )
            // InternalLggeWhile.g:2803:2: rule__ExprBase__Group_7__2__Impl rule__ExprBase__Group_7__3
            {
            pushFollow(FOLLOW_25);
            rule__ExprBase__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_7__2"


    // $ANTLR start "rule__ExprBase__Group_7__2__Impl"
    // InternalLggeWhile.g:2810:1: rule__ExprBase__Group_7__2__Impl : ( ( rule__ExprBase__LexprAssignment_7_2 ) ) ;
    public final void rule__ExprBase__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2814:1: ( ( ( rule__ExprBase__LexprAssignment_7_2 ) ) )
            // InternalLggeWhile.g:2815:1: ( ( rule__ExprBase__LexprAssignment_7_2 ) )
            {
            // InternalLggeWhile.g:2815:1: ( ( rule__ExprBase__LexprAssignment_7_2 ) )
            // InternalLggeWhile.g:2816:2: ( rule__ExprBase__LexprAssignment_7_2 )
            {
             before(grammarAccess.getExprBaseAccess().getLexprAssignment_7_2()); 
            // InternalLggeWhile.g:2817:2: ( rule__ExprBase__LexprAssignment_7_2 )
            // InternalLggeWhile.g:2817:3: rule__ExprBase__LexprAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__LexprAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getExprBaseAccess().getLexprAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_7__2__Impl"


    // $ANTLR start "rule__ExprBase__Group_7__3"
    // InternalLggeWhile.g:2825:1: rule__ExprBase__Group_7__3 : rule__ExprBase__Group_7__3__Impl ;
    public final void rule__ExprBase__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2829:1: ( rule__ExprBase__Group_7__3__Impl )
            // InternalLggeWhile.g:2830:2: rule__ExprBase__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_7__3"


    // $ANTLR start "rule__ExprBase__Group_7__3__Impl"
    // InternalLggeWhile.g:2836:1: rule__ExprBase__Group_7__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2840:1: ( ( ')' ) )
            // InternalLggeWhile.g:2841:1: ( ')' )
            {
            // InternalLggeWhile.g:2841:1: ( ')' )
            // InternalLggeWhile.g:2842:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_7_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_7__3__Impl"


    // $ANTLR start "rule__Program__FunctionsAssignment"
    // InternalLggeWhile.g:2852:1: rule__Program__FunctionsAssignment : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2856:1: ( ( ruleFunction ) )
            // InternalLggeWhile.g:2857:2: ( ruleFunction )
            {
            // InternalLggeWhile.g:2857:2: ( ruleFunction )
            // InternalLggeWhile.g:2858:3: ruleFunction
            {
             before(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFunctionsFunctionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FunctionsAssignment"


    // $ANTLR start "rule__Function__SymbolAssignment_1"
    // InternalLggeWhile.g:2867:1: rule__Function__SymbolAssignment_1 : ( RULE_SYMBOL ) ;
    public final void rule__Function__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2871:1: ( ( RULE_SYMBOL ) )
            // InternalLggeWhile.g:2872:2: ( RULE_SYMBOL )
            {
            // InternalLggeWhile.g:2872:2: ( RULE_SYMBOL )
            // InternalLggeWhile.g:2873:3: RULE_SYMBOL
            {
             before(grammarAccess.getFunctionAccess().getSymbolSYMBOLTerminalRuleCall_1_0()); 
            match(input,RULE_SYMBOL,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getSymbolSYMBOLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__SymbolAssignment_1"


    // $ANTLR start "rule__Function__DefinitionAssignment_3"
    // InternalLggeWhile.g:2882:1: rule__Function__DefinitionAssignment_3 : ( ruleDefinition ) ;
    public final void rule__Function__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2886:1: ( ( ruleDefinition ) )
            // InternalLggeWhile.g:2887:2: ( ruleDefinition )
            {
            // InternalLggeWhile.g:2887:2: ( ruleDefinition )
            // InternalLggeWhile.g:2888:3: ruleDefinition
            {
             before(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getDefinitionDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__DefinitionAssignment_3"


    // $ANTLR start "rule__Definition__InputAssignment_1"
    // InternalLggeWhile.g:2897:1: rule__Definition__InputAssignment_1 : ( ruleInput ) ;
    public final void rule__Definition__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2901:1: ( ( ruleInput ) )
            // InternalLggeWhile.g:2902:2: ( ruleInput )
            {
            // InternalLggeWhile.g:2902:2: ( ruleInput )
            // InternalLggeWhile.g:2903:3: ruleInput
            {
             before(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getInputInputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__InputAssignment_1"


    // $ANTLR start "rule__Definition__CommandsAssignment_3"
    // InternalLggeWhile.g:2912:1: rule__Definition__CommandsAssignment_3 : ( ruleCommands ) ;
    public final void rule__Definition__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2916:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:2917:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:2917:2: ( ruleCommands )
            // InternalLggeWhile.g:2918:3: ruleCommands
            {
             before(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getCommandsCommandsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__CommandsAssignment_3"


    // $ANTLR start "rule__Definition__OutputAssignment_6"
    // InternalLggeWhile.g:2927:1: rule__Definition__OutputAssignment_6 : ( ruleOutput ) ;
    public final void rule__Definition__OutputAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2931:1: ( ( ruleOutput ) )
            // InternalLggeWhile.g:2932:2: ( ruleOutput )
            {
            // InternalLggeWhile.g:2932:2: ( ruleOutput )
            // InternalLggeWhile.g:2933:3: ruleOutput
            {
             before(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getOutputOutputParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__OutputAssignment_6"


    // $ANTLR start "rule__Input__VarsAssignment_0"
    // InternalLggeWhile.g:2942:1: rule__Input__VarsAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2946:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:2947:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:2947:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:2948:3: RULE_VARIABLE
            {
             before(grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VarsAssignment_0"


    // $ANTLR start "rule__Input__VarsAssignment_1_1"
    // InternalLggeWhile.g:2957:1: rule__Input__VarsAssignment_1_1 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2961:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:2962:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:2962:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:2963:3: RULE_VARIABLE
            {
             before(grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getInputAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VarsAssignment_1_1"


    // $ANTLR start "rule__Output__VarsAssignment_0"
    // InternalLggeWhile.g:2972:1: rule__Output__VarsAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2976:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:2977:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:2977:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:2978:3: RULE_VARIABLE
            {
             before(grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__VarsAssignment_0"


    // $ANTLR start "rule__Output__VarsAssignment_1_1"
    // InternalLggeWhile.g:2987:1: rule__Output__VarsAssignment_1_1 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2991:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:2992:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:2992:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:2993:3: RULE_VARIABLE
            {
             before(grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getVarsVARIABLETerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__VarsAssignment_1_1"


    // $ANTLR start "rule__Commands__CommandsAssignment_0"
    // InternalLggeWhile.g:3002:1: rule__Commands__CommandsAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__CommandsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3006:1: ( ( ruleCommand ) )
            // InternalLggeWhile.g:3007:2: ( ruleCommand )
            {
            // InternalLggeWhile.g:3007:2: ( ruleCommand )
            // InternalLggeWhile.g:3008:3: ruleCommand
            {
             before(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__CommandsAssignment_0"


    // $ANTLR start "rule__Commands__CommandsAssignment_1_1"
    // InternalLggeWhile.g:3017:1: rule__Commands__CommandsAssignment_1_1 : ( ruleCommand ) ;
    public final void rule__Commands__CommandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3021:1: ( ( ruleCommand ) )
            // InternalLggeWhile.g:3022:2: ( ruleCommand )
            {
            // InternalLggeWhile.g:3022:2: ( ruleCommand )
            // InternalLggeWhile.g:3023:3: ruleCommand
            {
             before(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandsAccess().getCommandsCommandParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__CommandsAssignment_1_1"


    // $ANTLR start "rule__NopCommand__ExprAssignment"
    // InternalLggeWhile.g:3032:1: rule__NopCommand__ExprAssignment : ( ( 'nop' ) ) ;
    public final void rule__NopCommand__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3036:1: ( ( ( 'nop' ) ) )
            // InternalLggeWhile.g:3037:2: ( ( 'nop' ) )
            {
            // InternalLggeWhile.g:3037:2: ( ( 'nop' ) )
            // InternalLggeWhile.g:3038:3: ( 'nop' )
            {
             before(grammarAccess.getNopCommandAccess().getExprNopKeyword_0()); 
            // InternalLggeWhile.g:3039:3: ( 'nop' )
            // InternalLggeWhile.g:3040:4: 'nop'
            {
             before(grammarAccess.getNopCommandAccess().getExprNopKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNopCommandAccess().getExprNopKeyword_0()); 

            }

             after(grammarAccess.getNopCommandAccess().getExprNopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NopCommand__ExprAssignment"


    // $ANTLR start "rule__WhileCommand__ExprAssignment_1"
    // InternalLggeWhile.g:3051:1: rule__WhileCommand__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__WhileCommand__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3055:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3056:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3056:2: ( ruleExpr )
            // InternalLggeWhile.g:3057:3: ruleExpr
            {
             before(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getWhileCommandAccess().getExprExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__ExprAssignment_1"


    // $ANTLR start "rule__WhileCommand__CommandsAssignment_3"
    // InternalLggeWhile.g:3066:1: rule__WhileCommand__CommandsAssignment_3 : ( ruleCommands ) ;
    public final void rule__WhileCommand__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3070:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3071:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3071:2: ( ruleCommands )
            // InternalLggeWhile.g:3072:3: ruleCommands
            {
             before(grammarAccess.getWhileCommandAccess().getCommandsCommandsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getWhileCommandAccess().getCommandsCommandsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileCommand__CommandsAssignment_3"


    // $ANTLR start "rule__IfCommand__ExprAssignment_1"
    // InternalLggeWhile.g:3081:1: rule__IfCommand__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__IfCommand__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3085:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3086:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3086:2: ( ruleExpr )
            // InternalLggeWhile.g:3087:3: ruleExpr
            {
             before(grammarAccess.getIfCommandAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getIfCommandAccess().getExprExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__ExprAssignment_1"


    // $ANTLR start "rule__IfCommand__CommandsAssignment_3"
    // InternalLggeWhile.g:3096:1: rule__IfCommand__CommandsAssignment_3 : ( ruleCommands ) ;
    public final void rule__IfCommand__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3100:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3101:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3101:2: ( ruleCommands )
            // InternalLggeWhile.g:3102:3: ruleCommands
            {
             before(grammarAccess.getIfCommandAccess().getCommandsCommandsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getIfCommandAccess().getCommandsCommandsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__CommandsAssignment_3"


    // $ANTLR start "rule__IfCommand__ElsecommandsAssignment_4_1"
    // InternalLggeWhile.g:3111:1: rule__IfCommand__ElsecommandsAssignment_4_1 : ( ruleCommands ) ;
    public final void rule__IfCommand__ElsecommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3115:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3116:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3116:2: ( ruleCommands )
            // InternalLggeWhile.g:3117:3: ruleCommands
            {
             before(grammarAccess.getIfCommandAccess().getElsecommandsCommandsParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getIfCommandAccess().getElsecommandsCommandsParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfCommand__ElsecommandsAssignment_4_1"


    // $ANTLR start "rule__ForCommand__ExprAssignment_1"
    // InternalLggeWhile.g:3126:1: rule__ForCommand__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__ForCommand__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3130:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3131:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3131:2: ( ruleExpr )
            // InternalLggeWhile.g:3132:3: ruleExpr
            {
             before(grammarAccess.getForCommandAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getForCommandAccess().getExprExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__ExprAssignment_1"


    // $ANTLR start "rule__ForCommand__CommandAssignment_3"
    // InternalLggeWhile.g:3141:1: rule__ForCommand__CommandAssignment_3 : ( ruleCommands ) ;
    public final void rule__ForCommand__CommandAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3145:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3146:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3146:2: ( ruleCommands )
            // InternalLggeWhile.g:3147:3: ruleCommands
            {
             before(grammarAccess.getForCommandAccess().getCommandCommandsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getForCommandAccess().getCommandCommandsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForCommand__CommandAssignment_3"


    // $ANTLR start "rule__AffectCommand__VarsAssignment_0"
    // InternalLggeWhile.g:3156:1: rule__AffectCommand__VarsAssignment_0 : ( ruleVars ) ;
    public final void rule__AffectCommand__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3160:1: ( ( ruleVars ) )
            // InternalLggeWhile.g:3161:2: ( ruleVars )
            {
            // InternalLggeWhile.g:3161:2: ( ruleVars )
            // InternalLggeWhile.g:3162:3: ruleVars
            {
             before(grammarAccess.getAffectCommandAccess().getVarsVarsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVars();

            state._fsp--;

             after(grammarAccess.getAffectCommandAccess().getVarsVarsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectCommand__VarsAssignment_0"


    // $ANTLR start "rule__AffectCommand__ExprsAssignment_2"
    // InternalLggeWhile.g:3171:1: rule__AffectCommand__ExprsAssignment_2 : ( ruleExprs ) ;
    public final void rule__AffectCommand__ExprsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3175:1: ( ( ruleExprs ) )
            // InternalLggeWhile.g:3176:2: ( ruleExprs )
            {
            // InternalLggeWhile.g:3176:2: ( ruleExprs )
            // InternalLggeWhile.g:3177:3: ruleExprs
            {
             before(grammarAccess.getAffectCommandAccess().getExprsExprsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExprs();

            state._fsp--;

             after(grammarAccess.getAffectCommandAccess().getExprsExprsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AffectCommand__ExprsAssignment_2"


    // $ANTLR start "rule__ForeachCommand__VarsAssignment_1"
    // InternalLggeWhile.g:3186:1: rule__ForeachCommand__VarsAssignment_1 : ( ruleVars ) ;
    public final void rule__ForeachCommand__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3190:1: ( ( ruleVars ) )
            // InternalLggeWhile.g:3191:2: ( ruleVars )
            {
            // InternalLggeWhile.g:3191:2: ( ruleVars )
            // InternalLggeWhile.g:3192:3: ruleVars
            {
             before(grammarAccess.getForeachCommandAccess().getVarsVarsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVars();

            state._fsp--;

             after(grammarAccess.getForeachCommandAccess().getVarsVarsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__VarsAssignment_1"


    // $ANTLR start "rule__ForeachCommand__ExprAssignment_3"
    // InternalLggeWhile.g:3201:1: rule__ForeachCommand__ExprAssignment_3 : ( ruleExpr ) ;
    public final void rule__ForeachCommand__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3205:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3206:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3206:2: ( ruleExpr )
            // InternalLggeWhile.g:3207:3: ruleExpr
            {
             before(grammarAccess.getForeachCommandAccess().getExprExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getForeachCommandAccess().getExprExprParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__ExprAssignment_3"


    // $ANTLR start "rule__ForeachCommand__CommandsAssignment_5"
    // InternalLggeWhile.g:3216:1: rule__ForeachCommand__CommandsAssignment_5 : ( ruleCommands ) ;
    public final void rule__ForeachCommand__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3220:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3221:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3221:2: ( ruleCommands )
            // InternalLggeWhile.g:3222:3: ruleCommands
            {
             before(grammarAccess.getForeachCommandAccess().getCommandsCommandsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCommands();

            state._fsp--;

             after(grammarAccess.getForeachCommandAccess().getCommandsCommandsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForeachCommand__CommandsAssignment_5"


    // $ANTLR start "rule__Exprs__ExprAssignment_0"
    // InternalLggeWhile.g:3231:1: rule__Exprs__ExprAssignment_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3235:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3236:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3236:2: ( ruleExpr )
            // InternalLggeWhile.g:3237:3: ruleExpr
            {
             before(grammarAccess.getExprsAccess().getExprExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprsAccess().getExprExprParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExprAssignment_0"


    // $ANTLR start "rule__Exprs__ExprAssignment_1_1"
    // InternalLggeWhile.g:3246:1: rule__Exprs__ExprAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3250:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3251:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3251:2: ( ruleExpr )
            // InternalLggeWhile.g:3252:3: ruleExpr
            {
             before(grammarAccess.getExprsAccess().getExprExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprsAccess().getExprExprParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExprAssignment_1_1"


    // $ANTLR start "rule__Vars__VariAssignment_0"
    // InternalLggeWhile.g:3261:1: rule__Vars__VariAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VariAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3265:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:3266:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:3266:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:3267:3: RULE_VARIABLE
            {
             before(grammarAccess.getVarsAccess().getVariVARIABLETerminalRuleCall_0_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getVarsAccess().getVariVARIABLETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__VariAssignment_0"


    // $ANTLR start "rule__Vars__VariAssignment_1_1"
    // InternalLggeWhile.g:3276:1: rule__Vars__VariAssignment_1_1 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VariAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3280:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:3281:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:3281:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:3282:3: RULE_VARIABLE
            {
             before(grammarAccess.getVarsAccess().getVariVARIABLETerminalRuleCall_1_1_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getVarsAccess().getVariVARIABLETerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__VariAssignment_1_1"


    // $ANTLR start "rule__Expr__ExprbaseAssignment_0"
    // InternalLggeWhile.g:3291:1: rule__Expr__ExprbaseAssignment_0 : ( ruleExprBase ) ;
    public final void rule__Expr__ExprbaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3295:1: ( ( ruleExprBase ) )
            // InternalLggeWhile.g:3296:2: ( ruleExprBase )
            {
            // InternalLggeWhile.g:3296:2: ( ruleExprBase )
            // InternalLggeWhile.g:3297:3: ruleExprBase
            {
             before(grammarAccess.getExprAccess().getExprbaseExprBaseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getExprAccess().getExprbaseExprBaseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExprbaseAssignment_0"


    // $ANTLR start "rule__Expr__Exprbase1Assignment_1_1"
    // InternalLggeWhile.g:3306:1: rule__Expr__Exprbase1Assignment_1_1 : ( ruleExprBase ) ;
    public final void rule__Expr__Exprbase1Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3310:1: ( ( ruleExprBase ) )
            // InternalLggeWhile.g:3311:2: ( ruleExprBase )
            {
            // InternalLggeWhile.g:3311:2: ( ruleExprBase )
            // InternalLggeWhile.g:3312:3: ruleExprBase
            {
             before(grammarAccess.getExprAccess().getExprbase1ExprBaseParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getExprAccess().getExprbase1ExprBaseParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Exprbase1Assignment_1_1"


    // $ANTLR start "rule__LExpr__ExprAssignment"
    // InternalLggeWhile.g:3321:1: rule__LExpr__ExprAssignment : ( ruleExpr ) ;
    public final void rule__LExpr__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3325:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3326:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3326:2: ( ruleExpr )
            // InternalLggeWhile.g:3327:3: ruleExpr
            {
             before(grammarAccess.getLExprAccess().getExprExprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getLExprAccess().getExprExprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LExpr__ExprAssignment"


    // $ANTLR start "rule__ExprBase__ValueAssignment_0"
    // InternalLggeWhile.g:3336:1: rule__ExprBase__ValueAssignment_0 : ( ( 'nil' ) ) ;
    public final void rule__ExprBase__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3340:1: ( ( ( 'nil' ) ) )
            // InternalLggeWhile.g:3341:2: ( ( 'nil' ) )
            {
            // InternalLggeWhile.g:3341:2: ( ( 'nil' ) )
            // InternalLggeWhile.g:3342:3: ( 'nil' )
            {
             before(grammarAccess.getExprBaseAccess().getValueNilKeyword_0_0()); 
            // InternalLggeWhile.g:3343:3: ( 'nil' )
            // InternalLggeWhile.g:3344:4: 'nil'
            {
             before(grammarAccess.getExprBaseAccess().getValueNilKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getValueNilKeyword_0_0()); 

            }

             after(grammarAccess.getExprBaseAccess().getValueNilKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__ValueAssignment_0"


    // $ANTLR start "rule__ExprBase__ValueAssignment_1"
    // InternalLggeWhile.g:3355:1: rule__ExprBase__ValueAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__ExprBase__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3359:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:3360:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:3360:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:3361:3: RULE_VARIABLE
            {
             before(grammarAccess.getExprBaseAccess().getValueVARIABLETerminalRuleCall_1_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getValueVARIABLETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__ValueAssignment_1"


    // $ANTLR start "rule__ExprBase__ValueAssignment_2"
    // InternalLggeWhile.g:3370:1: rule__ExprBase__ValueAssignment_2 : ( RULE_SYMBOL ) ;
    public final void rule__ExprBase__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3374:1: ( ( RULE_SYMBOL ) )
            // InternalLggeWhile.g:3375:2: ( RULE_SYMBOL )
            {
            // InternalLggeWhile.g:3375:2: ( RULE_SYMBOL )
            // InternalLggeWhile.g:3376:3: RULE_SYMBOL
            {
             before(grammarAccess.getExprBaseAccess().getValueSYMBOLTerminalRuleCall_2_0()); 
            match(input,RULE_SYMBOL,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getValueSYMBOLTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__ValueAssignment_2"


    // $ANTLR start "rule__ExprBase__IdentitorAssignment_3_1"
    // InternalLggeWhile.g:3385:1: rule__ExprBase__IdentitorAssignment_3_1 : ( ( 'cons' ) ) ;
    public final void rule__ExprBase__IdentitorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3389:1: ( ( ( 'cons' ) ) )
            // InternalLggeWhile.g:3390:2: ( ( 'cons' ) )
            {
            // InternalLggeWhile.g:3390:2: ( ( 'cons' ) )
            // InternalLggeWhile.g:3391:3: ( 'cons' )
            {
             before(grammarAccess.getExprBaseAccess().getIdentitorConsKeyword_3_1_0()); 
            // InternalLggeWhile.g:3392:3: ( 'cons' )
            // InternalLggeWhile.g:3393:4: 'cons'
            {
             before(grammarAccess.getExprBaseAccess().getIdentitorConsKeyword_3_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getIdentitorConsKeyword_3_1_0()); 

            }

             after(grammarAccess.getExprBaseAccess().getIdentitorConsKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__IdentitorAssignment_3_1"


    // $ANTLR start "rule__ExprBase__LexprAssignment_3_2"
    // InternalLggeWhile.g:3404:1: rule__ExprBase__LexprAssignment_3_2 : ( ruleLExpr ) ;
    public final void rule__ExprBase__LexprAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3408:1: ( ( ruleLExpr ) )
            // InternalLggeWhile.g:3409:2: ( ruleLExpr )
            {
            // InternalLggeWhile.g:3409:2: ( ruleLExpr )
            // InternalLggeWhile.g:3410:3: ruleLExpr
            {
             before(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__LexprAssignment_3_2"


    // $ANTLR start "rule__ExprBase__IdentitorAssignment_4_1"
    // InternalLggeWhile.g:3419:1: rule__ExprBase__IdentitorAssignment_4_1 : ( ( 'list' ) ) ;
    public final void rule__ExprBase__IdentitorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3423:1: ( ( ( 'list' ) ) )
            // InternalLggeWhile.g:3424:2: ( ( 'list' ) )
            {
            // InternalLggeWhile.g:3424:2: ( ( 'list' ) )
            // InternalLggeWhile.g:3425:3: ( 'list' )
            {
             before(grammarAccess.getExprBaseAccess().getIdentitorListKeyword_4_1_0()); 
            // InternalLggeWhile.g:3426:3: ( 'list' )
            // InternalLggeWhile.g:3427:4: 'list'
            {
             before(grammarAccess.getExprBaseAccess().getIdentitorListKeyword_4_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getIdentitorListKeyword_4_1_0()); 

            }

             after(grammarAccess.getExprBaseAccess().getIdentitorListKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__IdentitorAssignment_4_1"


    // $ANTLR start "rule__ExprBase__LexprAssignment_4_2"
    // InternalLggeWhile.g:3438:1: rule__ExprBase__LexprAssignment_4_2 : ( ruleLExpr ) ;
    public final void rule__ExprBase__LexprAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3442:1: ( ( ruleLExpr ) )
            // InternalLggeWhile.g:3443:2: ( ruleLExpr )
            {
            // InternalLggeWhile.g:3443:2: ( ruleLExpr )
            // InternalLggeWhile.g:3444:3: ruleLExpr
            {
             before(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__LexprAssignment_4_2"


    // $ANTLR start "rule__ExprBase__Identitor1Assignment_5_1"
    // InternalLggeWhile.g:3453:1: rule__ExprBase__Identitor1Assignment_5_1 : ( ( 'hd' ) ) ;
    public final void rule__ExprBase__Identitor1Assignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3457:1: ( ( ( 'hd' ) ) )
            // InternalLggeWhile.g:3458:2: ( ( 'hd' ) )
            {
            // InternalLggeWhile.g:3458:2: ( ( 'hd' ) )
            // InternalLggeWhile.g:3459:3: ( 'hd' )
            {
             before(grammarAccess.getExprBaseAccess().getIdentitor1HdKeyword_5_1_0()); 
            // InternalLggeWhile.g:3460:3: ( 'hd' )
            // InternalLggeWhile.g:3461:4: 'hd'
            {
             before(grammarAccess.getExprBaseAccess().getIdentitor1HdKeyword_5_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getIdentitor1HdKeyword_5_1_0()); 

            }

             after(grammarAccess.getExprBaseAccess().getIdentitor1HdKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Identitor1Assignment_5_1"


    // $ANTLR start "rule__ExprBase__ExprAssignment_5_2"
    // InternalLggeWhile.g:3472:1: rule__ExprBase__ExprAssignment_5_2 : ( ruleExpr ) ;
    public final void rule__ExprBase__ExprAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3476:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3477:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3477:2: ( ruleExpr )
            // InternalLggeWhile.g:3478:3: ruleExpr
            {
             before(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__ExprAssignment_5_2"


    // $ANTLR start "rule__ExprBase__Identitor1Assignment_6_1"
    // InternalLggeWhile.g:3487:1: rule__ExprBase__Identitor1Assignment_6_1 : ( ( 'tl' ) ) ;
    public final void rule__ExprBase__Identitor1Assignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3491:1: ( ( ( 'tl' ) ) )
            // InternalLggeWhile.g:3492:2: ( ( 'tl' ) )
            {
            // InternalLggeWhile.g:3492:2: ( ( 'tl' ) )
            // InternalLggeWhile.g:3493:3: ( 'tl' )
            {
             before(grammarAccess.getExprBaseAccess().getIdentitor1TlKeyword_6_1_0()); 
            // InternalLggeWhile.g:3494:3: ( 'tl' )
            // InternalLggeWhile.g:3495:4: 'tl'
            {
             before(grammarAccess.getExprBaseAccess().getIdentitor1TlKeyword_6_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getIdentitor1TlKeyword_6_1_0()); 

            }

             after(grammarAccess.getExprBaseAccess().getIdentitor1TlKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Identitor1Assignment_6_1"


    // $ANTLR start "rule__ExprBase__ExprAssignment_6_2"
    // InternalLggeWhile.g:3506:1: rule__ExprBase__ExprAssignment_6_2 : ( ruleExpr ) ;
    public final void rule__ExprBase__ExprAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3510:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3511:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3511:2: ( ruleExpr )
            // InternalLggeWhile.g:3512:3: ruleExpr
            {
             before(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getExprExprParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__ExprAssignment_6_2"


    // $ANTLR start "rule__ExprBase__SymbolAssignment_7_1"
    // InternalLggeWhile.g:3521:1: rule__ExprBase__SymbolAssignment_7_1 : ( RULE_SYMBOL ) ;
    public final void rule__ExprBase__SymbolAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3525:1: ( ( RULE_SYMBOL ) )
            // InternalLggeWhile.g:3526:2: ( RULE_SYMBOL )
            {
            // InternalLggeWhile.g:3526:2: ( RULE_SYMBOL )
            // InternalLggeWhile.g:3527:3: RULE_SYMBOL
            {
             before(grammarAccess.getExprBaseAccess().getSymbolSYMBOLTerminalRuleCall_7_1_0()); 
            match(input,RULE_SYMBOL,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getSymbolSYMBOLTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__SymbolAssignment_7_1"


    // $ANTLR start "rule__ExprBase__LexprAssignment_7_2"
    // InternalLggeWhile.g:3536:1: rule__ExprBase__LexprAssignment_7_2 : ( ruleLExpr ) ;
    public final void rule__ExprBase__LexprAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3540:1: ( ( ruleLExpr ) )
            // InternalLggeWhile.g:3541:2: ( ruleLExpr )
            {
            // InternalLggeWhile.g:3541:2: ( ruleLExpr )
            // InternalLggeWhile.g:3542:3: ruleLExpr
            {
             before(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getLexprLExprParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__LexprAssignment_7_2"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\4\5\uffff";
    static final String dfa_3s = "\1\43\3\uffff\1\47\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\2\32\uffff\1\4\2\uffff\1\1",
            "",
            "",
            "",
            "\1\11\37\uffff\1\5\1\6\1\7\1\10",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "554:1: rule__ExprBase__Alternatives : ( ( ( rule__ExprBase__ValueAssignment_0 ) ) | ( ( rule__ExprBase__ValueAssignment_1 ) ) | ( ( rule__ExprBase__ValueAssignment_2 ) ) | ( ( rule__ExprBase__Group_3__0 ) ) | ( ( rule__ExprBase__Group_4__0 ) ) | ( ( rule__ExprBase__Group_5__0 ) ) | ( ( rule__ExprBase__Group_6__0 ) ) | ( ( rule__ExprBase__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000900000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000428900020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000900000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});

}