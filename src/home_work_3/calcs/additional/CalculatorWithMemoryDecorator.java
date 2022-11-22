package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    private ICalculator calculator;

    private double tempMemory;
    private double currentMemory;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
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
     * Записывает во временную память результат операции и возвращает сумму двух чисел
     * @param a
     * @param b
     * @return Сумма двух чисел
     */
    public double sum(double a, double b) {
        tempMemory = calculator.sum(a, b);
        return tempMemory;
    }

    /**
     * Записывает во временную память результат операции и возвращает разницу двух чисел (a-b)
     * @param a Число, из которого будем вычитать
     * @param b Число, которое будем вычитать
     * @return Разница двух чисел
     */
    public double substract(double a, double b) {
        tempMemory = calculator.substract(a, b);
        return tempMemory;
    }

    /**
     * Записывает во временную память результат операции и возвращает деление числа a на b
     * @param a Делитель
     * @param b Знаменатель
     * @return Результат деления
     */
    public double divide(double a, double b) {
        tempMemory = calculator.divide(a, b);
        return tempMemory;
    }

    /**
     * Записывает во временную память результат операции и возвращает умножение числа a на b
     * @param a
     * @param b
     * @return Результат умножения
     */
    public double multiply(double a, double b) {
        tempMemory = calculator.multiply(a, b);
        return tempMemory;
    }

    /**
     * Увеличивает счетчик и возвращает модуль числа путем вызова метода из класса Math
     * @param num
     * @return
     */
    public double module(double num) {
        tempMemory = calculator.module(num);
        return tempMemory;
    }


    /**
     * Записывает во временную память результат операции и возвращает заданное число,
     * возведенное в заданную целую степень путем вызова метода из библиотеки Math
     * @param num Возводимое в степень число
     * @param exp Степень
     * @return Число, возведенное в заданную степерь
     */
    public double exponiate(double num, int exp) {
        tempMemory = calculator.exponiate(num, exp);
        return tempMemory;
    }

    /**
     * Записывает во временную память результат операции и возвращает квадратный корень из заданного числа
     * путем вызова метода из библиотеки Math
     * @param num
     * @return квадратный корень из числа
     */
    public double squareRoot(double num) {
        tempMemory = calculator.squareRoot(num);
        return tempMemory;
    }

    /**
     * Сохраняет результат последней операции в память
     */
    public void save() {
        currentMemory = tempMemory;
    }

    /**
     * Выводит сохраненный из памяти результат и стирает ее
     */
    public double load() {
        double res = currentMemory;
        currentMemory = 0;
        return res;
    }
}
