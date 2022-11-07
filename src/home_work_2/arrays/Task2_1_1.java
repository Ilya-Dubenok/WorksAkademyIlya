package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class Task2_1_1 {

    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayFromConsole();
        System.out.println("Создан массив размером: " + container.length + " и элементами: " + Arrays.toString(container));


    }
}
