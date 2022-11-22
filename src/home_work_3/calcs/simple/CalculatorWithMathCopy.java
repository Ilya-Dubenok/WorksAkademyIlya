package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    /**
     * Возвращает сумму двух чисел
     * @param a
     * @param b
     * @return Сумма двух чисел
     */
    public double sum(double a, double b) {
        return a + b;
    }

    /**
     * Возвращает разницу двух чисел (a-b)
     * @param a Число, из которого будем вычитать
     * @param b Число, которое будем вычитать
     * @return Разница двух чисел
     */
    public double substract(double a, double b) {
        return a - b;
    }

    /**
     * Возвращает деление числа a на b
     * @param a Делитель
     * @param b Знаменатель
     * @return Результат деления
     */
    public double divide(double a, double b) {
        return a / b;
    }

    /**
     * Возвращает умножение числа a на b
     * @param a
     * @param b
     * @return Результат умножения
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Возвращает значение числа по модулю путем вызова метода из библиотеки Math
     * @param num
     * @return Значение числа по модулю
     */
    public double module(double num) {

        return Math.abs(num);
    }

    /**
     * Возвращает заданное число, возведенное в заданную целую степень путем вызова метода из библиотеки Math
     * @param num Возводимое в степень число
     * @param exp Степень
     * @return Число, возведенное в заданную степерь
     */
    public double exponiate(double num, int exp) {

        return Math.pow(num, exp);
    }

    /**
     * Возвращает квадратный корень из заданного числа путем вызова метода из библиотеки Math
     * @param num
     * @return квадратный корень из числа
     */
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }


}
