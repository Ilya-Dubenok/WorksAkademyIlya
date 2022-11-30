package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Task2 {

    @Test
    @DisplayName("Проверка на размер массива")
    public void getArrayOfResults() {
        int a = 5; int b = 2; int c = 8;
        int [] result = new int[] {
                home_work_1.Task2.run1(a, b, c),
                home_work_1.Task2.run2(a, b, c),
                home_work_1.Task2.run3(a, b, c),
                home_work_1.Task2.run4(a, b, c),
                home_work_1.Task2.run5(a, b, c),
                home_work_1.Task2.run6(b, c)};
        Assertions.assertEquals(6,result.length);
    }




    @Test
    @DisplayName("Проверка на совпадение точного результата run1")
    public void run1() {
        Assertions.assertEquals(5, home_work_1.Task2.run1(5,2,8));

    }

    @Test
    @DisplayName("Проверка на совпадение  результата run1")
    public void run1_1() {
        int a = -6565; int b = 448; int c = 979;
        Assertions.assertEquals(a + b / c, home_work_1.Task2.run1(a,b,c));

    }

    @Test
    @DisplayName("Проверка на деление на 0")
    public void run1_2() {
        int a = -6565; int b = 448; int c = 0;
        Assertions.assertEquals(0, home_work_1.Task2.run1(a,b,c));

    }

    @Test
    @DisplayName("Проверка на совпадение точного результата run2")
    public void run2() {
        Assertions.assertEquals(0, home_work_1.Task2.run2(5,2,8));

    }

    @Test
    @DisplayName("Проверка на совпадение результата run2")
    public void run2_1() {
        int a = -59569; int b = 448; int c = 979;
        Assertions.assertEquals((a + b) / c, home_work_1.Task2.run2(a,b,c));

    }

    @Test
    @DisplayName("Проверка на совпадение точного результата run3")
    public void run3() {
        Assertions.assertEquals(0, home_work_1.Task2.run3(5,2,8));

    }

    @Test
    @DisplayName("Проверка на совпадение результата run3")
    public void run3_1() {
        int a = -323; int b = 0; int c = 989;
        Assertions.assertEquals((a + b++) / c, home_work_1.Task2.run3(a,b,c));

    }

    @Test
    @DisplayName("Проверка на совпадение точного результата run4")
    public void run4() {
        Assertions.assertEquals(1, home_work_1.Task2.run4(5,2,8));

    }

    @Test
    @DisplayName("Проверка на совпадение результата run4")
    public void run4_1() {
        int a = 65654; int b = -448; int c = 979;
        Assertions.assertEquals((a + b++) / --c, home_work_1.Task2.run4(a,b,c));

    }

    @Test
    @DisplayName("Проверка на совпадение с == 1")
    public void run4_2() {
        int a = 65654; int b = -448; int c = 1;
        Assertions.assertEquals(0, home_work_1.Task2.run4(a,b,c));

    }

    @Test
    @DisplayName("Проверка на совпадение точного результата run5")
    public void run5() {
        Assertions.assertEquals(0, home_work_1.Task2.run5(5,2,8));

    }

    @Test
    @DisplayName("Проверка на совпадение результата run5")
    public void run5_1() {
        int a = -15; int b = 2; int c = 49;
        Assertions.assertEquals((a * b >> b++) / --c, home_work_1.Task2.run5(a,b,c));

    }

    @Test
    @DisplayName("Проверка на совпадение точного результата run6")
    public void run6() {
        Assertions.assertEquals(1, home_work_1.Task2.run6(2,8));

    }

    @Test
    @DisplayName("Проверка на совпадение результата run6")
    public void run6_1() {
         int b = 65; int c = -956;
        Assertions.assertEquals((5 + 7 > 20 ? 68 : ((22 * b >> b++) / --c)), home_work_1.Task2.run6(b,c));

    }

    @Test
    @DisplayName("Проверка на совпадение  результата run7")
    public void run7() {
        Assertions.assertEquals(false, home_work_1.Task2.run7());

    }

    @Test
    @DisplayName("Проверка на совпадение  результата run8")
    public void run8() {
        Assertions.assertEquals(false, home_work_1.Task2.run8());

    }



}
