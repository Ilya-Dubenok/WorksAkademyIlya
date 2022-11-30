package home_work_4.home_work_1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Character.MAX_CODE_POINT;
import static java.lang.Character.MIN_CODE_POINT;
import static org.junit.jupiter.api.Assertions.*;

public class Task4_5 {

    @Test
    @DisplayName("Проверка на определение отсутствия ошибки из-за значения (вар1)")
    public void getMessage1 () {
        int number = MIN_CODE_POINT-1;

        assertDoesNotThrow(()->home_work_1.Task4_5.getMessage(number));
    }

    @Test
    @DisplayName("Проверка на определение отсутствия ошибки из-за значения (вар1)")
    public void getMessage2 () {
        int number = MAX_CODE_POINT+1;

        assertDoesNotThrow(()->home_work_1.Task4_5.getMessage(number));
    }

    @Test
    @DisplayName("Проверка на определение отсутствия ошибки из-за значения (вар1)")
    public void getMessage3 () {
        int num = 65;
        String a = Character.toString(num);
        assertTrue(home_work_1.Task4_5.getMessage(num).contains("Введенный символ: "+a));
    }

    @Test
    @DisplayName("Проверка на определение отсутствия ошибки из-за значения (вар1)")
    public void getMessage4 () {
        int num = 122;
        String a = Character.toString(num);
        assertTrue(home_work_1.Task4_5.getMessage(num).contains("Это код английской буквы"));
    }

    @Test
    @DisplayName("Проверка на определение отсутствия ошибки из-за значения (вар1)")
    public void getMessage5 () {
        int num = 2;
        String a = Character.toString(num);
        assertTrue(home_work_1.Task4_5.getMessage(num).contains("Это не код английской буквы"));
    }


    @Test
    @DisplayName("Проверка на определение отсутствия ошибки из-за значения (вар1)")
    public void getMessage6 () {
        int num = 184;
        String a = Character.toString(num);
        assertTrue(home_work_1.Task4_5.getMessage(num).contains("Это не код английской буквы"));
    }






}
