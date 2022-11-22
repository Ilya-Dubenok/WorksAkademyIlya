package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorStringExpressionMain {

    public static void main(String[] args) {


        CalculatorStringExpression calculator = new CalculatorStringExpression(new CalculatorWithMathCopy());

        calculator.accept("(14+(-56,1)\\56+(2+(|5,0-9|)^2)+3)");
        System.out.println(calculator.getResult());

        System.out.println("______________________________________\n");

        calculator.accept("4.1+15*7+(28\\5)^2");
        System.out.println(calculator.getResult());


    }
}
