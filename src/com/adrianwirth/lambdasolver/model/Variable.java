package com.adrianwirth.lambdasolver.model;

import java.util.HashSet;
import java.util.Set;

public class Variable extends LambdaTerm {

    private final String name;


    public Variable (String name) {
        if (name == null) {
            throw new IllegalArgumentException("Variable name cannot be null");
        }

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
    public boolean equals (Object other) {
        if (this == other) {
            return true;
        }

        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }

        Variable otherAsVariable = (Variable) other;

        return this.variableEquals(otherAsVariable);
    }


    @Override
    public int hashCode () {
        return this.name.hashCode();
    }


    @Override
    protected LambdaTerm substitute (Variable variable, LambdaTerm substitution) {
        if (this.variableEquals(variable)) {
            return substitution;
        } else {
            return this;
        }
    }


    @Override
    protected Set<Variable> getFreeVariables () {
        if (this.freeVariablesCache != null) {
            return this.freeVariablesCache;
        }

        Set<Variable> freeVariables = new HashSet<>(1);
        freeVariables.add(this);

        return freeVariables;
    }
}
