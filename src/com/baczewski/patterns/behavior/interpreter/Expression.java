package com.baczewski.patterns.behavior.interpreter;

import java.util.Stack;

interface Expression {

    void interpret(Stack<Integer> context);
}
