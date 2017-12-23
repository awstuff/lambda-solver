package com.adrianwirth.lambdasolver.model;

import java.util.Set;

public abstract class LambdaTerm {

    protected static final String OPEN_PAREN = "(";

    protected static final String CLOSE_PAREN = ")";

    protected static final String LAMBDA = "\\";

    protected static final String DOT = ".";


    protected Set<Variable> freeVariablesCache;


    public LambdaTerm () {
        this.freeVariablesCache = null;
    }


    public abstract String toString ();


    public abstract LambdaTerm solve ();


    protected boolean isAbstraction () {
        return this instanceof Abstraction;
    }


    protected abstract LambdaTerm substitute (Variable variable, LambdaTerm substitution);


    protected abstract Set<Variable> getFreeVariables ();


    protected final Variable getNextUnusedFreeVariable () {
        return VariableHelper.getNextUnusedFreeVariable(this);
    }

}
