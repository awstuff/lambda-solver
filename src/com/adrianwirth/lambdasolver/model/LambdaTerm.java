package com.adrianwirth.lambdasolver.model;

public abstract class LambdaTerm {

    protected static final String OPEN_PAREN = "(";

    protected static final String CLOSE_PAREN = ")";

    protected static final String LAMBDA = "\\";

    protected static final String DOT = ".";


    public abstract String toString ();

    public abstract LambdaTerm solve ();

    protected boolean isAbstraction () {
        return this instanceof Abstraction;
    }

    protected abstract LambdaTerm substitute (Variable variable, LambdaTerm substitution);
}
