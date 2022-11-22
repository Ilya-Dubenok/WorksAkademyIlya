package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
     * Возвращает значение числа по модулю
     * @param num
     * @return Значение числа по модулю
     */
    public double module(double num) {

        return num >= 0 ? num : -1 * num;
    }

    /**
     * Возвращает заданное число, возведенное в заданную целую степень
     * @param num Возводимое в степень число
     * @param exp Степень
     * @return Число, возведенное в заданную степерь
     */
    public double exponiate(double num, int exp) {
        double res = 1;
        if (exp > 0) {
            for (int i = 0; i < exp; i++) {
                res = res * num;
            }
        } else if (exp < 0) {
            for (int i = 0; i > exp; i--) {
                res = res / num;
            }
        }
        return res;
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
