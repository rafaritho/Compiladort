// Generated from /home/rarks/Desktop/c/Compiladort/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

package decaf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCURLY=1, RCURLY=2, LBRACKET=3, RBRACKET=4, LP=5, RP=6, PROGRAM=7, CLASS=8, 
		SINAL=9, BOOLEAN=10, INTVAR=11, VOID=12, IF=13, ELSE=14, FOR=15, RETURN=16, 
		BREAK=17, CALLOUT=18, CONTINUE=19, BOOLEANLITERAL=20, EXCLAMATION=21, 
		OR=22, EQUAL=23, PLUS=24, MINUS=25, MULT=26, AND=27, EQUALS=28, DIV=29, 
		MOD=30, PLUSEQUAL=31, MINUSEQUAL=32, SEMICOLON=33, COMMA=34, COLON=35, 
		LESS=36, BIGGER=37, LESSEQ=38, BIGGEREQ=39, DIFFERENT=40, ID=41, INTLITERAL=42, 
		WS_=43, SL_COMMENT=44, CHAR=45, STRING=46, HEXLITERAL=47, ERRO_HEX=48, 
		NUM=49, C=50;
	public static final int
		RULE_program = 0, RULE_method_decl = 1, RULE_block_decl = 2, RULE_var_decl = 3, 
		RULE_array_decl = 4, RULE_type_id = 5, RULE_type = 6, RULE_statement_decl = 7, 
		RULE_assign_op = 8, RULE_method_call = 9, RULE_method_name = 10, RULE_location_decl = 11, 
		RULE_expr_decl = 12, RULE_identifier_decl = 13, RULE_bin_op = 14, RULE_arith_op = 15, 
		RULE_rel_op = 16, RULE_eq_op = 17, RULE_cond_op = 18;
	public static final String[] ruleNames = {
		"program", "method_decl", "block_decl", "var_decl", "array_decl", "type_id", 
		"type", "statement_decl", "assign_op", "method_call", "method_name", "location_decl", 
		"expr_decl", "identifier_decl", "bin_op", "arith_op", "rel_op", "eq_op", 
		"cond_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'Program'", "'class'", 
		null, "'boolean'", "'int'", "'void'", "'if'", "'else'", "'for'", "'return'", 
		"'break'", "'callout'", "'continue'", null, "'!'", "'||'", "'='", "'+'", 
		"'-'", "'*'", "'&&'", "'=='", "'/'", "'%'", "'+='", "'-='", "';'", "','", 
		"':'", "'<'", "'>'", "'>='", "'<='", "'!='", null, null, null, null, null, 
		null, null, "'0x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "LP", "RP", "PROGRAM", 
		"CLASS", "SINAL", "BOOLEAN", "INTVAR", "VOID", "IF", "ELSE", "FOR", "RETURN", 
		"BREAK", "CALLOUT", "CONTINUE", "BOOLEANLITERAL", "EXCLAMATION", "OR", 
		"EQUAL", "PLUS", "MINUS", "MULT", "AND", "EQUALS", "DIV", "MOD", "PLUSEQUAL", 
		"MINUSEQUAL", "SEMICOLON", "COMMA", "COLON", "LESS", "BIGGER", "LESSEQ", 
		"BIGGEREQ", "DIFFERENT", "ID", "INTLITERAL", "WS_", "SL_COMMENT", "CHAR", 
		"STRING", "HEXLITERAL", "ERRO_HEX", "NUM", "C"
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
	public String getGrammarFileName() { return "DecafParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(DecafParser.CLASS, 0); }
		public TerminalNode PROGRAM() { return getToken(DecafParser.PROGRAM, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(CLASS);
			setState(39);
			match(PROGRAM);
			setState(40);
			match(LCURLY);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(41);
							var_decl();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(44); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTVAR) | (1L << VOID))) != 0)) {
				{
				{
				setState(51);
				method_decl();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(RCURLY);
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

	public static class Method_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LP() { return getToken(DecafParser.LP, 0); }
		public TerminalNode RP() { return getToken(DecafParser.RP, 0); }
		public Block_declContext block_decl() {
			return getRuleContext(Block_declContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<TerminalNode> SINAL() { return getTokens(DecafParser.SINAL); }
		public TerminalNode SINAL(int i) {
			return getToken(DecafParser.SINAL, i);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTVAR:
				{
				setState(59);
				type();
				}
				break;
			case VOID:
				{
				setState(60);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(63);
			match(ID);
			setState(64);
			match(LP);
			setState(76);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INTVAR) {
				{
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65);
					var_decl();
					}
					}
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOOLEAN || _la==INTVAR );
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SINAL) {
					{
					{
					setState(70);
					match(SINAL);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(78);
			match(RP);
			setState(79);
			block_decl();
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

	public static class Block_declContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<Statement_declContext> statement_decl() {
			return getRuleContexts(Statement_declContext.class);
		}
		public Statement_declContext statement_decl(int i) {
			return getRuleContext(Statement_declContext.class,i);
		}
		public Block_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock_decl(this);
		}
	}

	public final Block_declContext block_decl() throws RecognitionException {
		Block_declContext _localctx = new Block_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LCURLY);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INTVAR) {
				{
				{
				setState(82);
				var_decl();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				statement_decl();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(RCURLY);
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

	public static class Var_declContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public Array_declContext array_decl() {
			return getRuleContext(Array_declContext.class,0);
		}
		public List<TerminalNode> SINAL() { return getTokens(DecafParser.SINAL); }
		public TerminalNode SINAL(int i) {
			return getToken(DecafParser.SINAL, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(97);
					match(ID);
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(98);
							match(SINAL);
							}
							} 
						}
						setState(103);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(110);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(109);
				array_decl();
				}
			}

			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					match(SINAL);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
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

	public static class Array_declContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(DecafParser.LBRACKET, 0); }
		public TerminalNode INTLITERAL() { return getToken(DecafParser.INTLITERAL, 0); }
		public TerminalNode RBRACKET() { return getToken(DecafParser.RBRACKET, 0); }
		public Array_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterArray_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitArray_decl(this);
		}
	}

	public final Array_declContext array_decl() throws RecognitionException {
		Array_declContext _localctx = new Array_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LBRACKET);
			setState(119);
			match(INTLITERAL);
			setState(120);
			match(RBRACKET);
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

	public static class Type_idContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Type_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType_id(this);
		}
	}

	public final Type_idContext type_id() throws RecognitionException {
		Type_idContext _localctx = new Type_idContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			type();
			setState(123);
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTVAR() { return getToken(DecafParser.INTVAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(DecafParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==BOOLEAN || _la==INTVAR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class Statement_declContext extends ParserRuleContext {
		public Location_declContext location_decl() {
			return getRuleContext(Location_declContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public List<Expr_declContext> expr_decl() {
			return getRuleContexts(Expr_declContext.class);
		}
		public Expr_declContext expr_decl(int i) {
			return getRuleContext(Expr_declContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(DecafParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(DecafParser.RP, i);
		}
		public List<TerminalNode> SINAL() { return getTokens(DecafParser.SINAL); }
		public TerminalNode SINAL(int i) {
			return getToken(DecafParser.SINAL, i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public List<Block_declContext> block_decl() {
			return getRuleContexts(Block_declContext.class);
		}
		public Block_declContext block_decl(int i) {
			return getRuleContext(Block_declContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(DecafParser.EQUAL, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public Statement_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement_decl(this);
		}
	}

	public final Statement_declContext statement_decl() throws RecognitionException {
		Statement_declContext _localctx = new Statement_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement_decl);
		int _la;
		try {
			int _alt;
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				location_decl();
				setState(128);
				assign_op();
				setState(129);
				expr_decl(0);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RP) {
					{
					{
					setState(130);
					match(RP);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SINAL) {
					{
					{
					setState(136);
					match(SINAL);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				method_call();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SINAL) {
					{
					{
					setState(143);
					match(SINAL);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RP) {
					{
					{
					setState(149);
					match(RP);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(IF);
				{
				setState(156);
				expr_decl(0);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RP) {
					{
					{
					setState(157);
					match(RP);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				block_decl();
				}
				setState(167);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(165);
					match(ELSE);
					setState(166);
					block_decl();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(FOR);
				setState(170);
				match(ID);
				setState(171);
				match(EQUAL);
				setState(172);
				expr_decl(0);
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(173);
						match(RP);
						}
						} 
					}
					setState(178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(179);
						match(SINAL);
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(185);
				expr_decl(0);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RP) {
					{
					{
					setState(186);
					match(RP);
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				block_decl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(194);
				match(RETURN);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(195);
					expr_decl(0);
					}
					break;
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==RP) {
					{
					{
					setState(198);
					match(RP);
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(SINAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(BREAK);
				setState(206);
				match(SINAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				match(CONTINUE);
				setState(208);
				match(SINAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				block_decl();
				}
				break;
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

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(DecafParser.EQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(DecafParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(DecafParser.MINUSEQUAL, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << PLUSEQUAL) | (1L << MINUSEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LP() { return getToken(DecafParser.LP, 0); }
		public List<Expr_declContext> expr_decl() {
			return getRuleContexts(Expr_declContext.class);
		}
		public Expr_declContext expr_decl(int i) {
			return getRuleContext(Expr_declContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(DecafParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(DecafParser.RP, i);
		}
		public List<TerminalNode> SINAL() { return getTokens(DecafParser.SINAL); }
		public TerminalNode SINAL(int i) {
			return getToken(DecafParser.SINAL, i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public List<TerminalNode> STRING() { return getTokens(DecafParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DecafParser.STRING, i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_call);
		int _la;
		try {
			int _alt;
			setState(256);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ID);
				setState(215);
				match(LP);
				setState(216);
				expr_decl(0);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SINAL) {
					{
					{
					setState(217);
					match(SINAL);
					setState(218);
					expr_decl(0);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(224);
						match(RP);
						}
						} 
					}
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(230);
				match(RP);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(CALLOUT);
				setState(233);
				match(LP);
				setState(234);
				match(STRING);
				setState(253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(235);
							match(SINAL);
							}
							} 
						}
						setState(240);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					}
					setState(243); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							setState(243);
							switch (_input.LA(1)) {
							case LP:
							case RP:
							case SINAL:
							case CALLOUT:
							case BOOLEANLITERAL:
							case EXCLAMATION:
							case OR:
							case PLUS:
							case MINUS:
							case MULT:
							case AND:
							case EQUALS:
							case DIV:
							case MOD:
							case LESS:
							case BIGGER:
							case LESSEQ:
							case BIGGEREQ:
							case DIFFERENT:
							case ID:
							case INTLITERAL:
							case CHAR:
								{
								setState(241);
								expr_decl(0);
								}
								break;
							case STRING:
								{
								setState(242);
								match(STRING);
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(245); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SINAL) {
						{
						{
						setState(247);
						match(SINAL);
						}
						}
						setState(252);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(255);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ID);
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

	public static class Location_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(DecafParser.LBRACKET, 0); }
		public Expr_declContext expr_decl() {
			return getRuleContext(Expr_declContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(DecafParser.RBRACKET, 0); }
		public Location_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation_decl(this);
		}
	}

	public final Location_declContext location_decl() throws RecognitionException {
		Location_declContext _localctx = new Location_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_location_decl);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(ID);
				setState(262);
				match(LBRACKET);
				setState(263);
				expr_decl(0);
				setState(264);
				match(RBRACKET);
				}
				break;
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

	public static class Expr_declContext extends ParserRuleContext {
		public Location_declContext location_decl() {
			return getRuleContext(Location_declContext.class,0);
		}
		public List<TerminalNode> LP() { return getTokens(DecafParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(DecafParser.LP, i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Identifier_declContext identifier_decl() {
			return getRuleContext(Identifier_declContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(DecafParser.MINUS, 0); }
		public List<Expr_declContext> expr_decl() {
			return getRuleContexts(Expr_declContext.class);
		}
		public Expr_declContext expr_decl(int i) {
			return getRuleContext(Expr_declContext.class,i);
		}
		public TerminalNode EXCLAMATION() { return getToken(DecafParser.EXCLAMATION, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public TerminalNode SINAL() { return getToken(DecafParser.SINAL, 0); }
		public TerminalNode RP() { return getToken(DecafParser.RP, 0); }
		public Expr_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr_decl(this);
		}
	}

	public final Expr_declContext expr_decl() throws RecognitionException {
		return expr_decl(0);
	}

	private Expr_declContext expr_decl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_declContext _localctx = new Expr_declContext(_ctx, _parentState);
		Expr_declContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr_decl, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(269);
				location_decl();
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(270);
						match(LP);
						}
						} 
					}
					setState(275);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(276);
				method_call();
				}
				break;
			case 3:
				{
				setState(277);
				identifier_decl();
				}
				break;
			case 4:
				{
				setState(278);
				match(MINUS);
				setState(279);
				expr_decl(6);
				}
				break;
			case 5:
				{
				setState(280);
				match(EXCLAMATION);
				setState(281);
				expr_decl(5);
				}
				break;
			case 6:
				{
				setState(282);
				bin_op();
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(283);
						expr_decl(0);
						}
						} 
					}
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case 7:
				{
				setState(289);
				match(SINAL);
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(290);
						expr_decl(0);
						}
						} 
					}
					setState(295);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case 8:
				{
				setState(296);
				match(RP);
				setState(297);
				match(SINAL);
				}
				break;
			case 9:
				{
				setState(298);
				match(LP);
				setState(299);
				expr_decl(0);
				setState(300);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_declContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_decl);
					setState(304);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(305);
					bin_op();
					setState(306);
					expr_decl(8);
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class Identifier_declContext extends ParserRuleContext {
		public List<TerminalNode> INTLITERAL() { return getTokens(DecafParser.INTLITERAL); }
		public TerminalNode INTLITERAL(int i) {
			return getToken(DecafParser.INTLITERAL, i);
		}
		public TerminalNode CHAR() { return getToken(DecafParser.CHAR, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(DecafParser.BOOLEANLITERAL, 0); }
		public Identifier_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterIdentifier_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitIdentifier_decl(this);
		}
	}

	public final Identifier_declContext identifier_decl() throws RecognitionException {
		Identifier_declContext _localctx = new Identifier_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier_decl);
		try {
			int _alt;
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(INTLITERAL);
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314);
						match(INTLITERAL);
						}
						} 
					}
					setState(319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(INTLITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(BOOLEANLITERAL);
				}
				break;
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

	public static class Bin_opContext extends ParserRuleContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bin_op);
		try {
			setState(329);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				arith_op();
				}
				break;
			case LESS:
			case BIGGER:
			case LESSEQ:
			case BIGGEREQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				rel_op();
				}
				break;
			case EQUALS:
			case DIFFERENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				eq_op();
				}
				break;
			case OR:
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(DecafParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DecafParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(DecafParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(DecafParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(DecafParser.MOD, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitArith_op(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(DecafParser.LESS, 0); }
		public TerminalNode BIGGER() { return getToken(DecafParser.BIGGER, 0); }
		public TerminalNode LESSEQ() { return getToken(DecafParser.LESSEQ, 0); }
		public TerminalNode BIGGEREQ() { return getToken(DecafParser.BIGGEREQ, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << BIGGER) | (1L << LESSEQ) | (1L << BIGGEREQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DecafParser.EQUALS, 0); }
		public TerminalNode DIFFERENT() { return getToken(DecafParser.DIFFERENT, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==DIFFERENT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DecafParser.AND, 0); }
		public TerminalNode OR() { return getToken(DecafParser.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
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
		case 12:
			return expr_decl_sempred((Expr_declContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_decl_sempred(Expr_declContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u0156\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\6\2-\n\2\r\2\16\2.\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\5\3@\n\3\3"+
		"\3\3\3\3\3\6\3E\n\3\r\3\16\3F\3\3\7\3J\n\3\f\3\16\3M\13\3\5\3O\n\3\3\3"+
		"\3\3\3\3\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\7\4\\\n\4\f\4\16\4_\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\7\5k\n\5\f\5\16\5n\13\5\3"+
		"\5\5\5q\n\5\3\5\7\5t\n\5\f\5\16\5w\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\7\t\u0086\n\t\f\t\16\t\u0089\13\t\3\t\7\t\u008c"+
		"\n\t\f\t\16\t\u008f\13\t\3\t\3\t\7\t\u0093\n\t\f\t\16\t\u0096\13\t\3\t"+
		"\7\t\u0099\n\t\f\t\16\t\u009c\13\t\3\t\3\t\3\t\7\t\u00a1\n\t\f\t\16\t"+
		"\u00a4\13\t\3\t\3\t\3\t\3\t\5\t\u00aa\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b1"+
		"\n\t\f\t\16\t\u00b4\13\t\3\t\7\t\u00b7\n\t\f\t\16\t\u00ba\13\t\3\t\3\t"+
		"\7\t\u00be\n\t\f\t\16\t\u00c1\13\t\3\t\3\t\3\t\3\t\5\t\u00c7\n\t\3\t\7"+
		"\t\u00ca\n\t\f\t\16\t\u00cd\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00d5\n\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00de\n\13\f\13\16\13\u00e1\13"+
		"\13\3\13\7\13\u00e4\n\13\f\13\16\13\u00e7\13\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u00ef\n\13\f\13\16\13\u00f2\13\13\3\13\3\13\6\13\u00f6\n"+
		"\13\r\13\16\13\u00f7\3\13\7\13\u00fb\n\13\f\13\16\13\u00fe\13\13\5\13"+
		"\u0100\n\13\3\13\5\13\u0103\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010d"+
		"\n\r\3\16\3\16\3\16\7\16\u0112\n\16\f\16\16\16\u0115\13\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\u011f\n\16\f\16\16\16\u0122\13\16\3"+
		"\16\3\16\7\16\u0126\n\16\f\16\16\16\u0129\13\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0131\n\16\3\16\3\16\3\16\3\16\7\16\u0137\n\16\f\16\16\16"+
		"\u013a\13\16\3\17\3\17\7\17\u013e\n\17\f\17\16\17\u0141\13\17\3\17\3\17"+
		"\3\17\5\17\u0146\n\17\3\20\3\20\3\20\3\20\5\20\u014c\n\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\2\3\32\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\b\3\2\f\r\4\2\31\31!\"\4\2\32\34\37 \3\2&)\4\2\36"+
		"\36**\4\2\30\30\35\35\u017d\2(\3\2\2\2\4?\3\2\2\2\6S\3\2\2\2\bb\3\2\2"+
		"\2\nx\3\2\2\2\f|\3\2\2\2\16\177\3\2\2\2\20\u00d4\3\2\2\2\22\u00d6\3\2"+
		"\2\2\24\u0102\3\2\2\2\26\u0104\3\2\2\2\30\u010c\3\2\2\2\32\u0130\3\2\2"+
		"\2\34\u0145\3\2\2\2\36\u014b\3\2\2\2 \u014d\3\2\2\2\"\u014f\3\2\2\2$\u0151"+
		"\3\2\2\2&\u0153\3\2\2\2()\7\n\2\2)*\7\t\2\2*\62\7\3\2\2+-\5\b\5\2,+\3"+
		"\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60,\3\2\2\2\61\64\3\2"+
		"\2\2\62\60\3\2\2\2\62\63\3\2\2\2\638\3\2\2\2\64\62\3\2\2\2\65\67\5\4\3"+
		"\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2"+
		";<\7\4\2\2<\3\3\2\2\2=@\5\16\b\2>@\7\16\2\2?=\3\2\2\2?>\3\2\2\2@A\3\2"+
		"\2\2AB\7+\2\2BN\7\7\2\2CE\5\b\5\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2"+
		"\2\2GK\3\2\2\2HJ\7\13\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3"+
		"\2\2\2MK\3\2\2\2ND\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\b\2\2QR\5\6\4\2R\5"+
		"\3\2\2\2SW\7\3\2\2TV\5\b\5\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X"+
		"]\3\2\2\2YW\3\2\2\2Z\\\5\20\t\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^`\3\2\2\2_]\3\2\2\2`a\7\4\2\2a\7\3\2\2\2bl\5\16\b\2cg\7+\2\2df\7\13"+
		"\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jc\3\2"+
		"\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2oq\5\n\6\2po\3\2"+
		"\2\2pq\3\2\2\2qu\3\2\2\2rt\7\13\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2v\t\3\2\2\2wu\3\2\2\2xy\7\5\2\2yz\7,\2\2z{\7\6\2\2{\13\3\2\2\2|"+
		"}\5\16\b\2}~\7+\2\2~\r\3\2\2\2\177\u0080\t\2\2\2\u0080\17\3\2\2\2\u0081"+
		"\u0082\5\30\r\2\u0082\u0083\5\22\n\2\u0083\u0087\5\32\16\2\u0084\u0086"+
		"\7\b\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\7\13"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u00d5\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094\5\24"+
		"\13\2\u0091\u0093\7\13\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0099\7\b\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00d5\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u009e\7\17\2\2\u009e\u00a2\5\32\16\2\u009f\u00a1\7\b\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\6\4\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a8\7\20\2\2\u00a8\u00aa\5\6\4\2\u00a9\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00d5\3\2\2\2\u00ab\u00ac\7\21\2\2\u00ac"+
		"\u00ad\7+\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00b2\5\32\16\2\u00af\u00b1\7"+
		"\b\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b8\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\7\13"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\5\32"+
		"\16\2\u00bc\u00be\7\b\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c3\5\6\4\2\u00c3\u00d5\3\2\2\2\u00c4\u00c6\7\22\2\2\u00c5"+
		"\u00c7\5\32\16\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cb\3"+
		"\2\2\2\u00c8\u00ca\7\b\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00d5\7\13\2\2\u00cf\u00d0\7\23\2\2\u00d0\u00d5\7\13\2\2\u00d1"+
		"\u00d2\7\25\2\2\u00d2\u00d5\7\13\2\2\u00d3\u00d5\5\6\4\2\u00d4\u0081\3"+
		"\2\2\2\u00d4\u0090\3\2\2\2\u00d4\u009d\3\2\2\2\u00d4\u00ab\3\2\2\2\u00d4"+
		"\u00c4\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\21\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7\23\3\2\2\2\u00d8\u00d9"+
		"\7+\2\2\u00d9\u00da\7\7\2\2\u00da\u00df\5\32\16\2\u00db\u00dc\7\13\2\2"+
		"\u00dc\u00de\5\32\16\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e5\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e4\7\b\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\7\b\2\2\u00e9\u0103\3\2\2\2\u00ea\u00eb\7\24\2\2\u00eb\u00ec\7"+
		"\7\2\2\u00ec\u00ff\7\60\2\2\u00ed\u00ef\7\13\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\5\32\16\2\u00f4\u00f6\7\60\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\7\13\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u00f0\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7\b\2\2\u0102\u00d8\3\2"+
		"\2\2\u0102\u00ea\3\2\2\2\u0103\25\3\2\2\2\u0104\u0105\7+\2\2\u0105\27"+
		"\3\2\2\2\u0106\u010d\7+\2\2\u0107\u0108\7+\2\2\u0108\u0109\7\5\2\2\u0109"+
		"\u010a\5\32\16\2\u010a\u010b\7\6\2\2\u010b\u010d\3\2\2\2\u010c\u0106\3"+
		"\2\2\2\u010c\u0107\3\2\2\2\u010d\31\3\2\2\2\u010e\u010f\b\16\1\2\u010f"+
		"\u0113\5\30\r\2\u0110\u0112\7\7\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3"+
		"\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0131\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0131\5\24\13\2\u0117\u0131\5\34\17\2\u0118\u0119"+
		"\7\33\2\2\u0119\u0131\5\32\16\b\u011a\u011b\7\27\2\2\u011b\u0131\5\32"+
		"\16\7\u011c\u0120\5\36\20\2\u011d\u011f\5\32\16\2\u011e\u011d\3\2\2\2"+
		"\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0131"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0127\7\13\2\2\u0124\u0126\5\32\16"+
		"\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0131\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\b\2\2\u012b"+
		"\u0131\7\13\2\2\u012c\u012d\7\7\2\2\u012d\u012e\5\32\16\2\u012e\u012f"+
		"\7\b\2\2\u012f\u0131\3\2\2\2\u0130\u010e\3\2\2\2\u0130\u0116\3\2\2\2\u0130"+
		"\u0117\3\2\2\2\u0130\u0118\3\2\2\2\u0130\u011a\3\2\2\2\u0130\u011c\3\2"+
		"\2\2\u0130\u0123\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u012c\3\2\2\2\u0131"+
		"\u0138\3\2\2\2\u0132\u0133\f\t\2\2\u0133\u0134\5\36\20\2\u0134\u0135\5"+
		"\32\16\n\u0135\u0137\3\2\2\2\u0136\u0132\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\33\3\2\2\2\u013a\u0138\3\2\2"+
		"\2\u013b\u013f\7,\2\2\u013c\u013e\7,\2\2\u013d\u013c\3\2\2\2\u013e\u0141"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0146\3\2\2\2\u0141"+
		"\u013f\3\2\2\2\u0142\u0146\7,\2\2\u0143\u0146\7/\2\2\u0144\u0146\7\26"+
		"\2\2\u0145\u013b\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\35\3\2\2\2\u0147\u014c\5 \21\2\u0148\u014c\5\"\22"+
		"\2\u0149\u014c\5$\23\2\u014a\u014c\5&\24\2\u014b\u0147\3\2\2\2\u014b\u0148"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\37\3\2\2\2\u014d"+
		"\u014e\t\4\2\2\u014e!\3\2\2\2\u014f\u0150\t\5\2\2\u0150#\3\2\2\2\u0151"+
		"\u0152\t\6\2\2\u0152%\3\2\2\2\u0153\u0154\t\7\2\2\u0154\'\3\2\2\2,.\62"+
		"8?FKNW]glpu\u0087\u008d\u0094\u009a\u00a2\u00a9\u00b2\u00b8\u00bf\u00c6"+
		"\u00cb\u00d4\u00df\u00e5\u00f0\u00f5\u00f7\u00fc\u00ff\u0102\u010c\u0113"+
		"\u0120\u0127\u0130\u0138\u013f\u0145\u014b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}