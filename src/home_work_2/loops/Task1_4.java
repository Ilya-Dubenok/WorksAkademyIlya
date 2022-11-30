package home_work_2.loops;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        System.out.println("Значение до переполнения: " + getNumsBeforeAndAfterOverfilling(1, 3)[0]);
        System.out.println("Значение после переполнения: " + getNumsBeforeAndAfterOverfilling(1, 3)[1]);


        System.out.println("Значение до переполнения: " + getNumsBeforeAndAfterOverfilling(1, 188)[0]);
        System.out.println("Значение после переполнения: " + getNumsBeforeAndAfterOverfilling(1, 188)[1]);


        System.out.println("Значение до переполнения: " + getNumsBeforeAndAfterOverfilling(1, -19)[0]);
        System.out.println("Значение после переполнения: " + getNumsBeforeAndAfterOverfilling(1, -19)[1]);


        System.out.println("Введите целое число типа int, не ноль и не (минус) единица");
        int b = getPositiveInt(console);

        System.out.println("Значение до переполнения: " + getNumsBeforeAndAfterOverfilling(1, b)[0]);
        System.out.println("Значение после переполнения: " + getNumsBeforeAndAfterOverfilling(1, b)[1]);
    }


    /**
     * Принимает два base и mult, возвращает массив, где 0 ячейка содержит число base, умноженное на mult
     * до переполнения, а 1 ячейка - после переполнения
     * @param base число, которое будем умножать
     * @param mult число, на которое будем умножать
     * @return
     */
    public static long[] getNumsBeforeAndAfterOverfilling(long base, int mult) {
        long[] res = new long[2];
        if (base == 0 || mult == 0 || Math.abs(mult) == 1) {
            return res;
        }
        while (true) {
            try {
                base = Math.multiplyExact(base, mult);

            } catch (Exception e) {
                break;
            }

        }
        res[0] = base;
        res[1] = base * mult;
        return res;


    }


    /**
     * Проверка на ввод пользователем целого числа типа int, не равного -1 / 0 / +1
     * Запрашивает повторный ввод в случае,если введенное число не соответствует условию
     * @param console
     * @return целое положительное число типа int
     */
    public static int getPositiveInt(Scanner console) {
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (Math.abs(res) <= 1) {
                System.out.println("Число должно быть не равно 0 или (минус) 1");
                return getPositiveInt(console);
            } else {
                return res;
            }
        } else {
            System.out.println("Необходимо ввести целое число: ");
            console.next();
            return getPositiveInt(console);
        }
    }
}
