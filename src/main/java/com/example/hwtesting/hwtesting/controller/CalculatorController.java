package com.example.hwtesting.hwtesting.controller;

import com.example.hwtesting.hwtesting.service.CalculatorService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorService calculatorServiceImpl;

    public CalculatorController(CalculatorService calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }

    @GetMapping
    public String greetingsСalculator() {
        return calculatorServiceImpl.greetingsСalculator();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorServiceImpl.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorServiceImpl.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorServiceImpl.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        return num1 + " / " + num2 + " = " + calculatorServiceImpl.divide(num1, num2);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String divideByZero(IllegalArgumentException e, HttpServletResponse response) {
        response.setStatus(400);
        return e.getMessage();
    }

}
