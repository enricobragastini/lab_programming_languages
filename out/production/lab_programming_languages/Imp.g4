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
    | DOLLAR LBRACE arnoldCProg RBRACE DOLLAR                           # arnoldBlock
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


arnoldCProg : 'IT\'S SHOWTIME' arnoldCCom* 'YOU HAVE BEEN TERMINATED';

arnoldCCom: ARNPRINT arnoldCexp                                         #arnoldCprint
        | ARNDECLR1 ID ARNDECLR2  arnoldCexp                            #arnoldCdeclare
        | ARNASSIGN1 ID ARNASSIGN2 arnoldCexp arnoldCOps+ ARNASSIGN3    #arnoldCassign
        | ARNIF1 arnoldCexp arnoldCCom (ARNIF2 arnoldCCom)? ARNIF3      #arnoldCifelse
        | ARNWHILE1 arnoldCexp arnoldCCom* ARNWHILE2                    #arnoldCwhile
        ;

arnoldCOps: op=(ARNPLUS|ARNMIN|ARNMULT|ARNDIV) arnoldCexp               #arnoldCArithmeticOp
          | op=(ARNEQ|ARNGT|ARNOR|ARNAND) arnoldCexp                    #arnoldCLogicalOp
          ;

arnoldCexp: StringLiteral   #arnoldCstring
        | ARBOOL            #arnoldCbool
        | FLOAT             #arnoldCfloat
        | ID                #arnoldCid
        ;


NAT : '0' | [1-9][0-9]* ;
FLOAT : [+-]? ([0-9]*[.])?[0-9]+;
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

ARNPRINT:   'TALK TO THE HAND';
ARNDECLR1:  'HEY CHRISTMAS TREE';
ARNDECLR2:  'YOU SET US UP';
ARNASSIGN1: 'GET TO THE CHOPPER';
ARNASSIGN2: 'HERE IS MY INVITATION';
ARNASSIGN3: 'ENOUGH TALK';
ARNPLUS:    'GET UP';
ARNMIN:     'GET DOWN';
ARNMULT:    'YOU\'RE FIRED';
ARNDIV:     'HE HAD TO SPLIT';
ARNEQ:      'YOU ARE NOT YOU YOU ARE ME';
ARNGT:      'LET OFF SOME STEAM BENNET';
ARNOR:      'CONSIDER THAT A DIVORCE';
ARNAND:     'KNOCK KNOCK';
ARNIF1:     'BECAUSE I\'M GOING TO SAY PLEASE';
ARNIF2:     'BULLSHIT';
ARNIF3:     'YOU HAVE NO RESPECT FOR LOGIC';
ARNWHILE1:  'STICK AROUND';
ARNWHILE2:  'CHILL';
ARBOOL:     '@I LIED' | '@NO PROBLEMO';

StringLiteral : UnterminatedStringLiteral '"' ;
fragment UnterminatedStringLiteral : '"' (~["\\\r\n] | '\\' (. | EOF))* ;

WS : [ \t\r\n]+ -> skip ;




