package home_work_2.loops;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, которое будем возводить в степень, можно дробное и отрицательное");
        double base = getDouble(console);
        System.out.println("Введите степень, в котороую будем возводить, только положительное типа int");
        int stage = getPositiveInt(console);
        double result = base;
        if (stage == 0) {
            result = 1;
        } else {
            for (int i = 2; i <= stage; i++) {
                result = result * base;

            }
        }
        System.out.println(base + " ^ " + stage + " = " + result);

    }

    /**
     * Проверка на ввод пользователем целого положительного числа типа int
     * Запрашивает повторный ввод в случае, если введенное значение не соовтетствует
     * условию
     *
     * @param console
     * @return целое положительное число типа int
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

    /**
     * Метод для принятия от сканера дробного числа
     * Заправшивает повторный ввод, если введенное
     * значение не является числом
     *
     * @param console
     * @return double значение из сканера
     */
    public static double getDouble(Scanner console) {
        if (console.hasNextDouble()) {
            return console.nextDouble();
        } else {
            System.out.println("Необходимо ввести число, можно дробное и отрицательное");
            console.next();
            return getDouble(console);
        }
    }

}


