package home_work_4.home_work_3.simple;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllSimpleCalsulators {


    public static Stream<Arguments> generatorOfSimpleCalcs() {
        return Stream.of(
                Arguments.of(new home_work_3.calcs.simple.CalculatorWithMathCopy()),
                Arguments.of(new CalculatorWithMathExtends()),
                Arguments.of(new CalculatorWithOperator())
        );
    }

    @ParameterizedTest
    @MethodSource("generatorOfSimpleCalcs")
    public void sum(ICalculator calculator) {
        assertEquals(8,calculator.sum(3,5));
    }

    @ParameterizedTest
    @MethodSource("generatorOfSimpleCalcs")
    public void substract(ICalculator calculator) {
        assertEquals(-2,calculator.substract(3,5));
    }

    @ParameterizedTest
    @MethodSource("generatorOfSimpleCalcs")
    public void divide(ICalculator calculator) {
        assertEquals(0.3,calculator.divide(3,10));
    }

    @ParameterizedTest
    @MethodSource("generatorOfSimpleCalcs")
    public void multiply(ICalculator calculator) {
        assertEquals(18,calculator.multiply(2,9));
    }

    @ParameterizedTest
    @MethodSource("generatorOfSimpleCalcs")
    public void module(ICalculator calculator) {
        assertEquals(65,calculator.module(-65));
    }

    @ParameterizedTest
    @MethodSource("generatorOfSimpleCalcs")
    public void exponiate(ICalculator calculator) {
        assertEquals(-8,calculator.exponiate(-2,3));
    }

    @ParameterizedTest
    @MethodSource("generatorOfSimpleCalcs")
    public void squareRoot(ICalculator calculator) {
        assertEquals(4,calculator.squareRoot(16));
    }


}
