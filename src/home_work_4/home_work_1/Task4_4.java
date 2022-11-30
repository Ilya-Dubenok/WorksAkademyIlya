package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_4 {

    @Test
    @DisplayName("Проверка на правильность вывода числа в зависимости от true")
    public void getNumber1 () {
        int number = 655;

        Assertions.assertEquals(number*1024, home_work_1.Task4_4.getNumber(true, number));
    }


    @Test
    @DisplayName("Проверка на правильность вывода числа в зависимости от условия false")
    public void getNumber2 () {
        int number = 2048;

        Assertions.assertEquals(number/1024.0, home_work_1.Task4_4.getNumber(false, number));
    }





}
