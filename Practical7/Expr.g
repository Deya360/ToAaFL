grammar Expr;

//program: statment+; //todo fix (not necessary)
statment: ('DO'|'do') (cmd+=command)+ ('WHILE'|'while') cond=condition ';';

command: ex=expr ';'
        | pr=mprint ';'
        | as=assign ';'
        | st=statment;

condition: l=expr co=cmp r=expr;
mprint: ('PRINT'|'print') ex=expr;
assign: l=expr EQUALS r=expr;

expr: ei=exprid
    | ex=exprnor
    | id=idgrp
    | l=expr op=oper r=expr;

exprnor: l=idgrp op=oper r=idgrp;//(op+=oper r+=idgrp)*;
exprid: id=ID op=oper r=idgrp;

idgrp: i=ID | n=numbergrp;
numbergrp: n1=NUM | n2=roman;

roman: ( | RTEN | RTEN RTEN | RTEN RTEN RTEN) (RONE RTEN|RONE RFIVE|RFIVE? ( | RONE | RONE RONE | RONE RONE RONE));

oper: t+=ADD | t+=SUB | t+=MUL | t+=DIV;
cmp: t+=LTHAN | t+=GTHAN | t+=LTHANEQU | t+=GTHANEQU | t+=ISEQUAL;

ID: [a-z][a-z]*;
NUM: [0-9]+;
RONE: 'I';
RFIVE: 'V';
RTEN: 'X';

WHITESPACE: ' ' -> skip ;
EQUALS: '=';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
LTHAN: '<';
GTHAN: '>';
LTHANEQU: '<=';
GTHANEQU: '>=';
ISEQUAL: '==';
