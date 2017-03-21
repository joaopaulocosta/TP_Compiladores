grammar Alguma;
//Autor : João Paulo Costa

//Analise Sintatica
programa
    :   declaracaoLista
    ;

declaracaoLista
    :    declaracao (declaracao)*
    ;

declaracao
    :   varDeclaracao
    |   funDeclaracao
    ;

varDeclaracao
    :   tipoEspecificador ident ('[' numInt ']')* (',' ident ('[' numInt ']')*)*  ';'
    ;

tipoEspecificador
    :   'int'
    |   'float'
    |   'char'
    |   'void'
    |   'struct' ident '{' atributosDeclaracao '}'
    ;

atributosDeclaracao
    :   varDeclaracao+
    ;

funDeclaracao
    :   tipoEspecificador ident '(' params ')' compostoDecl
    ;

params
    :   paramLista
    |   'void'
    ;

paramLista
    :   param (',' param)*
    ;

param
    :   tipoEspecificador ident
    |   tipoEspecificador ident '[' ']'
    ;

compostoDecl
    :   '{' localDeclaracoes comandoLista '}'
    ;

localDeclaracoes
    :   varDeclaracao*
    ;

comandoLista
    :   comando*
    ;

comando
    :   expressaoDecl
    |   compostoDecl
    |   selecaoDecl
    |   iteracaoDecl
    |   retornoDecl
    ;



expressaoDecl
    :   expressao ';'
    |   ';'
    ;

selecaoDecl
    :   'if' '(' expressao ')' comando  (elseR)?
    ;

elseR
    :
    ;

iteracaoDecl
    :   'while' '(' expressao ')' comando
    ;

retornoDecl
    :   'return' expressao? ';'
    ;

expressao
    :   var '=' expressao
    |   expressaoSimples
    ;

var
    :   ident ('[' expressao ']')*
    ;

expressaoSimples
    :   expressaoSoma (relacional expressaoSoma)?
    |   charR
    ;

charR
    :   '\'' LETRA '\''
    ;

relacional
    :   '<='
    |   '<'
    |   '>'
    |   '>='
    |   '=='
    |   '!='
    ;

expressaoSoma
    :   termo   (soma termo)*
    ;

soma
    :   '+'
    |   '-'
    ;

termo
    :   fator (mult fator)*
    ;

mult
    :   '*'
    |   '/'
    ;

fator
    :   '(' expressao ')'
    |   var
    |   ativacao
    |   num
    |   charR
    ;


ativacao
    :   ident   '(' args ')'
    ;

args
    :   argLista?
    ;

argLista
    :   expressao (',' expressao)*
    ;

num
    :   (soma)?(DIGITO)+('.'(DIGITO)+)?('E'(soma)?(DIGITO)+)?
    ;

numInt
    :   DIGITO+
    ;


ident
    :   LETRA (LETRA | LETRA_MAIUSCULA| DIGITO)*
    ;



//Analise Lexica

//Palavras Reservadas
CHAR    : 'char';
INT     : 'int';
VOID    : 'void';
FLOAT   : 'float';
STRUCT  : 'struct';
IF      : 'if';
ELSE    : 'else';
RETURN  : 'return';
WHILE   : 'while';

//Fragmentos

LETRA : [a-z];
DIGITO : [0-9];
ESPACO : (' ' | '\t') -> skip;
QUEBRA_LINHA : ('\n' | '\r') -> skip;
LETRA_MAIUSCULA : [A-Z];





//Operadores
ATRIBUICAO  : '=';
IGUALDADE   : '==';
DIFERENCA   : '!=';
MAIOR       : '>';
MENOR       : '<';
MAIORIGUAL  : '>=';
MENORIGUAL  : '<=';
ADICAO      : '+';
SUBTRACAO   : '-';
MULT        : '*';
DIV         : '/';


//separadores
ABRE_CHAVE : '{';
FECHA_CHAVE : '}';
ABRE_COLCHETE : '[';
FECHA_COLCHETE : ']';
ABRE_PARENTESE : '(';
FECHA_PARENTESE : ')';
VIRGULA : ',';
PONTO_VIRGULA : ';';
ASPAS_SIMPLES : '\'';
ASPAS_DUPLAS : '"';


//Espaços em branco e comentarios

WS : [ \r\t\n]+ -> skip;
COMENTARIO : ('/*'.*? '*/' ) -> skip;


