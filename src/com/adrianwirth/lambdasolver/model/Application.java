package com.adrianwirth.lambdasolver.model;

public class Application extends LambdaTerm {

    private final LambdaTerm left;

    private final LambdaTerm right;


    public Application (LambdaTerm left, LambdaTerm right) {
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
}
