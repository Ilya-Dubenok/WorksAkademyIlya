package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoSuperMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();


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
