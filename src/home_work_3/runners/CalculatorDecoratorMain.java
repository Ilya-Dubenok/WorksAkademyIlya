package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));


        System.out.println("Результат: " + getResult(calculator) + "\nКоличество выполненных операций: " + ((CalculatorWithCounterAutoDecorator) calculator).getCountOperation());

        System.out.println(getSaved(calculator));

    }

    public static String getSaved(ICalculator calculator) {
        String res = "Операция не удалась";
        calculator = ((CalculatorWithCounterAutoDecorator) calculator).getCalculator();

        if (calculator instanceof CalculatorWithMemoryDecorator) {
            ((CalculatorWithMemoryDecorator) calculator).save();
            res = "Сохраненное значение: " + ((CalculatorWithMemoryDecorator) calculator).load();
        }

        return res;
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
