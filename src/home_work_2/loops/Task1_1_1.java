package home_work_2.loops;

import java.util.Scanner;

public class Task1_1_1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число типа int: ");
        int limit = getPositiveInt(console);
        String msg = "1 * ";
        long result = 1;

        if (limit < 2) {
            msg = limit + " * " + limit + " = " + limit;
        } else {
            for (int a = 2; a <= limit; a++) {
                if (result * a > 0) {
                    msg = msg + a + " * ";
                    result = result * a;
                } else {
                    System.out.println("Произошло переполнение, дальнейшие операции не дадут верного результата." +
                            "\nВыводится операция для наибольшего допустимого числа: " + (a - 1));
                    break;
                }
            }

            msg = msg.substring(0, msg.length() - 2) + "= " + result;
        }

        System.out.println(msg);

    }

    /**
     * Проверка на ввод пользователем целого положительного числа типа int.
     * Запрашивает повторный ввод в случае, если введенное значение не соответствует условию
     *
     * @param console
     * @return целое положительное число (int)
     */
    public static int getPositiveInt(Scanner console) {
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (res < 0) {
                System.out.println("Необходимо ввести целое положительное число int");
                return getPositiveInt(console);
            } else {
                return res;
            }
        } else {
            System.out.println("Необходимо ввести целое положительное число int");
            console.next();
            return getPositiveInt(console);
        }
    }

}
