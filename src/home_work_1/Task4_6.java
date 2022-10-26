package home_work_1;

import java.util.Scanner;

public class Task4_6 {

    // Алгоритм из статьи Григорианского календаря из википедии

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год в виде целого числа: ");
        int a = getInt(console);
        if (a % 400 == 0) {
            System.out.println("Високосный");
        } else if (a % 100 == 0) {
            System.out.println("Невисокосный");
        } else if (a % 4 == 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Невисокосный");
        }

    }
    /*принмиает сканнер, возвращет введенное пользователем
     число (допускается только целое число)
     типа int, включает проверку на правильность ввода данных
     */
    public static int getInt (Scanner console){
        if (console.hasNextInt()) {
            return console.nextInt();
        } else {
            System.out.println("Нужно целое число: ");
            console.next();
            return getInt(console);
        }
    }
}
