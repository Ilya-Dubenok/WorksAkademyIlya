package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    /**
     * Возвращает модуль числа путем вызова метода из класса Math
     * @param num
     * @return
     */
    @Override
    public double module(double num) {

        return  Math.abs(num);
    }

    /**
     * Возвращает заданное число, возведенное в заданную целую степень путем вызова метода из библиотеки Math
     * @param num Возводимое в степень число
     * @param exp Степень
     * @return Число, возведенное в заданную степерь
     */
    @Override
    public double exponiate(double num, int exp) {

        return Math.pow(num, exp);
    }

    /**
     * Возвращает квадратный корень из заданного числа путем вызова метода из библиотеки Math
     * @param num
     * @return квадратный корень из числа
     */
    @Override
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
