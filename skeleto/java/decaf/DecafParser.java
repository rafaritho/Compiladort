// Generated from /home/rarks/compilador2/lab02/provided/skeleton/src/decaf/DecafParser.g4 by ANTLR 4.5.3

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
		LCURLY=1, RCURLY=2, LBRACKET=3, RBRACKET=4, LP=5, RP=6, CLASS=7, BOOLEAN=8, 
		INTVAR=9, VOID=10, IF=11, ELSE=12, FOR=13, RETURN=14, BREAK=15, CALLOUT=16, 
		CONTINUE=17, BOOLEANLITERAL=18, EXCLAMATION=19, OR=20, EQUAL=21, PLUS=22, 
		MINUS=23, MULT=24, AND=25, EQUALS=26, DIV=27, MOD=28, PLUSEQUAL=29, MINUSEQUAL=30, 
		SEMICOLON=31, COMMA=32, COLON=33, LESS=34, BIGGER=35, LESSEQ=36, BIGGEREQ=37, 
		DIFFERENT=38, ID=39, WS_=40, SL_COMMENT=41, CHAR=42, STRING=43, HEXLITERAL=44, 
		ERRO_HEX=45, NUM=46, C=47;
	public static final int
		RULE_program = 0, RULE_field_decl = 1, RULE_method_decl = 2, RULE_block = 3, 
		RULE_var_decl = 4, RULE_type_id = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_assing_op = 8, RULE_method_call = 9, RULE_method_name = 10, RULE_location = 11, 
		RULE_expr = 12, RULE_callout_arg = 13, RULE_bin_op = 14, RULE_arith_op = 15, 
		RULE_rel_op = 16, RULE_eq_op = 17, RULE_cond_op = 18, RULE_literal = 19, 
		RULE_alpha_num = 20, RULE_alpha = 21, RULE_digit = 22, RULE_hex_digit = 23, 
		RULE_int_literal = 24, RULE_decimal_literal = 25, RULE_hex_literal = 26, 
		RULE_bool_literal = 27, RULE_char_literal = 28, RULE_string_literal = 29;
	public static final String[] ruleNames = {
		"program", "field_decl", "method_decl", "block", "var_decl", "type_id", 
		"type", "statement", "assing_op", "method_call", "method_name", "location", 
		"expr", "callout_arg", "bin_op", "arith_op", "rel_op", "eq_op", "cond_op", 
		"literal", "alpha_num", "alpha", "digit", "hex_digit", "int_literal", 
		"decimal_literal", "hex_literal", "bool_literal", "char_literal", "string_literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'('", "')'", "'class'", "'boolean'", 
		"'int'", "'void'", "'if'", "'else'", "'for'", "'return'", "'break'", "'callout'", 
		"'continue'", null, "'!'", "'||'", "'='", "'+'", "'-'", "'*'", "'&&'", 
		"'=='", "'/'", "'%'", "'+='", "'-='", "';'", "','", "':'", "'<'", "'>'", 
		"'>='", "'<='", "'!='", null, null, null, null, null, null, "'0x'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "LP", "RP", "CLASS", 
		"BOOLEAN", "INTVAR", "VOID", "IF", "ELSE", "FOR", "RETURN", "BREAK", "CALLOUT", 
		"CONTINUE", "BOOLEANLITERAL", "EXCLAMATION", "OR", "EQUAL", "PLUS", "MINUS", 
		"MULT", "AND", "EQUALS", "DIV", "MOD", "PLUSEQUAL", "MINUSEQUAL", "SEMICOLON", 
		"COMMA", "COLON", "LESS", "BIGGER", "LESSEQ", "BIGGEREQ", "DIFFERENT", 
		"ID", "WS_", "SL_COMMENT", "CHAR", "STRING", "HEXLITERAL", "ERRO_HEX", 
		"NUM", "C"
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
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
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
			setState(60);
			match(CLASS);
			setState(61);
			match(ID);
			setState(62);
			match(LCURLY);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					field_decl();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTVAR) | (1L << VOID))) != 0)) {
				{
				{
				setState(69);
				method_decl();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
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

	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public List<Type_idContext> type_id() {
			return getRuleContexts(Type_idContext.class);
		}
		public Type_idContext type_id(int i) {
			return getRuleContext(Type_idContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(DecafParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(DecafParser.LBRACKET, i);
		}
		public List<Int_literalContext> int_literal() {
			return getRuleContexts(Int_literalContext.class);
		}
		public Int_literalContext int_literal(int i) {
			return getRuleContext(Int_literalContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(DecafParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(DecafParser.RBRACKET, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(77);
				type_id();
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(78);
					match(COMMA);
					setState(79);
					type_id();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(85);
				type_id();
				setState(86);
				match(LBRACKET);
				setState(87);
				int_literal();
				setState(88);
				match(RBRACKET);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(89);
					match(COMMA);
					setState(90);
					type_id();
					setState(91);
					match(LBRACKET);
					setState(92);
					int_literal();
					setState(93);
					match(RBRACKET);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(102);
			match(SEMICOLON);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public List<Type_idContext> type_id() {
			return getRuleContexts(Type_idContext.class);
		}
		public Type_idContext type_id(int i) {
			return getRuleContext(Type_idContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
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
		enterRule(_localctx, 4, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case INTVAR:
				{
				setState(104);
				type();
				}
				break;
			case VOID:
				{
				setState(105);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			match(ID);
			setState(109);
			match(LP);
			setState(118);
			_la = _input.LA(1);
			if (_la==BOOLEAN || _la==INTVAR) {
				{
				setState(110);
				type_id();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(111);
					match(COMMA);
					setState(112);
					type_id();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
			match(RP);
			setState(121);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(DecafParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(DecafParser.RCURLY, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LCURLY);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOOLEAN || _la==INTVAR) {
				{
				{
				setState(124);
				var_decl();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCURLY) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << BREAK) | (1L << CALLOUT) | (1L << CONTINUE) | (1L << ID))) != 0)) {
				{
				{
				setState(130);
				statement();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
		public Type_idContext type_id() {
			return getRuleContext(Type_idContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
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
		enterRule(_localctx, 8, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			type_id();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(139);
				match(COMMA);
				setState(140);
				match(ID);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(SEMICOLON);
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
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			type();
			setState(149);
			match(ID);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					match(ID);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(157);
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

	public static class StatementContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assing_opContext assing_op() {
			return getRuleContext(Assing_opContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public TerminalNode LP() { return getToken(DecafParser.LP, 0); }
		public TerminalNode RP() { return getToken(DecafParser.RP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(DecafParser.EQUAL, 0); }
		public TerminalNode COMMA() { return getToken(DecafParser.COMMA, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BREAK() { return getToken(DecafParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				location();
				setState(160);
				assing_op();
				setState(161);
				expr(0);
				setState(162);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				method_call();
				setState(165);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(IF);
				setState(168);
				match(LP);
				setState(169);
				expr(0);
				setState(170);
				match(RP);
				setState(171);
				block();
				setState(174);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(172);
					match(ELSE);
					setState(173);
					block();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(FOR);
				setState(177);
				match(ID);
				setState(178);
				match(EQUAL);
				setState(179);
				expr(0);
				setState(180);
				match(COMMA);
				setState(181);
				expr(0);
				setState(182);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				match(RETURN);
				setState(186);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << CALLOUT) | (1L << BOOLEANLITERAL) | (1L << EXCLAMATION) | (1L << MINUS) | (1L << ID) | (1L << CHAR) | (1L << HEXLITERAL) | (1L << NUM))) != 0)) {
					{
					setState(185);
					expr(0);
					}
				}

				setState(188);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(BREAK);
				setState(190);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				match(CONTINUE);
				setState(192);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(193);
				block();
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

	public static class Assing_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(DecafParser.EQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(DecafParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(DecafParser.MINUSEQUAL, 0); }
		public Assing_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assing_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAssing_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAssing_op(this);
		}
	}

	public final Assing_opContext assing_op() throws RecognitionException {
		Assing_opContext _localctx = new Assing_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assing_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode LP() { return getToken(DecafParser.LP, 0); }
		public TerminalNode RP() { return getToken(DecafParser.RP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DecafParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DecafParser.COMMA, i);
		}
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public TerminalNode STRING() { return getToken(DecafParser.STRING, 0); }
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
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
			setState(227);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				method_name();
				setState(199);
				match(LP);
				setState(208);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LP) | (1L << CALLOUT) | (1L << BOOLEANLITERAL) | (1L << EXCLAMATION) | (1L << MINUS) | (1L << ID) | (1L << CHAR) | (1L << HEXLITERAL) | (1L << NUM))) != 0)) {
					{
					setState(200);
					expr(0);
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(201);
						match(COMMA);
						setState(202);
						expr(0);
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(210);
				match(RP);
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(CALLOUT);
				setState(213);
				match(LP);
				setState(214);
				match(STRING);
				setState(224);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(215);
					match(COMMA);
					setState(216);
					callout_arg();
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(217);
						match(COMMA);
						setState(218);
						callout_arg();
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(226);
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
			setState(229);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(DecafParser.LBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(DecafParser.RBRACKET, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_location);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(ID);
				setState(233);
				match(LBRACKET);
				setState(234);
				expr(0);
				setState(235);
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(DecafParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXCLAMATION() { return getToken(DecafParser.EXCLAMATION, 0); }
		public TerminalNode LP() { return getToken(DecafParser.LP, 0); }
		public TerminalNode RP() { return getToken(DecafParser.RP, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(240);
				location();
				}
				break;
			case 2:
				{
				setState(241);
				method_call();
				}
				break;
			case 3:
				{
				setState(242);
				literal();
				}
				break;
			case 4:
				{
				setState(243);
				match(MINUS);
				setState(244);
				expr(3);
				}
				break;
			case 5:
				{
				setState(245);
				match(EXCLAMATION);
				setState(246);
				expr(2);
				}
				break;
			case 6:
				{
				setState(247);
				match(LP);
				setState(248);
				expr(0);
				setState(249);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(253);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(254);
					bin_op();
					setState(255);
					expr(5);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callout_arg);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case LP:
			case CALLOUT:
			case BOOLEANLITERAL:
			case EXCLAMATION:
			case MINUS:
			case ID:
			case CHAR:
			case HEXLITERAL:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				expr(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				string_literal();
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
			setState(270);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				arith_op();
				}
				break;
			case LESS:
			case BIGGER:
			case LESSEQ:
			case BIGGEREQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				rel_op();
				}
				break;
			case EQUALS:
			case DIFFERENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				eq_op();
				}
				break;
			case OR:
			case AND:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
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
			setState(272);
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
			setState(274);
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
			setState(276);
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
			setState(278);
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

	public static class LiteralContext extends ParserRuleContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case HEXLITERAL:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				int_literal();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				char_literal();
				}
				break;
			case BOOLEANLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				bool_literal();
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

	public static class Alpha_numContext extends ParserRuleContext {
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public Alpha_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAlpha_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAlpha_num(this);
		}
	}

	public final Alpha_numContext alpha_num() throws RecognitionException {
		Alpha_numContext _localctx = new Alpha_numContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alpha_num);
		try {
			setState(287);
			switch (_input.LA(1)) {
			case C:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				alpha();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				digit();
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

	public static class AlphaContext extends ParserRuleContext {
		public TerminalNode C() { return getToken(DecafParser.C, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAlpha(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alpha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(C);
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

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DecafParser.NUM, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(NUM);
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

	public static class Hex_digitContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public List<TerminalNode> C() { return getTokens(DecafParser.C); }
		public TerminalNode C(int i) {
			return getToken(DecafParser.C, i);
		}
		public Hex_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterHex_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitHex_digit(this);
		}
	}

	public final Hex_digitContext hex_digit() throws RecognitionException {
		Hex_digitContext _localctx = new Hex_digitContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_hex_digit);
		int _la;
		try {
			setState(299);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				digit();
				}
				break;
			case C:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(294);
					match(C);
					}
					}
					setState(297); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==C );
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

	public static class Int_literalContext extends ParserRuleContext {
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public Hex_literalContext hex_literal() {
			return getRuleContext(Hex_literalContext.class,0);
		}
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_int_literal);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				decimal_literal();
				}
				break;
			case HEXLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				hex_literal();
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

	public static class Decimal_literalContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DecafParser.NUM, 0); }
		public Decimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterDecimal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitDecimal_literal(this);
		}
	}

	public final Decimal_literalContext decimal_literal() throws RecognitionException {
		Decimal_literalContext _localctx = new Decimal_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decimal_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(NUM);
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

	public static class Hex_literalContext extends ParserRuleContext {
		public TerminalNode HEXLITERAL() { return getToken(DecafParser.HEXLITERAL, 0); }
		public Hex_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterHex_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitHex_literal(this);
		}
	}

	public final Hex_literalContext hex_literal() throws RecognitionException {
		Hex_literalContext _localctx = new Hex_literalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(HEXLITERAL);
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

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode BOOLEANLITERAL() { return getToken(DecafParser.BOOLEANLITERAL, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(BOOLEANLITERAL);
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

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(DecafParser.CHAR, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(CHAR);
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

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DecafParser.STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(STRING);
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
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u013e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\7\3S\n\3\f\3\16\3V\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3b\n\3\f\3\16\3e\13\3\5\3g\n\3\3\3\3\3\3\4\3\4\5\4m\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4t\n\4\f\4\16\4w\13\4\5\4y\n\4\3\4\3\4\3\4\3\5\3\5\7\5\u0080"+
		"\n\5\f\5\16\5\u0083\13\5\3\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5\3\5\3\5"+
		"\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b1\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u00bd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c5\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00ce\n\13\f\13\16\13\u00d1\13\13"+
		"\5\13\u00d3\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00de"+
		"\n\13\f\13\16\13\u00e1\13\13\5\13\u00e3\n\13\3\13\5\13\u00e6\n\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f0\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fe\n\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0104\n\16\f\16\16\16\u0107\13\16\3\17\3\17\5\17\u010b\n\17\3\20"+
		"\3\20\3\20\3\20\5\20\u0111\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\5\25\u011e\n\25\3\26\3\26\5\26\u0122\n\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\6\31\u012a\n\31\r\31\16\31\u012b\5\31\u012e\n\31\3"+
		"\32\3\32\5\32\u0132\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3\37\2\3\32 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<\2\b\3\2\n\13\4\2\27\27\37 \4\2\30\32\35\36\3\2$\'\4\2\34"+
		"\34((\4\2\26\26\33\33\u014a\2>\3\2\2\2\4f\3\2\2\2\6l\3\2\2\2\b}\3\2\2"+
		"\2\n\u008c\3\2\2\2\f\u0096\3\2\2\2\16\u009f\3\2\2\2\20\u00c4\3\2\2\2\22"+
		"\u00c6\3\2\2\2\24\u00e5\3\2\2\2\26\u00e7\3\2\2\2\30\u00ef\3\2\2\2\32\u00fd"+
		"\3\2\2\2\34\u010a\3\2\2\2\36\u0110\3\2\2\2 \u0112\3\2\2\2\"\u0114\3\2"+
		"\2\2$\u0116\3\2\2\2&\u0118\3\2\2\2(\u011d\3\2\2\2*\u0121\3\2\2\2,\u0123"+
		"\3\2\2\2.\u0125\3\2\2\2\60\u012d\3\2\2\2\62\u0131\3\2\2\2\64\u0133\3\2"+
		"\2\2\66\u0135\3\2\2\28\u0137\3\2\2\2:\u0139\3\2\2\2<\u013b\3\2\2\2>?\7"+
		"\t\2\2?@\7)\2\2@D\7\3\2\2AC\5\4\3\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3"+
		"\2\2\2EJ\3\2\2\2FD\3\2\2\2GI\5\6\4\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3"+
		"\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\4\2\2N\3\3\2\2\2OT\5\f\7\2PQ\7\"\2\2QS"+
		"\5\f\7\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2Ug\3\2\2\2VT\3\2\2\2W"+
		"X\5\f\7\2XY\7\5\2\2YZ\5\62\32\2Zc\7\6\2\2[\\\7\"\2\2\\]\5\f\7\2]^\7\5"+
		"\2\2^_\5\62\32\2_`\7\6\2\2`b\3\2\2\2a[\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2fO\3\2\2\2fW\3\2\2\2gh\3\2\2\2hi\7!\2\2i\5\3"+
		"\2\2\2jm\5\16\b\2km\7\f\2\2lj\3\2\2\2lk\3\2\2\2mn\3\2\2\2no\7)\2\2ox\7"+
		"\7\2\2pu\5\f\7\2qr\7\"\2\2rt\5\f\7\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2xp\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\b\2\2{|\5"+
		"\b\5\2|\7\3\2\2\2}\u0081\7\3\2\2~\u0080\5\n\6\2\177~\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0087\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0086\5\20\t\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\4\2\2\u008b\t\3\2\2\2\u008c\u0091\5\f\7\2"+
		"\u008d\u008e\7\"\2\2\u008e\u0090\7)\2\2\u008f\u008d\3\2\2\2\u0090\u0093"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\7!\2\2\u0095\13\3\2\2\2\u0096\u0097\5\16\b"+
		"\2\u0097\u009c\7)\2\2\u0098\u0099\7\"\2\2\u0099\u009b\7)\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\r\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\17\3\2\2\2\u00a1"+
		"\u00a2\5\30\r\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5"+
		"\7!\2\2\u00a5\u00c5\3\2\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a8\7!\2\2\u00a8"+
		"\u00c5\3\2\2\2\u00a9\u00aa\7\r\2\2\u00aa\u00ab\7\7\2\2\u00ab\u00ac\5\32"+
		"\16\2\u00ac\u00ad\7\b\2\2\u00ad\u00b0\5\b\5\2\u00ae\u00af\7\16\2\2\u00af"+
		"\u00b1\5\b\5\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00c5\3\2"+
		"\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b4\7)\2\2\u00b4\u00b5\7\27\2\2\u00b5"+
		"\u00b6\5\32\16\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00b9"+
		"\5\b\5\2\u00b9\u00c5\3\2\2\2\u00ba\u00bc\7\20\2\2\u00bb\u00bd\5\32\16"+
		"\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c5"+
		"\7!\2\2\u00bf\u00c0\7\21\2\2\u00c0\u00c5\7!\2\2\u00c1\u00c2\7\23\2\2\u00c2"+
		"\u00c5\7!\2\2\u00c3\u00c5\5\b\5\2\u00c4\u00a1\3\2\2\2\u00c4\u00a6\3\2"+
		"\2\2\u00c4\u00a9\3\2\2\2\u00c4\u00b2\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\21\3\2\2"+
		"\2\u00c6\u00c7\t\3\2\2\u00c7\23\3\2\2\2\u00c8\u00c9\5\26\f\2\u00c9\u00d2"+
		"\7\7\2\2\u00ca\u00cf\5\32\16\2\u00cb\u00cc\7\"\2\2\u00cc\u00ce\5\32\16"+
		"\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00e6\3\2"+
		"\2\2\u00d6\u00d7\7\22\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00e2\7-\2\2\u00d9"+
		"\u00da\7\"\2\2\u00da\u00df\5\34\17\2\u00db\u00dc\7\"\2\2\u00dc\u00de\5"+
		"\34\17\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00d9\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\7\b\2\2\u00e5"+
		"\u00c8\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e6\25\3\2\2\2\u00e7\u00e8\7)\2\2"+
		"\u00e8\27\3\2\2\2\u00e9\u00f0\7)\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec\7"+
		"\5\2\2\u00ec\u00ed\5\32\16\2\u00ed\u00ee\7\6\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\31\3\2\2\2\u00f1\u00f2\b\16\1"+
		"\2\u00f2\u00fe\5\30\r\2\u00f3\u00fe\5\24\13\2\u00f4\u00fe\5(\25\2\u00f5"+
		"\u00f6\7\31\2\2\u00f6\u00fe\5\32\16\5\u00f7\u00f8\7\25\2\2\u00f8\u00fe"+
		"\5\32\16\4\u00f9\u00fa\7\7\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc\7\b\2"+
		"\2\u00fc\u00fe\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f3\3\2\2\2\u00fd\u00f4"+
		"\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe"+
		"\u0105\3\2\2\2\u00ff\u0100\f\6\2\2\u0100\u0101\5\36\20\2\u0101\u0102\5"+
		"\32\16\7\u0102\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\33\3\2\2\2\u0107\u0105\3\2\2"+
		"\2\u0108\u010b\5\32\16\2\u0109\u010b\5<\37\2\u010a\u0108\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\35\3\2\2\2\u010c\u0111\5 \21\2\u010d\u0111\5\"\22"+
		"\2\u010e\u0111\5$\23\2\u010f\u0111\5&\24\2\u0110\u010c\3\2\2\2\u0110\u010d"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\37\3\2\2\2\u0112"+
		"\u0113\t\4\2\2\u0113!\3\2\2\2\u0114\u0115\t\5\2\2\u0115#\3\2\2\2\u0116"+
		"\u0117\t\6\2\2\u0117%\3\2\2\2\u0118\u0119\t\7\2\2\u0119\'\3\2\2\2\u011a"+
		"\u011e\5\62\32\2\u011b\u011e\5:\36\2\u011c\u011e\58\35\2\u011d\u011a\3"+
		"\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e)\3\2\2\2\u011f\u0122"+
		"\5,\27\2\u0120\u0122\5.\30\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"+\3\2\2\2\u0123\u0124\7\61\2\2\u0124-\3\2\2\2\u0125\u0126\7\60\2\2\u0126"+
		"/\3\2\2\2\u0127\u012e\5.\30\2\u0128\u012a\7\61\2\2\u0129\u0128\3\2\2\2"+
		"\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e"+
		"\3\2\2\2\u012d\u0127\3\2\2\2\u012d\u0129\3\2\2\2\u012e\61\3\2\2\2\u012f"+
		"\u0132\5\64\33\2\u0130\u0132\5\66\34\2\u0131\u012f\3\2\2\2\u0131\u0130"+
		"\3\2\2\2\u0132\63\3\2\2\2\u0133\u0134\7\60\2\2\u0134\65\3\2\2\2\u0135"+
		"\u0136\7.\2\2\u0136\67\3\2\2\2\u0137\u0138\7\24\2\2\u01389\3\2\2\2\u0139"+
		"\u013a\7,\2\2\u013a;\3\2\2\2\u013b\u013c\7-\2\2\u013c=\3\2\2\2 DJTcfl"+
		"ux\u0081\u0087\u0091\u009c\u00b0\u00bc\u00c4\u00cf\u00d2\u00df\u00e2\u00e5"+
		"\u00ef\u00fd\u0105\u010a\u0110\u011d\u0121\u012b\u012d\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}