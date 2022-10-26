package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int a = getInt(console);
        System.out.println("Введите второе целое число:");
        int b = getInt(console);
        //Для демонстрации выбрал числа 110 и -20
        //операция и вывод & (И)

        int result1 = a&b; /* = 108

        110 ->0110_1110
        -20 ->1110_1100
        108 ->0110_1100   */

        System.out.println("Результат побитового И чисел " + a + " и " + b + ": " + result1);
        //операция и вывод | (ИЛИ)

        int result2 = a|b; /*=-18
        110 ->0110_1110
        -20 ->1110_1100
        -18 ->1110_1110   */
        System.out.println("Результат побитового ИЛИ чисел " + a + " и " + b + ": " + result2);

        //Побитовая операция с floating point number не работает
        //double result3 = 42.5 &10;
        /*если убрать комментарий c операции выше
        то при компиляции выдаст build failed: bad operand types for binary operator '&'*/


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
