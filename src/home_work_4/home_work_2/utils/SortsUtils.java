package home_work_4.home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SortsUtils {

    @Test
    @DisplayName("Тестируем на нулевой размер")
    public void sort1() {
        Assertions.assertDoesNotThrow(() ->
                home_work_2.utils.SortsUtils.sort(new int[0]));
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void sort2() {
        int[] test = {1, 2, 3, 4, 5, 6};
        int[] result = {1, 2, 3, 4, 5, 6};
        home_work_2.utils.SortsUtils.sort(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void sort3() {
        int[] test = {1, 1, 1, 1};
        int[] result = {1, 1, 1, 1};
        home_work_2.utils.SortsUtils.sort(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void sort4() {
        int[] test = {9, 1, 5, 99, 9, 9};
        int[] result = {1, 5, 9, 9, 9, 99};
        home_work_2.utils.SortsUtils.sort(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void sort5() {
        int[] test = {6,5,4,3,2,1};
        int[] result = {1,2,3,4,5,6};
        home_work_2.utils.SortsUtils.sort(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void sort6() {
        int[] test = {3,-5,16,9,22};
        int[] result = {-5,3,9,16,22};
        home_work_2.utils.SortsUtils.sort(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void sort7() {
        int[] test = {1,0};
        int[] result = {0,1};
        home_work_2.utils.SortsUtils.sort(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем на нулевой размер")
    public void shake1() {
        Assertions.assertDoesNotThrow(() ->
                home_work_2.utils.SortsUtils.shake(new int[0]));
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void shake2() {
        int[] test = {1, 2, 3, 4, 5, 6};
        int[] result = {1, 2, 3, 4, 5, 6};
        home_work_2.utils.SortsUtils.shake(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void shake3() {
        int[] test = {1, 1, 1, 1};
        int[] result = {1, 1, 1, 1};
        home_work_2.utils.SortsUtils.shake(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void shake4() {
        int[] test = {9, 1, 5, 99, 9, 9};
        int[] result = {1, 5, 9, 9, 9, 99};
        home_work_2.utils.SortsUtils.shake(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void shake5() {
        int[] test = {6,5,4,3,2,1};
        int[] result = {1,2,3,4,5,6};
        home_work_2.utils.SortsUtils.shake(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void shake6() {
        int[] test = {3,-5,16,9,22};
        int[] result = {-5,3,9,16,22};
        home_work_2.utils.SortsUtils.shake(test);
        Assertions.assertArrayEquals(test, result);
    }

    @Test
    @DisplayName("Тестируем правильность сортировки")
    public void shake7() {
        int[] test = {1,0};
        int[] result = {0,1};
        home_work_2.utils.SortsUtils.shake(test);
        Assertions.assertArrayEquals(test, result);
    }
}
