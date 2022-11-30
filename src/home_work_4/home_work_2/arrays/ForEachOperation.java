package home_work_4.home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForEachOperation {

    @Test
    public void eachElementToConsole1() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.ForEachOperation forEachOperation = new home_work_2.arrays.ForEachOperation();
        Assertions.assertEquals("3 4 6 9 7", forEachOperation.eachElementToConsole(nums));
    }

    @Test
    public void eachElementToConsole2() {
        int[] nums = {};
        home_work_2.arrays.ForEachOperation forEachOperation = new home_work_2.arrays.ForEachOperation();
        Assertions.assertDoesNotThrow(() -> forEachOperation.eachElementToConsole(nums));
    }

    @Test
    public void everySecondElementToConsole() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.ForEachOperation forEachOperation = new home_work_2.arrays.ForEachOperation();
        Assertions.assertEquals("4 9", forEachOperation.everySecondElementToConsole(nums));
    }

    @Test
    public void everySecondElementToConsole2() {
        int[] nums = {};
        home_work_2.arrays.ForEachOperation forEachOperation = new home_work_2.arrays.ForEachOperation();
        Assertions.assertDoesNotThrow(() -> forEachOperation.everySecondElementToConsole(nums));
    }

    @Test
    public void reversedOrderToConsole1() {
        int[] nums = {3, 4, 6, 9, 7};
        home_work_2.arrays.ForEachOperation forEachOperation = new home_work_2.arrays.ForEachOperation();
        Assertions.assertEquals("7 9 6 4 3", forEachOperation.reversedOrderToConsole(nums));

    }

    @Test
    public void reversedOrderToConsole2() {
        int[] nums = {};
        home_work_2.arrays.ForEachOperation forEachOperation = new home_work_2.arrays.ForEachOperation();
        Assertions.assertDoesNotThrow(() -> forEachOperation.reversedOrderToConsole(nums));

    }

}
