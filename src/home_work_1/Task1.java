package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int a = getInt(console);
        System.out.println("Введите второе целое число:");
        int b = getInt(console);


        System.out.println(getAndMessage(a,b));

        System.out.println(getOrMessage(a,b));

        //Побитовая операция с floating point number не работает
        //double result3 = 42.5 &10;
        /*если убрать комментарий c операции выше
        то при компиляции выдаст build failed: bad operand types for binary operator '&'*/


    }

    public static String getAndMessage(int a, int b) {
        return "Результат побитового И чисел " + a + " и " + b + ": " + getAnd(a, b);
    }

    public static String getOrMessage(int a, int b) {
        return "Результат побитового ИЛИ чисел " + a + " и " + b + ": " + getOr(a, b);
    }

    /**
     * Возвращает побитовое И двух чисел
     * @param a
     * @param b
     * @return
     */
    public static int getAnd(int a, int b) {
        return a & b;
    }

    /**
     * Возвращает побитовое ИЛИ двух чисел
     * @param a
     * @param b
     * @return
     */
    public static int getOr(int a, int b) {
        return a | b;
    }
    /*принмиает сканнер, возвращет введенное пользователем
     число (допускается только целое число)
     типа int, включает проверку на правильность ввода данных
     */
    public static int getInt (Scanner console){
        if (console.hasNextInt()) {
            return console.nextInt();
        } else {
            System.out.println("Я сказал Введите.Целое.Число:");
            console.next();
            return getInt(console);
        }
    }

}
