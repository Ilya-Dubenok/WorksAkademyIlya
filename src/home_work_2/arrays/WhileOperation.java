package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {

    /**
     * Выводит в консоль все элементы массива при помощи while
     *
     * @param nums массив значений для вывода
     */
    @Override
    public String eachElementToConsole(int[] nums) {

        int a = 0;

        String res = "";

        while (a < nums.length) {
            res += nums[a] + " ";
            a++;
        }

        return res.trim();

    }

    /**
     * Выводит в консоль каждый второй элемент массива при помощи while
     *
     * @param nums массив значений для вывода
     */
    @Override
    public String everySecondElementToConsole(int[] nums) {

        String res = "";
        int a = 1;

        while (a < nums.length) {
            res += nums[a] + " ";
            a += 2;
        }

        return res.trim();


    }

    /**
     * Выводит в консоль все элементы массива в обратном порядке при помощи while
     *
     * @param nums массив значений для вывода
     */
    @Override
    public String reversedOrderToConsole(int[] nums) {

        int a = nums.length - 1;

        String res = "";
        while (a >= 0) {
            res += nums[a] + " ";
            a--;
        }

        return res.trim();

    }
}
