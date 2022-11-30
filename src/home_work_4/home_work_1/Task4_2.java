package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_2 {

    @Test
    @DisplayName("Проверка на один из вариантов")
    public void getMedium1() {
        double first = -3; double second = 5; double third = 8;
        double num = home_work_1.Task4_2.getMedium(first,second,third);
        Assertions.assertEquals(num, second);
    }

    @Test
    @DisplayName("Проверка на второй из вариантов")
    public void getMedium2() {
        double first = 9; double second = 5; double third = 0;
        double num = home_work_1.Task4_2.getMedium(first,second,third);
        Assertions.assertEquals(num, second);
    }

    @Test
    @DisplayName("Проверка на третий из вариантов")
    public void getMedium3() {
        double first = 9; double second = 55; double third = 0;
        double num = home_work_1.Task4_2.getMedium(first,second,third);
        Assertions.assertEquals(num, first);
    }

    @Test
    @DisplayName("Проверка на четвертый из вариантов")
    public void getMedium4() {
        double first = 9; double second = -55; double third = 55;
        double num = home_work_1.Task4_2.getMedium(first,second,third);
        Assertions.assertEquals(num, first);
    }

    @Test
    @DisplayName("Проверка на пятый из вариантов")
    public void getMedium5() {
        double first = 119; double second = -55; double third = 55;
        double num = home_work_1.Task4_2.getMedium(first,second,third);
        Assertions.assertEquals(num, third);
    }

    @Test
    @DisplayName("Проверка на шестой из вариантов")
    public void getMedium6() {
        double first = -119; double second = 300; double third = 55;
        double num = home_work_1.Task4_2.getMedium(first,second,third);
        Assertions.assertEquals(num, third);
    }

    @Test
    @DisplayName("Проверка на равенство")
    public void getMedium7() {
        double first = -119; double second = 100; double third = 100;
        double num = home_work_1.Task4_2.getMedium(first,second,third);
        Assertions.assertEquals(num, third);
    }





}
