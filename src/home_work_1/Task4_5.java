package home_work_1;

import java.util.Scanner;

public class Task4_5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число от 0 до 127 (включ): ");
        int a = getInt(console);
        char symbol = (char) a;

        System.out.print("Введенный символ: "+symbol+".");

        if (a >= 65 && a <= 122) {
            System.out.println(" Это код английской буквы");
        } else {
            System.out.println(" Это не код английской буквы");
        }

    }

    public static int getInt (Scanner console){
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (res >= 0&&res<=127) {
                return res;
            } else {
                System.out.println("Введено целое число, но вне диапазона." +
                        " Нужно положительное число от 0 до 127 (включ):");
                return getInt(console);
            }
        } else {
            System.out.println("Нужно ввести целое положительное число от 0 до 127 (включ): ");
            console.next();
            return getInt(console);
        }
    }

}
