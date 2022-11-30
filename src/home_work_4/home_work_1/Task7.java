package home_work_4.home_work_1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Task7 {

    @Test
    @DisplayName("Проверяем, что при нулевом массиве не выдает ошибки")
    public void phoneBuilder1_1() {
        assertDoesNotThrow(()->home_work_1.Task7.phoneBuilder(new int[0]));
    }

    @Test
    @DisplayName("Проверяем, что при массиве свыше 10 не выдает ошибки")
    public void phoneBuilder1_2() {
        assertDoesNotThrow(()->home_work_1.Task7.phoneBuilder(new int[30]));
    }

    @Test
    @DisplayName("Проверяем на совпадение по формату")
    public void phoneBuilder1_3() {
        int [] nums = {3,5,9,7,2,0,6,3,7,8};

        String phoneNumber = home_work_1.Task7.phoneBuilder(nums);

        assertTrue(phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}"));

    }

    @Test
    @DisplayName("Проверяем, что при нулевом массиве не выдает ошибки")
    public void phoneBuilder2_1() {
        assertDoesNotThrow(()->home_work_1.Task7.phoneBuilder2(new int[0]));
    }

    @Test
    @DisplayName("Проверяем, что при массиве свыше 10 не выдает ошибки")
    public void phoneBuilder2_2() {
        assertDoesNotThrow(()->home_work_1.Task7.phoneBuilder2(new int[30]));
    }

    @Test
    @DisplayName("Проверяем на совпадение по формату")
    public void phoneBuilder2_3() {
        int [] nums = {3,5,9,7,2,0,6,3,7,8};

        String phoneNumber = home_work_1.Task7.phoneBuilder2(nums);

        assertTrue(phoneNumber.matches("\\(\\d{3}\\) \\d{3}-\\d{4}"));

    }

    @Test
    @DisplayName("Проверяем на отсутствие ошибок1")
    public void getNumbers1() {
        int nums[] = {3};
        assertDoesNotThrow(()->home_work_1.Task7.getNumbers(nums,-1,1));
    }

    @Test
    @DisplayName("Проверяем на отсутствие ошибок2")
    public void getNumbers2() {
        int nums[] = {3};
        assertDoesNotThrow(()->home_work_1.Task7.getNumbers(nums,-1,-1));
    }

    @Test
    @DisplayName("Проверяем на отсутствие ошибок3")
    public void getNumbers3() {
        int nums[] = {};
        assertDoesNotThrow(()->home_work_1.Task7.getNumbers(nums,1,1));
    }

    @Test
    @DisplayName("Проверяем на отсутствие ошибок4")
    public void getNumbers4() {
        int nums[] = {3,4,5};
        assertDoesNotThrow(()->home_work_1.Task7.getNumbers(nums,1,9));
    }




}
