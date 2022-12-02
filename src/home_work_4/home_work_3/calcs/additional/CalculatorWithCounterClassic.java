package home_work_4.home_work_3.calcs.additional;


import home_work_3.calcs.additional.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterClassic {


    @Test
    @DisplayName("Тестируем сумму")
    public void sum() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertEquals(8, calculator.sum(3, 5));
    }

    @Test
    @DisplayName("Тестируем разницу")
    public void substract() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertEquals(-2, calculator.substract(3, 5));
    }

    @Test
    @DisplayName("Тестируем деление")
    public void divide1() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertEquals(0.3, calculator.divide(3, 10));
    }

    @Test
    @DisplayName("Тестируем деление на 0")
    public void divide2() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertDoesNotThrow(() -> calculator.divide(3, 0));
    }


    @Test
    @DisplayName("Тестируем умножение")
    public void multiply() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertEquals(18, calculator.multiply(2, 9));
    }

    @Test
    @DisplayName("Тестируем модуль")
    public void module() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertEquals(65, calculator.module(-65));
    }

    @Test
    @DisplayName("Тестируем степень")
    public void exponiate() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertEquals(-8, calculator.exponiate(-2, 3));
    }


    @Test
    @DisplayName("Тестируем корень числа")
    public void squareRoot1() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertEquals(4, calculator.squareRoot(16));
    }


    @Test
    @DisplayName("Тестируем корень отрицательного числа")
    public void squareRoot2() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertDoesNotThrow(() -> calculator.squareRoot(16));
    }


    @Test
    @DisplayName("Тестируем счетчик==0 при начале выполнения операций")
    public void getCountOperation1() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        assertEquals(0, calculator.getCountOperation());
    }

    @Test
    @DisplayName("Тестируем счетчик==5 при 5 операциях выполнения операций")
    public void getCountOperation2() {
        home_work_3.calcs.additional.CalculatorWithCounterClassic calculator =
                new home_work_3.calcs.additional.CalculatorWithCounterClassic();
        calculator.sum(1, 3);
        calculator.incrementCountOperation();
        calculator.divide(6, 2);
        calculator.incrementCountOperation();
        calculator.multiply(3, 0);
        calculator.incrementCountOperation();
        calculator.exponiate(6, 2);
        calculator.incrementCountOperation();
        calculator.module(15);
        calculator.incrementCountOperation();
        assertEquals(5, calculator.getCountOperation());
    }


}
