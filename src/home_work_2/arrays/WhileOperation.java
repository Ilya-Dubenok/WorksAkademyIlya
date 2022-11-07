package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    /**
     * Выводит в консоль все элементы массива при помощи while
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void eachElementToConsole(int[] nums) {

        int a = 0;

        System.out.println("Вывод всех элементов в консоль при помощи while:");

        while (a < nums.length) {
            System.out.print(nums[a] + " ");
            a++;
        }

        System.out.println();

    }

    /**
     * Выводит в консоль каждый второй элемент массива при помощи while
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void everySecondElementToConsole(int[] nums) {

        System.out.println("Вывод каждого второго элемента в консоль при помощи while:");

        int a = 1;

        while (a < nums.length) {
            System.out.print(nums[a] + " ");
            a += 2;
        }

        System.out.println();


    }

    /**
     * Выводит в консоль все элементы массива в обратном порядке при помощи while
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void reversedOrderToConsole(int[] nums) {

        int a = nums.length - 1;
        System.out.println("Вывод всех элементов в консоль при помощи while в обратном порядке:");

        while (a >= 0) {
            System.out.print(nums[a] + " ");
            a--;
        }

        System.out.println();

    }
}
