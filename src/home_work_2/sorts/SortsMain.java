package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {

    public static void main(String[] args) {


        int[] first = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Cортировка пузырьком:");
        System.out.print(Arrays.toString(first) + " -> ");
        SortsUtils.sort(first);
        System.out.println(Arrays.toString(first));

        first = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("Шейкерная сортировка: ");
        System.out.print(Arrays.toString(first) + " -> ");
        SortsUtils.shake(first);
        System.out.println(Arrays.toString(first));


        int[] second = new int[]{1, 1, 1, 1};
        System.out.println("Cортировка пузырьком:");
        System.out.print(Arrays.toString(second) + " -> ");
        SortsUtils.sort(second);
        System.out.println(Arrays.toString(second));

        second = new int[]{1, 1, 1, 1};
        System.out.println("Шейкерная сортировка: ");
        System.out.print(Arrays.toString(second) + " -> ");
        SortsUtils.shake(second);
        System.out.println(Arrays.toString(second));


        int[] third = new int[]{9, 1, 5, 99, 9, 9};
        System.out.println("Cортировка пузырьком:");
        System.out.print(Arrays.toString(third) + " -> ");
        SortsUtils.sort(third);
        System.out.println(Arrays.toString(third));

        third = new int[]{9, 1, 5, 99, 9, 9};
        System.out.println("Шейкерная сортировка: ");
        System.out.print(Arrays.toString(third) + " -> ");
        SortsUtils.shake(third);
        System.out.println(Arrays.toString(third));


        int[] fourth = new int[]{};
        System.out.println("Cортировка пузырьком:");
        System.out.print(Arrays.toString(fourth) + " -> ");
        SortsUtils.sort(fourth);
        System.out.println(Arrays.toString(fourth));

        fourth = new int[]{};
        System.out.println("Шейкерная сортировка: ");
        System.out.print(Arrays.toString(fourth) + " -> ");
        SortsUtils.shake(fourth);
        System.out.println(Arrays.toString(fourth));


        int[] fifth = new int[]{6, 5, 4, 3, 2, 1};
        System.out.println("Cортировка пузырьком:");
        System.out.print(Arrays.toString(fifth) + " -> ");
        SortsUtils.sort(fifth);
        System.out.println(Arrays.toString(fifth));

        fifth = new int[]{6, 5, 4, 3, 2, 1};
        System.out.println("Шейкерная сортировка: ");
        System.out.print(Arrays.toString(fifth) + " -> ");
        SortsUtils.shake(fifth);
        System.out.println(Arrays.toString(fifth));


        int[] random = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Cортировка пузырьком:");
        System.out.print(Arrays.toString(random) + " -> ");
        SortsUtils.sort(random);
        System.out.println(Arrays.toString(random));

        random = ArraysUtils.arrayRandom(50, 100);
        System.out.println("Шейкерная сортировка: ");
        System.out.print(Arrays.toString(random) + " -> ");
        SortsUtils.shake(random);
        System.out.println(Arrays.toString(random));


        int[] custom = ArraysUtils.arrayFromConsole();
        System.out.println("Cортировка пузырьком:");
        System.out.print(Arrays.toString(custom) + " -> ");
        SortsUtils.sort(custom);
        System.out.println(Arrays.toString(custom));

        custom = ArraysUtils.arrayFromConsole();
        System.out.println("Шейкерная сортировка: ");
        System.out.print(Arrays.toString(custom) + " -> ");
        SortsUtils.shake(custom);
        System.out.println(Arrays.toString(custom));

    }
}
