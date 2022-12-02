package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {

    public static void main(String[] args) {

        System.out.println(bubbleSort(new int[]{1, 2, 3, 4, 5, 6}));


        System.out.println(shakeSort(new int[]{1, 2, 3, 4, 5, 6}));


        System.out.println(bubbleSort(new int[]{1, 1, 1, 1}));

        System.out.println(shakeSort(new int[]{1, 1, 1, 1}));


        System.out.println(bubbleSort(new int[]{9, 1, 5, 99, 9, 9}));

        System.out.println(shakeSort(new int[]{9, 1, 5, 99, 9, 9}));


        System.out.println(bubbleSort(new int[]{}));

        System.out.println(shakeSort(new int[]{}));

        System.out.println(bubbleSort(new int[]{6, 5, 4, 3, 2, 1}));

        System.out.println(shakeSort(new int[]{6, 5, 4, 3, 2, 1}));

        System.out.println(bubbleSort(ArraysUtils.arrayRandom(50, 100)));

        System.out.println(shakeSort(ArraysUtils.arrayRandom(50, 100)));

        System.out.println("Ввод с консоли: ");

        System.out.println(bubbleSort(ArraysUtils.arrayFromConsole()));

        System.out.println(shakeSort(ArraysUtils.arrayFromConsole()));



    }

    public static String bubbleSort(int[] a) {
        String res = "Сортировка пузырьком:\n"+
                Arrays.toString(a);
        SortsUtils.sort(a);
        res +=" -> "+ Arrays.toString(a);
        return res;
    }

    public static String shakeSort(int[] a) {
        String res = "Сортировка пузырьком:\n"+
                Arrays.toString(a);
        SortsUtils.shake(a);
        res +=" -> "+ Arrays.toString(a);
        return res;
    }
}
