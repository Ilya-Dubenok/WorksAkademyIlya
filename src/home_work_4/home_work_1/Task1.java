package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1 {


    @Test
    @DisplayName("Проверка побитового И на совпадение результата (точные значения)")
    public void getAnd1() {
        Assertions.assertEquals(108, home_work_1.Task1.getAnd(110, -20));

    }

    @Test
    @DisplayName("Проверка побитового И на совпадение результата")
    public void getAnd2() {
        int a = 15; int b = -20;
        Assertions.assertEquals((a & b), home_work_1.Task1.getAnd(a, b));

    }

    /**
     * Тут я хз, правильно ли я написал этот тест, но вроде все логично. Просто захотелось
     * найти в библиотеке  что-нибудь интересное
     */
    @Test
    @DisplayName("Проверка побитового И на выдачу ошибки при различных значениях")
    public void getAnd3() {
        Assertions.assertDoesNotThrow(
                ()-> {home_work_1.Task1.getAnd(0, 0);}
        );

    }

    @Test
    @DisplayName("Проверка побитового И на выдачу ошибки при различных значениях")
    public void getAnd4() {
        Assertions.assertDoesNotThrow(
                ()-> {home_work_1.Task1.getAnd(Integer.MIN_VALUE, 0);}
        );

    }

    @Test
    @DisplayName("Проверка побитового И на выдачу ошибки при различных значениях")
    public void getAnd5() {
        Assertions.assertDoesNotThrow(
                ()-> {home_work_1.Task1.getAnd(Integer.MIN_VALUE, Integer.MAX_VALUE);}
        );

    }

    @Test
    @DisplayName("Проверка побитового И на выдачу ошибки при различных значениях")
    public void getAnd6() {
        Assertions.assertDoesNotThrow(
                ()-> {home_work_1.Task1.getAnd(0, Integer.MAX_VALUE);}
        );

    }



    @Test
    @DisplayName("Проверка побитового ИЛИ на совпадение результата (заранее известные значения)")
    public void getOr1() {
        Assertions.assertEquals(-18, home_work_1.Task1.getOr(110, -20));

    }


    @Test
    @DisplayName("Проверка побитового ИЛИ на совпадение результата")
    public void getOr2() {
        int a = 85; int b = 77;
        Assertions.assertEquals((a|b), home_work_1.Task1.getOr(a, -b));

    }

    @Test
    @DisplayName("Проверка побитового ИЛИ на выдачу ошибки при различных значениях")
    public void getOr3() {
        Assertions.assertDoesNotThrow(
                ()-> {home_work_1.Task1.getOr(0, 0);}
        );

    }

    @Test
    @DisplayName("Проверка побитового ИЛИ на выдачу ошибки при различных значениях")
    public void getOr4() {
        Assertions.assertDoesNotThrow(
                ()-> {home_work_1.Task1.getOr(Integer.MIN_VALUE, 0);}
        );

    }

    @Test
    @DisplayName("Проверка побитового ИЛИ на выдачу ошибки при различных значениях")
    public void getOr5() {
        Assertions.assertDoesNotThrow(
                ()-> {home_work_1.Task1.getOr(Integer.MIN_VALUE, Integer.MAX_VALUE);}
        );

    }

    @Test
    @DisplayName("Проверка побитового ИЛИ на выдачу ошибки при различных значениях")
    public void getOr6() {
        Assertions.assertDoesNotThrow(
                ()-> {home_work_1.Task1.getOr(0, Integer.MAX_VALUE);}
        );

    }


}
