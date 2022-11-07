package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    /**
     * Выводит в консоль все элементы массива при помощи for
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void eachElementToConsole(int[] nums) {

        System.out.println("Вывод всех элементов в консоль при помощи for:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

    }

    /**
     * Выводит в консоль каждый второй элемент массива при помощи for
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void everySecondElementToConsole(int[] nums) {

        System.out.println("Вывод каждого второго элемента в консоль при помощи for:");

        for (int i = 1; i < nums.length; i += 2) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

    }

    /**
     * Выводит в консоль все элементы массива в обратном порядке при помощи for
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void reversedOrderToConsole(int[] nums) {

        System.out.println("Вывод всех элементов в консоль при помощи for в обратном порядке:");

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

    }
}
