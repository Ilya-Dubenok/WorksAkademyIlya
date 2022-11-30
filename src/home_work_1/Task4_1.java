package home_work_1;

import java.util.Random;

public class Task4_1 {

    public static void main(String[] args) {

        System.out.println(getMessage());

    }

    /**
     * Метод для получения четного случайного числа
     * @return
     */
    public static int getEvenRandom() {
        int number = new Random().nextInt();

        if (number % 2 == 0) {
            return number;
        } else {
            return number + 1;
        }

    }


    /**
     * Метод для получения нечетного случайного числа
     * @return
     */
    public static int getOddRandom() {
        int number = new Random().nextInt();

        if (number % 2 == 0) {
            return number + 1;
        } else {
            return number;
        }

    }


    /**
     * Метод для получения строки с сгенерированными числами и выводом нечетного из них
     * @return
     */
    public static String getMessage() {

        int num1 = getEvenRandom();
        int num2 = getOddRandom();
        return "Были сгенерированы числа "+num1+" и "+ num2+ ".\nНечетное из них: " + num2;

    }
}
