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
	: exp=expr (NEWLINE | END)						{$v = $exp.value;}
	| assignVar (NEWLINE | END)	
	| assignFunc (NEWLINE | END)						
	| NEWLINE
	;
	
mathFunc returns [double v]
	: 
	;

expr returns [double value]
	: n=NO 											{$value = Double.parseDouble($n.text);}
	| i=ID											{$value = varMemory.get($i.text);}			
	| BRACKET_BEGIN exp=expr BRACKET_END 			{$value = $exp.value;}
	| mul1=expr MUL mul2=expr						{$value = $mul1.value * $mul2.value;}
	| div1=expr DIV div2=expr						{$value = $div1.value / $div2.value;}	
	| sum1=expr ADD sum2=expr						{$value = $sum1.value + $sum2.value;}
	| sub1=expr SUB sub2=expr						{$value = $sub1.value - $sub2.value;}
	| f=mathFunc									{$value = $f.v;}
	;
	
assignVar
	: i=ID ASSIGN exp=expr							{varMemory.put($i.text, $exp.value);}
	| i=ID ASSIGN j=ID								{varMemory.put($i.text, varMemory.get($j.text));}
	;

assignFunc
	: name=ID '(' params=PARAMS ')' '=' exp=expr	
	;


//	
// LEXER RULES
//

NO:				'-'?[0-9]+('.'[0-9]+)?;

ID:				([A-Z] | [a-z] | '_')+([A-Z] | [a-z] | [0-9] | '_')*;

PARAMS:			(ID',')*ID;

ADD:			'+';
MUL:			'*';
DIV:			'/';
SUB:			'-';

BRACKET_BEGIN:	'(';
BRACKET_END:	')';

ASSIGN:			'=';

END:			';';

NEWLINE:		'\r'? '\n' ;
WS:				(' ' | '\t') ->skip;