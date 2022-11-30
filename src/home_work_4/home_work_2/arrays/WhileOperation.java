package home_work_4.home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhileOperation {

    @Test
    public void eachElementToConsole1() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.WhileOperation whileOperation = new home_work_2.arrays.WhileOperation();
        Assertions.assertEquals("3 4 6 9 7", whileOperation.eachElementToConsole(nums));
    }

    @Test
    public void eachElementToConsole2() {
        int[] nums = {};
        home_work_2.arrays.WhileOperation whileOperation = new home_work_2.arrays.WhileOperation();
        Assertions.assertDoesNotThrow(() -> whileOperation.eachElementToConsole(nums));
    }

    @Test
    public void everySecondElementToConsole() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.WhileOperation whileOperation = new home_work_2.arrays.WhileOperation();
        Assertions.assertEquals("4 9", whileOperation.everySecondElementToConsole(nums));
    }

    @Test
    public void everySecondElementToConsole2() {
        int[] nums = {};
        home_work_2.arrays.WhileOperation whileOperation = new home_work_2.arrays.WhileOperation();
        Assertions.assertDoesNotThrow(() -> whileOperation.everySecondElementToConsole(nums));
    }

    @Test
    public void reversedOrderToConsole1() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.WhileOperation whileOperation = new home_work_2.arrays.WhileOperation();
        Assertions.assertEquals("7 9 6 4 3", whileOperation.reversedOrderToConsole(nums));

    }

    @Test
    public void reversedOrderToConsole2() {
        int[] nums = {};
        home_work_2.arrays.WhileOperation whileOperation = new home_work_2.arrays.WhileOperation();
        Assertions.assertDoesNotThrow(() -> whileOperation.reversedOrderToConsole(nums));

    }

}
