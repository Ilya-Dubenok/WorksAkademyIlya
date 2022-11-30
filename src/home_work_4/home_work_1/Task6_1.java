package home_work_4.home_work_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task6_1 {

    @Test
    @DisplayName("Проверка Васи")
    public void welcom1() {
        home_work_1.Task6_1 task6_1 = new home_work_1.Task6_1("Вася");
        assertEquals(task6_1.getMessage(),"Привет!\n"+"Я тебя так долго ждал");

    }

    @Test
    @DisplayName("Проверка Анастасии")
    public void welcom2() {
        home_work_1.Task6_1 task6_1 = new home_work_1.Task6_1("Анастасия");
        assertEquals(task6_1.getMessage(),"Я тебя так долго ждал");

    }

    @Test
    @DisplayName("Проверка абсурда")
    public void welcom3() {
        home_work_1.Task6_1 task6_1 = new home_work_1.Task6_1("kdjfhgjkdfhg");
        assertEquals(task6_1.getMessage(),"Добрый день, а вы кто?");

    }

    @Test
    @DisplayName("Проверка пустоты")
    public void welcom4() {
        home_work_1.Task6_1 task6_1 = new home_work_1.Task6_1("");
        assertEquals(task6_1.getMessage(),"Добрый день, а вы кто?");

    }
}
