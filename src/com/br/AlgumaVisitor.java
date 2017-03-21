// Generated from /home/joao/Documentos/ufla/Compiladores/Alguma/src/com/br/Alguma.g4 by ANTLR 4.6
package com.br;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracaoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoLista(AlgumaParser.DeclaracaoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#varDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaracao(AlgumaParser.VarDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#tipoEspecificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoEspecificador(AlgumaParser.TipoEspecificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#atributosDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributosDeclaracao(AlgumaParser.AtributosDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#funDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunDeclaracao(AlgumaParser.FunDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(AlgumaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#paramLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamLista(AlgumaParser.ParamListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(AlgumaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#compostoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompostoDecl(AlgumaParser.CompostoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#localDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDeclaracoes(AlgumaParser.LocalDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#comandoLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoLista(AlgumaParser.ComandoListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#expressaoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoDecl(AlgumaParser.ExpressaoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#selecaoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecaoDecl(AlgumaParser.SelecaoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#elseR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseR(AlgumaParser.ElseRContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#iteracaoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracaoDecl(AlgumaParser.IteracaoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#retornoDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetornoDecl(AlgumaParser.RetornoDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(AlgumaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(AlgumaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#expressaoSimples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoSimples(AlgumaParser.ExpressaoSimplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#charR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharR(AlgumaParser.CharRContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(AlgumaParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#expressaoSoma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoSoma(AlgumaParser.ExpressaoSomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#soma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma(AlgumaParser.SomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(AlgumaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(AlgumaParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(AlgumaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#ativacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtivacao(AlgumaParser.AtivacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(AlgumaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#argLista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgLista(AlgumaParser.ArgListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(AlgumaParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#numInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumInt(AlgumaParser.NumIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(AlgumaParser.IdentContext ctx);
}