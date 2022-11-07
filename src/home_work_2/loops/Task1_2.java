package home_work_2.loops;

import java.util.Scanner;

public class Task1_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число типа long: ");
        String number = getPositiveLong(console);
        long result = 1;
        String msg = "";
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(number.substring(i, i + 1));
            result = result * digit;
            msg = msg + digit + " * ";

        }

    }


    /**
     * Проверка на ввод пользователем целого положительного числа типа лонг
     * принимает также цифры, начинающиеся с нуля (к примеру, можно ввести 056)
     * запрашивает повторный ввод в случае, если введенное значение не соответствует
     * условию (ялвяется дробным, отрицательным, не числом)
     *
     * @param console
     * @return String с целым положительным числом
     */
    public static String getPositiveLong(Scanner console) {

        if (console.hasNextLong()) {
            String res = console.next();
            if (Long.valueOf(res) < 0) {
                System.out.println("Введено отрицательное число: ");
                return getPositiveLong(console);
            } else {
                return res;
            }
        } else if (console.hasNextDouble()) {
            double res = console.nextDouble();
            if (res < 0) {
                System.out.println("Введено не целое отрицательное число: ");
                return getPositiveLong(console);
            } else {
                System.out.println("Введено не целое число: ");
                return getPositiveLong(console);
            }
        } else {
            System.out.println("Введено не число");
            console.next();
            return getPositiveLong(console);
        }
    }


}
