package home_work_4.home_work_2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task1_5 {

    @Test
    public void getBiggestDigit1() {

        assertDoesNotThrow(() -> home_work_2.loops.Task1_5.getBiggestDigit(-6565));

    }

    @Test
    public void getBiggestDigit2() {

        assertDoesNotThrow(() -> home_work_2.loops.Task1_5.getBiggestDigit(0));

    }

    @Test
    public void getBiggestDigit3() {

        assertDoesNotThrow(() -> home_work_2.loops.Task1_5.getBiggestDigit(Integer.MAX_VALUE));

    }

    @Test
    public void getBiggestDigit4() {

        assertEquals(9, home_work_2.loops.Task1_5.getBiggestDigit(336654978));

    }

    @Test
    public void getBiggestDigit5() {

        assertEquals(6, home_work_2.loops.Task1_5.getBiggestDigit(-356445));

    }

    @Test
    public void getPossibilityOfEvenNums1() {

        assertDoesNotThrow(() -> home_work_2.loops.Task1_5.getPossibilityOfEvenNums(-6565));

    }


    @Test
    public void getPossibilityOfEvenNums2() {

        assertDoesNotThrow(() -> home_work_2.loops.Task1_5.getPossibilityOfEvenNums(0));

    }

    @Test
    public void getPossibilityOfEvenNums3() {
        String s = home_work_2.loops.Task1_5.getPossibilityOfEvenNums(100);
        s = s.substring(0, s.length() - 1);
        double result = Double.parseDouble(s);
        assertTrue(result > 40);

    }

    @Test
    public void getOddAndEvenNumbers1() {

        assertDoesNotThrow(() -> home_work_2.loops.Task1_5.getOddAndEvenNumbers(-5));

    }

    @Test
    public void getOddAndEvenNumbers2() {

        assertEquals("Количество четных цифр: 2. Количество нечетных цифр: 2"
                ,home_work_2.loops.Task1_5.getOddAndEvenNumbers(-6532));

    }

    @Test
    public void getOddAndEvenNumbers3() {

        assertEquals("Количество четных цифр: 0. Количество нечетных цифр: 5"
                ,home_work_2.loops.Task1_5.getOddAndEvenNumbers(-31557));

    }

    @Test
    public void getFibonacci1() {

        assertDoesNotThrow(() ->home_work_2.loops.Task1_5.getFibonacci(-35));

    }

    @Test
    public void getFibonacci2() {

        assertDoesNotThrow(() ->home_work_2.loops.Task1_5.getFibonacci(100));

    }

    @Test
    public void getFibonacci3() {

        assertEquals("1 2 3 5 8 13",home_work_2.loops.Task1_5.getFibonacci(6));

    }

    @Test
    public void getNumbersInBorders1() {

        assertEquals("2 4 6 8",home_work_2.loops.Task1_5.getNumbersInBorders(2,9,2));

    }

    @Test
    public void getNumbersInBorders2() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_5.getNumbersInBorders(-3,6,1));

    }

    @Test
    public void getNumbersInBorders3() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_5.getNumbersInBorders(0,6,0));

    }


    @Test
    public void getNumbersInBorders4() {

        assertEquals("-4 -2 0 2",home_work_2.loops.Task1_5.getNumbersInBorders(-4,2,2));

    }

    @Test
    public void getReversedNumber1() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_5.getReversedNumber(-5));

    }

    @Test
    public void getReversedNumber2() {

        assertEquals("-5697",home_work_2.loops.Task1_5.getReversedNumber(-7965));

    }





}
