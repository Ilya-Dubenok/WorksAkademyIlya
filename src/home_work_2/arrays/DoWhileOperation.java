package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {


    /**
     * Выводит строку со всеми элементами массива при помощи do...while
     * @param nums массив значений для вывода
     */
    @Override
    public String eachElementToConsole(int[] nums) {

        if (nums.length == 0) {
            return "";
        }


        String res = "";

        int a = 0;
        do {
            res += nums[a] + " ";
            a++;
        } while (a < nums.length);

        return res.trim();
    }

    /**
     * Выводит строку с каждым вторым элементом массива при помощи do...while
     * @param nums массив значений для вывода
     */
    @Override
    public String everySecondElementToConsole(int[] nums) {

        if (nums.length == 0) {
            return "";
        }

        String res = "";

        int a = 1;
        do {
            res += nums[a] + " ";
            a += 2;
        } while (a < nums.length);

        return res.trim();

    }

    /**
     * Выводит строку со всеми элементами массива в обратном порядке при помощи do...while
     * @param nums массив значений для вывода
     */
    @Override
    public String reversedOrderToConsole(int[] nums) {

        if (nums.length == 0) {
            return "";
        }

        String res = "";
        int a = nums.length - 1;
        do {
            res += nums[a] + " ";
            a--;
        } while (a >= 0);
        return res.trim();

    }
}
