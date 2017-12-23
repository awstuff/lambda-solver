package com.adrianwirth.lambdasolver.model;

import java.util.HashSet;
import java.util.Set;

public class Application extends LambdaTerm {

    private final LambdaTerm left;

    private final LambdaTerm right;


    public Application (LambdaTerm left, LambdaTerm right) {
        if (left == null){
            throw new IllegalArgumentException("Left term cannot be null");
        }

        if (right == null){
            throw new IllegalArgumentException("Right term cannot be null");
        }

        this.left = left;
        this.right = right;
    }


    @Override
    public String toString () {
        return OPEN_PAREN + this.left.toString() + this.right.toString() + CLOSE_PAREN;
    }


    @Override
    public LambdaTerm solve () {
        if (this.left.isAbstraction()) {
            return ((Abstraction) this.left).contractWith(this.right);
        } else {
            return new Application(this.left.solve(), this.right.solve());
        }
    }


    @Override
    protected LambdaTerm substitute (Variable variable, LambdaTerm substitution) {
        return new Application(this.left.substitute(variable, substitution), this.right.substitute(variable, substitution));
    }


    @Override
    protected Set<Variable> getFreeVariables () {
        if (this.freeVariablesCache != null) {
            return this.freeVariablesCache;
        }

        Set<Variable> freeVariables = new HashSet<>(this.left.getFreeVariables());
        freeVariables.addAll(this.right.getFreeVariables());

        return freeVariables;
    }
}
