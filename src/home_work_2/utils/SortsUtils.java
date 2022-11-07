package home_work_2.utils;

public class SortsUtils {


    /**
     * Сортировка пузырьком. Сортирует значения принятого массива по возрастанию
     * (меньшие значения в начале массива, большие в конце)
     *
     * @param arr массив, который будет отсортирован
     *
     */
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }

            }

        }

    }

    /**
     * Шейкерная сортировка. Сортирует значения принятого массива по возрастанию
     * (меньшие значения в начале массива, большие в конце)
     *
     * @param arr массив, который будет отсортирован
     */
    public static void shake(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        boolean flag = true;

        while (start < end && flag) {
            flag = false;

            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    flag = true;
                }

            }
            end--;
            for (int i = end; i > start; i--) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    flag = true;
                }

            }
            start++;


        }


    }

}
