package com.example.test.testcicd.controller;

import com.example.test.testcicd.serivce.CalculationService;
import com.example.test.testcicd.util.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculationController {
    @Autowired
    private CalculationService calculationService;

    @GetMapping("/plus")
    public double calculatePlusRequest(@RequestParam("firstNumber") String firstNumber,
                                @RequestParam("secondNumber") String secondNumber) {
        return calculationService.calculateExpression(firstNumber, secondNumber, Operation.PLUS);
    }

    @GetMapping("/minus")
    public double calculateMinusRequest(@RequestParam("firstNumber") String firstNumber,
                                @RequestParam("secondNumber") String secondNumber) {
        return calculationService.calculateExpression(firstNumber, secondNumber, Operation.MINUS);
    }

    @GetMapping("/divide")
    public double calculateDivideRequest(@RequestParam("firstNumber") String firstNumber,
                                @RequestParam("secondNumber") String secondNumber) {
        return calculationService.calculateExpression(firstNumber, secondNumber, Operation.DIVIDE);
    }

    @GetMapping("/multiply")
    public double calculateMultiplyRequest(@RequestParam("firstNumber") String firstNumber,
                                @RequestParam("secondNumber") String secondNumber) {
        return calculationService.calculateExpression(firstNumber, secondNumber, Operation.MULTIPLY);
    }
}
