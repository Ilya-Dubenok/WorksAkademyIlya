package home_work_4.home_work_1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task4_6 {

    @Test
    @DisplayName("Проверка с числом 2000")
    public void getMessage1() {
        assertTrue(home_work_1.Task4_6.getMessage(2000).contains("Високосный"));
    }

    @Test
    @DisplayName("Проверка с числом 1995")
    public void getMessage2() {
        assertFalse(home_work_1.Task4_6.getMessage(1995).contains("Високосный"));
    }

    @Test
    @DisplayName("Проверка с числом 1700")
    public void getMessage3() {
        assertFalse(home_work_1.Task4_6.getMessage(1700).contains("Високосный"));
    }
}
