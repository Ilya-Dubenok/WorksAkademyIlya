package home_work_1;

import java.util.Scanner;

public class Task4_3 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int a = getInt(console);

        System.out.println("Введите второе целое число, НЕ НОЛЬ:");
        int b = getIntWithZeroCheck(console);
        System.out.print("Смотрим на числа " + a + " и " + b + ". ");
        System.out.println(getMessage(a,b));

    }

    /**
     * Метод для получения строки с результатами деления одного числа на второе (на цело)
     * @param a
     * @param b
     * @return
     */
    public static String getMessage(int a, int b) {
        if (b == 0) {
            return "Второе число 0. Не надо так";
        }
        if (a % b == 0) {
            return "Первое делится на второе без остатка." + " Частное: " + a / b;

        } else {
            return "Первое делится на второе с остатком." + " Частное: " + a / b + " Остаток: "+ getOstatoc(a,b);
        }

    }

    /**
     * Возвращает остаток от деления первого числа на второе.
     * Если второе 0, возвращает 0;
     * @param first
     * @param second
     * @return
     */
    public static int getOstatoc(int first, int second) {
        if (second == 0) {
            return 0;
        }

        return first % second;
    }

    /*принмиает сканнер, возвращет введенное пользователем
     число (допускается только целое число)
     типа int, включает проверку на правильность ввода данных
     */
    public static int getInt(Scanner console) {
        if (console.hasNextInt()) {
            return console.nextInt();
        } else {
            System.out.println("Нужно ввести целое число:");
            console.next();
            return getInt(console);
        }
    }

    /*принмиает сканнер, возвращет введенное пользователем
     число (допускается только целое число и не ноль)
     типа int, включает проверку на правильность ввода данных
     */
    public static int getIntWithZeroCheck(Scanner console) {
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (res != 0) {
                return res;
            } else {
                System.out.println("НЕ НОЛЬ!");
                return getIntWithZeroCheck(console);
            }
        } else {
            System.out.println("Нужно ввести целое число и не ноль:");
            console.next();
            return getIntWithZeroCheck(console);
        }
    }
}
