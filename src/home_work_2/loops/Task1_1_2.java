package home_work_2.loops;

import java.util.Scanner;

public class Task1_1_2 {

    public Scanner console = new Scanner(System.in);

    public int limit;

    public String message = "";

    public int overLoaded = -1;

    public Task1_1_2(int limit) {
        if (limit < 0) {
            message = "Введенное число меньше нуля!";
        } else if (limit < 2) {
            message = limit + " * " + limit + " = " + limit;
        } else {
            this.limit = limit;
            message = recursion("", 1, limit, 1);
            if (overLoaded >= 0) {
                message = "Произошло переполнение, дальнейшие операции не дадут верного результата." +
                        "\nВыводится операция для наибольшего допустимого числа: " + (overLoaded) + "\n" +
                        message;
            }
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
     * Рекурсивный метод перемножения чисел, выводит тип String
     * В случае перегрузки выводит сообщение о перегрузке и возвращает
     * все сообщение о перемножении до последнего числа (включительно),
     * при котором не было перегрузки
     * @param msg    Строка для формирования итогового сообщения
     * @param base   Первое число, c которого начинается умножение, увеличивается на 1 каждый шаг
     * @param limit  Число, до которого нужно перемножать (включительно)
     * @param result Число типа long, конечный результат перемножения
     * @return сообщение типа String, отражающее ход и результат перемножения
     */
    public  String recursion(String msg, int base, int limit, long result) {
        if (limit < 2) {

            return limit + " * " + limit + " = " + limit;

        } else if (base > limit) {

            return msg.substring(0, msg.length() - 2) + "= " + result;

        } else if (base * result < 0) {
            overLoaded = base - 1;
            return msg.substring(0, msg.length() - 2) + " = " + result;
        }

        return recursion(msg + base + " * ", (base + 1), limit, result * base);

    }

    /**
     * Проверка на ввод пользователем целого положительного числа типа int
     * @param console
     * @return целое положительное число типа int, или повторный ввод
     * в случае, если ввод не соответствует условию
     */
    public int getPositiveInt(Scanner console) {
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
