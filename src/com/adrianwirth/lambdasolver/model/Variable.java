package com.adrianwirth.lambdasolver.model;

public class Variable extends LambdaTerm {

    private final String name;


    public Variable (String name) {
        this.name = name;
    }


    @Override
    public String toString () {
        return this.name;
    }


    @Override
    public LambdaTerm solve () {
        return this;
    }


    protected boolean variableEquals (Variable other) {
        return this.name.equals(other.name);
    }


    @Override
    protected LambdaTerm substitute (Variable variable, LambdaTerm substitution) {
        if (this.variableEquals(variable)) {
            return substitution;
        } else {
            return this;
        }
    }
}
