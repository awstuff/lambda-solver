package com.adrianwirth.lambdasolver.model;

import java.util.HashSet;
import java.util.Set;

public class Abstraction extends LambdaTerm {

    private final Variable boundVariable;

    private final LambdaTerm innerTerm;


    public Abstraction (Variable boundVariable, LambdaTerm innerTerm) {
        if (boundVariable == null) {
            throw new IllegalArgumentException("Bound variable cannot be null");
        }

        if (innerTerm == null) {
            throw new IllegalArgumentException("Inner term cannot be null");
        }

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

        if (substitution.getFreeVariables().contains(this.boundVariable) && this.innerTerm.getFreeVariables().contains(variable)) {
            Variable nextFreeVariable = this.getNextUnusedFreeVariable();

            return new Abstraction(nextFreeVariable, this.innerTerm
                    .substitute(this.boundVariable, nextFreeVariable)
                    .substitute(variable, substitution)
            );
        }

        return new Abstraction(this.boundVariable, this.innerTerm.substitute(variable, substitution));
    }


    protected LambdaTerm contractWith (LambdaTerm argument) {
        return this.innerTerm.substitute(this.boundVariable, argument);
    }


    @Override
    protected Set<Variable> getFreeVariables () {
        if (this.freeVariablesCache != null) {
            return this.freeVariablesCache;
        }

        Set<Variable> freeVariables = new HashSet<>(this.innerTerm.getFreeVariables());

        freeVariables.remove(this.boundVariable);

        return freeVariables;
    }
}
