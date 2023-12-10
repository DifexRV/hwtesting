package com.example.hwtesting.hwtesting.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String greetingsСalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @Override
    public Integer plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new NullPointerException("Ошибка! Неверно указан параметр переменной. Необходимо указать числовое значение.");
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new NullPointerException("Ошибка! Неверно указан параметр переменной. Необходимо указать числовое значение.");
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new NullPointerException("Ошибка! Неверно указан параметр переменной. Необходимо указать числовое значение.");
        return num1 * num2;
    }

    @Override
    public Double divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null)
            throw new NullPointerException("Ошибка! Неверно указан параметр переменной. Необходимо указать числовое значение.");
        if (num2 == 0) throw new IllegalArgumentException("Попытка поделить на 0! Необходимо указать иное число");
        return (num1.doubleValue() / num2.doubleValue());
    }

}
