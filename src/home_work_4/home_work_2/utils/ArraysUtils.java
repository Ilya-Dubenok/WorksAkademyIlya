package home_work_4.home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysUtils {

    @Test
    @DisplayName("Тестируем на отрицательное значение размера массива")
    public void ArraysUtils1() {

        Assertions.assertDoesNotThrow(() -> home_work_2.utils.ArraysUtils.arrayRandom(-5, 6));

    }

    @Test
    @DisplayName("Тестируем на правильный размер массива")
    public void ArraysUtils2() {

        Assertions.assertEquals(7, home_work_2.utils.ArraysUtils.arrayRandom(7, 6).length);

    }

    @Test
    @DisplayName("Тестируем на отрицательное значение лимита")
    public void ArraysUtils3() {

        Assertions.assertDoesNotThrow(() -> home_work_2.utils.ArraysUtils.arrayRandom(5, -6));

    }

    @RepeatedTest(50)
    @DisplayName("Тестируем на правильный диапазон значений")
    public void ArraysUtils4() {

        int[] array = home_work_2.utils.ArraysUtils.arrayRandom(30, 60);
        boolean test = true;
        for (int i : array) {
            if (i >= 60) {
                test = false;
            }
        }

        Assertions.assertTrue(test);

    }

    @RepeatedTest(50)
    @DisplayName("Тестируем на минимальный диапазон значений")
    public void ArraysUtils5() {

        int[] array = home_work_2.utils.ArraysUtils.arrayRandom(30, 60);
        boolean test = true;
        for (int i : array) {
            if (i < 0) {
                test = false;
            }
        }

        Assertions.assertTrue(test);

    }
}
