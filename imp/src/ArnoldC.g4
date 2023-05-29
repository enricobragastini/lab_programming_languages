grammar ArnoldC;

arnoldProgram :  'IT\'S SHOWTIME' com 'YOU HAVE BEEN TERMINATED';

com : 'BECAUSE I\'M GOING TO SAY PLEASE' exp com ('BULLSHIT' com)? 'YOU HAVE NO RESPECT FOR LOGIC'      # arnoldIf
    | 'HEY CHRISTMAS TREE' ID 'YOU SET US UP' exp                                                       # declaration
    | 'GET TO THE CHOPPER' ID 'HERE IS MY INVITATION' operand (op)* 'ENOUGH TALK'                       # assign
    | 'TALK TO THE HAND' (ID|STRING)                                                                    # print
    ;

exp : NUMBER
    | BOOL
    | STRING
    

op  : 'GET UP' operand              # sum
    | 'GET DOWN' operand            # sub
    | 'YOU\'RE FIRED' operand       # mul
    | 'HE HAD TO SPLIT' operand     # div
    ;

operand : ID | NUMBER;

BOOL : '@NO PROBLEMO' | '@I LIED';

ID : [a-z];
NUMBER : '0' | [1-9][0-9]*;
STRING: '"' (~["\r\n] | '\\"')* '"';

WS : [ \t\r\n]+ -> skip ;