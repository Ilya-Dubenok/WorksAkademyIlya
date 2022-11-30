package home_work_4.home_work_1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Task8 {


    @Test
    @DisplayName("Проверяем на отсутствие ошибки")
    public void toBinaryString1() {
        assertDoesNotThrow(()->home_work_1.Task8.toBinaryString((byte)-129));
    }

    @Test
    @DisplayName("Проверяем на отсутствие ошибки")

    public void toBinaryString2() {
        assertDoesNotThrow(()->home_work_1.Task8.toBinaryString((byte)128));
    }

    @Test
    @DisplayName("Проверяем на совпадение кастомного метода с программным (полож.числа)")

    public void toBinaryString3() {
        byte num = 56;
        assertTrue(
                home_work_1.Task8.toBinaryString(num).endsWith(Integer.toBinaryString(num))
                );
    }

    @Test
    @DisplayName("Проверяем на совпадение кастомного метода с программным (отриц.числа)")

    public void toBinaryString4() {
        byte num = -120;
        assertTrue(
                Integer.toBinaryString(num).endsWith( home_work_1.Task8.toBinaryString(num))
        );
    }



}
