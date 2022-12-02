package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICounter;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation implements ICounter {

    private long counter;

    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    /**
     * Увеличивает счетчик на 1 и возвращает сумму двух чисел
     * @param a
     * @param b
     * @return Сумма двух чисел
     */
    public double sum(double a, double b) {
        counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.sum(a, b);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.sum(a, b);
        } else {
            return calculatorWithMathExtends.sum(a,b);
        }
    }

    /**
     * Увеличивает значение счетчика и возвращает разницу двух чисел (a-b)
     * @param a Число, из которого будем вычитать
     * @param b Число, которое будем вычитать
     * @return Разница двух чисел
     */
    public double substract(double a, double b) {
        counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.substract(a, b);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.substract(a, b);
        } else {
            return calculatorWithMathExtends.substract(a,b);
        }
    }
    /**
     * Увеличивает значение счетчика и возвращает деление числа a на b
     * @param a Делитель
     * @param b Знаменатель
     * @return Результат деления
     */
    public double divide(double a, double b) {
        counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.divide(a, b);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.divide(a, b);
        } else {
            return calculatorWithMathExtends.divide(a,b);
        }
    }

    /**
     * Увеличивает значение счетчика и возвращает умножение числа a на b
     * @param a
     * @param b
     * @return Результат умножения
     */
    public double multiply(double a, double b) {
        counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.multiply(a, b);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.multiply(a, b);
        } else {
            return calculatorWithMathExtends.multiply(a,b);
        }
    }

    /**
     * Увеличивает счетчик и возвращает модуль числа путем вызова метода из класса Math
     * @param num
     * @return
     */
    public double module(double num) {
        counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.module(num);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.module(num);
        } else {
            return calculatorWithMathExtends.module(num);
        }
    }


    /**
     * Увеличивает значение счетчика и возвращает заданное число, возведенное в заданную целую степень путем вызова метода из библиотеки Math
     * @param num Возводимое в степень число
     * @param exp Степень
     * @return Число, возведенное в заданную степерь
     */
    public double exponiate(double num, int exp) {
        counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.exponiate(num,exp);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.exponiate(num,exp);
        } else {
            return calculatorWithMathExtends.exponiate(num,exp);
        }
    }

    /**
     * Увеличивает значение счетчика и возвращает квадратный корень из заданного числа путем вызова метода из библиотеки Math
     * @param num
     * @return квадратный корень из числа
     */
    public double squareRoot(double num) {
        counter++;
        if (calculatorWithMathCopy != null) {
            return calculatorWithMathCopy.squareRoot(num);
        } else if (calculatorWithOperator != null) {
            return calculatorWithOperator.squareRoot(num);
        } else {
            return calculatorWithMathExtends.squareRoot(num);
        }
    }


    /**
     * @return Значение счетчика
     */
    public long getCountOperation() {
        return counter;
    }

}
