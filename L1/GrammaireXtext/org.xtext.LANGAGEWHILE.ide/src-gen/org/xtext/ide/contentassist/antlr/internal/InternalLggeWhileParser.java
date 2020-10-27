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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_SYMBOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "'while'", "'do'", "'od'", "'if'", "'then'", "'fi'", "'else'", "'for'", "':='", "'foreach'", "'in'", "'=?'", "'nil'", "'('", "'cons'", "')'", "'list'", "'hd'", "'tl'"
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
    public static final int RULE_VARIABLE=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=5;
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


    // $ANTLR start "entryRuleWhileCommand"
    // InternalLggeWhile.g:228:1: entryRuleWhileCommand : ruleWhileCommand EOF ;
    public final void entryRuleWhileCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:229:1: ( ruleWhileCommand EOF )
            // InternalLggeWhile.g:230:1: ruleWhileCommand EOF
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
    // InternalLggeWhile.g:237:1: ruleWhileCommand : ( ( rule__WhileCommand__Group__0 ) ) ;
    public final void ruleWhileCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:241:2: ( ( ( rule__WhileCommand__Group__0 ) ) )
            // InternalLggeWhile.g:242:2: ( ( rule__WhileCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:242:2: ( ( rule__WhileCommand__Group__0 ) )
            // InternalLggeWhile.g:243:3: ( rule__WhileCommand__Group__0 )
            {
             before(grammarAccess.getWhileCommandAccess().getGroup()); 
            // InternalLggeWhile.g:244:3: ( rule__WhileCommand__Group__0 )
            // InternalLggeWhile.g:244:4: rule__WhileCommand__Group__0
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
    // InternalLggeWhile.g:253:1: entryRuleIfCommand : ruleIfCommand EOF ;
    public final void entryRuleIfCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:254:1: ( ruleIfCommand EOF )
            // InternalLggeWhile.g:255:1: ruleIfCommand EOF
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
    // InternalLggeWhile.g:262:1: ruleIfCommand : ( ( rule__IfCommand__Group__0 ) ) ;
    public final void ruleIfCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:266:2: ( ( ( rule__IfCommand__Group__0 ) ) )
            // InternalLggeWhile.g:267:2: ( ( rule__IfCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:267:2: ( ( rule__IfCommand__Group__0 ) )
            // InternalLggeWhile.g:268:3: ( rule__IfCommand__Group__0 )
            {
             before(grammarAccess.getIfCommandAccess().getGroup()); 
            // InternalLggeWhile.g:269:3: ( rule__IfCommand__Group__0 )
            // InternalLggeWhile.g:269:4: rule__IfCommand__Group__0
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
    // InternalLggeWhile.g:278:1: entryRuleForCommand : ruleForCommand EOF ;
    public final void entryRuleForCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:279:1: ( ruleForCommand EOF )
            // InternalLggeWhile.g:280:1: ruleForCommand EOF
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
    // InternalLggeWhile.g:287:1: ruleForCommand : ( ( rule__ForCommand__Group__0 ) ) ;
    public final void ruleForCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:291:2: ( ( ( rule__ForCommand__Group__0 ) ) )
            // InternalLggeWhile.g:292:2: ( ( rule__ForCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:292:2: ( ( rule__ForCommand__Group__0 ) )
            // InternalLggeWhile.g:293:3: ( rule__ForCommand__Group__0 )
            {
             before(grammarAccess.getForCommandAccess().getGroup()); 
            // InternalLggeWhile.g:294:3: ( rule__ForCommand__Group__0 )
            // InternalLggeWhile.g:294:4: rule__ForCommand__Group__0
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
    // InternalLggeWhile.g:303:1: entryRuleAffectCommand : ruleAffectCommand EOF ;
    public final void entryRuleAffectCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:304:1: ( ruleAffectCommand EOF )
            // InternalLggeWhile.g:305:1: ruleAffectCommand EOF
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
    // InternalLggeWhile.g:312:1: ruleAffectCommand : ( ( rule__AffectCommand__Group__0 ) ) ;
    public final void ruleAffectCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:316:2: ( ( ( rule__AffectCommand__Group__0 ) ) )
            // InternalLggeWhile.g:317:2: ( ( rule__AffectCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:317:2: ( ( rule__AffectCommand__Group__0 ) )
            // InternalLggeWhile.g:318:3: ( rule__AffectCommand__Group__0 )
            {
             before(grammarAccess.getAffectCommandAccess().getGroup()); 
            // InternalLggeWhile.g:319:3: ( rule__AffectCommand__Group__0 )
            // InternalLggeWhile.g:319:4: rule__AffectCommand__Group__0
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
    // InternalLggeWhile.g:328:1: entryRuleForeachCommand : ruleForeachCommand EOF ;
    public final void entryRuleForeachCommand() throws RecognitionException {
        try {
            // InternalLggeWhile.g:329:1: ( ruleForeachCommand EOF )
            // InternalLggeWhile.g:330:1: ruleForeachCommand EOF
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
    // InternalLggeWhile.g:337:1: ruleForeachCommand : ( ( rule__ForeachCommand__Group__0 ) ) ;
    public final void ruleForeachCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:341:2: ( ( ( rule__ForeachCommand__Group__0 ) ) )
            // InternalLggeWhile.g:342:2: ( ( rule__ForeachCommand__Group__0 ) )
            {
            // InternalLggeWhile.g:342:2: ( ( rule__ForeachCommand__Group__0 ) )
            // InternalLggeWhile.g:343:3: ( rule__ForeachCommand__Group__0 )
            {
             before(grammarAccess.getForeachCommandAccess().getGroup()); 
            // InternalLggeWhile.g:344:3: ( rule__ForeachCommand__Group__0 )
            // InternalLggeWhile.g:344:4: rule__ForeachCommand__Group__0
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
    // InternalLggeWhile.g:353:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // InternalLggeWhile.g:354:1: ( ruleExprs EOF )
            // InternalLggeWhile.g:355:1: ruleExprs EOF
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
    // InternalLggeWhile.g:362:1: ruleExprs : ( ( rule__Exprs__Group__0 ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:366:2: ( ( ( rule__Exprs__Group__0 ) ) )
            // InternalLggeWhile.g:367:2: ( ( rule__Exprs__Group__0 ) )
            {
            // InternalLggeWhile.g:367:2: ( ( rule__Exprs__Group__0 ) )
            // InternalLggeWhile.g:368:3: ( rule__Exprs__Group__0 )
            {
             before(grammarAccess.getExprsAccess().getGroup()); 
            // InternalLggeWhile.g:369:3: ( rule__Exprs__Group__0 )
            // InternalLggeWhile.g:369:4: rule__Exprs__Group__0
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
    // InternalLggeWhile.g:378:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // InternalLggeWhile.g:379:1: ( ruleVars EOF )
            // InternalLggeWhile.g:380:1: ruleVars EOF
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
    // InternalLggeWhile.g:387:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:391:2: ( ( ( rule__Vars__Group__0 ) ) )
            // InternalLggeWhile.g:392:2: ( ( rule__Vars__Group__0 ) )
            {
            // InternalLggeWhile.g:392:2: ( ( rule__Vars__Group__0 ) )
            // InternalLggeWhile.g:393:3: ( rule__Vars__Group__0 )
            {
             before(grammarAccess.getVarsAccess().getGroup()); 
            // InternalLggeWhile.g:394:3: ( rule__Vars__Group__0 )
            // InternalLggeWhile.g:394:4: rule__Vars__Group__0
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
    // InternalLggeWhile.g:403:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // InternalLggeWhile.g:404:1: ( ruleExpr EOF )
            // InternalLggeWhile.g:405:1: ruleExpr EOF
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
    // InternalLggeWhile.g:412:1: ruleExpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:416:2: ( ( ( rule__Expr__Group__0 ) ) )
            // InternalLggeWhile.g:417:2: ( ( rule__Expr__Group__0 ) )
            {
            // InternalLggeWhile.g:417:2: ( ( rule__Expr__Group__0 ) )
            // InternalLggeWhile.g:418:3: ( rule__Expr__Group__0 )
            {
             before(grammarAccess.getExprAccess().getGroup()); 
            // InternalLggeWhile.g:419:3: ( rule__Expr__Group__0 )
            // InternalLggeWhile.g:419:4: rule__Expr__Group__0
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
    // InternalLggeWhile.g:428:1: entryRuleLExpr : ruleLExpr EOF ;
    public final void entryRuleLExpr() throws RecognitionException {
        try {
            // InternalLggeWhile.g:429:1: ( ruleLExpr EOF )
            // InternalLggeWhile.g:430:1: ruleLExpr EOF
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
    // InternalLggeWhile.g:437:1: ruleLExpr : ( ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* ) ) ;
    public final void ruleLExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:441:2: ( ( ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* ) ) )
            // InternalLggeWhile.g:442:2: ( ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* ) )
            {
            // InternalLggeWhile.g:442:2: ( ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* ) )
            // InternalLggeWhile.g:443:3: ( ( rule__LExpr__ExprAssignment ) ) ( ( rule__LExpr__ExprAssignment )* )
            {
            // InternalLggeWhile.g:443:3: ( ( rule__LExpr__ExprAssignment ) )
            // InternalLggeWhile.g:444:4: ( rule__LExpr__ExprAssignment )
            {
             before(grammarAccess.getLExprAccess().getExprAssignment()); 
            // InternalLggeWhile.g:445:4: ( rule__LExpr__ExprAssignment )
            // InternalLggeWhile.g:445:5: rule__LExpr__ExprAssignment
            {
            pushFollow(FOLLOW_4);
            rule__LExpr__ExprAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLExprAccess().getExprAssignment()); 

            }

            // InternalLggeWhile.g:448:3: ( ( rule__LExpr__ExprAssignment )* )
            // InternalLggeWhile.g:449:4: ( rule__LExpr__ExprAssignment )*
            {
             before(grammarAccess.getLExprAccess().getExprAssignment()); 
            // InternalLggeWhile.g:450:4: ( rule__LExpr__ExprAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_VARIABLE && LA2_0<=RULE_SYMBOL)||(LA2_0>=33 && LA2_0<=34)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLggeWhile.g:450:5: rule__LExpr__ExprAssignment
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
    // InternalLggeWhile.g:460:1: entryRuleExprBase : ruleExprBase EOF ;
    public final void entryRuleExprBase() throws RecognitionException {
        try {
            // InternalLggeWhile.g:461:1: ( ruleExprBase EOF )
            // InternalLggeWhile.g:462:1: ruleExprBase EOF
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
    // InternalLggeWhile.g:469:1: ruleExprBase : ( ( rule__ExprBase__Alternatives ) ) ;
    public final void ruleExprBase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:473:2: ( ( ( rule__ExprBase__Alternatives ) ) )
            // InternalLggeWhile.g:474:2: ( ( rule__ExprBase__Alternatives ) )
            {
            // InternalLggeWhile.g:474:2: ( ( rule__ExprBase__Alternatives ) )
            // InternalLggeWhile.g:475:3: ( rule__ExprBase__Alternatives )
            {
             before(grammarAccess.getExprBaseAccess().getAlternatives()); 
            // InternalLggeWhile.g:476:3: ( rule__ExprBase__Alternatives )
            // InternalLggeWhile.g:476:4: rule__ExprBase__Alternatives
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
    // InternalLggeWhile.g:484:1: rule__Command__Alternatives : ( ( ruleWhileCommand ) | ( ruleIfCommand ) | ( ruleForCommand ) | ( ruleAffectCommand ) | ( ruleForeachCommand ) | ( ( rule__Command__Group_5__0 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:488:1: ( ( ruleWhileCommand ) | ( ruleIfCommand ) | ( ruleForCommand ) | ( ruleAffectCommand ) | ( ruleForeachCommand ) | ( ( rule__Command__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case RULE_VARIABLE:
                {
                alt3=4;
                }
                break;
            case 30:
                {
                alt3=5;
                }
                break;
            case 20:
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
                    // InternalLggeWhile.g:489:2: ( ruleWhileCommand )
                    {
                    // InternalLggeWhile.g:489:2: ( ruleWhileCommand )
                    // InternalLggeWhile.g:490:3: ruleWhileCommand
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
                    // InternalLggeWhile.g:495:2: ( ruleIfCommand )
                    {
                    // InternalLggeWhile.g:495:2: ( ruleIfCommand )
                    // InternalLggeWhile.g:496:3: ruleIfCommand
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
                    // InternalLggeWhile.g:501:2: ( ruleForCommand )
                    {
                    // InternalLggeWhile.g:501:2: ( ruleForCommand )
                    // InternalLggeWhile.g:502:3: ruleForCommand
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
                    // InternalLggeWhile.g:507:2: ( ruleAffectCommand )
                    {
                    // InternalLggeWhile.g:507:2: ( ruleAffectCommand )
                    // InternalLggeWhile.g:508:3: ruleAffectCommand
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
                    // InternalLggeWhile.g:513:2: ( ruleForeachCommand )
                    {
                    // InternalLggeWhile.g:513:2: ( ruleForeachCommand )
                    // InternalLggeWhile.g:514:3: ruleForeachCommand
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
                    // InternalLggeWhile.g:519:2: ( ( rule__Command__Group_5__0 ) )
                    {
                    // InternalLggeWhile.g:519:2: ( ( rule__Command__Group_5__0 ) )
                    // InternalLggeWhile.g:520:3: ( rule__Command__Group_5__0 )
                    {
                     before(grammarAccess.getCommandAccess().getGroup_5()); 
                    // InternalLggeWhile.g:521:3: ( rule__Command__Group_5__0 )
                    // InternalLggeWhile.g:521:4: rule__Command__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Command__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommandAccess().getGroup_5()); 

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
    // InternalLggeWhile.g:529:1: rule__ExprBase__Alternatives : ( ( ( rule__ExprBase__Group_0__0 ) ) | ( ( rule__ExprBase__Group_1__0 ) ) | ( ( rule__ExprBase__Group_2__0 ) ) | ( ( rule__ExprBase__Group_3__0 ) ) | ( ( rule__ExprBase__Group_4__0 ) ) | ( ( rule__ExprBase__Group_5__0 ) ) | ( ( rule__ExprBase__Group_6__0 ) ) | ( ( rule__ExprBase__Group_7__0 ) ) );
    public final void rule__ExprBase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:533:1: ( ( ( rule__ExprBase__Group_0__0 ) ) | ( ( rule__ExprBase__Group_1__0 ) ) | ( ( rule__ExprBase__Group_2__0 ) ) | ( ( rule__ExprBase__Group_3__0 ) ) | ( ( rule__ExprBase__Group_4__0 ) ) | ( ( rule__ExprBase__Group_5__0 ) ) | ( ( rule__ExprBase__Group_6__0 ) ) | ( ( rule__ExprBase__Group_7__0 ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalLggeWhile.g:534:2: ( ( rule__ExprBase__Group_0__0 ) )
                    {
                    // InternalLggeWhile.g:534:2: ( ( rule__ExprBase__Group_0__0 ) )
                    // InternalLggeWhile.g:535:3: ( rule__ExprBase__Group_0__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_0()); 
                    // InternalLggeWhile.g:536:3: ( rule__ExprBase__Group_0__0 )
                    // InternalLggeWhile.g:536:4: rule__ExprBase__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLggeWhile.g:540:2: ( ( rule__ExprBase__Group_1__0 ) )
                    {
                    // InternalLggeWhile.g:540:2: ( ( rule__ExprBase__Group_1__0 ) )
                    // InternalLggeWhile.g:541:3: ( rule__ExprBase__Group_1__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_1()); 
                    // InternalLggeWhile.g:542:3: ( rule__ExprBase__Group_1__0 )
                    // InternalLggeWhile.g:542:4: rule__ExprBase__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLggeWhile.g:546:2: ( ( rule__ExprBase__Group_2__0 ) )
                    {
                    // InternalLggeWhile.g:546:2: ( ( rule__ExprBase__Group_2__0 ) )
                    // InternalLggeWhile.g:547:3: ( rule__ExprBase__Group_2__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_2()); 
                    // InternalLggeWhile.g:548:3: ( rule__ExprBase__Group_2__0 )
                    // InternalLggeWhile.g:548:4: rule__ExprBase__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExprBase__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprBaseAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLggeWhile.g:552:2: ( ( rule__ExprBase__Group_3__0 ) )
                    {
                    // InternalLggeWhile.g:552:2: ( ( rule__ExprBase__Group_3__0 ) )
                    // InternalLggeWhile.g:553:3: ( rule__ExprBase__Group_3__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_3()); 
                    // InternalLggeWhile.g:554:3: ( rule__ExprBase__Group_3__0 )
                    // InternalLggeWhile.g:554:4: rule__ExprBase__Group_3__0
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
                    // InternalLggeWhile.g:558:2: ( ( rule__ExprBase__Group_4__0 ) )
                    {
                    // InternalLggeWhile.g:558:2: ( ( rule__ExprBase__Group_4__0 ) )
                    // InternalLggeWhile.g:559:3: ( rule__ExprBase__Group_4__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_4()); 
                    // InternalLggeWhile.g:560:3: ( rule__ExprBase__Group_4__0 )
                    // InternalLggeWhile.g:560:4: rule__ExprBase__Group_4__0
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
                    // InternalLggeWhile.g:564:2: ( ( rule__ExprBase__Group_5__0 ) )
                    {
                    // InternalLggeWhile.g:564:2: ( ( rule__ExprBase__Group_5__0 ) )
                    // InternalLggeWhile.g:565:3: ( rule__ExprBase__Group_5__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_5()); 
                    // InternalLggeWhile.g:566:3: ( rule__ExprBase__Group_5__0 )
                    // InternalLggeWhile.g:566:4: rule__ExprBase__Group_5__0
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
                    // InternalLggeWhile.g:570:2: ( ( rule__ExprBase__Group_6__0 ) )
                    {
                    // InternalLggeWhile.g:570:2: ( ( rule__ExprBase__Group_6__0 ) )
                    // InternalLggeWhile.g:571:3: ( rule__ExprBase__Group_6__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_6()); 
                    // InternalLggeWhile.g:572:3: ( rule__ExprBase__Group_6__0 )
                    // InternalLggeWhile.g:572:4: rule__ExprBase__Group_6__0
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
                    // InternalLggeWhile.g:576:2: ( ( rule__ExprBase__Group_7__0 ) )
                    {
                    // InternalLggeWhile.g:576:2: ( ( rule__ExprBase__Group_7__0 ) )
                    // InternalLggeWhile.g:577:3: ( rule__ExprBase__Group_7__0 )
                    {
                     before(grammarAccess.getExprBaseAccess().getGroup_7()); 
                    // InternalLggeWhile.g:578:3: ( rule__ExprBase__Group_7__0 )
                    // InternalLggeWhile.g:578:4: rule__ExprBase__Group_7__0
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
    // InternalLggeWhile.g:586:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:590:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalLggeWhile.g:591:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalLggeWhile.g:598:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:602:1: ( ( 'function' ) )
            // InternalLggeWhile.g:603:1: ( 'function' )
            {
            // InternalLggeWhile.g:603:1: ( 'function' )
            // InternalLggeWhile.g:604:2: 'function'
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
    // InternalLggeWhile.g:613:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:617:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalLggeWhile.g:618:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalLggeWhile.g:625:1: rule__Function__Group__1__Impl : ( ( rule__Function__SymbolAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:629:1: ( ( ( rule__Function__SymbolAssignment_1 ) ) )
            // InternalLggeWhile.g:630:1: ( ( rule__Function__SymbolAssignment_1 ) )
            {
            // InternalLggeWhile.g:630:1: ( ( rule__Function__SymbolAssignment_1 ) )
            // InternalLggeWhile.g:631:2: ( rule__Function__SymbolAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getSymbolAssignment_1()); 
            // InternalLggeWhile.g:632:2: ( rule__Function__SymbolAssignment_1 )
            // InternalLggeWhile.g:632:3: rule__Function__SymbolAssignment_1
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
    // InternalLggeWhile.g:640:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:644:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalLggeWhile.g:645:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalLggeWhile.g:652:1: rule__Function__Group__2__Impl : ( ':' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:656:1: ( ( ':' ) )
            // InternalLggeWhile.g:657:1: ( ':' )
            {
            // InternalLggeWhile.g:657:1: ( ':' )
            // InternalLggeWhile.g:658:2: ':'
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
    // InternalLggeWhile.g:667:1: rule__Function__Group__3 : rule__Function__Group__3__Impl ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:671:1: ( rule__Function__Group__3__Impl )
            // InternalLggeWhile.g:672:2: rule__Function__Group__3__Impl
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
    // InternalLggeWhile.g:678:1: rule__Function__Group__3__Impl : ( ( rule__Function__DefinitionAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:682:1: ( ( ( rule__Function__DefinitionAssignment_3 ) ) )
            // InternalLggeWhile.g:683:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            {
            // InternalLggeWhile.g:683:1: ( ( rule__Function__DefinitionAssignment_3 ) )
            // InternalLggeWhile.g:684:2: ( rule__Function__DefinitionAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getDefinitionAssignment_3()); 
            // InternalLggeWhile.g:685:2: ( rule__Function__DefinitionAssignment_3 )
            // InternalLggeWhile.g:685:3: rule__Function__DefinitionAssignment_3
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
    // InternalLggeWhile.g:694:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:698:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalLggeWhile.g:699:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
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
    // InternalLggeWhile.g:706:1: rule__Definition__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:710:1: ( ( 'read' ) )
            // InternalLggeWhile.g:711:1: ( 'read' )
            {
            // InternalLggeWhile.g:711:1: ( 'read' )
            // InternalLggeWhile.g:712:2: 'read'
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
    // InternalLggeWhile.g:721:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:725:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalLggeWhile.g:726:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
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
    // InternalLggeWhile.g:733:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__InputAssignment_1 ) ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:737:1: ( ( ( rule__Definition__InputAssignment_1 ) ) )
            // InternalLggeWhile.g:738:1: ( ( rule__Definition__InputAssignment_1 ) )
            {
            // InternalLggeWhile.g:738:1: ( ( rule__Definition__InputAssignment_1 ) )
            // InternalLggeWhile.g:739:2: ( rule__Definition__InputAssignment_1 )
            {
             before(grammarAccess.getDefinitionAccess().getInputAssignment_1()); 
            // InternalLggeWhile.g:740:2: ( rule__Definition__InputAssignment_1 )
            // InternalLggeWhile.g:740:3: rule__Definition__InputAssignment_1
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
    // InternalLggeWhile.g:748:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl rule__Definition__Group__3 ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:752:1: ( rule__Definition__Group__2__Impl rule__Definition__Group__3 )
            // InternalLggeWhile.g:753:2: rule__Definition__Group__2__Impl rule__Definition__Group__3
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
    // InternalLggeWhile.g:760:1: rule__Definition__Group__2__Impl : ( '%' ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:764:1: ( ( '%' ) )
            // InternalLggeWhile.g:765:1: ( '%' )
            {
            // InternalLggeWhile.g:765:1: ( '%' )
            // InternalLggeWhile.g:766:2: '%'
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
    // InternalLggeWhile.g:775:1: rule__Definition__Group__3 : rule__Definition__Group__3__Impl rule__Definition__Group__4 ;
    public final void rule__Definition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:779:1: ( rule__Definition__Group__3__Impl rule__Definition__Group__4 )
            // InternalLggeWhile.g:780:2: rule__Definition__Group__3__Impl rule__Definition__Group__4
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
    // InternalLggeWhile.g:787:1: rule__Definition__Group__3__Impl : ( ( rule__Definition__CommandsAssignment_3 ) ) ;
    public final void rule__Definition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:791:1: ( ( ( rule__Definition__CommandsAssignment_3 ) ) )
            // InternalLggeWhile.g:792:1: ( ( rule__Definition__CommandsAssignment_3 ) )
            {
            // InternalLggeWhile.g:792:1: ( ( rule__Definition__CommandsAssignment_3 ) )
            // InternalLggeWhile.g:793:2: ( rule__Definition__CommandsAssignment_3 )
            {
             before(grammarAccess.getDefinitionAccess().getCommandsAssignment_3()); 
            // InternalLggeWhile.g:794:2: ( rule__Definition__CommandsAssignment_3 )
            // InternalLggeWhile.g:794:3: rule__Definition__CommandsAssignment_3
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
    // InternalLggeWhile.g:802:1: rule__Definition__Group__4 : rule__Definition__Group__4__Impl rule__Definition__Group__5 ;
    public final void rule__Definition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:806:1: ( rule__Definition__Group__4__Impl rule__Definition__Group__5 )
            // InternalLggeWhile.g:807:2: rule__Definition__Group__4__Impl rule__Definition__Group__5
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
    // InternalLggeWhile.g:814:1: rule__Definition__Group__4__Impl : ( '%' ) ;
    public final void rule__Definition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:818:1: ( ( '%' ) )
            // InternalLggeWhile.g:819:1: ( '%' )
            {
            // InternalLggeWhile.g:819:1: ( '%' )
            // InternalLggeWhile.g:820:2: '%'
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
    // InternalLggeWhile.g:829:1: rule__Definition__Group__5 : rule__Definition__Group__5__Impl rule__Definition__Group__6 ;
    public final void rule__Definition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:833:1: ( rule__Definition__Group__5__Impl rule__Definition__Group__6 )
            // InternalLggeWhile.g:834:2: rule__Definition__Group__5__Impl rule__Definition__Group__6
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
    // InternalLggeWhile.g:841:1: rule__Definition__Group__5__Impl : ( 'write' ) ;
    public final void rule__Definition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:845:1: ( ( 'write' ) )
            // InternalLggeWhile.g:846:1: ( 'write' )
            {
            // InternalLggeWhile.g:846:1: ( 'write' )
            // InternalLggeWhile.g:847:2: 'write'
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
    // InternalLggeWhile.g:856:1: rule__Definition__Group__6 : rule__Definition__Group__6__Impl ;
    public final void rule__Definition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:860:1: ( rule__Definition__Group__6__Impl )
            // InternalLggeWhile.g:861:2: rule__Definition__Group__6__Impl
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
    // InternalLggeWhile.g:867:1: rule__Definition__Group__6__Impl : ( ( rule__Definition__OutputAssignment_6 ) ) ;
    public final void rule__Definition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:871:1: ( ( ( rule__Definition__OutputAssignment_6 ) ) )
            // InternalLggeWhile.g:872:1: ( ( rule__Definition__OutputAssignment_6 ) )
            {
            // InternalLggeWhile.g:872:1: ( ( rule__Definition__OutputAssignment_6 ) )
            // InternalLggeWhile.g:873:2: ( rule__Definition__OutputAssignment_6 )
            {
             before(grammarAccess.getDefinitionAccess().getOutputAssignment_6()); 
            // InternalLggeWhile.g:874:2: ( rule__Definition__OutputAssignment_6 )
            // InternalLggeWhile.g:874:3: rule__Definition__OutputAssignment_6
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
    // InternalLggeWhile.g:883:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:887:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalLggeWhile.g:888:2: rule__Input__Group__0__Impl rule__Input__Group__1
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
    // InternalLggeWhile.g:895:1: rule__Input__Group__0__Impl : ( ( rule__Input__VarsAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:899:1: ( ( ( rule__Input__VarsAssignment_0 ) ) )
            // InternalLggeWhile.g:900:1: ( ( rule__Input__VarsAssignment_0 ) )
            {
            // InternalLggeWhile.g:900:1: ( ( rule__Input__VarsAssignment_0 ) )
            // InternalLggeWhile.g:901:2: ( rule__Input__VarsAssignment_0 )
            {
             before(grammarAccess.getInputAccess().getVarsAssignment_0()); 
            // InternalLggeWhile.g:902:2: ( rule__Input__VarsAssignment_0 )
            // InternalLggeWhile.g:902:3: rule__Input__VarsAssignment_0
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
    // InternalLggeWhile.g:910:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:914:1: ( rule__Input__Group__1__Impl )
            // InternalLggeWhile.g:915:2: rule__Input__Group__1__Impl
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
    // InternalLggeWhile.g:921:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:925:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // InternalLggeWhile.g:926:1: ( ( rule__Input__Group_1__0 )* )
            {
            // InternalLggeWhile.g:926:1: ( ( rule__Input__Group_1__0 )* )
            // InternalLggeWhile.g:927:2: ( rule__Input__Group_1__0 )*
            {
             before(grammarAccess.getInputAccess().getGroup_1()); 
            // InternalLggeWhile.g:928:2: ( rule__Input__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLggeWhile.g:928:3: rule__Input__Group_1__0
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
    // InternalLggeWhile.g:937:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:941:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // InternalLggeWhile.g:942:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
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
    // InternalLggeWhile.g:949:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:953:1: ( ( ',' ) )
            // InternalLggeWhile.g:954:1: ( ',' )
            {
            // InternalLggeWhile.g:954:1: ( ',' )
            // InternalLggeWhile.g:955:2: ','
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
    // InternalLggeWhile.g:964:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:968:1: ( rule__Input__Group_1__1__Impl )
            // InternalLggeWhile.g:969:2: rule__Input__Group_1__1__Impl
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
    // InternalLggeWhile.g:975:1: rule__Input__Group_1__1__Impl : ( ( rule__Input__VarsAssignment_1_1 ) ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:979:1: ( ( ( rule__Input__VarsAssignment_1_1 ) ) )
            // InternalLggeWhile.g:980:1: ( ( rule__Input__VarsAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:980:1: ( ( rule__Input__VarsAssignment_1_1 ) )
            // InternalLggeWhile.g:981:2: ( rule__Input__VarsAssignment_1_1 )
            {
             before(grammarAccess.getInputAccess().getVarsAssignment_1_1()); 
            // InternalLggeWhile.g:982:2: ( rule__Input__VarsAssignment_1_1 )
            // InternalLggeWhile.g:982:3: rule__Input__VarsAssignment_1_1
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
    // InternalLggeWhile.g:991:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:995:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalLggeWhile.g:996:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalLggeWhile.g:1003:1: rule__Output__Group__0__Impl : ( ( rule__Output__VarsAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1007:1: ( ( ( rule__Output__VarsAssignment_0 ) ) )
            // InternalLggeWhile.g:1008:1: ( ( rule__Output__VarsAssignment_0 ) )
            {
            // InternalLggeWhile.g:1008:1: ( ( rule__Output__VarsAssignment_0 ) )
            // InternalLggeWhile.g:1009:2: ( rule__Output__VarsAssignment_0 )
            {
             before(grammarAccess.getOutputAccess().getVarsAssignment_0()); 
            // InternalLggeWhile.g:1010:2: ( rule__Output__VarsAssignment_0 )
            // InternalLggeWhile.g:1010:3: rule__Output__VarsAssignment_0
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
    // InternalLggeWhile.g:1018:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1022:1: ( rule__Output__Group__1__Impl )
            // InternalLggeWhile.g:1023:2: rule__Output__Group__1__Impl
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
    // InternalLggeWhile.g:1029:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1033:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // InternalLggeWhile.g:1034:1: ( ( rule__Output__Group_1__0 )* )
            {
            // InternalLggeWhile.g:1034:1: ( ( rule__Output__Group_1__0 )* )
            // InternalLggeWhile.g:1035:2: ( rule__Output__Group_1__0 )*
            {
             before(grammarAccess.getOutputAccess().getGroup_1()); 
            // InternalLggeWhile.g:1036:2: ( rule__Output__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLggeWhile.g:1036:3: rule__Output__Group_1__0
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
    // InternalLggeWhile.g:1045:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1049:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // InternalLggeWhile.g:1050:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
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
    // InternalLggeWhile.g:1057:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1061:1: ( ( ',' ) )
            // InternalLggeWhile.g:1062:1: ( ',' )
            {
            // InternalLggeWhile.g:1062:1: ( ',' )
            // InternalLggeWhile.g:1063:2: ','
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
    // InternalLggeWhile.g:1072:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1076:1: ( rule__Output__Group_1__1__Impl )
            // InternalLggeWhile.g:1077:2: rule__Output__Group_1__1__Impl
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
    // InternalLggeWhile.g:1083:1: rule__Output__Group_1__1__Impl : ( ( rule__Output__VarsAssignment_1_1 ) ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1087:1: ( ( ( rule__Output__VarsAssignment_1_1 ) ) )
            // InternalLggeWhile.g:1088:1: ( ( rule__Output__VarsAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:1088:1: ( ( rule__Output__VarsAssignment_1_1 ) )
            // InternalLggeWhile.g:1089:2: ( rule__Output__VarsAssignment_1_1 )
            {
             before(grammarAccess.getOutputAccess().getVarsAssignment_1_1()); 
            // InternalLggeWhile.g:1090:2: ( rule__Output__VarsAssignment_1_1 )
            // InternalLggeWhile.g:1090:3: rule__Output__VarsAssignment_1_1
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
    // InternalLggeWhile.g:1099:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1103:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // InternalLggeWhile.g:1104:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
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
    // InternalLggeWhile.g:1111:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__CommandsAssignment_0 ) ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1115:1: ( ( ( rule__Commands__CommandsAssignment_0 ) ) )
            // InternalLggeWhile.g:1116:1: ( ( rule__Commands__CommandsAssignment_0 ) )
            {
            // InternalLggeWhile.g:1116:1: ( ( rule__Commands__CommandsAssignment_0 ) )
            // InternalLggeWhile.g:1117:2: ( rule__Commands__CommandsAssignment_0 )
            {
             before(grammarAccess.getCommandsAccess().getCommandsAssignment_0()); 
            // InternalLggeWhile.g:1118:2: ( rule__Commands__CommandsAssignment_0 )
            // InternalLggeWhile.g:1118:3: rule__Commands__CommandsAssignment_0
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
    // InternalLggeWhile.g:1126:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1130:1: ( rule__Commands__Group__1__Impl )
            // InternalLggeWhile.g:1131:2: rule__Commands__Group__1__Impl
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
    // InternalLggeWhile.g:1137:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )* ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1141:1: ( ( ( rule__Commands__Group_1__0 )* ) )
            // InternalLggeWhile.g:1142:1: ( ( rule__Commands__Group_1__0 )* )
            {
            // InternalLggeWhile.g:1142:1: ( ( rule__Commands__Group_1__0 )* )
            // InternalLggeWhile.g:1143:2: ( rule__Commands__Group_1__0 )*
            {
             before(grammarAccess.getCommandsAccess().getGroup_1()); 
            // InternalLggeWhile.g:1144:2: ( rule__Commands__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLggeWhile.g:1144:3: rule__Commands__Group_1__0
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
    // InternalLggeWhile.g:1153:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1157:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // InternalLggeWhile.g:1158:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
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
    // InternalLggeWhile.g:1165:1: rule__Commands__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1169:1: ( ( ';' ) )
            // InternalLggeWhile.g:1170:1: ( ';' )
            {
            // InternalLggeWhile.g:1170:1: ( ';' )
            // InternalLggeWhile.g:1171:2: ';'
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
    // InternalLggeWhile.g:1180:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1184:1: ( rule__Commands__Group_1__1__Impl )
            // InternalLggeWhile.g:1185:2: rule__Commands__Group_1__1__Impl
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
    // InternalLggeWhile.g:1191:1: rule__Commands__Group_1__1__Impl : ( ( rule__Commands__CommandsAssignment_1_1 ) ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1195:1: ( ( ( rule__Commands__CommandsAssignment_1_1 ) ) )
            // InternalLggeWhile.g:1196:1: ( ( rule__Commands__CommandsAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:1196:1: ( ( rule__Commands__CommandsAssignment_1_1 ) )
            // InternalLggeWhile.g:1197:2: ( rule__Commands__CommandsAssignment_1_1 )
            {
             before(grammarAccess.getCommandsAccess().getCommandsAssignment_1_1()); 
            // InternalLggeWhile.g:1198:2: ( rule__Commands__CommandsAssignment_1_1 )
            // InternalLggeWhile.g:1198:3: rule__Commands__CommandsAssignment_1_1
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


    // $ANTLR start "rule__Command__Group_5__0"
    // InternalLggeWhile.g:1207:1: rule__Command__Group_5__0 : rule__Command__Group_5__0__Impl rule__Command__Group_5__1 ;
    public final void rule__Command__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1211:1: ( rule__Command__Group_5__0__Impl rule__Command__Group_5__1 )
            // InternalLggeWhile.g:1212:2: rule__Command__Group_5__0__Impl rule__Command__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Command__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Command__Group_5__1();

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
    // $ANTLR end "rule__Command__Group_5__0"


    // $ANTLR start "rule__Command__Group_5__0__Impl"
    // InternalLggeWhile.g:1219:1: rule__Command__Group_5__0__Impl : ( () ) ;
    public final void rule__Command__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1223:1: ( ( () ) )
            // InternalLggeWhile.g:1224:1: ( () )
            {
            // InternalLggeWhile.g:1224:1: ( () )
            // InternalLggeWhile.g:1225:2: ()
            {
             before(grammarAccess.getCommandAccess().getCommandAction_5_0()); 
            // InternalLggeWhile.g:1226:2: ()
            // InternalLggeWhile.g:1226:3: 
            {
            }

             after(grammarAccess.getCommandAccess().getCommandAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__0__Impl"


    // $ANTLR start "rule__Command__Group_5__1"
    // InternalLggeWhile.g:1234:1: rule__Command__Group_5__1 : rule__Command__Group_5__1__Impl ;
    public final void rule__Command__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1238:1: ( rule__Command__Group_5__1__Impl )
            // InternalLggeWhile.g:1239:2: rule__Command__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Command__Group_5__1__Impl();

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
    // $ANTLR end "rule__Command__Group_5__1"


    // $ANTLR start "rule__Command__Group_5__1__Impl"
    // InternalLggeWhile.g:1245:1: rule__Command__Group_5__1__Impl : ( 'nop' ) ;
    public final void rule__Command__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1249:1: ( ( 'nop' ) )
            // InternalLggeWhile.g:1250:1: ( 'nop' )
            {
            // InternalLggeWhile.g:1250:1: ( 'nop' )
            // InternalLggeWhile.g:1251:2: 'nop'
            {
             before(grammarAccess.getCommandAccess().getNopKeyword_5_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCommandAccess().getNopKeyword_5_1()); 

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
    // $ANTLR end "rule__Command__Group_5__1__Impl"


    // $ANTLR start "rule__WhileCommand__Group__0"
    // InternalLggeWhile.g:1261:1: rule__WhileCommand__Group__0 : rule__WhileCommand__Group__0__Impl rule__WhileCommand__Group__1 ;
    public final void rule__WhileCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1265:1: ( rule__WhileCommand__Group__0__Impl rule__WhileCommand__Group__1 )
            // InternalLggeWhile.g:1266:2: rule__WhileCommand__Group__0__Impl rule__WhileCommand__Group__1
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
    // InternalLggeWhile.g:1273:1: rule__WhileCommand__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1277:1: ( ( 'while' ) )
            // InternalLggeWhile.g:1278:1: ( 'while' )
            {
            // InternalLggeWhile.g:1278:1: ( 'while' )
            // InternalLggeWhile.g:1279:2: 'while'
            {
             before(grammarAccess.getWhileCommandAccess().getWhileKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalLggeWhile.g:1288:1: rule__WhileCommand__Group__1 : rule__WhileCommand__Group__1__Impl rule__WhileCommand__Group__2 ;
    public final void rule__WhileCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1292:1: ( rule__WhileCommand__Group__1__Impl rule__WhileCommand__Group__2 )
            // InternalLggeWhile.g:1293:2: rule__WhileCommand__Group__1__Impl rule__WhileCommand__Group__2
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
    // InternalLggeWhile.g:1300:1: rule__WhileCommand__Group__1__Impl : ( ( rule__WhileCommand__ExprAssignment_1 ) ) ;
    public final void rule__WhileCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1304:1: ( ( ( rule__WhileCommand__ExprAssignment_1 ) ) )
            // InternalLggeWhile.g:1305:1: ( ( rule__WhileCommand__ExprAssignment_1 ) )
            {
            // InternalLggeWhile.g:1305:1: ( ( rule__WhileCommand__ExprAssignment_1 ) )
            // InternalLggeWhile.g:1306:2: ( rule__WhileCommand__ExprAssignment_1 )
            {
             before(grammarAccess.getWhileCommandAccess().getExprAssignment_1()); 
            // InternalLggeWhile.g:1307:2: ( rule__WhileCommand__ExprAssignment_1 )
            // InternalLggeWhile.g:1307:3: rule__WhileCommand__ExprAssignment_1
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
    // InternalLggeWhile.g:1315:1: rule__WhileCommand__Group__2 : rule__WhileCommand__Group__2__Impl rule__WhileCommand__Group__3 ;
    public final void rule__WhileCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1319:1: ( rule__WhileCommand__Group__2__Impl rule__WhileCommand__Group__3 )
            // InternalLggeWhile.g:1320:2: rule__WhileCommand__Group__2__Impl rule__WhileCommand__Group__3
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
    // InternalLggeWhile.g:1327:1: rule__WhileCommand__Group__2__Impl : ( 'do' ) ;
    public final void rule__WhileCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1331:1: ( ( 'do' ) )
            // InternalLggeWhile.g:1332:1: ( 'do' )
            {
            // InternalLggeWhile.g:1332:1: ( 'do' )
            // InternalLggeWhile.g:1333:2: 'do'
            {
             before(grammarAccess.getWhileCommandAccess().getDoKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLggeWhile.g:1342:1: rule__WhileCommand__Group__3 : rule__WhileCommand__Group__3__Impl rule__WhileCommand__Group__4 ;
    public final void rule__WhileCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1346:1: ( rule__WhileCommand__Group__3__Impl rule__WhileCommand__Group__4 )
            // InternalLggeWhile.g:1347:2: rule__WhileCommand__Group__3__Impl rule__WhileCommand__Group__4
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
    // InternalLggeWhile.g:1354:1: rule__WhileCommand__Group__3__Impl : ( ( rule__WhileCommand__CommandsAssignment_3 ) ) ;
    public final void rule__WhileCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1358:1: ( ( ( rule__WhileCommand__CommandsAssignment_3 ) ) )
            // InternalLggeWhile.g:1359:1: ( ( rule__WhileCommand__CommandsAssignment_3 ) )
            {
            // InternalLggeWhile.g:1359:1: ( ( rule__WhileCommand__CommandsAssignment_3 ) )
            // InternalLggeWhile.g:1360:2: ( rule__WhileCommand__CommandsAssignment_3 )
            {
             before(grammarAccess.getWhileCommandAccess().getCommandsAssignment_3()); 
            // InternalLggeWhile.g:1361:2: ( rule__WhileCommand__CommandsAssignment_3 )
            // InternalLggeWhile.g:1361:3: rule__WhileCommand__CommandsAssignment_3
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
    // InternalLggeWhile.g:1369:1: rule__WhileCommand__Group__4 : rule__WhileCommand__Group__4__Impl ;
    public final void rule__WhileCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1373:1: ( rule__WhileCommand__Group__4__Impl )
            // InternalLggeWhile.g:1374:2: rule__WhileCommand__Group__4__Impl
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
    // InternalLggeWhile.g:1380:1: rule__WhileCommand__Group__4__Impl : ( 'od' ) ;
    public final void rule__WhileCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1384:1: ( ( 'od' ) )
            // InternalLggeWhile.g:1385:1: ( 'od' )
            {
            // InternalLggeWhile.g:1385:1: ( 'od' )
            // InternalLggeWhile.g:1386:2: 'od'
            {
             before(grammarAccess.getWhileCommandAccess().getOdKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalLggeWhile.g:1396:1: rule__IfCommand__Group__0 : rule__IfCommand__Group__0__Impl rule__IfCommand__Group__1 ;
    public final void rule__IfCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1400:1: ( rule__IfCommand__Group__0__Impl rule__IfCommand__Group__1 )
            // InternalLggeWhile.g:1401:2: rule__IfCommand__Group__0__Impl rule__IfCommand__Group__1
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
    // InternalLggeWhile.g:1408:1: rule__IfCommand__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1412:1: ( ( 'if' ) )
            // InternalLggeWhile.g:1413:1: ( 'if' )
            {
            // InternalLggeWhile.g:1413:1: ( 'if' )
            // InternalLggeWhile.g:1414:2: 'if'
            {
             before(grammarAccess.getIfCommandAccess().getIfKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalLggeWhile.g:1423:1: rule__IfCommand__Group__1 : rule__IfCommand__Group__1__Impl rule__IfCommand__Group__2 ;
    public final void rule__IfCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1427:1: ( rule__IfCommand__Group__1__Impl rule__IfCommand__Group__2 )
            // InternalLggeWhile.g:1428:2: rule__IfCommand__Group__1__Impl rule__IfCommand__Group__2
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
    // InternalLggeWhile.g:1435:1: rule__IfCommand__Group__1__Impl : ( ( rule__IfCommand__ExprAssignment_1 ) ) ;
    public final void rule__IfCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1439:1: ( ( ( rule__IfCommand__ExprAssignment_1 ) ) )
            // InternalLggeWhile.g:1440:1: ( ( rule__IfCommand__ExprAssignment_1 ) )
            {
            // InternalLggeWhile.g:1440:1: ( ( rule__IfCommand__ExprAssignment_1 ) )
            // InternalLggeWhile.g:1441:2: ( rule__IfCommand__ExprAssignment_1 )
            {
             before(grammarAccess.getIfCommandAccess().getExprAssignment_1()); 
            // InternalLggeWhile.g:1442:2: ( rule__IfCommand__ExprAssignment_1 )
            // InternalLggeWhile.g:1442:3: rule__IfCommand__ExprAssignment_1
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
    // InternalLggeWhile.g:1450:1: rule__IfCommand__Group__2 : rule__IfCommand__Group__2__Impl rule__IfCommand__Group__3 ;
    public final void rule__IfCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1454:1: ( rule__IfCommand__Group__2__Impl rule__IfCommand__Group__3 )
            // InternalLggeWhile.g:1455:2: rule__IfCommand__Group__2__Impl rule__IfCommand__Group__3
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
    // InternalLggeWhile.g:1462:1: rule__IfCommand__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1466:1: ( ( 'then' ) )
            // InternalLggeWhile.g:1467:1: ( 'then' )
            {
            // InternalLggeWhile.g:1467:1: ( 'then' )
            // InternalLggeWhile.g:1468:2: 'then'
            {
             before(grammarAccess.getIfCommandAccess().getThenKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalLggeWhile.g:1477:1: rule__IfCommand__Group__3 : rule__IfCommand__Group__3__Impl rule__IfCommand__Group__4 ;
    public final void rule__IfCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1481:1: ( rule__IfCommand__Group__3__Impl rule__IfCommand__Group__4 )
            // InternalLggeWhile.g:1482:2: rule__IfCommand__Group__3__Impl rule__IfCommand__Group__4
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
    // InternalLggeWhile.g:1489:1: rule__IfCommand__Group__3__Impl : ( ( rule__IfCommand__CommandsAssignment_3 ) ) ;
    public final void rule__IfCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1493:1: ( ( ( rule__IfCommand__CommandsAssignment_3 ) ) )
            // InternalLggeWhile.g:1494:1: ( ( rule__IfCommand__CommandsAssignment_3 ) )
            {
            // InternalLggeWhile.g:1494:1: ( ( rule__IfCommand__CommandsAssignment_3 ) )
            // InternalLggeWhile.g:1495:2: ( rule__IfCommand__CommandsAssignment_3 )
            {
             before(grammarAccess.getIfCommandAccess().getCommandsAssignment_3()); 
            // InternalLggeWhile.g:1496:2: ( rule__IfCommand__CommandsAssignment_3 )
            // InternalLggeWhile.g:1496:3: rule__IfCommand__CommandsAssignment_3
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
    // InternalLggeWhile.g:1504:1: rule__IfCommand__Group__4 : rule__IfCommand__Group__4__Impl rule__IfCommand__Group__5 ;
    public final void rule__IfCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1508:1: ( rule__IfCommand__Group__4__Impl rule__IfCommand__Group__5 )
            // InternalLggeWhile.g:1509:2: rule__IfCommand__Group__4__Impl rule__IfCommand__Group__5
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
    // InternalLggeWhile.g:1516:1: rule__IfCommand__Group__4__Impl : ( ( rule__IfCommand__Group_4__0 )? ) ;
    public final void rule__IfCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1520:1: ( ( ( rule__IfCommand__Group_4__0 )? ) )
            // InternalLggeWhile.g:1521:1: ( ( rule__IfCommand__Group_4__0 )? )
            {
            // InternalLggeWhile.g:1521:1: ( ( rule__IfCommand__Group_4__0 )? )
            // InternalLggeWhile.g:1522:2: ( rule__IfCommand__Group_4__0 )?
            {
             before(grammarAccess.getIfCommandAccess().getGroup_4()); 
            // InternalLggeWhile.g:1523:2: ( rule__IfCommand__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLggeWhile.g:1523:3: rule__IfCommand__Group_4__0
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
    // InternalLggeWhile.g:1531:1: rule__IfCommand__Group__5 : rule__IfCommand__Group__5__Impl ;
    public final void rule__IfCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1535:1: ( rule__IfCommand__Group__5__Impl )
            // InternalLggeWhile.g:1536:2: rule__IfCommand__Group__5__Impl
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
    // InternalLggeWhile.g:1542:1: rule__IfCommand__Group__5__Impl : ( 'fi' ) ;
    public final void rule__IfCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1546:1: ( ( 'fi' ) )
            // InternalLggeWhile.g:1547:1: ( 'fi' )
            {
            // InternalLggeWhile.g:1547:1: ( 'fi' )
            // InternalLggeWhile.g:1548:2: 'fi'
            {
             before(grammarAccess.getIfCommandAccess().getFiKeyword_5()); 
            match(input,26,FOLLOW_2); 
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
    // InternalLggeWhile.g:1558:1: rule__IfCommand__Group_4__0 : rule__IfCommand__Group_4__0__Impl rule__IfCommand__Group_4__1 ;
    public final void rule__IfCommand__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1562:1: ( rule__IfCommand__Group_4__0__Impl rule__IfCommand__Group_4__1 )
            // InternalLggeWhile.g:1563:2: rule__IfCommand__Group_4__0__Impl rule__IfCommand__Group_4__1
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
    // InternalLggeWhile.g:1570:1: rule__IfCommand__Group_4__0__Impl : ( 'else' ) ;
    public final void rule__IfCommand__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1574:1: ( ( 'else' ) )
            // InternalLggeWhile.g:1575:1: ( 'else' )
            {
            // InternalLggeWhile.g:1575:1: ( 'else' )
            // InternalLggeWhile.g:1576:2: 'else'
            {
             before(grammarAccess.getIfCommandAccess().getElseKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalLggeWhile.g:1585:1: rule__IfCommand__Group_4__1 : rule__IfCommand__Group_4__1__Impl ;
    public final void rule__IfCommand__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1589:1: ( rule__IfCommand__Group_4__1__Impl )
            // InternalLggeWhile.g:1590:2: rule__IfCommand__Group_4__1__Impl
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
    // InternalLggeWhile.g:1596:1: rule__IfCommand__Group_4__1__Impl : ( ( rule__IfCommand__ElsecommandsAssignment_4_1 ) ) ;
    public final void rule__IfCommand__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1600:1: ( ( ( rule__IfCommand__ElsecommandsAssignment_4_1 ) ) )
            // InternalLggeWhile.g:1601:1: ( ( rule__IfCommand__ElsecommandsAssignment_4_1 ) )
            {
            // InternalLggeWhile.g:1601:1: ( ( rule__IfCommand__ElsecommandsAssignment_4_1 ) )
            // InternalLggeWhile.g:1602:2: ( rule__IfCommand__ElsecommandsAssignment_4_1 )
            {
             before(grammarAccess.getIfCommandAccess().getElsecommandsAssignment_4_1()); 
            // InternalLggeWhile.g:1603:2: ( rule__IfCommand__ElsecommandsAssignment_4_1 )
            // InternalLggeWhile.g:1603:3: rule__IfCommand__ElsecommandsAssignment_4_1
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
    // InternalLggeWhile.g:1612:1: rule__ForCommand__Group__0 : rule__ForCommand__Group__0__Impl rule__ForCommand__Group__1 ;
    public final void rule__ForCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1616:1: ( rule__ForCommand__Group__0__Impl rule__ForCommand__Group__1 )
            // InternalLggeWhile.g:1617:2: rule__ForCommand__Group__0__Impl rule__ForCommand__Group__1
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
    // InternalLggeWhile.g:1624:1: rule__ForCommand__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1628:1: ( ( 'for' ) )
            // InternalLggeWhile.g:1629:1: ( 'for' )
            {
            // InternalLggeWhile.g:1629:1: ( 'for' )
            // InternalLggeWhile.g:1630:2: 'for'
            {
             before(grammarAccess.getForCommandAccess().getForKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalLggeWhile.g:1639:1: rule__ForCommand__Group__1 : rule__ForCommand__Group__1__Impl rule__ForCommand__Group__2 ;
    public final void rule__ForCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1643:1: ( rule__ForCommand__Group__1__Impl rule__ForCommand__Group__2 )
            // InternalLggeWhile.g:1644:2: rule__ForCommand__Group__1__Impl rule__ForCommand__Group__2
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
    // InternalLggeWhile.g:1651:1: rule__ForCommand__Group__1__Impl : ( ( rule__ForCommand__ExprAssignment_1 ) ) ;
    public final void rule__ForCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1655:1: ( ( ( rule__ForCommand__ExprAssignment_1 ) ) )
            // InternalLggeWhile.g:1656:1: ( ( rule__ForCommand__ExprAssignment_1 ) )
            {
            // InternalLggeWhile.g:1656:1: ( ( rule__ForCommand__ExprAssignment_1 ) )
            // InternalLggeWhile.g:1657:2: ( rule__ForCommand__ExprAssignment_1 )
            {
             before(grammarAccess.getForCommandAccess().getExprAssignment_1()); 
            // InternalLggeWhile.g:1658:2: ( rule__ForCommand__ExprAssignment_1 )
            // InternalLggeWhile.g:1658:3: rule__ForCommand__ExprAssignment_1
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
    // InternalLggeWhile.g:1666:1: rule__ForCommand__Group__2 : rule__ForCommand__Group__2__Impl rule__ForCommand__Group__3 ;
    public final void rule__ForCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1670:1: ( rule__ForCommand__Group__2__Impl rule__ForCommand__Group__3 )
            // InternalLggeWhile.g:1671:2: rule__ForCommand__Group__2__Impl rule__ForCommand__Group__3
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
    // InternalLggeWhile.g:1678:1: rule__ForCommand__Group__2__Impl : ( 'do' ) ;
    public final void rule__ForCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1682:1: ( ( 'do' ) )
            // InternalLggeWhile.g:1683:1: ( 'do' )
            {
            // InternalLggeWhile.g:1683:1: ( 'do' )
            // InternalLggeWhile.g:1684:2: 'do'
            {
             before(grammarAccess.getForCommandAccess().getDoKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLggeWhile.g:1693:1: rule__ForCommand__Group__3 : rule__ForCommand__Group__3__Impl rule__ForCommand__Group__4 ;
    public final void rule__ForCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1697:1: ( rule__ForCommand__Group__3__Impl rule__ForCommand__Group__4 )
            // InternalLggeWhile.g:1698:2: rule__ForCommand__Group__3__Impl rule__ForCommand__Group__4
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
    // InternalLggeWhile.g:1705:1: rule__ForCommand__Group__3__Impl : ( ( rule__ForCommand__CommandAssignment_3 ) ) ;
    public final void rule__ForCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1709:1: ( ( ( rule__ForCommand__CommandAssignment_3 ) ) )
            // InternalLggeWhile.g:1710:1: ( ( rule__ForCommand__CommandAssignment_3 ) )
            {
            // InternalLggeWhile.g:1710:1: ( ( rule__ForCommand__CommandAssignment_3 ) )
            // InternalLggeWhile.g:1711:2: ( rule__ForCommand__CommandAssignment_3 )
            {
             before(grammarAccess.getForCommandAccess().getCommandAssignment_3()); 
            // InternalLggeWhile.g:1712:2: ( rule__ForCommand__CommandAssignment_3 )
            // InternalLggeWhile.g:1712:3: rule__ForCommand__CommandAssignment_3
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
    // InternalLggeWhile.g:1720:1: rule__ForCommand__Group__4 : rule__ForCommand__Group__4__Impl ;
    public final void rule__ForCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1724:1: ( rule__ForCommand__Group__4__Impl )
            // InternalLggeWhile.g:1725:2: rule__ForCommand__Group__4__Impl
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
    // InternalLggeWhile.g:1731:1: rule__ForCommand__Group__4__Impl : ( 'od' ) ;
    public final void rule__ForCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1735:1: ( ( 'od' ) )
            // InternalLggeWhile.g:1736:1: ( 'od' )
            {
            // InternalLggeWhile.g:1736:1: ( 'od' )
            // InternalLggeWhile.g:1737:2: 'od'
            {
             before(grammarAccess.getForCommandAccess().getOdKeyword_4()); 
            match(input,23,FOLLOW_2); 
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
    // InternalLggeWhile.g:1747:1: rule__AffectCommand__Group__0 : rule__AffectCommand__Group__0__Impl rule__AffectCommand__Group__1 ;
    public final void rule__AffectCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1751:1: ( rule__AffectCommand__Group__0__Impl rule__AffectCommand__Group__1 )
            // InternalLggeWhile.g:1752:2: rule__AffectCommand__Group__0__Impl rule__AffectCommand__Group__1
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
    // InternalLggeWhile.g:1759:1: rule__AffectCommand__Group__0__Impl : ( ( rule__AffectCommand__VarsAssignment_0 ) ) ;
    public final void rule__AffectCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1763:1: ( ( ( rule__AffectCommand__VarsAssignment_0 ) ) )
            // InternalLggeWhile.g:1764:1: ( ( rule__AffectCommand__VarsAssignment_0 ) )
            {
            // InternalLggeWhile.g:1764:1: ( ( rule__AffectCommand__VarsAssignment_0 ) )
            // InternalLggeWhile.g:1765:2: ( rule__AffectCommand__VarsAssignment_0 )
            {
             before(grammarAccess.getAffectCommandAccess().getVarsAssignment_0()); 
            // InternalLggeWhile.g:1766:2: ( rule__AffectCommand__VarsAssignment_0 )
            // InternalLggeWhile.g:1766:3: rule__AffectCommand__VarsAssignment_0
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
    // InternalLggeWhile.g:1774:1: rule__AffectCommand__Group__1 : rule__AffectCommand__Group__1__Impl rule__AffectCommand__Group__2 ;
    public final void rule__AffectCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1778:1: ( rule__AffectCommand__Group__1__Impl rule__AffectCommand__Group__2 )
            // InternalLggeWhile.g:1779:2: rule__AffectCommand__Group__1__Impl rule__AffectCommand__Group__2
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
    // InternalLggeWhile.g:1786:1: rule__AffectCommand__Group__1__Impl : ( ':=' ) ;
    public final void rule__AffectCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1790:1: ( ( ':=' ) )
            // InternalLggeWhile.g:1791:1: ( ':=' )
            {
            // InternalLggeWhile.g:1791:1: ( ':=' )
            // InternalLggeWhile.g:1792:2: ':='
            {
             before(grammarAccess.getAffectCommandAccess().getColonEqualsSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalLggeWhile.g:1801:1: rule__AffectCommand__Group__2 : rule__AffectCommand__Group__2__Impl ;
    public final void rule__AffectCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1805:1: ( rule__AffectCommand__Group__2__Impl )
            // InternalLggeWhile.g:1806:2: rule__AffectCommand__Group__2__Impl
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
    // InternalLggeWhile.g:1812:1: rule__AffectCommand__Group__2__Impl : ( ( rule__AffectCommand__ExprsAssignment_2 ) ) ;
    public final void rule__AffectCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1816:1: ( ( ( rule__AffectCommand__ExprsAssignment_2 ) ) )
            // InternalLggeWhile.g:1817:1: ( ( rule__AffectCommand__ExprsAssignment_2 ) )
            {
            // InternalLggeWhile.g:1817:1: ( ( rule__AffectCommand__ExprsAssignment_2 ) )
            // InternalLggeWhile.g:1818:2: ( rule__AffectCommand__ExprsAssignment_2 )
            {
             before(grammarAccess.getAffectCommandAccess().getExprsAssignment_2()); 
            // InternalLggeWhile.g:1819:2: ( rule__AffectCommand__ExprsAssignment_2 )
            // InternalLggeWhile.g:1819:3: rule__AffectCommand__ExprsAssignment_2
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
    // InternalLggeWhile.g:1828:1: rule__ForeachCommand__Group__0 : rule__ForeachCommand__Group__0__Impl rule__ForeachCommand__Group__1 ;
    public final void rule__ForeachCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1832:1: ( rule__ForeachCommand__Group__0__Impl rule__ForeachCommand__Group__1 )
            // InternalLggeWhile.g:1833:2: rule__ForeachCommand__Group__0__Impl rule__ForeachCommand__Group__1
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
    // InternalLggeWhile.g:1840:1: rule__ForeachCommand__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForeachCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1844:1: ( ( 'foreach' ) )
            // InternalLggeWhile.g:1845:1: ( 'foreach' )
            {
            // InternalLggeWhile.g:1845:1: ( 'foreach' )
            // InternalLggeWhile.g:1846:2: 'foreach'
            {
             before(grammarAccess.getForeachCommandAccess().getForeachKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalLggeWhile.g:1855:1: rule__ForeachCommand__Group__1 : rule__ForeachCommand__Group__1__Impl rule__ForeachCommand__Group__2 ;
    public final void rule__ForeachCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1859:1: ( rule__ForeachCommand__Group__1__Impl rule__ForeachCommand__Group__2 )
            // InternalLggeWhile.g:1860:2: rule__ForeachCommand__Group__1__Impl rule__ForeachCommand__Group__2
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
    // InternalLggeWhile.g:1867:1: rule__ForeachCommand__Group__1__Impl : ( ( rule__ForeachCommand__VarsAssignment_1 ) ) ;
    public final void rule__ForeachCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1871:1: ( ( ( rule__ForeachCommand__VarsAssignment_1 ) ) )
            // InternalLggeWhile.g:1872:1: ( ( rule__ForeachCommand__VarsAssignment_1 ) )
            {
            // InternalLggeWhile.g:1872:1: ( ( rule__ForeachCommand__VarsAssignment_1 ) )
            // InternalLggeWhile.g:1873:2: ( rule__ForeachCommand__VarsAssignment_1 )
            {
             before(grammarAccess.getForeachCommandAccess().getVarsAssignment_1()); 
            // InternalLggeWhile.g:1874:2: ( rule__ForeachCommand__VarsAssignment_1 )
            // InternalLggeWhile.g:1874:3: rule__ForeachCommand__VarsAssignment_1
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
    // InternalLggeWhile.g:1882:1: rule__ForeachCommand__Group__2 : rule__ForeachCommand__Group__2__Impl rule__ForeachCommand__Group__3 ;
    public final void rule__ForeachCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1886:1: ( rule__ForeachCommand__Group__2__Impl rule__ForeachCommand__Group__3 )
            // InternalLggeWhile.g:1887:2: rule__ForeachCommand__Group__2__Impl rule__ForeachCommand__Group__3
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
    // InternalLggeWhile.g:1894:1: rule__ForeachCommand__Group__2__Impl : ( 'in' ) ;
    public final void rule__ForeachCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1898:1: ( ( 'in' ) )
            // InternalLggeWhile.g:1899:1: ( 'in' )
            {
            // InternalLggeWhile.g:1899:1: ( 'in' )
            // InternalLggeWhile.g:1900:2: 'in'
            {
             before(grammarAccess.getForeachCommandAccess().getInKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalLggeWhile.g:1909:1: rule__ForeachCommand__Group__3 : rule__ForeachCommand__Group__3__Impl rule__ForeachCommand__Group__4 ;
    public final void rule__ForeachCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1913:1: ( rule__ForeachCommand__Group__3__Impl rule__ForeachCommand__Group__4 )
            // InternalLggeWhile.g:1914:2: rule__ForeachCommand__Group__3__Impl rule__ForeachCommand__Group__4
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
    // InternalLggeWhile.g:1921:1: rule__ForeachCommand__Group__3__Impl : ( ( rule__ForeachCommand__ExprAssignment_3 ) ) ;
    public final void rule__ForeachCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1925:1: ( ( ( rule__ForeachCommand__ExprAssignment_3 ) ) )
            // InternalLggeWhile.g:1926:1: ( ( rule__ForeachCommand__ExprAssignment_3 ) )
            {
            // InternalLggeWhile.g:1926:1: ( ( rule__ForeachCommand__ExprAssignment_3 ) )
            // InternalLggeWhile.g:1927:2: ( rule__ForeachCommand__ExprAssignment_3 )
            {
             before(grammarAccess.getForeachCommandAccess().getExprAssignment_3()); 
            // InternalLggeWhile.g:1928:2: ( rule__ForeachCommand__ExprAssignment_3 )
            // InternalLggeWhile.g:1928:3: rule__ForeachCommand__ExprAssignment_3
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
    // InternalLggeWhile.g:1936:1: rule__ForeachCommand__Group__4 : rule__ForeachCommand__Group__4__Impl rule__ForeachCommand__Group__5 ;
    public final void rule__ForeachCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1940:1: ( rule__ForeachCommand__Group__4__Impl rule__ForeachCommand__Group__5 )
            // InternalLggeWhile.g:1941:2: rule__ForeachCommand__Group__4__Impl rule__ForeachCommand__Group__5
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
    // InternalLggeWhile.g:1948:1: rule__ForeachCommand__Group__4__Impl : ( 'do' ) ;
    public final void rule__ForeachCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1952:1: ( ( 'do' ) )
            // InternalLggeWhile.g:1953:1: ( 'do' )
            {
            // InternalLggeWhile.g:1953:1: ( 'do' )
            // InternalLggeWhile.g:1954:2: 'do'
            {
             before(grammarAccess.getForeachCommandAccess().getDoKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalLggeWhile.g:1963:1: rule__ForeachCommand__Group__5 : rule__ForeachCommand__Group__5__Impl rule__ForeachCommand__Group__6 ;
    public final void rule__ForeachCommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1967:1: ( rule__ForeachCommand__Group__5__Impl rule__ForeachCommand__Group__6 )
            // InternalLggeWhile.g:1968:2: rule__ForeachCommand__Group__5__Impl rule__ForeachCommand__Group__6
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
    // InternalLggeWhile.g:1975:1: rule__ForeachCommand__Group__5__Impl : ( ( rule__ForeachCommand__CommandsAssignment_5 ) ) ;
    public final void rule__ForeachCommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1979:1: ( ( ( rule__ForeachCommand__CommandsAssignment_5 ) ) )
            // InternalLggeWhile.g:1980:1: ( ( rule__ForeachCommand__CommandsAssignment_5 ) )
            {
            // InternalLggeWhile.g:1980:1: ( ( rule__ForeachCommand__CommandsAssignment_5 ) )
            // InternalLggeWhile.g:1981:2: ( rule__ForeachCommand__CommandsAssignment_5 )
            {
             before(grammarAccess.getForeachCommandAccess().getCommandsAssignment_5()); 
            // InternalLggeWhile.g:1982:2: ( rule__ForeachCommand__CommandsAssignment_5 )
            // InternalLggeWhile.g:1982:3: rule__ForeachCommand__CommandsAssignment_5
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
    // InternalLggeWhile.g:1990:1: rule__ForeachCommand__Group__6 : rule__ForeachCommand__Group__6__Impl ;
    public final void rule__ForeachCommand__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:1994:1: ( rule__ForeachCommand__Group__6__Impl )
            // InternalLggeWhile.g:1995:2: rule__ForeachCommand__Group__6__Impl
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
    // InternalLggeWhile.g:2001:1: rule__ForeachCommand__Group__6__Impl : ( 'od' ) ;
    public final void rule__ForeachCommand__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2005:1: ( ( 'od' ) )
            // InternalLggeWhile.g:2006:1: ( 'od' )
            {
            // InternalLggeWhile.g:2006:1: ( 'od' )
            // InternalLggeWhile.g:2007:2: 'od'
            {
             before(grammarAccess.getForeachCommandAccess().getOdKeyword_6()); 
            match(input,23,FOLLOW_2); 
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
    // InternalLggeWhile.g:2017:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2021:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // InternalLggeWhile.g:2022:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
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
    // InternalLggeWhile.g:2029:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__ExprAssignment_0 ) ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2033:1: ( ( ( rule__Exprs__ExprAssignment_0 ) ) )
            // InternalLggeWhile.g:2034:1: ( ( rule__Exprs__ExprAssignment_0 ) )
            {
            // InternalLggeWhile.g:2034:1: ( ( rule__Exprs__ExprAssignment_0 ) )
            // InternalLggeWhile.g:2035:2: ( rule__Exprs__ExprAssignment_0 )
            {
             before(grammarAccess.getExprsAccess().getExprAssignment_0()); 
            // InternalLggeWhile.g:2036:2: ( rule__Exprs__ExprAssignment_0 )
            // InternalLggeWhile.g:2036:3: rule__Exprs__ExprAssignment_0
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
    // InternalLggeWhile.g:2044:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2048:1: ( rule__Exprs__Group__1__Impl )
            // InternalLggeWhile.g:2049:2: rule__Exprs__Group__1__Impl
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
    // InternalLggeWhile.g:2055:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )* ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2059:1: ( ( ( rule__Exprs__Group_1__0 )* ) )
            // InternalLggeWhile.g:2060:1: ( ( rule__Exprs__Group_1__0 )* )
            {
            // InternalLggeWhile.g:2060:1: ( ( rule__Exprs__Group_1__0 )* )
            // InternalLggeWhile.g:2061:2: ( rule__Exprs__Group_1__0 )*
            {
             before(grammarAccess.getExprsAccess().getGroup_1()); 
            // InternalLggeWhile.g:2062:2: ( rule__Exprs__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLggeWhile.g:2062:3: rule__Exprs__Group_1__0
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
    // InternalLggeWhile.g:2071:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2075:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // InternalLggeWhile.g:2076:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
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
    // InternalLggeWhile.g:2083:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2087:1: ( ( ',' ) )
            // InternalLggeWhile.g:2088:1: ( ',' )
            {
            // InternalLggeWhile.g:2088:1: ( ',' )
            // InternalLggeWhile.g:2089:2: ','
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
    // InternalLggeWhile.g:2098:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2102:1: ( rule__Exprs__Group_1__1__Impl )
            // InternalLggeWhile.g:2103:2: rule__Exprs__Group_1__1__Impl
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
    // InternalLggeWhile.g:2109:1: rule__Exprs__Group_1__1__Impl : ( ( rule__Exprs__ExprAssignment_1_1 ) ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2113:1: ( ( ( rule__Exprs__ExprAssignment_1_1 ) ) )
            // InternalLggeWhile.g:2114:1: ( ( rule__Exprs__ExprAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:2114:1: ( ( rule__Exprs__ExprAssignment_1_1 ) )
            // InternalLggeWhile.g:2115:2: ( rule__Exprs__ExprAssignment_1_1 )
            {
             before(grammarAccess.getExprsAccess().getExprAssignment_1_1()); 
            // InternalLggeWhile.g:2116:2: ( rule__Exprs__ExprAssignment_1_1 )
            // InternalLggeWhile.g:2116:3: rule__Exprs__ExprAssignment_1_1
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
    // InternalLggeWhile.g:2125:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2129:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // InternalLggeWhile.g:2130:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
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
    // InternalLggeWhile.g:2137:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__VarAssignment_0 ) ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2141:1: ( ( ( rule__Vars__VarAssignment_0 ) ) )
            // InternalLggeWhile.g:2142:1: ( ( rule__Vars__VarAssignment_0 ) )
            {
            // InternalLggeWhile.g:2142:1: ( ( rule__Vars__VarAssignment_0 ) )
            // InternalLggeWhile.g:2143:2: ( rule__Vars__VarAssignment_0 )
            {
             before(grammarAccess.getVarsAccess().getVarAssignment_0()); 
            // InternalLggeWhile.g:2144:2: ( rule__Vars__VarAssignment_0 )
            // InternalLggeWhile.g:2144:3: rule__Vars__VarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Vars__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarsAccess().getVarAssignment_0()); 

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
    // InternalLggeWhile.g:2152:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2156:1: ( rule__Vars__Group__1__Impl )
            // InternalLggeWhile.g:2157:2: rule__Vars__Group__1__Impl
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
    // InternalLggeWhile.g:2163:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )* ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2167:1: ( ( ( rule__Vars__Group_1__0 )* ) )
            // InternalLggeWhile.g:2168:1: ( ( rule__Vars__Group_1__0 )* )
            {
            // InternalLggeWhile.g:2168:1: ( ( rule__Vars__Group_1__0 )* )
            // InternalLggeWhile.g:2169:2: ( rule__Vars__Group_1__0 )*
            {
             before(grammarAccess.getVarsAccess().getGroup_1()); 
            // InternalLggeWhile.g:2170:2: ( rule__Vars__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLggeWhile.g:2170:3: rule__Vars__Group_1__0
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
    // InternalLggeWhile.g:2179:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2183:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // InternalLggeWhile.g:2184:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
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
    // InternalLggeWhile.g:2191:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2195:1: ( ( ',' ) )
            // InternalLggeWhile.g:2196:1: ( ',' )
            {
            // InternalLggeWhile.g:2196:1: ( ',' )
            // InternalLggeWhile.g:2197:2: ','
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
    // InternalLggeWhile.g:2206:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2210:1: ( rule__Vars__Group_1__1__Impl )
            // InternalLggeWhile.g:2211:2: rule__Vars__Group_1__1__Impl
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
    // InternalLggeWhile.g:2217:1: rule__Vars__Group_1__1__Impl : ( ( rule__Vars__VarAssignment_1_1 ) ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2221:1: ( ( ( rule__Vars__VarAssignment_1_1 ) ) )
            // InternalLggeWhile.g:2222:1: ( ( rule__Vars__VarAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:2222:1: ( ( rule__Vars__VarAssignment_1_1 ) )
            // InternalLggeWhile.g:2223:2: ( rule__Vars__VarAssignment_1_1 )
            {
             before(grammarAccess.getVarsAccess().getVarAssignment_1_1()); 
            // InternalLggeWhile.g:2224:2: ( rule__Vars__VarAssignment_1_1 )
            // InternalLggeWhile.g:2224:3: rule__Vars__VarAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Vars__VarAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarsAccess().getVarAssignment_1_1()); 

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
    // InternalLggeWhile.g:2233:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2237:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // InternalLggeWhile.g:2238:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
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
    // InternalLggeWhile.g:2245:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__ExprbaseAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2249:1: ( ( ( rule__Expr__ExprbaseAssignment_0 ) ) )
            // InternalLggeWhile.g:2250:1: ( ( rule__Expr__ExprbaseAssignment_0 ) )
            {
            // InternalLggeWhile.g:2250:1: ( ( rule__Expr__ExprbaseAssignment_0 ) )
            // InternalLggeWhile.g:2251:2: ( rule__Expr__ExprbaseAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getExprbaseAssignment_0()); 
            // InternalLggeWhile.g:2252:2: ( rule__Expr__ExprbaseAssignment_0 )
            // InternalLggeWhile.g:2252:3: rule__Expr__ExprbaseAssignment_0
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
    // InternalLggeWhile.g:2260:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2264:1: ( rule__Expr__Group__1__Impl )
            // InternalLggeWhile.g:2265:2: rule__Expr__Group__1__Impl
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
    // InternalLggeWhile.g:2271:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2275:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // InternalLggeWhile.g:2276:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // InternalLggeWhile.g:2276:1: ( ( rule__Expr__Group_1__0 )* )
            // InternalLggeWhile.g:2277:2: ( rule__Expr__Group_1__0 )*
            {
             before(grammarAccess.getExprAccess().getGroup_1()); 
            // InternalLggeWhile.g:2278:2: ( rule__Expr__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==32) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLggeWhile.g:2278:3: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

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
    // InternalLggeWhile.g:2287:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2291:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // InternalLggeWhile.g:2292:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
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
    // InternalLggeWhile.g:2299:1: rule__Expr__Group_1__0__Impl : ( '=?' ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2303:1: ( ( '=?' ) )
            // InternalLggeWhile.g:2304:1: ( '=?' )
            {
            // InternalLggeWhile.g:2304:1: ( '=?' )
            // InternalLggeWhile.g:2305:2: '=?'
            {
             before(grammarAccess.getExprAccess().getEqualsSignQuestionMarkKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalLggeWhile.g:2314:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2318:1: ( rule__Expr__Group_1__1__Impl )
            // InternalLggeWhile.g:2319:2: rule__Expr__Group_1__1__Impl
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
    // InternalLggeWhile.g:2325:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__ExprbaseAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2329:1: ( ( ( rule__Expr__ExprbaseAssignment_1_1 ) ) )
            // InternalLggeWhile.g:2330:1: ( ( rule__Expr__ExprbaseAssignment_1_1 ) )
            {
            // InternalLggeWhile.g:2330:1: ( ( rule__Expr__ExprbaseAssignment_1_1 ) )
            // InternalLggeWhile.g:2331:2: ( rule__Expr__ExprbaseAssignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getExprbaseAssignment_1_1()); 
            // InternalLggeWhile.g:2332:2: ( rule__Expr__ExprbaseAssignment_1_1 )
            // InternalLggeWhile.g:2332:3: rule__Expr__ExprbaseAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expr__ExprbaseAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getExprbaseAssignment_1_1()); 

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


    // $ANTLR start "rule__ExprBase__Group_0__0"
    // InternalLggeWhile.g:2341:1: rule__ExprBase__Group_0__0 : rule__ExprBase__Group_0__0__Impl rule__ExprBase__Group_0__1 ;
    public final void rule__ExprBase__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2345:1: ( rule__ExprBase__Group_0__0__Impl rule__ExprBase__Group_0__1 )
            // InternalLggeWhile.g:2346:2: rule__ExprBase__Group_0__0__Impl rule__ExprBase__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__ExprBase__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_0__1();

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
    // $ANTLR end "rule__ExprBase__Group_0__0"


    // $ANTLR start "rule__ExprBase__Group_0__0__Impl"
    // InternalLggeWhile.g:2353:1: rule__ExprBase__Group_0__0__Impl : ( () ) ;
    public final void rule__ExprBase__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2357:1: ( ( () ) )
            // InternalLggeWhile.g:2358:1: ( () )
            {
            // InternalLggeWhile.g:2358:1: ( () )
            // InternalLggeWhile.g:2359:2: ()
            {
             before(grammarAccess.getExprBaseAccess().getExprBaseAction_0_0()); 
            // InternalLggeWhile.g:2360:2: ()
            // InternalLggeWhile.g:2360:3: 
            {
            }

             after(grammarAccess.getExprBaseAccess().getExprBaseAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_0__0__Impl"


    // $ANTLR start "rule__ExprBase__Group_0__1"
    // InternalLggeWhile.g:2368:1: rule__ExprBase__Group_0__1 : rule__ExprBase__Group_0__1__Impl ;
    public final void rule__ExprBase__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2372:1: ( rule__ExprBase__Group_0__1__Impl )
            // InternalLggeWhile.g:2373:2: rule__ExprBase__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExprBase__Group_0__1"


    // $ANTLR start "rule__ExprBase__Group_0__1__Impl"
    // InternalLggeWhile.g:2379:1: rule__ExprBase__Group_0__1__Impl : ( 'nil' ) ;
    public final void rule__ExprBase__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2383:1: ( ( 'nil' ) )
            // InternalLggeWhile.g:2384:1: ( 'nil' )
            {
            // InternalLggeWhile.g:2384:1: ( 'nil' )
            // InternalLggeWhile.g:2385:2: 'nil'
            {
             before(grammarAccess.getExprBaseAccess().getNilKeyword_0_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getNilKeyword_0_1()); 

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
    // $ANTLR end "rule__ExprBase__Group_0__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_1__0"
    // InternalLggeWhile.g:2395:1: rule__ExprBase__Group_1__0 : rule__ExprBase__Group_1__0__Impl rule__ExprBase__Group_1__1 ;
    public final void rule__ExprBase__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2399:1: ( rule__ExprBase__Group_1__0__Impl rule__ExprBase__Group_1__1 )
            // InternalLggeWhile.g:2400:2: rule__ExprBase__Group_1__0__Impl rule__ExprBase__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ExprBase__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_1__1();

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
    // $ANTLR end "rule__ExprBase__Group_1__0"


    // $ANTLR start "rule__ExprBase__Group_1__0__Impl"
    // InternalLggeWhile.g:2407:1: rule__ExprBase__Group_1__0__Impl : ( () ) ;
    public final void rule__ExprBase__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2411:1: ( ( () ) )
            // InternalLggeWhile.g:2412:1: ( () )
            {
            // InternalLggeWhile.g:2412:1: ( () )
            // InternalLggeWhile.g:2413:2: ()
            {
             before(grammarAccess.getExprBaseAccess().getExprBaseAction_1_0()); 
            // InternalLggeWhile.g:2414:2: ()
            // InternalLggeWhile.g:2414:3: 
            {
            }

             after(grammarAccess.getExprBaseAccess().getExprBaseAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_1__0__Impl"


    // $ANTLR start "rule__ExprBase__Group_1__1"
    // InternalLggeWhile.g:2422:1: rule__ExprBase__Group_1__1 : rule__ExprBase__Group_1__1__Impl ;
    public final void rule__ExprBase__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2426:1: ( rule__ExprBase__Group_1__1__Impl )
            // InternalLggeWhile.g:2427:2: rule__ExprBase__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExprBase__Group_1__1"


    // $ANTLR start "rule__ExprBase__Group_1__1__Impl"
    // InternalLggeWhile.g:2433:1: rule__ExprBase__Group_1__1__Impl : ( RULE_VARIABLE ) ;
    public final void rule__ExprBase__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2437:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:2438:1: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:2438:1: ( RULE_VARIABLE )
            // InternalLggeWhile.g:2439:2: RULE_VARIABLE
            {
             before(grammarAccess.getExprBaseAccess().getVARIABLETerminalRuleCall_1_1()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getVARIABLETerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__ExprBase__Group_1__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_2__0"
    // InternalLggeWhile.g:2449:1: rule__ExprBase__Group_2__0 : rule__ExprBase__Group_2__0__Impl rule__ExprBase__Group_2__1 ;
    public final void rule__ExprBase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2453:1: ( rule__ExprBase__Group_2__0__Impl rule__ExprBase__Group_2__1 )
            // InternalLggeWhile.g:2454:2: rule__ExprBase__Group_2__0__Impl rule__ExprBase__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ExprBase__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_2__1();

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
    // $ANTLR end "rule__ExprBase__Group_2__0"


    // $ANTLR start "rule__ExprBase__Group_2__0__Impl"
    // InternalLggeWhile.g:2461:1: rule__ExprBase__Group_2__0__Impl : ( () ) ;
    public final void rule__ExprBase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2465:1: ( ( () ) )
            // InternalLggeWhile.g:2466:1: ( () )
            {
            // InternalLggeWhile.g:2466:1: ( () )
            // InternalLggeWhile.g:2467:2: ()
            {
             before(grammarAccess.getExprBaseAccess().getExprBaseAction_2_0()); 
            // InternalLggeWhile.g:2468:2: ()
            // InternalLggeWhile.g:2468:3: 
            {
            }

             after(grammarAccess.getExprBaseAccess().getExprBaseAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprBase__Group_2__0__Impl"


    // $ANTLR start "rule__ExprBase__Group_2__1"
    // InternalLggeWhile.g:2476:1: rule__ExprBase__Group_2__1 : rule__ExprBase__Group_2__1__Impl ;
    public final void rule__ExprBase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2480:1: ( rule__ExprBase__Group_2__1__Impl )
            // InternalLggeWhile.g:2481:2: rule__ExprBase__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExprBase__Group_2__1__Impl();

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
    // $ANTLR end "rule__ExprBase__Group_2__1"


    // $ANTLR start "rule__ExprBase__Group_2__1__Impl"
    // InternalLggeWhile.g:2487:1: rule__ExprBase__Group_2__1__Impl : ( RULE_SYMBOL ) ;
    public final void rule__ExprBase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2491:1: ( ( RULE_SYMBOL ) )
            // InternalLggeWhile.g:2492:1: ( RULE_SYMBOL )
            {
            // InternalLggeWhile.g:2492:1: ( RULE_SYMBOL )
            // InternalLggeWhile.g:2493:2: RULE_SYMBOL
            {
             before(grammarAccess.getExprBaseAccess().getSYMBOLTerminalRuleCall_2_1()); 
            match(input,RULE_SYMBOL,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getSYMBOLTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__ExprBase__Group_2__1__Impl"


    // $ANTLR start "rule__ExprBase__Group_3__0"
    // InternalLggeWhile.g:2503:1: rule__ExprBase__Group_3__0 : rule__ExprBase__Group_3__0__Impl rule__ExprBase__Group_3__1 ;
    public final void rule__ExprBase__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2507:1: ( rule__ExprBase__Group_3__0__Impl rule__ExprBase__Group_3__1 )
            // InternalLggeWhile.g:2508:2: rule__ExprBase__Group_3__0__Impl rule__ExprBase__Group_3__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalLggeWhile.g:2515:1: rule__ExprBase__Group_3__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2519:1: ( ( '(' ) )
            // InternalLggeWhile.g:2520:1: ( '(' )
            {
            // InternalLggeWhile.g:2520:1: ( '(' )
            // InternalLggeWhile.g:2521:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLggeWhile.g:2530:1: rule__ExprBase__Group_3__1 : rule__ExprBase__Group_3__1__Impl rule__ExprBase__Group_3__2 ;
    public final void rule__ExprBase__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2534:1: ( rule__ExprBase__Group_3__1__Impl rule__ExprBase__Group_3__2 )
            // InternalLggeWhile.g:2535:2: rule__ExprBase__Group_3__1__Impl rule__ExprBase__Group_3__2
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
    // InternalLggeWhile.g:2542:1: rule__ExprBase__Group_3__1__Impl : ( 'cons' ) ;
    public final void rule__ExprBase__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2546:1: ( ( 'cons' ) )
            // InternalLggeWhile.g:2547:1: ( 'cons' )
            {
            // InternalLggeWhile.g:2547:1: ( 'cons' )
            // InternalLggeWhile.g:2548:2: 'cons'
            {
             before(grammarAccess.getExprBaseAccess().getConsKeyword_3_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getConsKeyword_3_1()); 

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
    // InternalLggeWhile.g:2557:1: rule__ExprBase__Group_3__2 : rule__ExprBase__Group_3__2__Impl rule__ExprBase__Group_3__3 ;
    public final void rule__ExprBase__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2561:1: ( rule__ExprBase__Group_3__2__Impl rule__ExprBase__Group_3__3 )
            // InternalLggeWhile.g:2562:2: rule__ExprBase__Group_3__2__Impl rule__ExprBase__Group_3__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalLggeWhile.g:2569:1: rule__ExprBase__Group_3__2__Impl : ( ruleLExpr ) ;
    public final void rule__ExprBase__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2573:1: ( ( ruleLExpr ) )
            // InternalLggeWhile.g:2574:1: ( ruleLExpr )
            {
            // InternalLggeWhile.g:2574:1: ( ruleLExpr )
            // InternalLggeWhile.g:2575:2: ruleLExpr
            {
             before(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_3_2()); 
            pushFollow(FOLLOW_2);
            ruleLExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_3_2()); 

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
    // InternalLggeWhile.g:2584:1: rule__ExprBase__Group_3__3 : rule__ExprBase__Group_3__3__Impl ;
    public final void rule__ExprBase__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2588:1: ( rule__ExprBase__Group_3__3__Impl )
            // InternalLggeWhile.g:2589:2: rule__ExprBase__Group_3__3__Impl
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
    // InternalLggeWhile.g:2595:1: rule__ExprBase__Group_3__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2599:1: ( ( ')' ) )
            // InternalLggeWhile.g:2600:1: ( ')' )
            {
            // InternalLggeWhile.g:2600:1: ( ')' )
            // InternalLggeWhile.g:2601:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_3_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalLggeWhile.g:2611:1: rule__ExprBase__Group_4__0 : rule__ExprBase__Group_4__0__Impl rule__ExprBase__Group_4__1 ;
    public final void rule__ExprBase__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2615:1: ( rule__ExprBase__Group_4__0__Impl rule__ExprBase__Group_4__1 )
            // InternalLggeWhile.g:2616:2: rule__ExprBase__Group_4__0__Impl rule__ExprBase__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalLggeWhile.g:2623:1: rule__ExprBase__Group_4__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2627:1: ( ( '(' ) )
            // InternalLggeWhile.g:2628:1: ( '(' )
            {
            // InternalLggeWhile.g:2628:1: ( '(' )
            // InternalLggeWhile.g:2629:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLggeWhile.g:2638:1: rule__ExprBase__Group_4__1 : rule__ExprBase__Group_4__1__Impl rule__ExprBase__Group_4__2 ;
    public final void rule__ExprBase__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2642:1: ( rule__ExprBase__Group_4__1__Impl rule__ExprBase__Group_4__2 )
            // InternalLggeWhile.g:2643:2: rule__ExprBase__Group_4__1__Impl rule__ExprBase__Group_4__2
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
    // InternalLggeWhile.g:2650:1: rule__ExprBase__Group_4__1__Impl : ( 'list' ) ;
    public final void rule__ExprBase__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2654:1: ( ( 'list' ) )
            // InternalLggeWhile.g:2655:1: ( 'list' )
            {
            // InternalLggeWhile.g:2655:1: ( 'list' )
            // InternalLggeWhile.g:2656:2: 'list'
            {
             before(grammarAccess.getExprBaseAccess().getListKeyword_4_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getListKeyword_4_1()); 

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
    // InternalLggeWhile.g:2665:1: rule__ExprBase__Group_4__2 : rule__ExprBase__Group_4__2__Impl rule__ExprBase__Group_4__3 ;
    public final void rule__ExprBase__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2669:1: ( rule__ExprBase__Group_4__2__Impl rule__ExprBase__Group_4__3 )
            // InternalLggeWhile.g:2670:2: rule__ExprBase__Group_4__2__Impl rule__ExprBase__Group_4__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalLggeWhile.g:2677:1: rule__ExprBase__Group_4__2__Impl : ( ruleLExpr ) ;
    public final void rule__ExprBase__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2681:1: ( ( ruleLExpr ) )
            // InternalLggeWhile.g:2682:1: ( ruleLExpr )
            {
            // InternalLggeWhile.g:2682:1: ( ruleLExpr )
            // InternalLggeWhile.g:2683:2: ruleLExpr
            {
             before(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_4_2()); 
            pushFollow(FOLLOW_2);
            ruleLExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_4_2()); 

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
    // InternalLggeWhile.g:2692:1: rule__ExprBase__Group_4__3 : rule__ExprBase__Group_4__3__Impl ;
    public final void rule__ExprBase__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2696:1: ( rule__ExprBase__Group_4__3__Impl )
            // InternalLggeWhile.g:2697:2: rule__ExprBase__Group_4__3__Impl
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
    // InternalLggeWhile.g:2703:1: rule__ExprBase__Group_4__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2707:1: ( ( ')' ) )
            // InternalLggeWhile.g:2708:1: ( ')' )
            {
            // InternalLggeWhile.g:2708:1: ( ')' )
            // InternalLggeWhile.g:2709:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_4_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalLggeWhile.g:2719:1: rule__ExprBase__Group_5__0 : rule__ExprBase__Group_5__0__Impl rule__ExprBase__Group_5__1 ;
    public final void rule__ExprBase__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2723:1: ( rule__ExprBase__Group_5__0__Impl rule__ExprBase__Group_5__1 )
            // InternalLggeWhile.g:2724:2: rule__ExprBase__Group_5__0__Impl rule__ExprBase__Group_5__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalLggeWhile.g:2731:1: rule__ExprBase__Group_5__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2735:1: ( ( '(' ) )
            // InternalLggeWhile.g:2736:1: ( '(' )
            {
            // InternalLggeWhile.g:2736:1: ( '(' )
            // InternalLggeWhile.g:2737:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLggeWhile.g:2746:1: rule__ExprBase__Group_5__1 : rule__ExprBase__Group_5__1__Impl rule__ExprBase__Group_5__2 ;
    public final void rule__ExprBase__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2750:1: ( rule__ExprBase__Group_5__1__Impl rule__ExprBase__Group_5__2 )
            // InternalLggeWhile.g:2751:2: rule__ExprBase__Group_5__1__Impl rule__ExprBase__Group_5__2
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
    // InternalLggeWhile.g:2758:1: rule__ExprBase__Group_5__1__Impl : ( 'hd' ) ;
    public final void rule__ExprBase__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2762:1: ( ( 'hd' ) )
            // InternalLggeWhile.g:2763:1: ( 'hd' )
            {
            // InternalLggeWhile.g:2763:1: ( 'hd' )
            // InternalLggeWhile.g:2764:2: 'hd'
            {
             before(grammarAccess.getExprBaseAccess().getHdKeyword_5_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getHdKeyword_5_1()); 

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
    // InternalLggeWhile.g:2773:1: rule__ExprBase__Group_5__2 : rule__ExprBase__Group_5__2__Impl rule__ExprBase__Group_5__3 ;
    public final void rule__ExprBase__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2777:1: ( rule__ExprBase__Group_5__2__Impl rule__ExprBase__Group_5__3 )
            // InternalLggeWhile.g:2778:2: rule__ExprBase__Group_5__2__Impl rule__ExprBase__Group_5__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalLggeWhile.g:2785:1: rule__ExprBase__Group_5__2__Impl : ( ruleExpr ) ;
    public final void rule__ExprBase__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2789:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:2790:1: ( ruleExpr )
            {
            // InternalLggeWhile.g:2790:1: ( ruleExpr )
            // InternalLggeWhile.g:2791:2: ruleExpr
            {
             before(grammarAccess.getExprBaseAccess().getExprParserRuleCall_5_2()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getExprParserRuleCall_5_2()); 

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
    // InternalLggeWhile.g:2800:1: rule__ExprBase__Group_5__3 : rule__ExprBase__Group_5__3__Impl ;
    public final void rule__ExprBase__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2804:1: ( rule__ExprBase__Group_5__3__Impl )
            // InternalLggeWhile.g:2805:2: rule__ExprBase__Group_5__3__Impl
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
    // InternalLggeWhile.g:2811:1: rule__ExprBase__Group_5__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2815:1: ( ( ')' ) )
            // InternalLggeWhile.g:2816:1: ( ')' )
            {
            // InternalLggeWhile.g:2816:1: ( ')' )
            // InternalLggeWhile.g:2817:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_5_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalLggeWhile.g:2827:1: rule__ExprBase__Group_6__0 : rule__ExprBase__Group_6__0__Impl rule__ExprBase__Group_6__1 ;
    public final void rule__ExprBase__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2831:1: ( rule__ExprBase__Group_6__0__Impl rule__ExprBase__Group_6__1 )
            // InternalLggeWhile.g:2832:2: rule__ExprBase__Group_6__0__Impl rule__ExprBase__Group_6__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalLggeWhile.g:2839:1: rule__ExprBase__Group_6__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2843:1: ( ( '(' ) )
            // InternalLggeWhile.g:2844:1: ( '(' )
            {
            // InternalLggeWhile.g:2844:1: ( '(' )
            // InternalLggeWhile.g:2845:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLggeWhile.g:2854:1: rule__ExprBase__Group_6__1 : rule__ExprBase__Group_6__1__Impl rule__ExprBase__Group_6__2 ;
    public final void rule__ExprBase__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2858:1: ( rule__ExprBase__Group_6__1__Impl rule__ExprBase__Group_6__2 )
            // InternalLggeWhile.g:2859:2: rule__ExprBase__Group_6__1__Impl rule__ExprBase__Group_6__2
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
    // InternalLggeWhile.g:2866:1: rule__ExprBase__Group_6__1__Impl : ( 'tl' ) ;
    public final void rule__ExprBase__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2870:1: ( ( 'tl' ) )
            // InternalLggeWhile.g:2871:1: ( 'tl' )
            {
            // InternalLggeWhile.g:2871:1: ( 'tl' )
            // InternalLggeWhile.g:2872:2: 'tl'
            {
             before(grammarAccess.getExprBaseAccess().getTlKeyword_6_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getTlKeyword_6_1()); 

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
    // InternalLggeWhile.g:2881:1: rule__ExprBase__Group_6__2 : rule__ExprBase__Group_6__2__Impl rule__ExprBase__Group_6__3 ;
    public final void rule__ExprBase__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2885:1: ( rule__ExprBase__Group_6__2__Impl rule__ExprBase__Group_6__3 )
            // InternalLggeWhile.g:2886:2: rule__ExprBase__Group_6__2__Impl rule__ExprBase__Group_6__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalLggeWhile.g:2893:1: rule__ExprBase__Group_6__2__Impl : ( ruleExpr ) ;
    public final void rule__ExprBase__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2897:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:2898:1: ( ruleExpr )
            {
            // InternalLggeWhile.g:2898:1: ( ruleExpr )
            // InternalLggeWhile.g:2899:2: ruleExpr
            {
             before(grammarAccess.getExprBaseAccess().getExprParserRuleCall_6_2()); 
            pushFollow(FOLLOW_2);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getExprParserRuleCall_6_2()); 

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
    // InternalLggeWhile.g:2908:1: rule__ExprBase__Group_6__3 : rule__ExprBase__Group_6__3__Impl ;
    public final void rule__ExprBase__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2912:1: ( rule__ExprBase__Group_6__3__Impl )
            // InternalLggeWhile.g:2913:2: rule__ExprBase__Group_6__3__Impl
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
    // InternalLggeWhile.g:2919:1: rule__ExprBase__Group_6__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2923:1: ( ( ')' ) )
            // InternalLggeWhile.g:2924:1: ( ')' )
            {
            // InternalLggeWhile.g:2924:1: ( ')' )
            // InternalLggeWhile.g:2925:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_6_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalLggeWhile.g:2935:1: rule__ExprBase__Group_7__0 : rule__ExprBase__Group_7__0__Impl rule__ExprBase__Group_7__1 ;
    public final void rule__ExprBase__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2939:1: ( rule__ExprBase__Group_7__0__Impl rule__ExprBase__Group_7__1 )
            // InternalLggeWhile.g:2940:2: rule__ExprBase__Group_7__0__Impl rule__ExprBase__Group_7__1
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
    // InternalLggeWhile.g:2947:1: rule__ExprBase__Group_7__0__Impl : ( '(' ) ;
    public final void rule__ExprBase__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2951:1: ( ( '(' ) )
            // InternalLggeWhile.g:2952:1: ( '(' )
            {
            // InternalLggeWhile.g:2952:1: ( '(' )
            // InternalLggeWhile.g:2953:2: '('
            {
             before(grammarAccess.getExprBaseAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalLggeWhile.g:2962:1: rule__ExprBase__Group_7__1 : rule__ExprBase__Group_7__1__Impl rule__ExprBase__Group_7__2 ;
    public final void rule__ExprBase__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2966:1: ( rule__ExprBase__Group_7__1__Impl rule__ExprBase__Group_7__2 )
            // InternalLggeWhile.g:2967:2: rule__ExprBase__Group_7__1__Impl rule__ExprBase__Group_7__2
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
    // InternalLggeWhile.g:2974:1: rule__ExprBase__Group_7__1__Impl : ( RULE_SYMBOL ) ;
    public final void rule__ExprBase__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2978:1: ( ( RULE_SYMBOL ) )
            // InternalLggeWhile.g:2979:1: ( RULE_SYMBOL )
            {
            // InternalLggeWhile.g:2979:1: ( RULE_SYMBOL )
            // InternalLggeWhile.g:2980:2: RULE_SYMBOL
            {
             before(grammarAccess.getExprBaseAccess().getSYMBOLTerminalRuleCall_7_1()); 
            match(input,RULE_SYMBOL,FOLLOW_2); 
             after(grammarAccess.getExprBaseAccess().getSYMBOLTerminalRuleCall_7_1()); 

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
    // InternalLggeWhile.g:2989:1: rule__ExprBase__Group_7__2 : rule__ExprBase__Group_7__2__Impl rule__ExprBase__Group_7__3 ;
    public final void rule__ExprBase__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:2993:1: ( rule__ExprBase__Group_7__2__Impl rule__ExprBase__Group_7__3 )
            // InternalLggeWhile.g:2994:2: rule__ExprBase__Group_7__2__Impl rule__ExprBase__Group_7__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalLggeWhile.g:3001:1: rule__ExprBase__Group_7__2__Impl : ( ruleLExpr ) ;
    public final void rule__ExprBase__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3005:1: ( ( ruleLExpr ) )
            // InternalLggeWhile.g:3006:1: ( ruleLExpr )
            {
            // InternalLggeWhile.g:3006:1: ( ruleLExpr )
            // InternalLggeWhile.g:3007:2: ruleLExpr
            {
             before(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_7_2()); 
            pushFollow(FOLLOW_2);
            ruleLExpr();

            state._fsp--;

             after(grammarAccess.getExprBaseAccess().getLExprParserRuleCall_7_2()); 

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
    // InternalLggeWhile.g:3016:1: rule__ExprBase__Group_7__3 : rule__ExprBase__Group_7__3__Impl ;
    public final void rule__ExprBase__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3020:1: ( rule__ExprBase__Group_7__3__Impl )
            // InternalLggeWhile.g:3021:2: rule__ExprBase__Group_7__3__Impl
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
    // InternalLggeWhile.g:3027:1: rule__ExprBase__Group_7__3__Impl : ( ')' ) ;
    public final void rule__ExprBase__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3031:1: ( ( ')' ) )
            // InternalLggeWhile.g:3032:1: ( ')' )
            {
            // InternalLggeWhile.g:3032:1: ( ')' )
            // InternalLggeWhile.g:3033:2: ')'
            {
             before(grammarAccess.getExprBaseAccess().getRightParenthesisKeyword_7_3()); 
            match(input,36,FOLLOW_2); 
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
    // InternalLggeWhile.g:3043:1: rule__Program__FunctionsAssignment : ( ruleFunction ) ;
    public final void rule__Program__FunctionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3047:1: ( ( ruleFunction ) )
            // InternalLggeWhile.g:3048:2: ( ruleFunction )
            {
            // InternalLggeWhile.g:3048:2: ( ruleFunction )
            // InternalLggeWhile.g:3049:3: ruleFunction
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
    // InternalLggeWhile.g:3058:1: rule__Function__SymbolAssignment_1 : ( RULE_SYMBOL ) ;
    public final void rule__Function__SymbolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3062:1: ( ( RULE_SYMBOL ) )
            // InternalLggeWhile.g:3063:2: ( RULE_SYMBOL )
            {
            // InternalLggeWhile.g:3063:2: ( RULE_SYMBOL )
            // InternalLggeWhile.g:3064:3: RULE_SYMBOL
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
    // InternalLggeWhile.g:3073:1: rule__Function__DefinitionAssignment_3 : ( ruleDefinition ) ;
    public final void rule__Function__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3077:1: ( ( ruleDefinition ) )
            // InternalLggeWhile.g:3078:2: ( ruleDefinition )
            {
            // InternalLggeWhile.g:3078:2: ( ruleDefinition )
            // InternalLggeWhile.g:3079:3: ruleDefinition
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
    // InternalLggeWhile.g:3088:1: rule__Definition__InputAssignment_1 : ( ruleInput ) ;
    public final void rule__Definition__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3092:1: ( ( ruleInput ) )
            // InternalLggeWhile.g:3093:2: ( ruleInput )
            {
            // InternalLggeWhile.g:3093:2: ( ruleInput )
            // InternalLggeWhile.g:3094:3: ruleInput
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
    // InternalLggeWhile.g:3103:1: rule__Definition__CommandsAssignment_3 : ( ruleCommands ) ;
    public final void rule__Definition__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3107:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3108:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3108:2: ( ruleCommands )
            // InternalLggeWhile.g:3109:3: ruleCommands
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
    // InternalLggeWhile.g:3118:1: rule__Definition__OutputAssignment_6 : ( ruleOutput ) ;
    public final void rule__Definition__OutputAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3122:1: ( ( ruleOutput ) )
            // InternalLggeWhile.g:3123:2: ( ruleOutput )
            {
            // InternalLggeWhile.g:3123:2: ( ruleOutput )
            // InternalLggeWhile.g:3124:3: ruleOutput
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
    // InternalLggeWhile.g:3133:1: rule__Input__VarsAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3137:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:3138:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:3138:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:3139:3: RULE_VARIABLE
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
    // InternalLggeWhile.g:3148:1: rule__Input__VarsAssignment_1_1 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3152:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:3153:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:3153:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:3154:3: RULE_VARIABLE
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
    // InternalLggeWhile.g:3163:1: rule__Output__VarsAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3167:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:3168:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:3168:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:3169:3: RULE_VARIABLE
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
    // InternalLggeWhile.g:3178:1: rule__Output__VarsAssignment_1_1 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3182:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:3183:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:3183:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:3184:3: RULE_VARIABLE
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
    // InternalLggeWhile.g:3193:1: rule__Commands__CommandsAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__CommandsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3197:1: ( ( ruleCommand ) )
            // InternalLggeWhile.g:3198:2: ( ruleCommand )
            {
            // InternalLggeWhile.g:3198:2: ( ruleCommand )
            // InternalLggeWhile.g:3199:3: ruleCommand
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
    // InternalLggeWhile.g:3208:1: rule__Commands__CommandsAssignment_1_1 : ( ruleCommand ) ;
    public final void rule__Commands__CommandsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3212:1: ( ( ruleCommand ) )
            // InternalLggeWhile.g:3213:2: ( ruleCommand )
            {
            // InternalLggeWhile.g:3213:2: ( ruleCommand )
            // InternalLggeWhile.g:3214:3: ruleCommand
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


    // $ANTLR start "rule__WhileCommand__ExprAssignment_1"
    // InternalLggeWhile.g:3223:1: rule__WhileCommand__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__WhileCommand__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3227:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3228:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3228:2: ( ruleExpr )
            // InternalLggeWhile.g:3229:3: ruleExpr
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
    // InternalLggeWhile.g:3238:1: rule__WhileCommand__CommandsAssignment_3 : ( ruleCommands ) ;
    public final void rule__WhileCommand__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3242:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3243:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3243:2: ( ruleCommands )
            // InternalLggeWhile.g:3244:3: ruleCommands
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
    // InternalLggeWhile.g:3253:1: rule__IfCommand__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__IfCommand__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3257:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3258:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3258:2: ( ruleExpr )
            // InternalLggeWhile.g:3259:3: ruleExpr
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
    // InternalLggeWhile.g:3268:1: rule__IfCommand__CommandsAssignment_3 : ( ruleCommands ) ;
    public final void rule__IfCommand__CommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3272:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3273:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3273:2: ( ruleCommands )
            // InternalLggeWhile.g:3274:3: ruleCommands
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
    // InternalLggeWhile.g:3283:1: rule__IfCommand__ElsecommandsAssignment_4_1 : ( ruleCommands ) ;
    public final void rule__IfCommand__ElsecommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3287:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3288:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3288:2: ( ruleCommands )
            // InternalLggeWhile.g:3289:3: ruleCommands
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
    // InternalLggeWhile.g:3298:1: rule__ForCommand__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__ForCommand__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3302:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3303:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3303:2: ( ruleExpr )
            // InternalLggeWhile.g:3304:3: ruleExpr
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
    // InternalLggeWhile.g:3313:1: rule__ForCommand__CommandAssignment_3 : ( ruleCommands ) ;
    public final void rule__ForCommand__CommandAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3317:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3318:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3318:2: ( ruleCommands )
            // InternalLggeWhile.g:3319:3: ruleCommands
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
    // InternalLggeWhile.g:3328:1: rule__AffectCommand__VarsAssignment_0 : ( ruleVars ) ;
    public final void rule__AffectCommand__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3332:1: ( ( ruleVars ) )
            // InternalLggeWhile.g:3333:2: ( ruleVars )
            {
            // InternalLggeWhile.g:3333:2: ( ruleVars )
            // InternalLggeWhile.g:3334:3: ruleVars
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
    // InternalLggeWhile.g:3343:1: rule__AffectCommand__ExprsAssignment_2 : ( ruleExprs ) ;
    public final void rule__AffectCommand__ExprsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3347:1: ( ( ruleExprs ) )
            // InternalLggeWhile.g:3348:2: ( ruleExprs )
            {
            // InternalLggeWhile.g:3348:2: ( ruleExprs )
            // InternalLggeWhile.g:3349:3: ruleExprs
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
    // InternalLggeWhile.g:3358:1: rule__ForeachCommand__VarsAssignment_1 : ( ruleVars ) ;
    public final void rule__ForeachCommand__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3362:1: ( ( ruleVars ) )
            // InternalLggeWhile.g:3363:2: ( ruleVars )
            {
            // InternalLggeWhile.g:3363:2: ( ruleVars )
            // InternalLggeWhile.g:3364:3: ruleVars
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
    // InternalLggeWhile.g:3373:1: rule__ForeachCommand__ExprAssignment_3 : ( ruleExpr ) ;
    public final void rule__ForeachCommand__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3377:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3378:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3378:2: ( ruleExpr )
            // InternalLggeWhile.g:3379:3: ruleExpr
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
    // InternalLggeWhile.g:3388:1: rule__ForeachCommand__CommandsAssignment_5 : ( ruleCommands ) ;
    public final void rule__ForeachCommand__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3392:1: ( ( ruleCommands ) )
            // InternalLggeWhile.g:3393:2: ( ruleCommands )
            {
            // InternalLggeWhile.g:3393:2: ( ruleCommands )
            // InternalLggeWhile.g:3394:3: ruleCommands
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
    // InternalLggeWhile.g:3403:1: rule__Exprs__ExprAssignment_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3407:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3408:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3408:2: ( ruleExpr )
            // InternalLggeWhile.g:3409:3: ruleExpr
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
    // InternalLggeWhile.g:3418:1: rule__Exprs__ExprAssignment_1_1 : ( ruleExpr ) ;
    public final void rule__Exprs__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3422:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3423:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3423:2: ( ruleExpr )
            // InternalLggeWhile.g:3424:3: ruleExpr
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


    // $ANTLR start "rule__Vars__VarAssignment_0"
    // InternalLggeWhile.g:3433:1: rule__Vars__VarAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3437:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:3438:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:3438:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:3439:3: RULE_VARIABLE
            {
             before(grammarAccess.getVarsAccess().getVarVARIABLETerminalRuleCall_0_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getVarsAccess().getVarVARIABLETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Vars__VarAssignment_0"


    // $ANTLR start "rule__Vars__VarAssignment_1_1"
    // InternalLggeWhile.g:3448:1: rule__Vars__VarAssignment_1_1 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__VarAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3452:1: ( ( RULE_VARIABLE ) )
            // InternalLggeWhile.g:3453:2: ( RULE_VARIABLE )
            {
            // InternalLggeWhile.g:3453:2: ( RULE_VARIABLE )
            // InternalLggeWhile.g:3454:3: RULE_VARIABLE
            {
             before(grammarAccess.getVarsAccess().getVarVARIABLETerminalRuleCall_1_1_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getVarsAccess().getVarVARIABLETerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Vars__VarAssignment_1_1"


    // $ANTLR start "rule__Expr__ExprbaseAssignment_0"
    // InternalLggeWhile.g:3463:1: rule__Expr__ExprbaseAssignment_0 : ( ruleExprBase ) ;
    public final void rule__Expr__ExprbaseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3467:1: ( ( ruleExprBase ) )
            // InternalLggeWhile.g:3468:2: ( ruleExprBase )
            {
            // InternalLggeWhile.g:3468:2: ( ruleExprBase )
            // InternalLggeWhile.g:3469:3: ruleExprBase
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


    // $ANTLR start "rule__Expr__ExprbaseAssignment_1_1"
    // InternalLggeWhile.g:3478:1: rule__Expr__ExprbaseAssignment_1_1 : ( ruleExprBase ) ;
    public final void rule__Expr__ExprbaseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3482:1: ( ( ruleExprBase ) )
            // InternalLggeWhile.g:3483:2: ( ruleExprBase )
            {
            // InternalLggeWhile.g:3483:2: ( ruleExprBase )
            // InternalLggeWhile.g:3484:3: ruleExprBase
            {
             before(grammarAccess.getExprAccess().getExprbaseExprBaseParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExprBase();

            state._fsp--;

             after(grammarAccess.getExprAccess().getExprbaseExprBaseParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expr__ExprbaseAssignment_1_1"


    // $ANTLR start "rule__LExpr__ExprAssignment"
    // InternalLggeWhile.g:3493:1: rule__LExpr__ExprAssignment : ( ruleExpr ) ;
    public final void rule__LExpr__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLggeWhile.g:3497:1: ( ( ruleExpr ) )
            // InternalLggeWhile.g:3498:2: ( ruleExpr )
            {
            // InternalLggeWhile.g:3498:2: ( ruleExpr )
            // InternalLggeWhile.g:3499:3: ruleExpr
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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\5\5\uffff";
    static final String dfa_3s = "\1\42\3\uffff\1\47\5\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\10\1\7\1\6\1\5\1\4";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\33\uffff\1\1\1\4",
            "",
            "",
            "",
            "\1\5\35\uffff\1\11\1\uffff\1\10\1\7\1\6",
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
            return "529:1: rule__ExprBase__Alternatives : ( ( ( rule__ExprBase__Group_0__0 ) ) | ( ( rule__ExprBase__Group_1__0 ) ) | ( ( rule__ExprBase__Group_2__0 ) ) | ( ( rule__ExprBase__Group_3__0 ) ) | ( ( rule__ExprBase__Group_4__0 ) ) | ( ( rule__ExprBase__Group_5__0 ) ) | ( ( rule__ExprBase__Group_6__0 ) ) | ( ( rule__ExprBase__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000600000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000051300010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000600000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});

}