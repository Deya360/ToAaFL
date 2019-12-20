// Generated from C:/Users/Deya/Documents/Projects/TAAFL - Sem5/Practical6\Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, NUM=11, NUMROMAN=12, WHITESPACE=13, EQUALS=14, ADD=15, SUB=16, 
		MUL=17, DIV=18, LTHAN=19, GTHAN=20, LTHANEQU=21, GTHANEQU=22, ISEQUAL=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ID", "NUM", "NUMROMAN", "WHITESPACE", "EQUALS", "ADD", "SUB", "MUL", 
			"DIV", "LTHAN", "GTHAN", "LTHANEQU", "GTHANEQU", "ISEQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DO'", "'do'", "'WHILE'", "'while'", "';'", "'PRINT'", "'print'", 
			"'('", "')'", null, null, null, "' '", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'<'", "'>'", "'<='", "'>='", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "NUM", 
			"NUMROMAN", "WHITESPACE", "EQUALS", "ADD", "SUB", "MUL", "DIV", "LTHAN", 
			"GTHAN", "LTHANEQU", "GTHANEQU", "ISEQUAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11:
			NUMROMAN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NUMROMAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			0,4
			break;
		case 1:
			0,3
			break;
		case 2:
			0,3
			break;
		case 3:
			0,3
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\7\13X\n\13\f\13\16\13[\13\13\3\f\6\f^\n\f\r\f\16\f_\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\ri\n\r\3\r\3\r\5\rm\n\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"t\n\r\3\r\3\r\5\rx\n\r\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3\r\3\r\5\r\u0083"+
		"\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\4\4\2C\\c|\3\2\62;\2"+
		"\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\3\61\3\2\2\2\5\64\3\2\2\2\7\67\3\2\2\2\t=\3\2\2\2\13C\3\2\2"+
		"\2\rE\3\2\2\2\17K\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27]\3\2"+
		"\2\2\31a\3\2\2\2\33\u0084\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c"+
		"\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u0092\3\2\2\2)\u0094\3\2\2\2"+
		"+\u0096\3\2\2\2-\u0099\3\2\2\2/\u009c\3\2\2\2\61\62\7F\2\2\62\63\7Q\2"+
		"\2\63\4\3\2\2\2\64\65\7f\2\2\65\66\7q\2\2\66\6\3\2\2\2\678\7Y\2\289\7"+
		"J\2\29:\7K\2\2:;\7N\2\2;<\7G\2\2<\b\3\2\2\2=>\7y\2\2>?\7j\2\2?@\7k\2\2"+
		"@A\7n\2\2AB\7g\2\2B\n\3\2\2\2CD\7=\2\2D\f\3\2\2\2EF\7R\2\2FG\7T\2\2GH"+
		"\7K\2\2HI\7P\2\2IJ\7V\2\2J\16\3\2\2\2KL\7r\2\2LM\7t\2\2MN\7k\2\2NO\7p"+
		"\2\2OP\7v\2\2P\20\3\2\2\2QR\7*\2\2R\22\3\2\2\2ST\7+\2\2T\24\3\2\2\2UY"+
		"\t\2\2\2VX\t\2\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\26\3\2\2\2"+
		"[Y\3\2\2\2\\^\t\3\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\30\3\2"+
		"\2\2ab\7O\2\2bl\b\r\2\2cd\7E\2\2dm\7O\2\2ef\7E\2\2fm\7F\2\2gi\7F\2\2h"+
		"g\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7E\2\2km\b\r\3\2lc\3\2\2\2le\3\2\2\2l"+
		"h\3\2\2\2mw\3\2\2\2no\7Z\2\2ox\7E\2\2pq\7Z\2\2qx\7N\2\2rt\7N\2\2sr\3\2"+
		"\2\2st\3\2\2\2tu\3\2\2\2uv\7Z\2\2vx\b\r\4\2wn\3\2\2\2wp\3\2\2\2ws\3\2"+
		"\2\2x\u0082\3\2\2\2yz\7K\2\2z\u0083\7Z\2\2{|\7K\2\2|\u0083\7X\2\2}\177"+
		"\7X\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7K\2\2\u0081"+
		"\u0083\b\r\5\2\u0082y\3\2\2\2\u0082{\3\2\2\2\u0082~\3\2\2\2\u0083\32\3"+
		"\2\2\2\u0084\u0085\7\"\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\16\6\2\u0087"+
		"\34\3\2\2\2\u0088\u0089\7?\2\2\u0089\36\3\2\2\2\u008a\u008b\7-\2\2\u008b"+
		" \3\2\2\2\u008c\u008d\7/\2\2\u008d\"\3\2\2\2\u008e\u008f\7,\2\2\u008f"+
		"$\3\2\2\2\u0090\u0091\7\61\2\2\u0091&\3\2\2\2\u0092\u0093\7>\2\2\u0093"+
		"(\3\2\2\2\u0094\u0095\7@\2\2\u0095*\3\2\2\2\u0096\u0097\7>\2\2\u0097\u0098"+
		"\7?\2\2\u0098,\3\2\2\2\u0099\u009a\7@\2\2\u009a\u009b\7?\2\2\u009b.\3"+
		"\2\2\2\u009c\u009d\7?\2\2\u009d\u009e\7?\2\2\u009e\60\3\2\2\2\13\2Y_h"+
		"lsw~\u0082\7\3\r\2\3\r\3\3\r\4\3\r\5\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}