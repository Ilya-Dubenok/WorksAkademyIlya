package home_work_4.home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorStringExpression {

    @Test
    @DisplayName("Тестируем единственное число")
    public void single1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-5  ");
        Assertions.assertEquals(-5, calculator.getResult());


    }

    @Test
    @DisplayName("Тестируем единственное число")
    public void single2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept(" 5 ");
        Assertions.assertEquals(5, calculator.getResult());


    }

    @Test
    @DisplayName("Тестируем сумму")
    public void sum1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("5+ 2");
        Assertions.assertEquals(7, calculator.getResult());


    }

    @Test
    @DisplayName("Тестируем сумму c отрицательным первым числом")
    public void sum2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-5+ 2");
        Assertions.assertEquals(-3, calculator.getResult());


    }

    @Test
    @DisplayName("Тестируем неверное выражение")
    public void false1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-5+ ");
        Assertions.assertEquals(0, calculator.getResult());


    }

    @Test
    @DisplayName("Тестируем абсурд")
    public void false2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("asdlkf ");
        Assertions.assertEquals(0, calculator.getResult());


    }

    @Test
    @DisplayName("Тестируем абсурд2")
    public void false3() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-ldskfl ");
        Assertions.assertEquals(0, calculator.getResult());


    }

    @Test
    @DisplayName("Тестируем разницу")
    public void substract1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("5 - 9 ");
        Assertions.assertEquals(-4, calculator.getResult());


    }

    @Test
    @DisplayName("Тестируем разницу с первым отрицательным числом")
    public void substract2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-5 - 9 ");
        Assertions.assertEquals(-14, calculator.getResult());

    }


    @Test
    @DisplayName("Тестируем умножение")
    public void mulipty1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("5 * 9 ");
        Assertions.assertEquals(45, calculator.getResult());

    }

    @Test
    @DisplayName("Тестируем умножение с первым отриц числом")
    public void mulipty2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-5 * 9 ");
        Assertions.assertEquals(-45, calculator.getResult());

    }

    @Test
    @DisplayName("Тестируем умножение с двумя отрицат. числами")
    public void mulipty3() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-5 * (-9) ");
        Assertions.assertEquals(45, calculator.getResult());

    }

    @Test
    @DisplayName("Тестируем модуль1")
    public void module1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("|-5| ");
        Assertions.assertEquals(5, calculator.getResult());

    }

    @Test
    @DisplayName("Тестируем модуль 2")
    public void module2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("|5| ");
        Assertions.assertEquals(5, calculator.getResult());

    }

    @Test
    @DisplayName("Тестируем модуль c выражением внутри")
    public void module3() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("|-15 * 2,0| ");
        Assertions.assertEquals(30, calculator.getResult());

    }

    @Test
    @DisplayName("Деление")
    public void divide() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("16\\2");
        Assertions.assertEquals(8, calculator.getResult());

    }

    @Test
    @DisplayName("Деление с отриц числом")
    public void divide2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-16\\2");
        Assertions.assertEquals(-8, calculator.getResult());

    }

    @Test
    @DisplayName("Деление на ноль")
    public void divide3() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-16,0\\2");
        Assertions.assertDoesNotThrow(() -> calculator.getResult());

    }

    @Test
    @DisplayName("Возведение в степень")
    public void exp1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("3^2");
        Assertions.assertEquals(9, calculator.getResult());

    }

    @Test
    @DisplayName("Возведение в степень отрицательного числа")
    public void exp2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-3^2");
        Assertions.assertEquals(9, calculator.getResult());

    }

    @Test
    @DisplayName("Дробное число с точкой")
    public void num1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("15.9549");
        Assertions.assertEquals(15.9549, calculator.getResult());

    }

    @Test
    @DisplayName("Отриц дробное число с запятой")
    public void num2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549");
        Assertions.assertEquals(-15.9549, calculator.getResult());

    }

    /**
     * Вроде это тоже считается как число с 0,
     */
    @Test
    @DisplayName("число без цифр до точки")
    public void num3() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept(".09549");
        Assertions.assertEquals(0.09549, calculator.getResult());

    }

    @Test
    @DisplayName("отриц число без цифр до точки")
    public void num4() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-.09549");
        Assertions.assertEquals(-0.09549, calculator.getResult());

    }

    @Test
    @DisplayName("PI")
    public void num5() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("PI");
        Assertions.assertEquals(Math.PI, calculator.getResult());

    }

    @Test
    @DisplayName("E")
    public void num6() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("E");
        Assertions.assertEquals(Math.E, calculator.getResult());

    }

    @Test
    @DisplayName("Операция с дробным числов")
    public void operation1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 + 0.66");
        Assertions.assertEquals(-15.9549 + 0.66, calculator.getResult());

    }

    @Test
    @DisplayName("Операция с PI")
    public void operation2_1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 + PI");
        Assertions.assertEquals(-15.9549 + Math.PI, calculator.getResult());

    }

    @Test
    @DisplayName("Операция с E")
    public void operation2_2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 + E");
        Assertions.assertEquals(-15.9549 + Math.E, calculator.getResult());

    }

    @Test
    @DisplayName("двойная операция")
    public void operation2() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 + 0.66 - 0.19");
        Assertions.assertEquals(-15.9549 + 0.66 - 0.19, calculator.getResult());

    }

    @Test
    @DisplayName("операция с разным приоритетом 1 (без скобок)")
    public void operation3() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 + 0.66 * 0.19");
        Assertions.assertEquals(-15.9549 + 0.66 * 0.19, calculator.getResult());

    }


    @Test
    @DisplayName("операция с разным приоритетом 2 (без скобок)")
    public void operation4() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 * 0.66 - 0.19");
        Assertions.assertEquals(-15.9549 * 0.66 - 0.19, calculator.getResult());

    }


    @Test
    @DisplayName("операция с разным приоритетом 3 (без скобок)")
    public void operation5() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 ^ 2 - 0.19");
        Assertions.assertEquals(Math.pow(-15.9549, 2) - 0.19, calculator.getResult());

    }

    @Test
    @DisplayName("операция с разным приоритетом 4 (без скобок)")
    public void operation6() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 ^ 2 - |0.19 - 0,65|");
        Assertions.assertEquals(Math.pow(-15.9549, 2) - Math.abs(0.19 - 0.65), calculator.getResult());

    }


    @Test
    @DisplayName("операция с разным приоритетом скобки 1")
    public void operation7() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 ^ 2 - (0.19 - 0,65)");
        Assertions.assertEquals(Math.pow(-15.9549, 2) - (0.19 - 0.65), calculator.getResult());

    }

    @Test
    @DisplayName("операция с ошибкой в модуле")
    public void operation8() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 ^ 2 - (0.19 - 0,65|)");
        Assertions.assertEquals(0, calculator.getResult());

    }


    @Test
    @DisplayName("операция с ошибкой в скобках 1")
    public void operation9() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 ^ 2 - 0.19 - 0,65)");
        Assertions.assertEquals(0, calculator.getResult());

    }

    @Test
    @DisplayName("операция с ошибкой в скобках 2")
    public void operation10() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 ^ 2 - ((0.19 - 0,65)");
        Assertions.assertEquals(0, calculator.getResult());

    }

    @Test
    @DisplayName("операция с ошибкой в скобках 3")
    public void operation11() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 ^ 2 - (0.19 - 0,65");
        Assertions.assertEquals(0, calculator.getResult());

    }

    @Test
    @DisplayName("операция с ошибкой в скобках 4")
    public void operation12() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 ^ 2 - ()");
        Assertions.assertEquals(0, calculator.getResult());

    }

    @Test
    @DisplayName("операция с ошибкой в скобках 5")
    public void operation12_1() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15,9549 ^ 2 - (65+)");
        Assertions.assertEquals(0, calculator.getResult());

    }

    @Test
    @DisplayName("операция с разным приоритетом скобки 2")
    public void operation13() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("(-15,9549 + 15) ^ 2 - (0.19 - 0,65)");
        Assertions.assertEquals(Math.pow(-15.9549 + 15, 2) - (0.19 - 0.65), calculator.getResult());

    }

    @Test
    @DisplayName("операция с разным приоритетом скобки 3")
    public void operation14() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("(-15,9549 + 15)  - (0.19 - 0,65)");
        Assertions.assertEquals((-15.9549 + 15) - (0.19 - 0.65), calculator.getResult());

    }

    @Test
    @DisplayName("операция со вложенными скобками")
    public void operation15() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15.9549*((15-20) - (0.19-0.65))");
        Assertions.assertEquals(-15.9549 * ((15 - 20) - (0.19 - 0.65)), calculator.getResult());

    }

    @Test
    @DisplayName("операция с модулем и скобками")
    public void operation16() {
        home_work_3.calcs.additional.CalculatorStringExpression calculator =
                new home_work_3.calcs.additional.CalculatorStringExpression(new CalculatorWithMathExtends());

        calculator.accept("-15.9549*(|(15-20) - (0.19-0.65)|)");
        Assertions.assertEquals(-15.9549 * (Math.abs((15 - 20) - (0.19 - 0.65))), calculator.getResult());

    }

}
