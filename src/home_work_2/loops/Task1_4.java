package home_work_2.loops;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long a = 1;

        int b = 3;

        while (Math.abs(a) * Math.abs(b) > 0) {
            a = a * b;
        }

        System.out.println("Значение до переполнения: " + a);
        System.out.println("Значение после переполнения: " + a * b);

        a = 1;
        b = 188;

        while (Math.abs(a) * Math.abs(b) > 0) {
            a = a * b;
        }

        System.out.println("Значение до переполнения: " + a);
        System.out.println("Значение после переполнения: " + a * b);

        a = 1;
        b = -19;

        while (Math.abs(a) * Math.abs(b) > 0) {
            a = a * b;
        }

        System.out.println("Значение до переполнения: " + a);
        System.out.println("Значение после переполнения: " + a * b);

        a = 1;
        System.out.println("Введите целое число типа int, не ноль и не (минус) единица");
        b = getPositiveInt(console);


        while (Math.abs(a) * Math.abs(b) > 0) {
            a = a * b;
        }

        System.out.println("Значение до переполнения: " + a);
        System.out.println("Значение после переполнения: " + a * b);
    }


    /**
     * Проверка на ввод пользователем целого числа типа int, не равного -1 / 0 / +1
     * Запрашивает повторный ввод в случае,если введенное число не соответствует условию
     *
     * @param console
     * @return целое положительное число типа int
     */
    public static int getPositiveInt(Scanner console) {
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (Math.abs(res) <= 1) {
                System.out.println("Число должно быть не равно 0 или (минус) 1");
                return getPositiveInt(console);
            } else {
                return res;
            }
        } else {
            System.out.println("Необходимо ввести целое число: ");
            console.next();
            return getPositiveInt(console);
        }
    }
}
