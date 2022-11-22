package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {

    public static void main(String[] args) {

        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();

        double a = calculator.multiply(15,7);

        double b = calculator.divide(28,5);

        double c = calculator.exponiate(b,2);

        double d = calculator.sum(a , c);

        double res = calculator.sum(4.1,d);

        System.out.println("Результат: "+res+"\nКоличество выполненных операций: "+calculator.getCountOperation());
    }
}
