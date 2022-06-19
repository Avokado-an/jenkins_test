package com.example.test.testcicd.serivce;

import com.example.test.testcicd.util.Operation;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {
    public double calculateExpression(String firstNumber, String secondNumber, Operation operation) {
        return operation.getExpression().applyAsDouble(
                Double.parseDouble(firstNumber),
                Double.parseDouble(secondNumber)
        );
    }

    public double calculateExpressionWithSelf(String firstNumber, Operation operation) {
        return operation.getExpression().applyAsDouble(
                Double.parseDouble(firstNumber),
                Double.parseDouble(firstNumber)
        );
    }
}
