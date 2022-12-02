package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoChoiceAgregation calculator = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());


        System.out.println("Результат: " + getResult(calculator) + "\nКоличество выполненных операций: " + calculator.getCountOperation());

        calculator = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());


        System.out.println("Результат: " + getResult(calculator) + "\nКоличество выполненных операций: " + calculator.getCountOperation());

        calculator = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());


        System.out.println("Результат: " + getResult(calculator) + "\nКоличество выполненных операций: " + calculator.getCountOperation());


    }

    public static double getResult(ICalculator calculator) {
        double a = calculator.multiply(15, 7);

        double b = calculator.divide(28, 5);

        double c = calculator.exponiate(b, 2);

        double d = calculator.sum(a, c);

        double res = calculator.sum(4.1, d);

        return res;

    }
}
