package home_work_1;


import static home_work_2.utils.ArraysUtils.arrayRandom;

public class Task7 {
    public static void main(String[] args) {

        System.out.println(phoneBuilder(arrayRandom(10,10)));
        System.out.println(phoneBuilder2(arrayRandom(10,10))); // более удобный метод

    }
    /*
    */


    /**
     * принимает массив чисел и возвращет их
     * заданном формате (xxx) xxx-xxxx типа String. если размер переданного массива меньше 10, заполняет нулями
     * @param nums
     * @return
     */
    public static String phoneBuilder (int [] nums) {
        int [] curNums = new int [10];
        for (int i = 0; i < nums.length&&i< curNums.length; i++) {
            curNums[i] = nums[i];
        }

        return "("+curNums[0]+""+curNums[1]+""+curNums[2]+") "+curNums[3]+""+curNums[4]+""+curNums[5]+"-"
            +curNums[6]+""+curNums[7]+""+curNums[8]+""+curNums[9];
    }
    /**
     * принимает массив чисел и возвращет их
     * заданном формате (xxx) xxx-xxxx типа String. если размер переданного массива меньше 10, заполняет нулями
     * @param nums
     * @return
     */
    public static String phoneBuilder2 (int [] nums) {

        int [] curNums = new int [10];
        for (int i = 0; i < nums.length&&i< curNums.length; i++) {
            curNums[i] = nums[i];

        }

        return String.format("(%1$s) %2$s-%3$s",
                getNumbers(curNums, 0, 2),
                getNumbers(curNums, 3, 5),
                getNumbers(curNums, 6, 9));
    }

    /**
    *принимает массив чисел и значения начало-конец,
    * возвращает String, содержащий числа из массива
    * в диапазоне начало-конец(вкл.)*/
    public static String getNumbers(int[] nums, int start, int stop) {
        String res = "";
        while (start <= stop&&start< nums.length&&start>=0) {
            res = res.concat(String.valueOf(nums[start]));
            start++;
        }
        return res;
    }



}
