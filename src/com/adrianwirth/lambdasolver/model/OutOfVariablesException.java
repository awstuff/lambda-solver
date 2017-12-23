package com.adrianwirth.lambdasolver.model;

public class OutOfVariablesException extends RuntimeException {

    public OutOfVariablesException (LambdaTerm lambdaTerm) {
        super("No more unused variables available. Caused by: " + lambdaTerm.toString());
    }

}
