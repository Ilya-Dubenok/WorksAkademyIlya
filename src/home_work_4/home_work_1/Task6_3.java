package home_work_4.home_work_1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Task6_3 {



    @Test
    @DisplayName("Проверка Васи")
    public void welcom1() {
        home_work_1.Task6_3 task6_3 = new home_work_1.Task6_3("Вася");
        assertEquals(task6_3.getMessage(),"Привет!\n"+"Я тебя так долго ждал");

    }

    @Test
    @DisplayName("Проверка Анастасии")
    public void welcom2() {
        home_work_1.Task6_3 task6_3 = new home_work_1.Task6_3("Анастасия");
        assertEquals(task6_3.getMessage(),"Я тебя так долго ждал");

    }

    @Test
    @DisplayName("Проверка абсурда")
    public void welcom3() {
        home_work_1.Task6_3 task6_3 = new home_work_1.Task6_3("kdjfhgjkdfhg");
        assertEquals(task6_3.getMessage(),"Добрый день, а вы кто?");

    }

    @Test
    @DisplayName("Проверка пустоты")
    public void welcom4() {
        home_work_1.Task6_3 task6_3 = new home_work_1.Task6_3("");
        assertEquals(task6_3.getMessage(),"Добрый день, а вы кто?");

    }
}
