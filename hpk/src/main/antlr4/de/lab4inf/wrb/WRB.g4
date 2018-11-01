grammar WRB;

options{
	language = Java;
}

@parser::header{
	
}

@parser::members{
	java.util.HashMap<String, Double> varMemory = new java.util.HashMap<String, Double>();
}

//
// PARSER RULES
//

run returns [double v]
	: s=statement+									{$v = $s.v;}
	;

statement returns [double v] 
	: exp=expr (NEWLINE | END)						{$v = $exp.v;}
	| a=assignVar (NEWLINE | END)					{$v = $a.v;}						
	;

expr returns [double v]
	: t=term										{$v = $t.v;}
	| t1=expr a=exprAdd								{$v = $t1.v + $a.v;}
	| t1=expr s=exprSub								{$v = $t1.v - $s.v;}
	;

exprAdd returns [double v]
	: ADD t=term									{$v = $t.v;}
	;
	
exprSub returns [double v]
	: SUB t=term									{$v = $t.v;}
	;
	
term returns [double v]
	: f=factor										{$v = $f.v;}
	| f1=term m=termMul								{$v = $f1.v * $m.v;}
	| f1=term d=termDiv								{$v = $f1.v / $d.v;}
	;

termMul returns [double v]
	: MUL f=factor									{$v = $f.v;}
	;
	
termDiv returns [double v]
	: DIV f=factor									{$v = $f.v;}
	;
	
factor returns [double v]
	: a=signedAtom									{$v = $a.v;}
	| b=signedAtom p=pow							{$v = Math.pow($b.v, $p.v);}
	;

pow returns [double v]
	: POW '(' e=expr ')'							{$v = $e.v;}
	| POW n=SCI_NO p=pow							{$v = Math.pow(Double.parseDouble($n.text), $p.v);}
	| POW i=ID p=pow								{$v = Math.pow(varMemory.get($i.text), $p.v);}
	| POW n=SCI_NO									{$v = Double.parseDouble($n.text);}
	| POW i=ID										{$v = varMemory.get($i.text);}
 	;

signedAtom returns [double v]
   	: '+' a=atom									{$v = $a.v;}
   	| '-' a=atom									{$v = -1*$a.v;}
   	| a=atom										{$v = $a.v;}
	;

atom returns [double v]
   	: n=SCI_NO										{$v = Double.parseDouble($n.text);}
   	| '(' e=expr ')'								{$v = $e.v;}
   	| f=function									{$v = $f.v;}
   	| i=ID											{$v = varMemory.get($i.text);}
   	;	
   	
function returns [double v]
	: m=mathFunction								{$v = $m.v;}
	;

mathFunction returns [double v]
	: ABS '(' e=expr ')'							{$v = Math.abs($e.v);}
	| ACOS '(' e=expr ')'							{$v = Math.acos($e.v);}
	| ASIN '(' e=expr ')'							{$v = Math.asin($e.v);}
	| ATAN '(' e=expr ')'							{$v = Math.atan($e.v);}
	| CBRT '(' e=expr ')'							{$v = Math.cbrt($e.v);}
	| CEIL '(' e=expr ')'							{$v = Math.ceil($e.v);}
	| COS '(' e=expr ')'							{$v = Math.cos($e.v);}
	| COSH '(' e=expr ')'							{$v = Math.cosh($e.v);}
	| EXP '(' e=expr ')'							{$v = Math.exp($e.v);}
	| EXPM1 '(' e=expr ')'							{$v = Math.expm1($e.v);}
	| FLOOR '(' e=expr ')'							{$v = Math.floor($e.v);}
	| (LN| LOGE) '(' e=expr ')'						{$v = Math.log($e.v);}
	| (LOG | LOG10) '(' e=expr ')'					{$v = Math.log10($e.v);}
	| (LOG2 | LD | LB) '(' e=expr ')'				{$v = Math.log($e.v)/Math.log(2);}
	| a=max											{$v = $a.v;}
	| i=min											{$v = $i.v;}
	| POWFUNC '('e1=expr','e2=expr')'				{$v = Math.pow($e1.v,$e2.v);}
	| RINT '(' e=expr ')'							{$v = Math.rint($e.v);}
	| ROUND '(' e=expr ')'							{$v = Math.round($e.v);}
	| SIGNUM '(' e=expr ')'							{$v = Math.signum($e.v);}
	| SIN '(' e=expr ')'							{$v = Math.sin($e.v);}
	| SINH '(' e=expr ')'							{$v = Math.sinh($e.v);}
	| SQRT '(' e=expr ')'							{$v = Math.sqrt($e.v);}
	| TAN '(' e=expr ')'							{$v = Math.tan($e.v);}
	| TANH '(' e=expr ')'							{$v = Math.tanh($e.v);}
	;

min returns [double v]
	: MIN '(' e1=expr ',' e2=expr ')'				{$v = Math.min($e1.v,$e2.v);}
	| MIN '(' e1=expr ',' e2=expr ',' e3=expr ')'	{$v = Math.min(Math.min($e1.v,$e2.v),$e3.v);}
	| MIN '(' e1=expr ',' e2=expr ',' e3=expr ',' e4=expr ')'
	{$v = Math.min(Math.min($e1.v,$e2.v),Math.min($e3.v,$e4.v));}
	;
	
max returns [double v]
	: MAX '(' e1=expr ',' e2=expr ')'				{$v = Math.max($e1.v,$e2.v);}
	| MAX '(' e1=expr ',' e2=expr ',' e3=expr ')'	{$v = Math.max(Math.max($e1.v,$e2.v),$e3.v);}
	| MAX '(' e1=expr ',' e2=expr ',' e3=expr ',' e4=expr ')'
	{$v = Math.max(Math.max($e1.v,$e2.v),Math.max($e3.v,$e4.v));}
	;
	
userFunction:;

assignVar returns [double v]
	: i=ID ASSIGN exp=expr							{varMemory.put($i.text, $exp.v); $v = $exp.v;}
	| i=ID ASSIGN j=ID								{varMemory.put($i.text, varMemory.get($j.text)); $v = varMemory.get($j.text);}
	;
	
//	
// LEXER RULES
//

// Fragments 

fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

fragment NUMBER:	[0-9]+('.'[0-9]+)?;	

// Token

// Math Functions

ABS:			A B S;
ACOS:			A C O S;
ASIN:			A S I N;
ATAN:			A T A N;
ATAN2:			A T A N '2';
CBRT:			C B R T;
CEIL:			C E I L;
COS:			C O S;
COSH:			C O S H;
EXP:			E X P;
EXPM1:			E X P M '1';
FLOOR:			F L O O R;
FLOORDIV:		F L O O R D I V;
FLOORMOD:		F L O O R M O D;
HYPOD:			H Y P O D;
LN:				L N;
LOG:			L O G;
LOGE:			L O G E;
LOG10:			L O G '10';
LOG2:			L O G '2';
LB:				L B;
LD:				L D;
LOG1P:			L O G '1' P;
MAX:			M A X;
MIN:			M I N;
POWFUNC:		P O W;
RINT:			R I N T;
ROUND:			R O U N D;
SCALB:			S C A L B;
SIGNUM:			S I G N U M;
SIN:			S I N;
SINH:			S I N H;
SQRT:			S Q R T;
TAN:			T A N;
TANH:			T A N H;

SCI_NO:			NUMBER (E ('+' | '-') NUMBER)?;

DIGIT:			[0-9]+;

ID:				([A-Z] | [a-z] | '_')+([A-Z] | [a-z] | [0-9] | '_')*;

ADD:			'+';
MUL:			'*';
DIV:			'/';
SUB:			'-';
POW:			'**' | '^';

BRACKET_BEGIN:	'(';
BRACKET_END:	')';

ASSIGN:			'=';

END:			';';

NEWLINE:		'\r'? '\n' ;
WS:				(' ' | '\t') ->skip;

