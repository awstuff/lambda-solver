// Generated from /Users/adrian/Programmieren/Java/lambda-solver/src/Lambda.g4 by ANTLR 4.7
package com.adrianwirth.lambdasolver.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LambdaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LAMBDA=1, DOT=2, OPEN_PAREN=3, CLOSE_PAREN=4, VARIABLE=5, WHITESPACE=6;
	public static final int
		RULE_parse = 0, RULE_lambdaTerm = 1, RULE_abstraction = 2, RULE_variable = 3;
	public static final String[] ruleNames = {
		"parse", "lambdaTerm", "abstraction", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\'", "'.'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LAMBDA", "DOT", "OPEN_PAREN", "CLOSE_PAREN", "VARIABLE", "WHITESPACE"
	};
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

	@Override
	public String getGrammarFileName() { return "Lambda.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LambdaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public com.adrianwirth.lambdasolver.model.LambdaTerm value;
		public LambdaTermContext lambdaTerm;
		public LambdaTermContext lambdaTerm() {
			return getRuleContext(LambdaTermContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LambdaParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			((ParseContext)_localctx).lambdaTerm = lambdaTerm(0);
			setState(9);
			match(EOF);
			((ParseContext)_localctx).value =  ((ParseContext)_localctx).lambdaTerm.value;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaTermContext extends ParserRuleContext {
		public com.adrianwirth.lambdasolver.model.LambdaTerm value;
		public LambdaTermContext left;
		public VariableContext variable;
		public AbstractionContext abstraction;
		public LambdaTermContext lambdaTerm;
		public LambdaTermContext right;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AbstractionContext abstraction() {
			return getRuleContext(AbstractionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(LambdaParser.OPEN_PAREN, 0); }
		public List<LambdaTermContext> lambdaTerm() {
			return getRuleContexts(LambdaTermContext.class);
		}
		public LambdaTermContext lambdaTerm(int i) {
			return getRuleContext(LambdaTermContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(LambdaParser.CLOSE_PAREN, 0); }
		public LambdaTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterLambdaTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitLambdaTerm(this);
		}
	}

	public final LambdaTermContext lambdaTerm() throws RecognitionException {
		return lambdaTerm(0);
	}

	private LambdaTermContext lambdaTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LambdaTermContext _localctx = new LambdaTermContext(_ctx, _parentState);
		LambdaTermContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_lambdaTerm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				{
				setState(13);
				((LambdaTermContext)_localctx).variable = variable();
				((LambdaTermContext)_localctx).value =  ((LambdaTermContext)_localctx).variable.value;
				}
				break;
			case LAMBDA:
				{
				setState(16);
				((LambdaTermContext)_localctx).abstraction = abstraction();
				((LambdaTermContext)_localctx).value =  ((LambdaTermContext)_localctx).abstraction.value;
				}
				break;
			case OPEN_PAREN:
				{
				setState(19);
				match(OPEN_PAREN);
				setState(20);
				((LambdaTermContext)_localctx).lambdaTerm = lambdaTerm(0);
				setState(21);
				match(CLOSE_PAREN);
				((LambdaTermContext)_localctx).value =  ((LambdaTermContext)_localctx).lambdaTerm.value;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LambdaTermContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_lambdaTerm);
					setState(26);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(27);
					((LambdaTermContext)_localctx).right = ((LambdaTermContext)_localctx).lambdaTerm = lambdaTerm(4);
					((LambdaTermContext)_localctx).value =  new com.adrianwirth.lambdasolver.model.Application(((LambdaTermContext)_localctx).left.value, ((LambdaTermContext)_localctx).right.value);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractionContext extends ParserRuleContext {
		public com.adrianwirth.lambdasolver.model.Abstraction value;
		public VariableContext variable;
		public LambdaTermContext lambdaTerm;
		public TerminalNode LAMBDA() { return getToken(LambdaParser.LAMBDA, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LambdaParser.DOT, 0); }
		public LambdaTermContext lambdaTerm() {
			return getRuleContext(LambdaTermContext.class,0);
		}
		public AbstractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterAbstraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitAbstraction(this);
		}
	}

	public final AbstractionContext abstraction() throws RecognitionException {
		AbstractionContext _localctx = new AbstractionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_abstraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(LAMBDA);
			setState(36);
			((AbstractionContext)_localctx).variable = variable();
			setState(37);
			match(DOT);
			setState(38);
			((AbstractionContext)_localctx).lambdaTerm = lambdaTerm(0);
			((AbstractionContext)_localctx).value =  new com.adrianwirth.lambdasolver.model.Abstraction(((AbstractionContext)_localctx).variable.value, ((AbstractionContext)_localctx).lambdaTerm.value);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public com.adrianwirth.lambdasolver.model.Variable value;
		public TerminalNode VARIABLE() { return getToken(LambdaParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LambdaListener ) ((LambdaListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(VARIABLE);
			((VariableContext)_localctx).value =  new com.adrianwirth.lambdasolver.model.Variable(_input.getText(_localctx.start, _input.LT(-1)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return lambdaTerm_sempred((LambdaTermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lambdaTerm_sempred(LambdaTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\2\3\4\6\2\4\6\b\2\2\2-\2\n\3\2\2\2"+
		"\4\32\3\2\2\2\6%\3\2\2\2\b+\3\2\2\2\n\13\5\4\3\2\13\f\7\2\2\3\f\r\b\2"+
		"\1\2\r\3\3\2\2\2\16\17\b\3\1\2\17\20\5\b\5\2\20\21\b\3\1\2\21\33\3\2\2"+
		"\2\22\23\5\6\4\2\23\24\b\3\1\2\24\33\3\2\2\2\25\26\7\5\2\2\26\27\5\4\3"+
		"\2\27\30\7\6\2\2\30\31\b\3\1\2\31\33\3\2\2\2\32\16\3\2\2\2\32\22\3\2\2"+
		"\2\32\25\3\2\2\2\33\"\3\2\2\2\34\35\f\5\2\2\35\36\5\4\3\6\36\37\b\3\1"+
		"\2\37!\3\2\2\2 \34\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\5\3\2\2\2"+
		"$\"\3\2\2\2%&\7\3\2\2&\'\5\b\5\2\'(\7\4\2\2()\5\4\3\2)*\b\4\1\2*\7\3\2"+
		"\2\2+,\7\7\2\2,-\b\5\1\2-\t\3\2\2\2\4\32\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}