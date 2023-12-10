package com.example.hwtesting.hwtesting;

import com.example.hwtesting.hwtesting.service.CalculatorService;
import com.example.hwtesting.hwtesting.service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HwtestingParamApplicationTests {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();


    @ParameterizedTest
    @CsvSource(value = {"1,2,3", "5,10,15", "-10,15,5", "0,0,0", "0,-1,-1"})
    void plusPositive(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource(value = {"20,15,5", "22,7,15"})
    void minus(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource(value = {"3,2,6", "2,4,8"})
    void multiply(Integer num1, Integer num2, Integer expected) {
        assertEquals(expected, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @CsvSource(value = {"75,5,15", "100,10,10"})
    void divide(Integer num1, Integer num2, Double expected) {
        assertEquals(expected, calculatorService.divide(num1, num2));
    }

}
