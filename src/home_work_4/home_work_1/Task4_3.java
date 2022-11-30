package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task4_3 {

    @Test
    @DisplayName("Проверка на правильность определения остатка 5/2")
    public void getOstatoc1 () {

        Assertions.assertEquals(1, home_work_1.Task4_3.getOstatoc(5,2));
    }

    @Test
    @DisplayName("Проверка на деление на 0")
    public void getOstatoc2 () {

        Assertions.assertEquals(0, home_work_1.Task4_3.getOstatoc(5,0));
    }


    @Test
    @DisplayName("Проверка на правильность определения остатка 6/3")
    public void getOstatoc3 () {

        Assertions.assertEquals(0, home_work_1.Task4_3.getOstatoc(6,3));
    }

    @Test
    @DisplayName("Проверка на правильность определения остатка -6/3")
    public void getOstatoc4 () {

        Assertions.assertEquals(0, home_work_1.Task4_3.getOstatoc(-6,3));
    }

    @Test
    @DisplayName("Проверка на правильность определения остатка -5/2")
    public void getOstatoc5 () {

        Assertions.assertEquals(-1, home_work_1.Task4_3.getOstatoc(-5,2));
    }

    @Test
    @DisplayName("Проверка на правильность определения остатка 0/3")
    public void getOstatoc6 () {

        Assertions.assertEquals(0, home_work_1.Task4_3.getOstatoc(0,3));
    }




}
