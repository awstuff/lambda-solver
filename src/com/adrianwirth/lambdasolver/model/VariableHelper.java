package com.adrianwirth.lambdasolver.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class VariableHelper {

    private static final int NUM_LETTERS_IN_ALPHABET = 26;

    private static List<Variable> availableVariables;

    private VariableHelper () {
    }


    public static Variable getNextUnusedFreeVariable (LambdaTerm lambdaTerm) {
        if (availableVariables == null) {
            availableVariables = new ArrayList<>(NUM_LETTERS_IN_ALPHABET);

            availableVariables.add(new Variable("a"));
            availableVariables.add(new Variable("b"));
            availableVariables.add(new Variable("c"));
            availableVariables.add(new Variable("d"));
            availableVariables.add(new Variable("e"));
            availableVariables.add(new Variable("f"));
            availableVariables.add(new Variable("g"));
            availableVariables.add(new Variable("h"));
            availableVariables.add(new Variable("i"));
            availableVariables.add(new Variable("j"));
            availableVariables.add(new Variable("k"));
            availableVariables.add(new Variable("l"));
            availableVariables.add(new Variable("m"));
            availableVariables.add(new Variable("n"));
            availableVariables.add(new Variable("o"));
            availableVariables.add(new Variable("p"));
            availableVariables.add(new Variable("q"));
            availableVariables.add(new Variable("r"));
            availableVariables.add(new Variable("s"));
            availableVariables.add(new Variable("t"));
            availableVariables.add(new Variable("u"));
            availableVariables.add(new Variable("v"));
            availableVariables.add(new Variable("w"));
            availableVariables.add(new Variable("x"));
            availableVariables.add(new Variable("y"));
            availableVariables.add(new Variable("z"));
        }

        Set<Variable> freeVariablesOfGivenTerm = lambdaTerm.getFreeVariables();

        for (Variable availableVariable : availableVariables) {
            if (!freeVariablesOfGivenTerm.contains(availableVariable)) {
                return availableVariable;
            }
        }

        throw new OutOfVariablesException(lambdaTerm);
    }

}
