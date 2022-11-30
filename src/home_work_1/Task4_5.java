package home_work_1;

import java.util.Scanner;

import static java.lang.Character.MAX_CODE_POINT;
import static java.lang.Character.MIN_CODE_POINT;

public class Task4_5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        System.out.println(getMessage(getInt(console)));

    }

    /**
     * Выводит String с результатом (код английской буквы или нет) в зависимости от введенного числа
     * @param a
     * @return
     */
    public static String getMessage(int a) {
        if (a < MIN_CODE_POINT || a > MAX_CODE_POINT) {
            return "Введенное значение выходит за допустимый диапазон";
        }

        String res = "Введенный символ: "+Character.toString(a);
        if (isEnglishLetter(a)) {
            res += "\nЭто код английской буквы";
        } else {
            res += "\nЭто не код английской буквы";
        }

        return res;
    }

    /**
     * Определяет, является ли введенное число кодом английской буквы по ASCII
     * @param a
     * @return
     */
    public static boolean isEnglishLetter(int a) {
        return a >= 65 && a <= 122;
    }

    /*принмиает сканнер, возвращет введенное пользователем
     число (допускается только целое число)
     типа int, включает проверку на правильность ввода данных
     */
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
            System.out.println("Нужно ввести целое положительное число: ");
            console.next();
            return getInt(console);
        }
    }

}
