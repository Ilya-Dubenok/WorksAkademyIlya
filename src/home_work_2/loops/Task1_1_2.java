package home_work_2.loops;

import java.util.Scanner;

public class Task1_1_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число типа int: ");
        int limit = getPositiveInt(console);
        System.out.println(recursion("", 1, limit, 1));


    }

    /**
     * Рекурсивный метод перемножения чисел, выводит тип String
     * В случае перегрузки выводит сообщение о перегрузке и возвращает
     * все сообщение о перемножении до последнего числа (включительно),
     * при котором не было перегрузки
     *
     * @param msg    Строка для формирования итогового сообщения
     * @param base   Первое число, c которого начинается умножение, увеличивается на 1 каждый шаг
     * @param limit  Число, до которого нужно перемножать (включительно)
     * @param result Число типа long, конечный результат перемножения
     * @return сообщение типа String, отражающее ход и результат перемножения
     */
    public static String recursion(String msg, int base, int limit, long result) {
        if (limit < 2) {

            return limit + " * " + limit + " = " + limit;

        } else if (base > limit) {

            return msg.substring(0, msg.length() - 2) + "= " + result;

        } else if (base * result < 0) {
            System.out.println("Произошло переполнение, дальнейшие операции не дадут верного результата." +
                    "\nВыводится операция для наибольшего допустимого числа: " + (base - 1));
            return msg.substring(0, msg.length() - 2) + " = " + result;
        }

        return recursion(msg + base + " * ", (base + 1), limit, result * base);

    }

    /**
     * Проверка на ввод пользователем целого положительного числа типа int
     *
     * @param console
     * @return целое положительное число типа int, или повторный ввод
     * в случае, если ввод не соответствует условию
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
