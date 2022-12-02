package home_work_4.home_work_3.calcs.additional;


import home_work_3.calcs.additional.*;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.api.ICounter;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ICounter_Calculators {

    public static Stream<Arguments> generatorOfICounterCalcs() {
        return Stream.of(
                Arguments.of(new CalculatorWithCounterAutoAgregation(new CalculatorWithMathCopy())),
                Arguments.of(new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends())),
                Arguments.of(new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends())),
                Arguments.of(new CalculatorWithCounterAutoComposite()),
                Arguments.of(new CalculatorWithCounterAutoDecorator(new CalculatorWithMathExtends())),
                Arguments.of(new CalculatorWithCounterAutoSuper())
        );
    }

    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем сумму")
    public void sum(ICounter calculator) {
        assertEquals(8, calculator.sum(3, 5));
    }

    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем разницу")
    public void substract(ICounter calculator) {
        assertEquals(-2, calculator.substract(3, 5));
    }

    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем деление")
    public void divide1(ICounter calculator) {
        assertEquals(0.3, calculator.divide(3, 10));
    }

    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем деление на 0")
    public void divide2(ICounter calculator) {
        assertDoesNotThrow(() -> calculator.divide(3, 0));
    }


    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем умножение")
    public void multiply(ICounter calculator) {
        assertEquals(18, calculator.multiply(2, 9));
    }

    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем модуль")
    public void module(ICounter calculator) {
        assertEquals(65, calculator.module(-65));
    }

    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем степень")
    public void exponiate(ICounter calculator) {
        assertEquals(-8, calculator.exponiate(-2, 3));
    }


    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем корень числа")
    public void squareRoot1(ICounter calculator) {
        assertEquals(4, calculator.squareRoot(16));
    }


    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем корень отрицательного числа")
    public void squareRoot2(ICounter calculator) {
        assertDoesNotThrow(() -> calculator.squareRoot(16));
    }


    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем счетчик==0 при начале выполнения операций")
    public void getCountOperation1(ICounter calculator) {
        assertEquals(0, calculator.getCountOperation());
    }

    @ParameterizedTest
    @MethodSource("generatorOfICounterCalcs")
    @DisplayName("Тестируем счетчик==5 при 5 операциях выполнения операций")
    public void getCountOperation2(ICounter calculator) {
        calculator.sum(1, 3);
        calculator.divide(6, 2);
        calculator.multiply(3, 0);
        calculator.exponiate(6, 2);
        calculator.module(15);
        assertEquals(5, calculator.getCountOperation());
    }

    @Test
    @DisplayName("Тестируем работу декоратоа")
    public void asDecorator() {
        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        calculator.sum(15, 7);
        calculator.divide(7, 1);
        calculator = ((CalculatorWithCounterAutoDecorator) calculator).getCalculator();
        if (calculator instanceof CalculatorWithMemoryDecorator) {
            ((CalculatorWithMemoryDecorator) calculator).save();
            assertEquals(7, ((CalculatorWithMemoryDecorator) calculator).load());
        }

    }
}
