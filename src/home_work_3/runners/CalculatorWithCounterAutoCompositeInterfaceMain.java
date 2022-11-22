package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregationInterface calculator =
                new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());


        double a = calculator.multiply(15,7);

        double b = calculator.divide(28,5);

        double c = calculator.exponiate(b,2);

        double d = calculator.sum(a , c);

        double res = calculator.sum(4.1,d);

        System.out.println("Результат: "+res+"\nКоличество выполненных операций: "+calculator.getCountOperation());


    }
}
