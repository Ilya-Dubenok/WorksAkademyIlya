package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoChoiceAgregation calculator = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());

        double a = calculator.multiply(15, 7);

        double b = calculator.divide(28, 5);

        double c = calculator.exponiate(b, 2);

        double d = calculator.sum(a, c);

        double res = calculator.sum(4.1, d);

        System.out.println("Результат: " + res + "\nКоличество выполненных операций: " + calculator.getCountOperation());

        calculator = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());

        a = calculator.multiply(15, 7);

        b = calculator.divide(28, 5);

        c = calculator.exponiate(b, 2);

        d = calculator.sum(a, c);

        res = calculator.sum(4.1, d);

        System.out.println("Результат: " + res + "\nКоличество выполненных операций: " + calculator.getCountOperation());

        calculator = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());

        a = calculator.multiply(15, 7);

        b = calculator.divide(28, 5);

        c = calculator.exponiate(b, 2);

        d = calculator.sum(a, c);

        res = calculator.sum(4.1, d);

        System.out.println("Результат: " + res + "\nКоличество выполненных операций: " + calculator.getCountOperation());


    }
}
