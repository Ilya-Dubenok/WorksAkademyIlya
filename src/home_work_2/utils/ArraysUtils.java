package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    /**
     * Принимает от пользователя через консоль размер массива,
     * а затем все его элементы. Для размера принимает только натуральное число,
     * для элементов - числа типа int.
     *
     * @return массив введенного пользователем размера с введенными им значениями
     */

    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива, натуральное число: ");

        while (!console.hasNextInt()) {
            System.out.println("Введено неверное число");
            console.next();
        }

        int size = console.nextInt();
        if (size <= 0) {
            System.out.println("Вы ввели не натуральное число.");
            return arrayFromConsole();
        }
        int[] result = new int[size];

        for (int i = 0; i < result.length; i++) {
            System.out.println("Введите число " + (i + 1) + "-го из " + result.length + " элементов массива. Только целые числа: ");
            while (!console.hasNextInt()) {
                System.out.println("Введено неверное число");
                console.next();
            }
            result[i] = console.nextInt();

        }

        return result;

    }

    /**
     * Возвращает массив заданного размера, заполненный рандомными значениями
     * от 0 до заданного диапазона (не включительно)
     *
     * @param size              размер массива
     * @param maxValueExclusion диапазон, до которого будут генерироваться значения
     * @return массив заданного размера со сгенерированными значениями
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {

        int[] result = new int[size];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {

            result[i] = random.nextInt(maxValueExclusion);
        }

        return result;
    }
}
