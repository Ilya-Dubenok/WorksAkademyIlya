package home_work_1;

import java.util.Scanner;

public class Task4_2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double first = getDouble(console);
        System.out.println("Введите второе число:");
        double second = getDouble(console);
        System.out.println("Введите третье число:");
        double third = getDouble(console);

        System.out.println("Вы ввели числа: " + first + " " + second + " " + third);
        System.out.println("Среднее из них: " + getMedium(first,second,third));

    }

    /**
     * принмиает сканнер, возвращет введенное пользователем типа double
     * @param console
     * @return
     */
    public static double getDouble(Scanner console) {
        if (console.hasNextDouble()) {
            return console.nextDouble();
        } else {
            System.out.println("Я сказал Введите.Число:");
            console.next();
            return getDouble(console);
        }
    }

    /**
     * Метод для вывода среднего числа из трех заданных
     * @param first
     * @param second
     * @param third
     * @return
     */
    public static double getMedium(double first, double second, double third) {
        if ((first >= second && second >= third) || (third >= second && second >= first)) {
            return second;
        } else if ((second >= third && third >= first) || (first >= third && third >= second)) {
            return third;
        } else{ return first;}

    }

}
