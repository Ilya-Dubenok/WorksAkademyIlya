package home_work_4.home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task2_4 {

    @Test
    public void sumOfOddPositive1() {
        int[] nums = {-5, 65, 1, 48, 3, 2, -6};
        Assertions.assertEquals(50, home_work_2.arrays.Task2_4.sumOfOddPositive(nums));

    }

    @Test
    public void sumOfOddPositive2() {
        Assertions.assertDoesNotThrow(() -> home_work_2.arrays.Task2_4.sumOfOddPositive(new int[0]));
    }

    @Test
    public void maxFromOdd1() {
        int[] nums = {-5, 65, 1, 48, 3, 2, -6};
        Assertions.assertEquals(3, home_work_2.arrays.Task2_4.maxFromOdd(nums));

    }

    @Test
    public void maxFromOdd2() {
        Assertions.assertDoesNotThrow(() -> home_work_2.arrays.Task2_4.maxFromOdd(new int[0]));
    }

    @Test
    public void lowerThanMiddleAriphmetic1() {
        int nums[] = {3, 5, 7, 9};
        Assertions.assertEquals(2, home_work_2.arrays.Task2_4.lowerThanMiddleAriphmetic(nums).length);
    }

    @Test
    public void lowerThanMiddleAriphmetic2() {
        int nums[] = {3, 5, 7, 9};
        boolean flag = true;
        for (int i : home_work_2.arrays.Task2_4.lowerThanMiddleAriphmetic(nums)) {
            if (i > 6) {
                flag = false;
                break;
            }
        }
        Assertions.assertTrue(flag);
    }

    @Test
    public void twoMinimumValues1() {
        int nums[] = {1};
        Assertions.assertEquals(1, home_work_2.arrays.Task2_4.twoMinimumValues(nums)[0]);

    }

    @Test
    public void twoMinimumValues2() {
        int nums[] = {1, 2};
        int result[] = {1, 2};
        Assertions.assertArrayEquals(result, home_work_2.arrays.Task2_4.twoMinimumValues(nums));

    }



    @Test
    public void twoMinimumValues3() {
        int[] nums = {};
        Assertions.assertEquals(0, home_work_2.arrays.Task2_4.twoMinimumValues(nums).length);

    }



    @Test
    public void twoMinimumValues4() {
        int[] result = {-1, 2};
        Assertions.assertArrayEquals(result, home_work_2.arrays.
                Task2_4.twoMinimumValues(new int[]{3, 2, -1}));

    }

    @Test
    public void squeeze1() {
        Assertions.assertDoesNotThrow( ()->
                home_work_2.arrays.Task2_4.squeeze(new int[0],5,3));
    }

    @Test
    public void squeeze2() {
        Assertions.assertDoesNotThrow( ()->
                home_work_2.arrays.Task2_4.squeeze(new int[6],-5,3));
    }

    @Test
    public void squeeze3() {
        int[] array = new int[] {2,3,4,3,6,7};
        home_work_2.arrays.Task2_4.squeeze(array,2,3);
        Assertions.assertArrayEquals(new int[]{4, 6, 7, 0, 0, 0}, array);

    }

    @Test
    public void sumOfDigits() {
        Assertions.assertEquals(14,home_work_2.arrays.Task2_4.sumOfDigits(new int[]{3,5,-6,0}));
    }
}
