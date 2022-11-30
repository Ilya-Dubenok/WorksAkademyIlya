package home_work_1;

import java.util.Scanner;

public class Task4_6 {

    // Алгоритм из статьи Григорианского календаря из википедии

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год в виде целого числа: ");
        System.out.println(getMessage(getInt(console)));

    }

    /**
     * Возвращает сообщение, является ли введенный год високосным
     * @param a
     * @return
     */
    public static String getMessage(int a) {
        if (a % 400 == 0) {
            return "Високосный";
        } else if (a % 100 == 0) {
            return "Невисокосный";
        } else if (a % 4 == 0) {
            return "Високосный";
        } else {
            return "Невисокосный";
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
