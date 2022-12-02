package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {

        CalculatorWithMemory calculator =
                new CalculatorWithMemory(new CalculatorWithMathCopy());


        System.out.println("Результат: " + getResult(calculator));

    }

    public static double getResult(CalculatorWithMemory calculator) {
        calculator.divide(28.0, 5);
        calculator.save();
        calculator.exponiate(calculator.load(), 2);
        calculator.save();
        calculator.sum(15 * 7, calculator.load());
        calculator.save();
        calculator.sum(4.1, calculator.load());
        calculator.save();
        return calculator.load();
    }


}
