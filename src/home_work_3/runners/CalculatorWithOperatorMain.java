package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {

    public static void main(String[] args) {

        CalculatorWithOperator calculator = new CalculatorWithOperator();


        System.out.println(getResult(calculator));

    }

    private static double getResult(CalculatorWithOperator calculator) {
        double a = calculator.multiply(15, 7);

        double b = calculator.divide(28, 5);

        double c = calculator.exponiate(b, 2);

        double d = calculator.sum(a, c);

        double res = calculator.sum(4.1, d);
        return res;
    }


}
