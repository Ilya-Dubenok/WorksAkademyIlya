package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();


        System.out.println("Результат: " + getResult(calculator) + "\nКоличество выполненных операций: " + calculator.getCountOperation());

    }

    public static double getResult(CalculatorWithCounterClassic calculator) {
        double a = calculator.multiply(15, 7);
        calculator.incrementCountOperation();

        double b = calculator.divide(28, 5);
        calculator.incrementCountOperation();

        double c = calculator.exponiate(b, 2);
        calculator.incrementCountOperation();

        double d = calculator.sum(a, c);
        calculator.incrementCountOperation();

        double res = calculator.sum(4.1, d);
        calculator.incrementCountOperation();

        return res;

    }


}
