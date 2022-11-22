package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private ICalculator calculator;

    private long counter;


    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Возвращает ссылку на Icalculator calculator
     * @return
     */
    public ICalculator getCalculator() {
        return this.calculator;
    }


    /**
     * Увеличивает счетчик на 1 и возвращает сумму двух чисел
     * @param a
     * @param b
     * @return Сумма двух чисел
     */
    @Override
    public double sum(double a, double b) {
        counter++;
        return calculator.sum(a, b);
    }

    /**
     * Увеличивает значение счетчика и возвращает разницу двух чисел (a-b)
     * @param a Число, из которого будем вычитать
     * @param b Число, которое будем вычитать
     * @return Разница двух чисел
     */
    @Override
    public double substract(double a, double b) {
        counter++;
        return calculator.substract(a, b);
    }

    /**
     * Увеличивает значение счетчика и возвращает деление числа a на b
     * @param a Делитель
     * @param b Знаменатель
     * @return Результат деления
     */
    public double divide(double a, double b) {
        counter++;
        return calculator.divide(a, b);
    }

    /**
     * Увеличивает значение счетчика и возвращает умножение числа a на b
     * @param a
     * @param b
     * @return Результат умножения
     */
    public double multiply(double a, double b) {
        counter++;
        return calculator.multiply(a, b);
    }

    /**
     * Возвращает модуль числа путем вызова метода из класса Math
     * @param num
     * @return
     */
    @Override
    public double module(double num) {
        counter++;
        return calculator.module(num);
    }

    /**
     * Увеличивает значение счетчика и возвращает заданное число, возведенное в заданную целую степень путем вызова метода из библиотеки Math
     * @param num Возводимое в степень число
     * @param exp Степень
     * @return Число, возведенное в заданную степерь
     */
    @Override
    public double exponiate(double num, int exp) {
        counter++;
        return calculator.exponiate(num, exp);
    }

    /**
     * Увеличивает значение счетчика и возвращает квадратный корень из заданного числа путем вызова метода из библиотеки Math
     * @param num
     * @return квадратный корень из числа
     */
    @Override
    public double squareRoot(double num) {
        counter++;
        return calculator.squareRoot(num);
    }


    /**
     * @return Значение счетчика
     */
    public long getCountOperation() {
        return counter;
    }
}
