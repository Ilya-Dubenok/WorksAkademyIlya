package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {

    /**
     * Выводит в консоль все элементы массива при помощи foreach
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void eachElementToConsole(int[] nums) {
        System.out.println("Вывод всех элементов в консоль при помощи foreach:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");

    }

    /**
     * Выводит в консоль каждый второй элемент массива при помощи foreach
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void everySecondElementToConsole(int[] nums) {

        System.out.println("Вывод каждого второго элемента в консоль при помощи foreach:");
        int a = 0;
        for (int num : nums) {

            if (a % 2 != 0) {
                System.out.print(num + " ");
            }
            a++;

        }
        System.out.println("");

    }

    /**
     * Выводит в консоль все элементы массива в обратном порядке при помощи foreach
     *
     * @param nums массив значений для вывода
     */
    @Override
    public void reversedOrderToConsole(int[] nums) {

        System.out.println("Вывод всех элементов в консоль при помощи foreach в обратном порядке:");

        int[] reversed = new int[nums.length];
        int a = reversed.length - 1;

        for (int num : nums) {
            reversed[a] = num;
            a--;
        }

        for (int rev : reversed) {
            System.out.print(rev + " ");
        }

        System.out.println("");

    }
}
