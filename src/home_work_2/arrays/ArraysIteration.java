package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {

    public static void main(String[] args) {

        int[] test = ArraysUtils.arrayFromConsole();
        eachElementToConsole(test);
        everySecondElementToConsole(test);
        reversedOrderToConsole(test);

    }

    /**
     * Выводит в консоль все элементы принятого массива 4 видами циклов
     *
     * @param nums массив значений для вывода
     */
    public static void eachElementToConsole(int[] nums) {

        System.out.println("Вывод всех элементов в консоль при помощи do...while:");

        int a = 0;
        do {
            System.out.print(nums[a] + " ");
            a++;
        } while (a < nums.length);

        a = 0;


        System.out.println("\nВывод всех элементов в консоль при помощи while:");

        while (a < nums.length) {
            System.out.print(nums[a] + " ");
            a++;
        }

        System.out.println("\nВывод всех элементов в консоль при помощи for:");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nВывод всех элементов в консоль при помощи foreach:");

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");

    }

    /**
     * Выводит в консоль каждый второй элемент принятого массива 4 видами циклов
     *
     * @param nums массив значений для вывода
     */
    public static void everySecondElementToConsole(int[] nums) {

        System.out.println("Вывод каждого второго элемента в консоль при помощи do...while:");

        int a = 1;
        do {
            System.out.print(nums[a] + " ");
            a += 2;
        } while (a < nums.length);

        System.out.println("\nВывод каждого второго элемента в консоль при помощи while:");

        a = 1;

        while (a < nums.length) {
            System.out.print(nums[a] + " ");
            a += 2;
        }

        System.out.println("\nВывод каждого второго элемента в консоль при помощи for:");

        for (int i = 1; i < nums.length; i += 2) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nВывод каждого второго элемента в консоль при помощи foreach:");
        a = 0;
        for (int num : nums) {

            if (a % 2 != 0) {
                System.out.print(num + " ");
            }
            a++;

        }
        System.out.println("");

    }

    /**
     * Выводит в консоль элементы принятого массива в обратном порядке 4 видами циклов
     *
     * @param nums массив значений для вывода
     */
    public static void reversedOrderToConsole(int[] nums) {

        System.out.println("Вывод всех элементов в консоль при помощи do...while в обратном порядке:");

        int a = nums.length - 1;
        do {
            System.out.print(nums[a] + " ");
            a--;
        } while (a >= 0);

        a = nums.length - 1;
        System.out.println("\nВывод всех элементов в консоль при помощи while в обратном порядке:");

        while (a >= 0) {
            System.out.print(nums[a] + " ");
            a--;
        }

        System.out.println("\nВывод всех элементов в консоль при помощи for в обратном порядке:");

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nВывод всех элементов в консоль при помощи foreach в обратном порядке:");

        int[] reversed = new int[nums.length];
        a = reversed.length - 1;

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
