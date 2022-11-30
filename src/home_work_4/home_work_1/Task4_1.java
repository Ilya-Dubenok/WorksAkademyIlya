package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class Task4_1 {

    @RepeatedTest(20)
    @DisplayName("Проверка на четность чисел")
    public void getEvenRandom1() {
        int num = home_work_1.Task4_1.getEvenRandom();
        Assertions.assertTrue(num % 2 == 0);
    }

    @RepeatedTest(20)
    @DisplayName("Проверка на случайность чисел")
    public void getEvenRandom2() {
        int num = home_work_1.Task4_1.getEvenRandom();
        int num2 = home_work_1.Task4_1.getEvenRandom();
        Assertions.assertTrue(num != num2);
    }


    @RepeatedTest(20)
    @DisplayName("Проверка на нечетность чисел")
    public void getOddRandom() {
        int num = home_work_1.Task4_1.getOddRandom();
        Assertions.assertTrue(num % 2 != 0);
    }






}
