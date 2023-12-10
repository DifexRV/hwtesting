package com.example.hwtesting.hwtesting;

import com.example.hwtesting.hwtesting.service.CalculatorService;
import com.example.hwtesting.hwtesting.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class HwtestingApplicationTests {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    private final Integer EXPECTED = 15;

    @Test
    void greetingsСalculator() {
        String expected = "<b>Добро пожаловать в калькулятор</b>";
        assertEquals(expected, calculatorService.greetingsСalculator());
    }

    @Test
    void plus() {
        assertEquals(EXPECTED, 5, 10);
    }

    @Test
    void plusNegative() {
        assertThrows(NullPointerException.class, () -> calculatorService.plus(null, 5));
    }

    @Test
    void minus() {
        assertEquals(EXPECTED, calculatorService.minus(20, 5));
    }

    @Test
    void minusNegative() {
        assertThrows(NullPointerException.class, () -> calculatorService.minus(null, 5));
    }
    @Test
    void multiply() {
        assertEquals(EXPECTED, calculatorService.multiply(3, 5));
    }

    @Test
    void multiplyNegative() {
        assertThrows(NullPointerException.class, () -> calculatorService.multiply(null, 5));
    }

    @Test
    void divide() {
        Double expected = 15.0;
        assertEquals(expected, calculatorService.divide(75, 5));
    }

    @Test
    void divideNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(75, 0));
        assertThrows(NullPointerException.class, () -> calculatorService.divide(null, 5));
    }

}
