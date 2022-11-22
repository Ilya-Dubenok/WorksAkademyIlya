package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long counter;

    /**
     * Увеличивает счетчик на 1
     */
    public void incrementCountOperation() {
        counter++;
    }

    /**
     * @return Значение счетчика
     */
    public long getCountOperation() {
        return counter;
    }


}
