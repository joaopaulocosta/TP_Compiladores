// Generated from /home/joao/Documentos/ufla/Compiladores/Alguma/src/com/br/Alguma.g4 by ANTLR 4.6
package com.br;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracaoLista}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoLista(AlgumaParser.DeclaracaoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracaoLista}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoLista(AlgumaParser.DeclaracaoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#varDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaracao(AlgumaParser.VarDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#varDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaracao(AlgumaParser.VarDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#tipoEspecificador}.
	 * @param ctx the parse tree
	 */
	void enterTipoEspecificador(AlgumaParser.TipoEspecificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#tipoEspecificador}.
	 * @param ctx the parse tree
	 */
	void exitTipoEspecificador(AlgumaParser.TipoEspecificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#atributosDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterAtributosDeclaracao(AlgumaParser.AtributosDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#atributosDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitAtributosDeclaracao(AlgumaParser.AtributosDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#funDeclaracao}.
	 * @param ctx the parse tree
	 */
	void enterFunDeclaracao(AlgumaParser.FunDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#funDeclaracao}.
	 * @param ctx the parse tree
	 */
	void exitFunDeclaracao(AlgumaParser.FunDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(AlgumaParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(AlgumaParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#paramLista}.
	 * @param ctx the parse tree
	 */
	void enterParamLista(AlgumaParser.ParamListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#paramLista}.
	 * @param ctx the parse tree
	 */
	void exitParamLista(AlgumaParser.ParamListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(AlgumaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(AlgumaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#compostoDecl}.
	 * @param ctx the parse tree
	 */
	void enterCompostoDecl(AlgumaParser.CompostoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#compostoDecl}.
	 * @param ctx the parse tree
	 */
	void exitCompostoDecl(AlgumaParser.CompostoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#localDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterLocalDeclaracoes(AlgumaParser.LocalDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#localDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitLocalDeclaracoes(AlgumaParser.LocalDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoLista}.
	 * @param ctx the parse tree
	 */
	void enterComandoLista(AlgumaParser.ComandoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoLista}.
	 * @param ctx the parse tree
	 */
	void exitComandoLista(AlgumaParser.ComandoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoDecl}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoDecl(AlgumaParser.ExpressaoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoDecl}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoDecl(AlgumaParser.ExpressaoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#selecaoDecl}.
	 * @param ctx the parse tree
	 */
	void enterSelecaoDecl(AlgumaParser.SelecaoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#selecaoDecl}.
	 * @param ctx the parse tree
	 */
	void exitSelecaoDecl(AlgumaParser.SelecaoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#elseR}.
	 * @param ctx the parse tree
	 */
	void enterElseR(AlgumaParser.ElseRContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#elseR}.
	 * @param ctx the parse tree
	 */
	void exitElseR(AlgumaParser.ElseRContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#iteracaoDecl}.
	 * @param ctx the parse tree
	 */
	void enterIteracaoDecl(AlgumaParser.IteracaoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#iteracaoDecl}.
	 * @param ctx the parse tree
	 */
	void exitIteracaoDecl(AlgumaParser.IteracaoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#retornoDecl}.
	 * @param ctx the parse tree
	 */
	void enterRetornoDecl(AlgumaParser.RetornoDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#retornoDecl}.
	 * @param ctx the parse tree
	 */
	void exitRetornoDecl(AlgumaParser.RetornoDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(AlgumaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(AlgumaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(AlgumaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(AlgumaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoSimples}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoSimples(AlgumaParser.ExpressaoSimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoSimples}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoSimples(AlgumaParser.ExpressaoSimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#charR}.
	 * @param ctx the parse tree
	 */
	void enterCharR(AlgumaParser.CharRContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#charR}.
	 * @param ctx the parse tree
	 */
	void exitCharR(AlgumaParser.CharRContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(AlgumaParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(AlgumaParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoSoma}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoSoma(AlgumaParser.ExpressaoSomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoSoma}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoSoma(AlgumaParser.ExpressaoSomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#soma}.
	 * @param ctx the parse tree
	 */
	void enterSoma(AlgumaParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#soma}.
	 * @param ctx the parse tree
	 */
	void exitSoma(AlgumaParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AlgumaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AlgumaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(AlgumaParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(AlgumaParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AlgumaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AlgumaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void enterAtivacao(AlgumaParser.AtivacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#ativacao}.
	 * @param ctx the parse tree
	 */
	void exitAtivacao(AlgumaParser.AtivacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(AlgumaParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(AlgumaParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#argLista}.
	 * @param ctx the parse tree
	 */
	void enterArgLista(AlgumaParser.ArgListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#argLista}.
	 * @param ctx the parse tree
	 */
	void exitArgLista(AlgumaParser.ArgListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(AlgumaParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(AlgumaParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#numInt}.
	 * @param ctx the parse tree
	 */
	void enterNumInt(AlgumaParser.NumIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#numInt}.
	 * @param ctx the parse tree
	 */
	void exitNumInt(AlgumaParser.NumIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(AlgumaParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(AlgumaParser.IdentContext ctx);
}