package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class Task2_4 {

    public static void main(String[] args) {

        int[] arr = ArraysUtils.arrayRandom(50, 100);
        int a = sumOfOddPositive(arr);
        System.out.println("Cумма положительных четных чисел: " + a);
        int b = maxFromOdd(arr);
        System.out.println("Максимальное число с четным индексом: " + b);
        int[] c = lowerThanMiddleAriphmetic(arr);
        System.out.println("Элементы массива меньше среднего арифметического: " + Arrays.toString(c));
        int[] d = twoMinimumValues(arr);
        System.out.println("Два наименьших элемента массива: " + Arrays.toString(d));
        squeeze(arr, 15, 35);
        System.out.println("Сжатый массив: " + Arrays.toString(arr));
        int f = sumOfDigits(arr);
        System.out.println("Cумма цифр массива: " + f);
    }

    /**
     * Метод для решения задачи 2.4.1.
     * Вовзращает сумму положительных четных чисел массива
     *
     * @param nums массив значений для поиска
     * @return  сумма положительных четных чисел
     */
    public static int sumOfOddPositive(int[] nums) {
        int res = 0;

        for (int num : nums) {
            if (num >= 0 && num % 2 == 0) {
                res += num;
            }
        }

        return res;

    }

    /**
     * Метод для решения задачи 2.4.2.
     * Возвращает элемент массива с максимальным значением среди элементов
     * с четным индексом
     *
     * @param nums массив значений для поиска
     * @return максимальный элемент среди элементов с четным индексом
     */
    public static int maxFromOdd(int[] nums) {
        int res = nums[0];
        for (int i = 2; i < nums.length; i += 2) {
            if (nums[i] > res) {
                res = nums[i];
            }
        }

        return res;

    }

    /**
     * Метод для решения задачи 2.4.3.
     * Принимает массив, возвращает массив значений меньше среднего арифметического из
     * всех значений принятого массива
     *
     * @param nums массив значений для обработки
     * @return массив значений, которые меньше среднего арифметического всех значений
     * принятого массива
     */
    public static int[] lowerThanMiddleAriphmetic(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double middle = sum * 1.0 / nums.length;

        int[] res = new int[0];

        for (int num : nums) {
            if (num < middle) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = num;
            }
        }

        return res;

    }

    /**
     * Метод для решения задачи 2.4.4.
     * Принимает массив, возвращает массив из двух наименьших
     * значений принятого массива (значения могут быть равны между собой)
     *
     * @param nums массив значений для вывода
     * @return массив из двух наименьших значений принятого массива
     */
    public static int[] twoMinimumValues(int[] nums) {
        int[] res = new int[2];
        res[0] = Integer.MAX_VALUE;
        res[1] = Integer.MAX_VALUE;
        int ind = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < res[0]) {
                res[0] = nums[i];
                ind = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= res[0] && nums[i] <= res[1] && ind != i) {
                res[1] = nums[i];
            }
        }
        return res;
    }

    /**
     * Метод для решения задачи 2.4.5.
     * Принимает массив и диапазон начального и конечного значения
     * Убирает в массиве значения, подпадающие под этот диапазон (сдвиг влево),
     * освободившиеся элементы заполяет нулями
     *
     * @param nums  массив значений для обработки
     * @param begin начало диапазона (включительно)
     * @param end   конец диапазона (включительно)
     */
    public static void squeeze(int[] nums, int begin, int end) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= begin && nums[i] <= end) {
                count++;
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[nums.length - count] = 0;
                i--;

            }

        }

    }

    /**
     * Метод для решения задачи 2.4.6.
     * Принимает массив, возвращает сумму всех цифр всех элементов массива
     *
     * @param nums массив значений для вывода
     * @return сумма всех цифр всех элементов
     */

    public static int sumOfDigits(int[] nums) {

        int res = 0;

        for (int num : nums) {

            String a = String.valueOf(num);

            for (char c : a.toCharArray()) {

                res += Integer.parseInt(c + "");

            }

        }

        return res;

    }

}


