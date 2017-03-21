// Generated from /home/joao/Documentos/ufla/Compiladores/Alguma/src/com/br/Alguma.g4 by ANTLR 4.6
package com.br;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CHAR=3, INT=4, VOID=5, FLOAT=6, STRUCT=7, IF=8, ELSE=9, 
		RETURN=10, WHILE=11, LETRA=12, DIGITO=13, ESPACO=14, QUEBRA_LINHA=15, 
		LETRA_MAIUSCULA=16, ATRIBUICAO=17, IGUALDADE=18, DIFERENCA=19, MAIOR=20, 
		MENOR=21, MAIORIGUAL=22, MENORIGUAL=23, ADICAO=24, SUBTRACAO=25, MULT=26, 
		DIV=27, ABRE_CHAVE=28, FECHA_CHAVE=29, ABRE_COLCHETE=30, FECHA_COLCHETE=31, 
		ABRE_PARENTESE=32, FECHA_PARENTESE=33, VIRGULA=34, PONTO_VIRGULA=35, ASPAS_SIMPLES=36, 
		ASPAS_DUPLAS=37, WS=38, COMENTARIO=39;
	public static final int
		RULE_programa = 0, RULE_declaracaoLista = 1, RULE_declaracao = 2, RULE_varDeclaracao = 3, 
		RULE_tipoEspecificador = 4, RULE_atributosDeclaracao = 5, RULE_funDeclaracao = 6, 
		RULE_params = 7, RULE_paramLista = 8, RULE_param = 9, RULE_compostoDecl = 10, 
		RULE_localDeclaracoes = 11, RULE_comandoLista = 12, RULE_comando = 13, 
		RULE_expressaoDecl = 14, RULE_selecaoDecl = 15, RULE_elseR = 16, RULE_iteracaoDecl = 17, 
		RULE_retornoDecl = 18, RULE_expressao = 19, RULE_var = 20, RULE_expressaoSimples = 21, 
		RULE_charR = 22, RULE_relacional = 23, RULE_expressaoSoma = 24, RULE_soma = 25, 
		RULE_termo = 26, RULE_mult = 27, RULE_fator = 28, RULE_ativacao = 29, 
		RULE_args = 30, RULE_argLista = 31, RULE_num = 32, RULE_numInt = 33, RULE_ident = 34;
	public static final String[] ruleNames = {
		"programa", "declaracaoLista", "declaracao", "varDeclaracao", "tipoEspecificador", 
		"atributosDeclaracao", "funDeclaracao", "params", "paramLista", "param", 
		"compostoDecl", "localDeclaracoes", "comandoLista", "comando", "expressaoDecl", 
		"selecaoDecl", "elseR", "iteracaoDecl", "retornoDecl", "expressao", "var", 
		"expressaoSimples", "charR", "relacional", "expressaoSoma", "soma", "termo", 
		"mult", "fator", "ativacao", "args", "argLista", "num", "numInt", "ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'E'", "'char'", "'int'", "'void'", "'float'", "'struct'", 
		"'if'", "'else'", "'return'", "'while'", null, null, null, null, null, 
		"'='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", 
		"'/'", "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "';'", "'''", 
		"'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "CHAR", "INT", "VOID", "FLOAT", "STRUCT", "IF", "ELSE", 
		"RETURN", "WHILE", "LETRA", "DIGITO", "ESPACO", "QUEBRA_LINHA", "LETRA_MAIUSCULA", 
		"ATRIBUICAO", "IGUALDADE", "DIFERENCA", "MAIOR", "MENOR", "MAIORIGUAL", 
		"MENORIGUAL", "ADICAO", "SUBTRACAO", "MULT", "DIV", "ABRE_CHAVE", "FECHA_CHAVE", 
		"ABRE_COLCHETE", "FECHA_COLCHETE", "ABRE_PARENTESE", "FECHA_PARENTESE", 
		"VIRGULA", "PONTO_VIRGULA", "ASPAS_SIMPLES", "ASPAS_DUPLAS", "WS", "COMENTARIO"
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
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracaoListaContext declaracaoLista() {
			return getRuleContext(DeclaracaoListaContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			declaracaoLista();
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

	public static class DeclaracaoListaContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public DeclaracaoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracaoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracaoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracaoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoListaContext declaracaoLista() throws RecognitionException {
		DeclaracaoListaContext _localctx = new DeclaracaoListaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracaoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			declaracao();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << VOID) | (1L << FLOAT) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(73);
				declaracao();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public VarDeclaracaoContext varDeclaracao() {
			return getRuleContext(VarDeclaracaoContext.class,0);
		}
		public FunDeclaracaoContext funDeclaracao() {
			return getRuleContext(FunDeclaracaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				varDeclaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				funDeclaracao();
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

	public static class VarDeclaracaoContext extends ParserRuleContext {
		public TipoEspecificadorContext tipoEspecificador() {
			return getRuleContext(TipoEspecificadorContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<NumIntContext> numInt() {
			return getRuleContexts(NumIntContext.class);
		}
		public NumIntContext numInt(int i) {
			return getRuleContext(NumIntContext.class,i);
		}
		public VarDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterVarDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitVarDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitVarDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclaracaoContext varDeclaracao() throws RecognitionException {
		VarDeclaracaoContext _localctx = new VarDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			tipoEspecificador();
			setState(84);
			ident();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRE_COLCHETE) {
				{
				{
				setState(85);
				match(ABRE_COLCHETE);
				setState(86);
				numInt();
				setState(87);
				match(FECHA_COLCHETE);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(94);
				match(VIRGULA);
				setState(95);
				ident();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ABRE_COLCHETE) {
					{
					{
					setState(96);
					match(ABRE_COLCHETE);
					setState(97);
					numInt();
					setState(98);
					match(FECHA_COLCHETE);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(PONTO_VIRGULA);
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

	public static class TipoEspecificadorContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public AtributosDeclaracaoContext atributosDeclaracao() {
			return getRuleContext(AtributosDeclaracaoContext.class,0);
		}
		public TipoEspecificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoEspecificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipoEspecificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipoEspecificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipoEspecificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoEspecificadorContext tipoEspecificador() throws RecognitionException {
		TipoEspecificadorContext _localctx = new TipoEspecificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipoEspecificador);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(CHAR);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				match(VOID);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				match(STRUCT);
				setState(117);
				ident();
				setState(118);
				match(ABRE_CHAVE);
				setState(119);
				atributosDeclaracao();
				setState(120);
				match(FECHA_CHAVE);
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

	public static class AtributosDeclaracaoContext extends ParserRuleContext {
		public List<VarDeclaracaoContext> varDeclaracao() {
			return getRuleContexts(VarDeclaracaoContext.class);
		}
		public VarDeclaracaoContext varDeclaracao(int i) {
			return getRuleContext(VarDeclaracaoContext.class,i);
		}
		public AtributosDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributosDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterAtributosDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitAtributosDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitAtributosDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosDeclaracaoContext atributosDeclaracao() throws RecognitionException {
		AtributosDeclaracaoContext _localctx = new AtributosDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atributosDeclaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				varDeclaracao();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << VOID) | (1L << FLOAT) | (1L << STRUCT))) != 0) );
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

	public static class FunDeclaracaoContext extends ParserRuleContext {
		public TipoEspecificadorContext tipoEspecificador() {
			return getRuleContext(TipoEspecificadorContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public CompostoDeclContext compostoDecl() {
			return getRuleContext(CompostoDeclContext.class,0);
		}
		public FunDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDeclaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFunDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFunDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFunDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunDeclaracaoContext funDeclaracao() throws RecognitionException {
		FunDeclaracaoContext _localctx = new FunDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funDeclaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			tipoEspecificador();
			setState(130);
			ident();
			setState(131);
			match(ABRE_PARENTESE);
			setState(132);
			params();
			setState(133);
			match(FECHA_PARENTESE);
			setState(134);
			compostoDecl();
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamListaContext paramLista() {
			return getRuleContext(ParamListaContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				paramLista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(VOID);
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

	public static class ParamListaContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParamLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParamLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParamLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListaContext paramLista() throws RecognitionException {
		ParamListaContext _localctx = new ParamListaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			param();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(141);
				match(VIRGULA);
				setState(142);
				param();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParamContext extends ParserRuleContext {
		public TipoEspecificadorContext tipoEspecificador() {
			return getRuleContext(TipoEspecificadorContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_param);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				tipoEspecificador();
				setState(149);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				tipoEspecificador();
				setState(152);
				ident();
				setState(153);
				match(ABRE_COLCHETE);
				setState(154);
				match(FECHA_COLCHETE);
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

	public static class CompostoDeclContext extends ParserRuleContext {
		public LocalDeclaracoesContext localDeclaracoes() {
			return getRuleContext(LocalDeclaracoesContext.class,0);
		}
		public ComandoListaContext comandoLista() {
			return getRuleContext(ComandoListaContext.class,0);
		}
		public CompostoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compostoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCompostoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCompostoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCompostoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompostoDeclContext compostoDecl() throws RecognitionException {
		CompostoDeclContext _localctx = new CompostoDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compostoDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ABRE_CHAVE);
			setState(159);
			localDeclaracoes();
			setState(160);
			comandoLista();
			setState(161);
			match(FECHA_CHAVE);
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

	public static class LocalDeclaracoesContext extends ParserRuleContext {
		public List<VarDeclaracaoContext> varDeclaracao() {
			return getRuleContexts(VarDeclaracaoContext.class);
		}
		public VarDeclaracaoContext varDeclaracao(int i) {
			return getRuleContext(VarDeclaracaoContext.class,i);
		}
		public LocalDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterLocalDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitLocalDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitLocalDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclaracoesContext localDeclaracoes() throws RecognitionException {
		LocalDeclaracoesContext _localctx = new LocalDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_localDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << INT) | (1L << VOID) | (1L << FLOAT) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(163);
				varDeclaracao();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ComandoListaContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComandoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComandoLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitComandoLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoListaContext comandoLista() throws RecognitionException {
		ComandoListaContext _localctx = new ComandoListaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << RETURN) | (1L << WHILE) | (1L << LETRA) | (1L << DIGITO) | (1L << ADICAO) | (1L << SUBTRACAO) | (1L << ABRE_CHAVE) | (1L << ABRE_PARENTESE) | (1L << PONTO_VIRGULA) | (1L << ASPAS_SIMPLES))) != 0)) {
				{
				{
				setState(169);
				comando();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ComandoContext extends ParserRuleContext {
		public ExpressaoDeclContext expressaoDecl() {
			return getRuleContext(ExpressaoDeclContext.class,0);
		}
		public CompostoDeclContext compostoDecl() {
			return getRuleContext(CompostoDeclContext.class,0);
		}
		public SelecaoDeclContext selecaoDecl() {
			return getRuleContext(SelecaoDeclContext.class,0);
		}
		public IteracaoDeclContext iteracaoDecl() {
			return getRuleContext(IteracaoDeclContext.class,0);
		}
		public RetornoDeclContext retornoDecl() {
			return getRuleContext(RetornoDeclContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETRA:
			case DIGITO:
			case ADICAO:
			case SUBTRACAO:
			case ABRE_PARENTESE:
			case PONTO_VIRGULA:
			case ASPAS_SIMPLES:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				expressaoDecl();
				}
				break;
			case ABRE_CHAVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				compostoDecl();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				selecaoDecl();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				iteracaoDecl();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				retornoDecl();
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

	public static class ExpressaoDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpressaoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressaoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoDeclContext expressaoDecl() throws RecognitionException {
		ExpressaoDeclContext _localctx = new ExpressaoDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressaoDecl);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETRA:
			case DIGITO:
			case ADICAO:
			case SUBTRACAO:
			case ABRE_PARENTESE:
			case ASPAS_SIMPLES:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				expressao();
				setState(183);
				match(PONTO_VIRGULA);
				}
				break;
			case PONTO_VIRGULA:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(PONTO_VIRGULA);
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

	public static class SelecaoDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ElseRContext elseR() {
			return getRuleContext(ElseRContext.class,0);
		}
		public SelecaoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecaoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSelecaoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSelecaoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitSelecaoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoDeclContext selecaoDecl() throws RecognitionException {
		SelecaoDeclContext _localctx = new SelecaoDeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selecaoDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(IF);
			setState(189);
			match(ABRE_PARENTESE);
			setState(190);
			expressao();
			setState(191);
			match(FECHA_PARENTESE);
			setState(192);
			comando();
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(193);
				elseR();
				}
				break;
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

	public static class ElseRContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ElseRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterElseR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitElseR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitElseR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseRContext elseR() throws RecognitionException {
		ElseRContext _localctx = new ElseRContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elseR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ELSE);
			setState(197);
			comando();
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

	public static class IteracaoDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public IteracaoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracaoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterIteracaoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitIteracaoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitIteracaoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteracaoDeclContext iteracaoDecl() throws RecognitionException {
		IteracaoDeclContext _localctx = new IteracaoDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iteracaoDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(WHILE);
			setState(200);
			match(ABRE_PARENTESE);
			setState(201);
			expressao();
			setState(202);
			match(FECHA_PARENTESE);
			setState(203);
			comando();
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

	public static class RetornoDeclContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RetornoDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornoDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterRetornoDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitRetornoDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitRetornoDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoDeclContext retornoDecl() throws RecognitionException {
		RetornoDeclContext _localctx = new RetornoDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_retornoDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(RETURN);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << DIGITO) | (1L << ADICAO) | (1L << SUBTRACAO) | (1L << ABRE_PARENTESE) | (1L << ASPAS_SIMPLES))) != 0)) {
				{
				setState(206);
				expressao();
				}
			}

			setState(209);
			match(PONTO_VIRGULA);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpressaoSimplesContext expressaoSimples() {
			return getRuleContext(ExpressaoSimplesContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressao);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				var();
				setState(212);
				match(ATRIBUICAO);
				setState(213);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				expressaoSimples();
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

	public static class VarContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			ident();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRE_COLCHETE) {
				{
				{
				setState(219);
				match(ABRE_COLCHETE);
				setState(220);
				expressao();
				setState(221);
				match(FECHA_COLCHETE);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressaoSimplesContext extends ParserRuleContext {
		public List<ExpressaoSomaContext> expressaoSoma() {
			return getRuleContexts(ExpressaoSomaContext.class);
		}
		public ExpressaoSomaContext expressaoSoma(int i) {
			return getRuleContext(ExpressaoSomaContext.class,i);
		}
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public CharRContext charR() {
			return getRuleContext(CharRContext.class,0);
		}
		public ExpressaoSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoSimples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoSimples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressaoSimples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoSimplesContext expressaoSimples() throws RecognitionException {
		ExpressaoSimplesContext _localctx = new ExpressaoSimplesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressaoSimples);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				expressaoSoma();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUALDADE) | (1L << DIFERENCA) | (1L << MAIOR) | (1L << MENOR) | (1L << MAIORIGUAL) | (1L << MENORIGUAL))) != 0)) {
					{
					setState(229);
					relacional();
					setState(230);
					expressaoSoma();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				charR();
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

	public static class CharRContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(AlgumaParser.LETRA, 0); }
		public CharRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCharR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCharR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCharR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharRContext charR() throws RecognitionException {
		CharRContext _localctx = new CharRContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_charR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ASPAS_SIMPLES);
			setState(238);
			match(LETRA);
			setState(239);
			match(ASPAS_SIMPLES);
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

	public static class RelacionalContext extends ParserRuleContext {
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUALDADE) | (1L << DIFERENCA) | (1L << MAIOR) | (1L << MENOR) | (1L << MAIORIGUAL) | (1L << MENORIGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ExpressaoSomaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<SomaContext> soma() {
			return getRuleContexts(SomaContext.class);
		}
		public SomaContext soma(int i) {
			return getRuleContext(SomaContext.class,i);
		}
		public ExpressaoSomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoSoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressaoSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressaoSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressaoSoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoSomaContext expressaoSoma() throws RecognitionException {
		ExpressaoSomaContext _localctx = new ExpressaoSomaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expressaoSoma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			termo();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADICAO || _la==SUBTRACAO) {
				{
				{
				setState(244);
				soma();
				setState(245);
				termo();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SomaContext extends ParserRuleContext {
		public SomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitSoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomaContext soma() throws RecognitionException {
		SomaContext _localctx = new SomaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==ADICAO || _la==SUBTRACAO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			fator();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(255);
				mult();
				setState(256);
				fator();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class FatorContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AtivacaoContext ativacao() {
			return getRuleContext(AtivacaoContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public CharRContext charR() {
			return getRuleContext(CharRContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fator);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(ABRE_PARENTESE);
				setState(266);
				expressao();
				setState(267);
				match(FECHA_PARENTESE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				ativacao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				num();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				charR();
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

	public static class AtivacaoContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public AtivacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ativacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterAtivacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitAtivacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitAtivacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtivacaoContext ativacao() throws RecognitionException {
		AtivacaoContext _localctx = new AtivacaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ativacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			ident();
			setState(276);
			match(ABRE_PARENTESE);
			setState(277);
			args();
			setState(278);
			match(FECHA_PARENTESE);
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

	public static class ArgsContext extends ParserRuleContext {
		public ArgListaContext argLista() {
			return getRuleContext(ArgListaContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << DIGITO) | (1L << ADICAO) | (1L << SUBTRACAO) | (1L << ABRE_PARENTESE) | (1L << ASPAS_SIMPLES))) != 0)) {
				{
				setState(280);
				argLista();
				}
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

	public static class ArgListaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterArgLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitArgLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitArgLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListaContext argLista() throws RecognitionException {
		ArgListaContext _localctx = new ArgListaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			expressao();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(284);
				match(VIRGULA);
				setState(285);
				expressao();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NumContext extends ParserRuleContext {
		public List<SomaContext> soma() {
			return getRuleContexts(SomaContext.class);
		}
		public SomaContext soma(int i) {
			return getRuleContext(SomaContext.class,i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(AlgumaParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(AlgumaParser.DIGITO, i);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_num);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADICAO || _la==SUBTRACAO) {
				{
				setState(291);
				soma();
				}
			}

			setState(295); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(294);
				match(DIGITO);
				}
				}
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(299);
				match(T__0);
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(300);
					match(DIGITO);
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
				}
			}

			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(307);
				match(T__1);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADICAO || _la==SUBTRACAO) {
					{
					setState(308);
					soma();
					}
				}

				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(311);
					match(DIGITO);
					}
					}
					setState(314); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGITO );
				}
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

	public static class NumIntContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(AlgumaParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(AlgumaParser.DIGITO, i);
		}
		public NumIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNumInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNumInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitNumInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumIntContext numInt() throws RecognitionException {
		NumIntContext _localctx = new NumIntContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_numInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(318);
				match(DIGITO);
				}
				}
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGITO );
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

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(AlgumaParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(AlgumaParser.LETRA, i);
		}
		public List<TerminalNode> LETRA_MAIUSCULA() { return getTokens(AlgumaParser.LETRA_MAIUSCULA); }
		public TerminalNode LETRA_MAIUSCULA(int i) {
			return getToken(AlgumaParser.LETRA_MAIUSCULA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(AlgumaParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(AlgumaParser.DIGITO, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(LETRA);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << DIGITO) | (1L << LETRA_MAIUSCULA))) != 0)) {
				{
				{
				setState(324);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << DIGITO) | (1L << LETRA_MAIUSCULA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u014d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\4\3"+
		"\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5g\n\5\f\5\16\5j\13\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\7\6\7\u0080\n\7\r"+
		"\7\16\7\u0081\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u008d\n\t\3\n\3"+
		"\n\3\n\7\n\u0092\n\n\f\n\16\n\u0095\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u009f\n\13\3\f\3\f\3\f\3\f\3\f\3\r\7\r\u00a7\n\r\f\r\16"+
		"\r\u00aa\13\r\3\16\7\16\u00ad\n\16\f\16\16\16\u00b0\13\16\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00b7\n\17\3\20\3\20\3\20\3\20\5\20\u00bd\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00c5\n\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\5\24\u00d2\n\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00db\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u00e2\n\26\f\26\16"+
		"\26\u00e5\13\26\3\27\3\27\3\27\3\27\5\27\u00eb\n\27\3\27\5\27\u00ee\n"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00fa\n\32"+
		"\f\32\16\32\u00fd\13\32\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u0105\n\34"+
		"\f\34\16\34\u0108\13\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\5\36\u0114\n\36\3\37\3\37\3\37\3\37\3\37\3 \5 \u011c\n \3!\3!\3!\7"+
		"!\u0121\n!\f!\16!\u0124\13!\3\"\5\"\u0127\n\"\3\"\6\"\u012a\n\"\r\"\16"+
		"\"\u012b\3\"\3\"\6\"\u0130\n\"\r\"\16\"\u0131\5\"\u0134\n\"\3\"\3\"\5"+
		"\"\u0138\n\"\3\"\6\"\u013b\n\"\r\"\16\"\u013c\5\"\u013f\n\"\3#\6#\u0142"+
		"\n#\r#\16#\u0143\3$\3$\7$\u0148\n$\f$\16$\u014b\13$\3$\2\2%\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\6\3\2\24"+
		"\31\3\2\32\33\3\2\34\35\4\2\16\17\22\22\u0154\2H\3\2\2\2\4J\3\2\2\2\6"+
		"S\3\2\2\2\bU\3\2\2\2\n|\3\2\2\2\f\177\3\2\2\2\16\u0083\3\2\2\2\20\u008c"+
		"\3\2\2\2\22\u008e\3\2\2\2\24\u009e\3\2\2\2\26\u00a0\3\2\2\2\30\u00a8\3"+
		"\2\2\2\32\u00ae\3\2\2\2\34\u00b6\3\2\2\2\36\u00bc\3\2\2\2 \u00be\3\2\2"+
		"\2\"\u00c6\3\2\2\2$\u00c9\3\2\2\2&\u00cf\3\2\2\2(\u00da\3\2\2\2*\u00dc"+
		"\3\2\2\2,\u00ed\3\2\2\2.\u00ef\3\2\2\2\60\u00f3\3\2\2\2\62\u00f5\3\2\2"+
		"\2\64\u00fe\3\2\2\2\66\u0100\3\2\2\28\u0109\3\2\2\2:\u0113\3\2\2\2<\u0115"+
		"\3\2\2\2>\u011b\3\2\2\2@\u011d\3\2\2\2B\u0126\3\2\2\2D\u0141\3\2\2\2F"+
		"\u0145\3\2\2\2HI\5\4\3\2I\3\3\2\2\2JN\5\6\4\2KM\5\6\4\2LK\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PN\3\2\2\2QT\5\b\5\2RT\5\16\b\2S"+
		"Q\3\2\2\2SR\3\2\2\2T\7\3\2\2\2UV\5\n\6\2V]\5F$\2WX\7 \2\2XY\5D#\2YZ\7"+
		"!\2\2Z\\\3\2\2\2[W\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^m\3\2\2\2_]"+
		"\3\2\2\2`a\7$\2\2ah\5F$\2bc\7 \2\2cd\5D#\2de\7!\2\2eg\3\2\2\2fb\3\2\2"+
		"\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2k`\3\2\2\2lo\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7%\2\2q\t\3\2\2\2r}\7\6\2"+
		"\2s}\7\b\2\2t}\7\5\2\2u}\7\7\2\2vw\7\t\2\2wx\5F$\2xy\7\36\2\2yz\5\f\7"+
		"\2z{\7\37\2\2{}\3\2\2\2|r\3\2\2\2|s\3\2\2\2|t\3\2\2\2|u\3\2\2\2|v\3\2"+
		"\2\2}\13\3\2\2\2~\u0080\5\b\5\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\r\3\2\2\2\u0083\u0084\5\n\6\2\u0084"+
		"\u0085\5F$\2\u0085\u0086\7\"\2\2\u0086\u0087\5\20\t\2\u0087\u0088\7#\2"+
		"\2\u0088\u0089\5\26\f\2\u0089\17\3\2\2\2\u008a\u008d\5\22\n\2\u008b\u008d"+
		"\7\7\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\21\3\2\2\2\u008e"+
		"\u0093\5\24\13\2\u008f\u0090\7$\2\2\u0090\u0092\5\24\13\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\23\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\5\n\6\2\u0097\u0098\5F$\2"+
		"\u0098\u009f\3\2\2\2\u0099\u009a\5\n\6\2\u009a\u009b\5F$\2\u009b\u009c"+
		"\7 \2\2\u009c\u009d\7!\2\2\u009d\u009f\3\2\2\2\u009e\u0096\3\2\2\2\u009e"+
		"\u0099\3\2\2\2\u009f\25\3\2\2\2\u00a0\u00a1\7\36\2\2\u00a1\u00a2\5\30"+
		"\r\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4\7\37\2\2\u00a4\27\3\2\2\2\u00a5"+
		"\u00a7\5\b\5\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad"+
		"\5\34\17\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b7"+
		"\5\36\20\2\u00b2\u00b7\5\26\f\2\u00b3\u00b7\5 \21\2\u00b4\u00b7\5$\23"+
		"\2\u00b5\u00b7\5&\24\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\35\3\2\2\2\u00b8"+
		"\u00b9\5(\25\2\u00b9\u00ba\7%\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\7%\2"+
		"\2\u00bc\u00b8\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\37\3\2\2\2\u00be\u00bf"+
		"\7\n\2\2\u00bf\u00c0\7\"\2\2\u00c0\u00c1\5(\25\2\u00c1\u00c2\7#\2\2\u00c2"+
		"\u00c4\5\34\17\2\u00c3\u00c5\5\"\22\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5!\3\2\2\2\u00c6\u00c7\7\13\2\2\u00c7\u00c8\5\34\17\2\u00c8"+
		"#\3\2\2\2\u00c9\u00ca\7\r\2\2\u00ca\u00cb\7\"\2\2\u00cb\u00cc\5(\25\2"+
		"\u00cc\u00cd\7#\2\2\u00cd\u00ce\5\34\17\2\u00ce%\3\2\2\2\u00cf\u00d1\7"+
		"\f\2\2\u00d0\u00d2\5(\25\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\7%\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\5*\26\2"+
		"\u00d6\u00d7\7\23\2\2\u00d7\u00d8\5(\25\2\u00d8\u00db\3\2\2\2\u00d9\u00db"+
		"\5,\27\2\u00da\u00d5\3\2\2\2\u00da\u00d9\3\2\2\2\u00db)\3\2\2\2\u00dc"+
		"\u00e3\5F$\2\u00dd\u00de\7 \2\2\u00de\u00df\5(\25\2\u00df\u00e0\7!\2\2"+
		"\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4+\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00ea\5\62\32\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\5\62\32\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ee\5.\30\2\u00ed\u00e6\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee-\3\2\2\2"+
		"\u00ef\u00f0\7&\2\2\u00f0\u00f1\7\16\2\2\u00f1\u00f2\7&\2\2\u00f2/\3\2"+
		"\2\2\u00f3\u00f4\t\2\2\2\u00f4\61\3\2\2\2\u00f5\u00fb\5\66\34\2\u00f6"+
		"\u00f7\5\64\33\2\u00f7\u00f8\5\66\34\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\63\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\t\3\2\2\u00ff\65\3\2\2\2\u0100"+
		"\u0106\5:\36\2\u0101\u0102\58\35\2\u0102\u0103\5:\36\2\u0103\u0105\3\2"+
		"\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\67\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\t\4\2"+
		"\2\u010a9\3\2\2\2\u010b\u010c\7\"\2\2\u010c\u010d\5(\25\2\u010d\u010e"+
		"\7#\2\2\u010e\u0114\3\2\2\2\u010f\u0114\5*\26\2\u0110\u0114\5<\37\2\u0111"+
		"\u0114\5B\"\2\u0112\u0114\5.\30\2\u0113\u010b\3\2\2\2\u0113\u010f\3\2"+
		"\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		";\3\2\2\2\u0115\u0116\5F$\2\u0116\u0117\7\"\2\2\u0117\u0118\5> \2\u0118"+
		"\u0119\7#\2\2\u0119=\3\2\2\2\u011a\u011c\5@!\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c?\3\2\2\2\u011d\u0122\5(\25\2\u011e\u011f\7$\2\2\u011f"+
		"\u0121\5(\25\2\u0120\u011e\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123A\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127"+
		"\5\64\33\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2"+
		"\u0128\u012a\7\17\2\2\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0133\3\2\2\2\u012d\u012f\7\3\2\2\u012e"+
		"\u0130\7\17\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u012d\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u013e\3\2\2\2\u0135\u0137\7\4\2\2\u0136\u0138\5\64"+
		"\33\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u013b\7\17\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0135\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013fC\3\2\2\2\u0140\u0142\7\17\2\2\u0141\u0140\3\2\2\2"+
		"\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144E\3"+
		"\2\2\2\u0145\u0149\7\16\2\2\u0146\u0148\t\5\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014aG\3\2\2\2"+
		"\u014b\u0149\3\2\2\2$NS]hm|\u0081\u008c\u0093\u009e\u00a8\u00ae\u00b6"+
		"\u00bc\u00c4\u00d1\u00da\u00e3\u00ea\u00ed\u00fb\u0106\u0113\u011b\u0122"+
		"\u0126\u012b\u0131\u0133\u0137\u013c\u013e\u0143\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}