package home_work_1;

import java.util.Scanner;

public class Task4_4 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int a = getInt(console);
        double res;
        if (getBytesOrKiloBytes(console)) {
            res = a * 1024;
            System.out.printf(a + " КБ равняется %.0f Б\n", res);
        } else {
            res = a / 1024.0;
            System.out.println(a + " Б равняется " + res + " КБ");
        }
    }

    //true if bytes, false if kilobytes
    public static boolean getBytesOrKiloBytes (Scanner console){
        System.out.println("Если хотите перевести в байты, введите b, если в килобайты, введите kb: ");
        String choice = getStringWithCheck(console);
        return choice.equals("b");
    }

    public static String getStringWithCheck(Scanner console){
        String answer = console.next();
        if (!(answer.equals("b") || answer.equals("kb"))) {
            System.out.println("Введены неверные данные. Если хотите перевести в байты, " +
                    "введите b, если в килобайты, введите kb:");
            return getStringWithCheck(console);
        }
        return answer;

    }

    public static int getInt (Scanner console){
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (res >= 0) {
                return res;
            } else {
                System.out.println("Введено целое, но отрицательное число. Нужно положительное");
                return getInt(console);
            }
        } else {
            System.out.println("Нужно ввести целое положительное число: ");
            console.next();
            return getInt(console);
        }
    }

}
