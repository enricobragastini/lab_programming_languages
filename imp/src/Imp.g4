grammar Imp;

prog : funcDef* com EOF ;

funcDef : FUN ID LPAR params? RPAR funcBody;

params : ID (COMMA ID)*;

funcBody : LBRACE (com SEMICOLON)? RETURN exp RBRACE;

com : IF LPAR exp RPAR THEN LBRACE com RBRACE ELSE LBRACE com RBRACE    # if
    | ID ASSIGN exp                                                     # assign
    | GLOBAL ID ASSIGN exp                                              # globalDeclare
    | ID DOTG ASSIGN exp                                                # globalAssign
    | SKIPP                                                             # skip
    | com SEMICOLON com                                                 # seq
    | WHILE LPAR exp RPAR LBRACE com RBRACE                             # while
    | OUT LPAR exp RPAR                                                 # out
    | LBRACE com RBRACE ND LBRACE com RBRACE                            # nd
    | exp                                                               # expCmd
    ;

exp : NAT                                 # nat
    | BOOL                                # bool
    | LPAR exp RPAR                       # parExp
    | <assoc=right> exp POW exp           # pow
    | NOT exp                             # not
    | exp op=(DIV | MUL | MOD) exp        # divMulMod
    | exp op=(PLUS | MINUS) exp           # plusMinus
    | exp op=(LT | LEQ | GEQ | GT) exp    # cmpExp
    | exp op=(EQQ | NEQ) exp              # eqExp
    | exp op=(AND | OR) exp               # logicExp
    | ID LPAR (exp (COMMA exp)*)? RPAR    # funcCall
    | ID DOTG                             # globalId
    | ID                                  # id
    ;


NAT : '0' | [1-9][0-9]* ;
BOOL : 'true' | 'false' ;

PLUS  : '+' ;
MINUS : '-';
MUL   : '*' ;
DIV   : '/' ;
MOD   : 'mod' ;
POW   : '^' ;

AND : '&' ;
OR  : '|' ;

EQQ : '==' ;
NEQ : '!=' ;
LEQ : '<=' ;
GEQ : '>=' ;
LT  : '<' ;
GT  : '>' ;
NOT : '!' ;

IF     : 'if' ;
THEN   : 'then' ;
ELSE   : 'else' ;
WHILE  : 'while' ;
SKIPP  : 'skip' ;
ASSIGN : '=' ;
OUT    : 'out' ;
FUN    : 'fun' ;
RETURN : 'return' ;
GLOBAL : 'global' ;
ND     : 'nd' ;

LPAR      : '(' ;
RPAR      : ')';
LBRACE    : '{' ;
RBRACE    : '}' ;
DOLLAR    : '$' ;
SEMICOLON : ';' ;
COMMA     : ',' ;
DOTG      : '.g';


ID : [a-z]+ ;

WS : [ \t\r\n]+ -> skip ;
