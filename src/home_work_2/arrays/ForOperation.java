package home_work_2.arrays;

public class ForOperation implements IArraysOperation {

    /**
     * Выводит в консоль все элементы массива при помощи for
     *
     * @param nums массив значений для вывода
     */
    @Override
    public String eachElementToConsole(int[] nums) {
        String res = "";

        for (int i = 0; i < nums.length; i++) {
            res += nums[i] + " ";
        }

        return res.trim();


    }

    /**
     * Выводит в консоль каждый второй элемент массива при помощи for
     *
     * @param nums массив значений для вывода
     */
    @Override
    public String everySecondElementToConsole(int[] nums) {

        String res = "";

        for (int i = 1; i < nums.length; i += 2) {
            res += nums[i] + " ";
        }

        return res.trim();
    }

    /**
     * Выводит в консоль все элементы массива в обратном порядке при помощи for
     *
     * @param nums массив значений для вывода
     */
    @Override
    public String reversedOrderToConsole(int[] nums) {

        String res = "";
        for (int i = nums.length - 1; i >= 0; i--) {
            res += nums[i] + " ";
        }

        return res.trim();

    }
}
