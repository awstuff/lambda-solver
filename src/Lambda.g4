grammar Lambda;


parse returns [com.adrianwirth.lambdasolver.model.LambdaTerm value]
    : lambdaTerm EOF {$value = $lambdaTerm.value;}
    ;

lambdaTerm returns [com.adrianwirth.lambdasolver.model.LambdaTerm value]
    : variable {$value = $variable.value;}
    | <assoc=left> left=lambdaTerm right=lambdaTerm {$value = new com.adrianwirth.lambdasolver.model.Application($left.value, $right.value);}
    | abstraction {$value = $abstraction.value;}
    | OPEN_PAREN lambdaTerm CLOSE_PAREN {$value = $lambdaTerm.value;}
    ;

abstraction returns [com.adrianwirth.lambdasolver.model.Abstraction value]
    : LAMBDA variable DOT lambdaTerm {$value = new com.adrianwirth.lambdasolver.model.Abstraction($variable.value, $lambdaTerm.value);}
    ;


variable returns [com.adrianwirth.lambdasolver.model.Variable value]
    : VARIABLE {$value = new com.adrianwirth.lambdasolver.model.Variable($text);}
    ;


LAMBDA : '\\';

DOT : '.';

OPEN_PAREN : '(';

CLOSE_PAREN : ')';

VARIABLE : [a-zA-Z];

WHITESPACE : (' ' | '\t' | '\r'| '\n') -> skip;