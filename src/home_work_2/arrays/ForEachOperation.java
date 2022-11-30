package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {

    /**
     * Выводит String со всеми элементами массива при помощи foreach
     * @param nums массив значений для вывода
     */
    @Override
    public String eachElementToConsole(int[] nums) {
        String res = "";
        for (int num : nums) {
            res += num + " ";
        }
        return res.trim();

    }

    /**
     * Выводит строку с каждым вторым элементом массива при помощи foreach
     * @param nums массив значений для вывода
     */
    @Override
    public String everySecondElementToConsole(int[] nums) {
        String res = "";
        int a = 0;
        for (int num : nums) {

            if (a % 2 != 0) {
                res += num + " ";
            }
            a++;

        }
        return res.trim();

    }

    /**
     * Выводит строку со всеми элементами массива в обратном порядке при помощи foreach
     * @param nums массив значений для вывода
     */
    @Override
    public String reversedOrderToConsole(int[] nums) {

        String res = "";

        if (nums.length < 1) {
            return res;
        }

        int[] reversed = new int[nums.length];

        int a = reversed.length - 1;

        for (int num : nums) {
            reversed[a] = num;
            a--;
        }

        for (int rev : reversed) {
            res += rev + " ";
        }

        return res.trim();

    }
}
