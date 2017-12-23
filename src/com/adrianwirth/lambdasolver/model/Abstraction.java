package com.adrianwirth.lambdasolver.model;

public class Abstraction extends LambdaTerm {

    private final Variable boundVariable;

    private final LambdaTerm innerTerm;


    public Abstraction (Variable boundVariable, LambdaTerm innerTerm) {
        this.boundVariable = boundVariable;
        this.innerTerm = innerTerm;
    }


    @Override
    public String toString () {
        return OPEN_PAREN + LAMBDA + this.boundVariable.toString() + DOT + this.innerTerm.toString() + CLOSE_PAREN;
    }


    @Override
    public LambdaTerm solve () {
        return new Abstraction(this.boundVariable, this.innerTerm.solve());
    }


    @Override
    protected LambdaTerm substitute (Variable variable, LambdaTerm substitution) {
        if (this.boundVariable.variableEquals(variable)) {
            return this;
        }

        return this;

//        if (this.)
    }


    protected LambdaTerm contractWith (LambdaTerm argument) {
        return this.innerTerm.substitute(this.boundVariable, argument);
    }

}
