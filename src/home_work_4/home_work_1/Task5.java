package home_work_4.home_work_1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task5 {

    @Test
    @DisplayName("Проверка true и false")
    public void getMessage1() {
        assertTrue(home_work_1.Task5.getMessage(true,false).contains("Пора на работу!"));
    }

    @Test
    @DisplayName("Проверка false и false")
    public void getMessage2() {
        assertFalse(home_work_1.Task5.getMessage(false,false).contains("Пора на работу!"));
    }

    @Test
    @DisplayName("Проверка false и true")
    public void getMessage3() {
        assertFalse(home_work_1.Task5.getMessage(false,true).contains("Пора на работу!"));
    }

    @Test
    @DisplayName("Проверка true и true")
    public void getMessage4() {
        assertFalse(home_work_1.Task5.getMessage(true,true).contains("Пора на работу!"));
    }

}
