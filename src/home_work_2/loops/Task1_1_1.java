package home_work_2.loops;

import java.util.Scanner;

public class Task1_1_1 {

    public String message = "";

    public Scanner console = new Scanner(System.in);

    public long result = 1;

    public int limit;

    public Task1_1_1(int limit) {
        if (limit < 0) {
            message = "Введенное число меньше нуля!";
        } else if (limit <2) {
            message = limit + " * " + limit + " = " + limit;
        } else {
            this.limit = limit;
            formMessage();
        }
        displayMessage();
    }

    /**
     * Выводит сообщение в консоль
     */
    private void displayMessage() {
        System.out.println(message);
    }

    /**
     * Метод формирует сообщение с факториалом, если было переполнение,
     * формирует сообщение с последним верным результатом
     */
    private void formMessage() {
        boolean flag = false;
        for (int i = 1; i <= limit; i++) {
            if (result * i > 0) {
                if (flag) {
                    message = message + " * ";

                } else {
                    flag = true;
                }
                message += i;
                result *= i;

            } else {
                limit = i-1;
                message = "Произошло переполнение, дальнейшие операции не дадут верного результата." +
                        "\nВыводится операция для наибольшего допустимого числа: " + (limit) + "\n" +
                        message + " = " + result;
                return;
            }
        }
        message = message + " = " + result;


    }


    /**
     * Проверка на ввод пользователем целого положительного числа типа int.
     * Запрашивает повторный ввод в случае, если введенное значение не соответствует условию
     * @param
     * @return целое положительное число (int)
     */
    public int getPositiveInt() {
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (res < 0) {
                System.out.println("Необходимо ввести целое положительное число int");
                return getPositiveInt();
            } else {
                return res;
            }
        } else {
            System.out.println("Необходимо ввести целое положительное число int");
            console.next();
            return getPositiveInt();
        }
    }

}
