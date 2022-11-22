package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {

    public static void main(String[] args) {

        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double a = calculator.multiply(15,7);
        calculator.incrementCountOperation();

        double b = calculator.divide(28,5);
        calculator.incrementCountOperation();

        double c = calculator.exponiate(b,2);
        calculator.incrementCountOperation();

        double d = calculator.sum(a , c);
        calculator.incrementCountOperation();

        double res = calculator.sum(4.1,d);
        calculator.incrementCountOperation();

        System.out.println("Результат: "+res+"\nКоличество выполненных операций: "+calculator.getCountOperation());

    }


}
