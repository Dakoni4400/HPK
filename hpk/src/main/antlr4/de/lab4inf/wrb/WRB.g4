grammar WRB;

options{
	language = Java;
}

@parser::header{
	import org.antlr.v4.runtime.*;
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
	| assignFunc (NEWLINE | END)						
	;
	
mathFunc returns [double v]
	: 
	;

pow returns [double v]
	: POW '(' e=expr ')'							{$v = $e.v;}
	| POW n=SCI_NO p=pow							{$v = java.lang.Math.pow(Double.parseDouble($n.text), $p.v);}
	| POW i=ID p=pow								{$v = java.lang.Math.pow(varMemory.get($i.text), $p.v);}
	| POW n=SCI_NO									{$v = Double.parseDouble($n.text);}
	| POW i=ID										{$v = varMemory.get($i.text);}
 	;

expr returns [double v]
	: t=term										{$v = $t.v;}
	| t1=term a=exprAdd								{$v = $t1.v + $a.v;}
	| t1=term s=exprSub								{$v = $t1.v - $s.v;}
	;

exprAdd returns [double v]
	: ADD t=term									{$v = $t.v;}
	;
	
exprSub returns [double v]
	: SUB t=term									{$v = $t.v;}
	;
	
term returns [double v]
	: f=factor										{$v = $f.v;}
	| f1=factor m=termMul							{$v = $f1.v * $m.v;}
	| f1=factor d=termDiv							{$v = $f1.v / $d.v;}
	;

termMul returns [double v]
	: MUL f=factor									{$v = $f.v;}
	;
	
termDiv returns [double v]
	: DIV f=factor									{$v = $f.v;}
	;
	
factor returns [double v]
	: a=signedAtom									{$v = $a.v;}
	| b=signedAtom p=pow							{$v = java.lang.Math.pow($b.v, $p.v);}
	;

signedAtom returns [double v]
   	: '+' a=atom									{$v = $a.v;}
   	| '-' a=atom									{$v = -1*$a.v;}
   	| a=atom										{$v = $a.v;}
	;

atom returns [double v]
   	: n=SCI_NO										{$v = Double.parseDouble($n.text);}
   	| i=ID											{$v = varMemory.get($i.text);}
   	| '(' e=expr ')'								{$v = $e.v;}
   	;	

assignVar returns [double v]
	: i=ID ASSIGN exp=expr							{varMemory.put($i.text, $exp.v); $v = $exp.v;}
	| i=ID ASSIGN j=ID								{varMemory.put($i.text, varMemory.get($j.text)); $v = varMemory.get($j.text);}
	;

assignFunc
	: name=ID '(' params=PARAMS ')' '=' exp=expr	
	;
	
//	
// LEXER RULES
//

// Fragments 

fragment E:			('e' | 'E');

fragment NUMBER:	[0-9]+('.'[0-9]+)?;	

// Token

SCI_NO:			NUMBER (E ('+' | '-') NUMBER)?;

ID:				([A-Z] | [a-z] | '_')+([A-Z] | [a-z] | [0-9] | '_')*;

PARAMS: 		(ID',')*ID;

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