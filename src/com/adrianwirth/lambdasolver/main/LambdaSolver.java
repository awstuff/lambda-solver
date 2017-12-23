package com.adrianwirth.lambdasolver.main;

import com.adrianwirth.lambdasolver.model.LambdaTerm;

public class LambdaSolver {

    private final LambdaTerm lambdaTerm;


    public LambdaSolver(LambdaTerm lambdaTerm) {
        this.lambdaTerm = lambdaTerm;
        System.out.println(lambdaTerm);
    }

    public void solve () {
        System.out.println(this.lambdaTerm.solve().toString());
    }

}
