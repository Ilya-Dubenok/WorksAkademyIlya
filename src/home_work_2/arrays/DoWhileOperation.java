package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {


    /**
     * Выводит в консоль все элементы массива при помощи do...while
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void eachElementToConsole(int[] nums) {

        System.out.println("Вывод всех элементов в консоль при помощи do...while:");

        int a = 0;
        do {
            System.out.print(nums[a] + " ");
            a++;
        } while (a < nums.length);

        System.out.println();
    }

    /**
     * Выводит в консоль каждый второй элемент массива при помощи do...while
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void everySecondElementToConsole(int[] nums) {

        System.out.println("Вывод каждого второго элемента в консоль при помощи do...while:");

        int a = 1;
        do {
            System.out.print(nums[a] + " ");
            a += 2;
        } while (a < nums.length);

        System.out.println();

    }

    /**
     * Выводит в консоль все элементы массива в обратном порядке при помощи do...while
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void reversedOrderToConsole(int[] nums) {

        System.out.println("Вывод всех элементов в консоль при помощи do...while в обратном порядке:");

        int a = nums.length - 1;
        do {
            System.out.print(nums[a] + " ");
            a--;
        } while (a >= 0);
        System.out.println();

    }
}
