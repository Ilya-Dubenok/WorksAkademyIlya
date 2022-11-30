package home_work_4.home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForOperation {

    @Test
    public void eachElementToConsole1() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.ForOperation forOperation = new home_work_2.arrays.ForOperation();
        Assertions.assertEquals("3 4 6 9 7", forOperation.eachElementToConsole(nums));
    }

    @Test
    public void eachElementToConsole2() {
        int[] nums = {};
        home_work_2.arrays.ForOperation forOperation = new home_work_2.arrays.ForOperation();
        Assertions.assertDoesNotThrow(() -> forOperation.eachElementToConsole(nums));
    }

    @Test
    public void everySecondElementToConsole() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.ForOperation forOperation = new home_work_2.arrays.ForOperation();
        Assertions.assertEquals("4 9", forOperation.everySecondElementToConsole(nums));
    }

    @Test
    public void everySecondElementToConsole2() {
        int[] nums = {};
        home_work_2.arrays.ForOperation forOperation = new home_work_2.arrays.ForOperation();
        Assertions.assertDoesNotThrow(() -> forOperation.everySecondElementToConsole(nums));
    }

    @Test
    public void reversedOrderToConsole1() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.ForOperation forOperation = new home_work_2.arrays.ForOperation();
        Assertions.assertEquals("7 9 6 4 3", forOperation.reversedOrderToConsole(nums));

    }

    @Test
    public void reversedOrderToConsole2() {
        int[] nums = {};
        home_work_2.arrays.ForOperation forOperation = new home_work_2.arrays.ForOperation();
        Assertions.assertDoesNotThrow(() -> forOperation.reversedOrderToConsole(nums));

    }

}
