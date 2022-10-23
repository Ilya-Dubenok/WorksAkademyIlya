package home_work_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //не знаю, нужно ли в этом задании делать проверку на ввод данных, сделал на всякий случай
        System.out.println("Введите первое целое число:");
        int a = getInt(console);
        System.out.println("Введите второе целое число:");
        int b = getInt(console);
        //Для демонстрации выбрал числа 335 и -20
        //операция и вывод & (И)
        int result1 = a&b; /* =332

        335 ->0000_0000_0000_0000_0000_0001_0100_1111
        -20 ->1111_1111_1111_1111_1111_1111_1110_1100
        332 ->0000_0000_0000_0000_0000_0001_0100_1100   */

        System.out.println("Результат побитового И: "+result1);
        //операция и вывод | (ИЛИ)

        int result2 = a|b; /*=-17
        335 ->0000_0000_0000_0000_0000_0001_0100_1111
        -20 ->1111_1111_1111_1111_1111_1111_1110_1100
        -17 ->1111_1111_1111_1111_1111_1111_1110_1111   */
        System.out.println("Результат побитового ИЛИ: "+result2);

        //Побитовая операция с floating point number не работает
        //double result3 = 42.5 &10;
        /*если убрать комментарий c операции выше
        то при компиляции выдаст build failed: bad operand types for binary operator '&'*/


    }

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
