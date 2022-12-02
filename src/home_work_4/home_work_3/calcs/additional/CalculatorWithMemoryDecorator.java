package home_work_4.home_work_3.calcs.additional;


import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMemoryDecorator {


    @Test
    @DisplayName("Тестируем сумму")
    public void sum() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        assertEquals(8, calculator.sum(3, 5));
    }

    @Test
    @DisplayName("Тестируем разницу")
    public void substract() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        assertEquals(-2, calculator.substract(3, 5));
    }

    @Test
    @DisplayName("Тестируем деление")
    public void divide1() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        assertEquals(0.3, calculator.divide(3, 10));
    }

    @Test
    @DisplayName("Тестируем деление на 0")
    public void divide2() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        assertDoesNotThrow(() -> calculator.divide(3, 0));
    }


    @Test
    @DisplayName("Тестируем умножение")
    public void multiply() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        assertEquals(18, calculator.multiply(2, 9));
    }

    @Test
    @DisplayName("Тестируем модуль")
    public void module() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        assertEquals(65, calculator.module(-65));
    }

    @Test
    @DisplayName("Тестируем степень")
    public void exponiate() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        assertEquals(-8, calculator.exponiate(-2, 3));
    }


    @Test
    @DisplayName("Тестируем корень числа")
    public void squareRoot1() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        assertEquals(4, calculator.squareRoot(16));
    }


    @Test
    @DisplayName("Тестируем корень отрицательного числа")
    public void squareRoot2() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        assertDoesNotThrow(() -> calculator.squareRoot(16));
    }

    @Test
    @DisplayName("Тестируем память в начале операции")
    public void load1() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());

        assertEquals(0, calculator.load());
    }

    @Test
    @DisplayName("Тестируем память в ряде операций")
    public void load2() {
        home_work_3.calcs.additional.CalculatorWithMemoryDecorator calculator =
                new home_work_3.calcs.additional.CalculatorWithMemoryDecorator(new CalculatorWithMathExtends());
        calculator.sum(7, 3);
        calculator.save(); //10
        calculator.exponiate(calculator.load(), 2);
        calculator.save(); //100
        calculator.divide(calculator.load(), 25);
        calculator.save();//4


        assertEquals(4, calculator.load());
    }


}
