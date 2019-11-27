parser grammar DecafParser;

@header {
package decaf;
}

options
{
  language=Java;
  tokenVocab=DecafLexer;
}

program: CLASS PROGRAM LCURLY (var_decl+)* method_decl* RCURLY;

method_decl: (type | VOID) ID LP ((var_decl)+ SINAL*)? RP block_decl;

block_decl: LCURLY var_decl* statement_decl* RCURLY;
var_decl: type (ID SINAL* )* array_decl? SINAL*;
array_decl: LBRACKET INTLITERAL RBRACKET;

type_id: type ID;

type: INTVAR | BOOLEAN;

statement_decl: location_decl assign_op expr_decl RP* SINAL*
| method_call SINAL* RP* 
| IF (expr_decl RP* block_decl) (ELSE block_decl)? 
| FOR ID EQUAL expr_decl RP* SINAL* expr_decl RP* block_decl 
| RETURN expr_decl? RP* SINAL 
| BREAK SINAL 
| CONTINUE SINAL 
| block_decl;

assign_op: EQUAL | PLUSEQUAL | MINUSEQUAL;

method_call: ID LP expr_decl (SINAL expr_decl)* RP* RP 
| CALLOUT LP STRING (SINAL* (expr_decl 
|STRING)+ SINAL* )? RP;

method_name: ID;

location_decl: ID | ID LBRACKET expr_decl RBRACKET;

expr_decl: location_decl LP*
| method_call 
| identifier_decl 
| expr_decl bin_op expr_decl 
| MINUS expr_decl
| EXCLAMATION expr_decl
| bin_op expr_decl* 
| SINAL expr_decl* 
| RP SINAL
| LP expr_decl RP;

identifier_decl: INTLITERAL INTLITERAL* | INTLITERAL | CHAR | BOOLEANLITERAL ;

bin_op: arith_op | rel_op | eq_op | cond_op;

arith_op: PLUS | MINUS | MULT | DIV | MOD;

rel_op: LESS | BIGGER | LESSEQ | BIGGEREQ;

eq_op: EQUALS | DIFFERENT;

cond_op: AND | OR;