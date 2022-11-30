package home_work_4.home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoWhileOperation {

    @Test
    public void eachElementToConsole1() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.DoWhileOperation doWhileOperation = new home_work_2.arrays.DoWhileOperation();
        Assertions.assertEquals("3 4 6 9 7", doWhileOperation.eachElementToConsole(nums));
    }

    @Test
    public void eachElementToConsole2() {
        int[] nums = {};
        home_work_2.arrays.DoWhileOperation doWhileOperation = new home_work_2.arrays.DoWhileOperation();
        Assertions.assertDoesNotThrow(() -> doWhileOperation.eachElementToConsole(nums));
    }

    @Test
    public void everySecondElementToConsole() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.DoWhileOperation doWhileOperation = new home_work_2.arrays.DoWhileOperation();
        Assertions.assertEquals("4 9", doWhileOperation.everySecondElementToConsole(nums));
    }

    @Test
    public void everySecondElementToConsole2() {
        int[] nums = {};
        home_work_2.arrays.DoWhileOperation doWhileOperation = new home_work_2.arrays.DoWhileOperation();
        Assertions.assertDoesNotThrow(() -> doWhileOperation.everySecondElementToConsole(nums));
    }

    @Test
    public void reversedOrderToConsole1() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.DoWhileOperation doWhileOperation = new home_work_2.arrays.DoWhileOperation();
        Assertions.assertEquals("7 9 6 4 3", doWhileOperation.reversedOrderToConsole(nums));

    }

    @Test
    public void reversedOrderToConsole2() {
        int[] nums = {};
        home_work_2.arrays.DoWhileOperation doWhileOperation = new home_work_2.arrays.DoWhileOperation();
        Assertions.assertDoesNotThrow(() -> doWhileOperation.reversedOrderToConsole(nums));

    }

}
