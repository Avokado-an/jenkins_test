package com.example.test.testcicd.util;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS(Double::sum),
    MINUS((n1, n2) -> n1 - n2),
    DIVIDE((n1, n2) -> n1 / n2),
    MULTIPLY((n1, n2) -> n1 * n2);

    private final DoubleBinaryOperator expression;

    Operation(DoubleBinaryOperator expression) {
        this.expression = expression;
    }

    public DoubleBinaryOperator getExpression() {
        return expression;
    }
}
