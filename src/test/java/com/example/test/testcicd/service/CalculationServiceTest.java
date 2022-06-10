package com.example.test.testcicd.service;

import com.example.test.testcicd.serivce.CalculationService;
import com.example.test.testcicd.util.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculationServiceTest {
    @Autowired
    private CalculationService calculationService;

    @Test
    public void testCalculateExpression() {
        double expected = 9;
        Assertions.assertEquals(
                calculationService.calculateExpression("5", "4", Operation.PLUS), expected
        );
    }
}
