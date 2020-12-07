package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLggeWhileLexer extends Lexer {
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

    public InternalLggeWhileLexer() {;} 
    public InternalLggeWhileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLggeWhileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLggeWhile.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:11:7: ( 'function' )
            // InternalLggeWhile.g:11:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:12:7: ( ':' )
            // InternalLggeWhile.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:13:7: ( 'read' )
            // InternalLggeWhile.g:13:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:14:7: ( '%' )
            // InternalLggeWhile.g:14:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:15:7: ( 'write' )
            // InternalLggeWhile.g:15:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:16:7: ( ',' )
            // InternalLggeWhile.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:17:7: ( ';' )
            // InternalLggeWhile.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:18:7: ( 'nop' )
            // InternalLggeWhile.g:18:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:19:7: ( 'while' )
            // InternalLggeWhile.g:19:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:20:7: ( 'do' )
            // InternalLggeWhile.g:20:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:21:7: ( 'od' )
            // InternalLggeWhile.g:21:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:22:7: ( 'if' )
            // InternalLggeWhile.g:22:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:23:7: ( 'then' )
            // InternalLggeWhile.g:23:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:24:7: ( 'else' )
            // InternalLggeWhile.g:24:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:25:7: ( 'fi' )
            // InternalLggeWhile.g:25:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:26:7: ( 'for' )
            // InternalLggeWhile.g:26:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:27:7: ( ':=' )
            // InternalLggeWhile.g:27:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:28:7: ( 'foreach' )
            // InternalLggeWhile.g:28:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:29:7: ( 'in' )
            // InternalLggeWhile.g:29:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:30:7: ( '=?' )
            // InternalLggeWhile.g:30:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:31:7: ( 'nil' )
            // InternalLggeWhile.g:31:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:32:7: ( '(' )
            // InternalLggeWhile.g:32:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:33:7: ( 'cons' )
            // InternalLggeWhile.g:33:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:34:7: ( ')' )
            // InternalLggeWhile.g:34:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:35:7: ( 'list' )
            // InternalLggeWhile.g:35:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:36:7: ( 'hd' )
            // InternalLggeWhile.g:36:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:37:7: ( 'tl' )
            // InternalLggeWhile.g:37:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:1446:13: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )? )
            // InternalLggeWhile.g:1446:15: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('a','z'); 
            // InternalLggeWhile.g:1446:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLggeWhile.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLggeWhile.g:1446:54: ( '!' | '?' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='!'||LA2_0=='?') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLggeWhile.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:1448:15: ( 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )? )
            // InternalLggeWhile.g:1448:17: 'A' .. 'Z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )?
            {
            matchRange('A','Z'); 
            // InternalLggeWhile.g:1448:26: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLggeWhile.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalLggeWhile.g:1448:56: ( '!' | '?' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='!'||LA4_0=='?') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLggeWhile.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:1450:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLggeWhile.g:1450:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLggeWhile.g:1450:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLggeWhile.g:1450:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLggeWhile.g:1450:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLggeWhile.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:1452:10: ( ( '0' .. '9' )+ )
            // InternalLggeWhile.g:1452:12: ( '0' .. '9' )+
            {
            // InternalLggeWhile.g:1452:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLggeWhile.g:1452:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:1454:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLggeWhile.g:1454:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLggeWhile.g:1454:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLggeWhile.g:1454:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLggeWhile.g:1454:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalLggeWhile.g:1454:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLggeWhile.g:1454:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLggeWhile.g:1454:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLggeWhile.g:1454:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalLggeWhile.g:1454:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLggeWhile.g:1454:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:1456:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLggeWhile.g:1456:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLggeWhile.g:1456:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLggeWhile.g:1456:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:1458:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLggeWhile.g:1458:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLggeWhile.g:1458:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLggeWhile.g:1458:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalLggeWhile.g:1458:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLggeWhile.g:1458:41: ( '\\r' )? '\\n'
                    {
                    // InternalLggeWhile.g:1458:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalLggeWhile.g:1458:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:1460:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLggeWhile.g:1460:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLggeWhile.g:1460:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLggeWhile.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLggeWhile.g:1462:16: ( . )
            // InternalLggeWhile.g:1462:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalLggeWhile.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_SYMBOL | RULE_VARIABLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=36;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalLggeWhile.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalLggeWhile.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalLggeWhile.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalLggeWhile.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalLggeWhile.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalLggeWhile.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalLggeWhile.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalLggeWhile.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalLggeWhile.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalLggeWhile.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalLggeWhile.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalLggeWhile.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalLggeWhile.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalLggeWhile.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalLggeWhile.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalLggeWhile.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalLggeWhile.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalLggeWhile.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalLggeWhile.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalLggeWhile.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalLggeWhile.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalLggeWhile.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalLggeWhile.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalLggeWhile.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalLggeWhile.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalLggeWhile.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalLggeWhile.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalLggeWhile.g:1:172: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 29 :
                // InternalLggeWhile.g:1:184: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 30 :
                // InternalLggeWhile.g:1:198: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalLggeWhile.g:1:206: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalLggeWhile.g:1:215: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalLggeWhile.g:1:227: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalLggeWhile.g:1:243: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalLggeWhile.g:1:259: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalLggeWhile.g:1:267: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\42\1\45\1\42\1\uffff\1\42\2\uffff\6\42\1\35\1\uffff\1\42\1\uffff\3\42\1\74\1\35\2\uffff\3\35\2\uffff\1\42\1\103\2\42\4\uffff\1\42\1\uffff\2\42\2\uffff\2\42\1\112\1\113\1\114\1\115\1\42\1\117\1\42\2\uffff\1\42\1\uffff\1\42\1\123\1\74\6\uffff\1\42\1\uffff\1\126\3\42\1\132\1\133\4\uffff\1\42\1\uffff\3\42\1\uffff\2\42\1\uffff\1\142\2\42\2\uffff\1\145\1\146\1\147\1\150\2\42\1\uffff\1\153\1\154\4\uffff\2\42\2\uffff\1\42\1\160\1\161\2\uffff";
    static final String DFA16_eofS =
        "\162\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\2\uffff\6\60\1\77\1\uffff\1\60\1\uffff\4\60\1\101\2\uffff\2\0\1\52\2\uffff\1\60\1\41\2\60\4\uffff\1\60\1\uffff\2\60\2\uffff\2\60\4\41\1\60\1\41\1\60\2\uffff\1\60\1\uffff\1\60\1\41\1\60\6\uffff\1\60\1\uffff\1\41\3\60\2\41\4\uffff\1\60\1\uffff\3\60\1\uffff\2\60\1\uffff\1\41\2\60\2\uffff\4\41\2\60\1\uffff\2\41\4\uffff\2\60\2\uffff\1\60\2\41\2\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\6\172\1\77\1\uffff\1\172\1\uffff\5\172\2\uffff\2\uffff\1\57\2\uffff\4\172\4\uffff\1\172\1\uffff\2\172\2\uffff\11\172\2\uffff\1\172\1\uffff\3\172\6\uffff\1\172\1\uffff\6\172\4\uffff\1\172\1\uffff\3\172\1\uffff\2\172\1\uffff\3\172\2\uffff\6\172\1\uffff\2\172\4\uffff\2\172\2\uffff\3\172\2\uffff";
    static final String DFA16_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\7\uffff\1\26\1\uffff\1\30\5\uffff\1\36\1\37\3\uffff\1\43\1\44\4\uffff\1\34\1\36\1\21\1\2\1\uffff\1\4\2\uffff\1\6\1\7\11\uffff\1\24\1\26\1\uffff\1\30\3\uffff\1\35\1\37\1\40\1\41\1\42\1\43\1\uffff\1\17\6\uffff\1\12\1\13\1\14\1\23\1\uffff\1\33\3\uffff\1\32\2\uffff\1\20\3\uffff\1\10\1\25\6\uffff\1\3\2\uffff\1\15\1\16\1\27\1\31\2\uffff\1\5\1\11\3\uffff\1\22\1\1";
    static final String DFA16_specialS =
        "\1\1\30\uffff\1\0\1\2\127\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\31\2\35\1\4\1\35\1\32\1\17\1\21\2\35\1\6\2\35\1\33\12\30\1\2\1\7\1\35\1\16\3\35\32\25\3\35\1\26\1\27\1\35\2\24\1\20\1\11\1\15\1\1\1\24\1\23\1\13\2\24\1\22\1\24\1\10\1\12\2\24\1\3\1\24\1\14\2\24\1\5\3\24\uff85\35",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\10\41\1\37\5\41\1\40\5\41\1\36\5\41",
            "\1\44",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41\1\46\25\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\7\41\1\51\11\41\1\50\10\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\10\41\1\55\5\41\1\54\13\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\16\41\1\56\13\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\3\41\1\57\26\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\5\41\1\60\7\41\1\61\14\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\7\41\1\62\3\41\1\63\16\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\13\41\1\64\16\41",
            "\1\65",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\16\41\1\67\13\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\10\41\1\71\21\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\3\41\1\72\26\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\12\73\7\uffff\32\73\4\uffff\1\43\1\uffff\32\73",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\0\76",
            "\0\76",
            "\1\77\4\uffff\1\100",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\15\41\1\102\14\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\21\41\1\104\10\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\1\105\31\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\10\41\1\106\21\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\10\41\1\107\21\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\17\41\1\110\12\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\13\41\1\111\16\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41\1\116\25\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\22\41\1\120\7\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\15\41\1\121\14\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\22\41\1\122\7\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\12\73\7\uffff\32\73\4\uffff\1\43\1\uffff\32\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\2\41\1\124\27\41",
            "",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\4\41\1\125\25\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\3\41\1\127\26\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41\1\130\6\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\13\41\1\131\16\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\15\41\1\134\14\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41\1\135\25\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\22\41\1\136\7\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41\1\137\6\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41\1\140\6\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\1\141\31\41",
            "",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41\1\143\25\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41\1\144\25\41",
            "",
            "",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\10\41\1\151\21\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\2\41\1\152\27\41",
            "",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\16\41\1\155\13\41",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\7\41\1\156\22\41",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\15\41\1\157\14\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\16\uffff\12\41\5\uffff\1\42\1\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_SYMBOL | RULE_VARIABLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_25 = input.LA(1);

                        s = -1;
                        if ( ((LA16_25>='\u0000' && LA16_25<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='f') ) {s = 1;}

                        else if ( (LA16_0==':') ) {s = 2;}

                        else if ( (LA16_0=='r') ) {s = 3;}

                        else if ( (LA16_0=='%') ) {s = 4;}

                        else if ( (LA16_0=='w') ) {s = 5;}

                        else if ( (LA16_0==',') ) {s = 6;}

                        else if ( (LA16_0==';') ) {s = 7;}

                        else if ( (LA16_0=='n') ) {s = 8;}

                        else if ( (LA16_0=='d') ) {s = 9;}

                        else if ( (LA16_0=='o') ) {s = 10;}

                        else if ( (LA16_0=='i') ) {s = 11;}

                        else if ( (LA16_0=='t') ) {s = 12;}

                        else if ( (LA16_0=='e') ) {s = 13;}

                        else if ( (LA16_0=='=') ) {s = 14;}

                        else if ( (LA16_0=='(') ) {s = 15;}

                        else if ( (LA16_0=='c') ) {s = 16;}

                        else if ( (LA16_0==')') ) {s = 17;}

                        else if ( (LA16_0=='l') ) {s = 18;}

                        else if ( (LA16_0=='h') ) {s = 19;}

                        else if ( ((LA16_0>='a' && LA16_0<='b')||LA16_0=='g'||(LA16_0>='j' && LA16_0<='k')||LA16_0=='m'||(LA16_0>='p' && LA16_0<='q')||LA16_0=='s'||(LA16_0>='u' && LA16_0<='v')||(LA16_0>='x' && LA16_0<='z')) ) {s = 20;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')) ) {s = 21;}

                        else if ( (LA16_0=='^') ) {s = 22;}

                        else if ( (LA16_0=='_') ) {s = 23;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 24;}

                        else if ( (LA16_0=='\"') ) {s = 25;}

                        else if ( (LA16_0=='\'') ) {s = 26;}

                        else if ( (LA16_0=='/') ) {s = 27;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 28;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='$')||LA16_0=='&'||(LA16_0>='*' && LA16_0<='+')||(LA16_0>='-' && LA16_0<='.')||LA16_0=='<'||(LA16_0>='>' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||(LA16_0>='{' && LA16_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_26 = input.LA(1);

                        s = -1;
                        if ( ((LA16_26>='\u0000' && LA16_26<='\uFFFF')) ) {s = 62;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}