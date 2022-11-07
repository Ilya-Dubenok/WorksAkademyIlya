package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Задача 1. Поиск наибольшей цифры. Необходимо ввести натуральное число: ");
        System.out.println("Наибольшая цифра: " + getBiggestDigit(getPositiveInt(console)));

        System.out.println("Задача 2. Вероятность выпадения четных чисел. Необходимо ввести количество операций: ");
        System.out.println("Вероятность выпадения четных чисел: " + getPossibilityOfEvenNums(getPositiveInt(console)));

        System.out.println("Задача 3. Подсчет кол-ва четных и нечетных. Необходимо ввести натуральное число: ");
        System.out.println(getOddAndEvenNumbers(getPositiveInt(console)));

        System.out.println("Задача 4. Числа Фибоначчи. Необходимо ввести натуральное число: ");
        System.out.println("Числа Фибоначчи: " + getFibonacci(getPositiveInt(console), 0, 1, 1));

        System.out.println("Задача 5. Числа в диапазоне. Введите минимум.");
        int min = getPositiveInt(console);
        System.out.println("Введите максимум");
        int max = getPositiveInt(console);
        System.out.println("Введите шаг");
        int step = getPositiveInt(console);
        System.out.println("Числа в заданных параметрах: " + getNumbersInBorders(min, max, step));

        System.out.println("Задача 6. Число наоборот. Необходимо ввести натуральное число: ");
        System.out.println("Число наоборот: " + getReversedNumber(getPositiveInt(console)));


    }

    /**
     * Метод для решения задачи 1.5.1
     * Принимает интовое число, возвращает его наибольшую цифру
     *
     * @param number число, наибольшую цифру в котором ищем
     * @return наибольшую цифру введенного числа
     */
    public static int getBiggestDigit(int number) {
        String num = String.valueOf(number);
        int result = 0;
        for (char i : num.toCharArray()) {
            if (Integer.parseInt(i + "") > result) {
                result = Integer.parseInt(i + "");
            }

        }
        return result;
    }

    /**
     * Метод для решения задачи 1.5.2
     * Принимает интовое число(кол-во операций), возвращает количество выпадения четных чисел, сгенерированных
     * за введенное число операций
     *
     * @param limit число операций
     * @return процент сгенерированных четных чисел по отношению к общему количеству чисел, сгенерированных за введенное число операций
     */
    public static String getPossibilityOfEvenNums(int limit) {
        int possibility = 0;
        Random r = new Random();
        for (int i = 0; i < limit; i++) {
            int num = r.nextInt();
            if (num % 2 == 0) {
                possibility += 1;
            }
        }

        String res = (possibility / (double) limit * 100.0) + "%";

        return res;

    }


    /**
     * Метод для решения задачи 1.5.3
     * Принимает интовое число, выводит String о количестве четных и нечетных цифр в данном числе
     *
     * @param number число для анализа
     * @return строка о количестве четных и нечетных цифр в принятом числе
     */
    public static String getOddAndEvenNumbers(int number) {
        String num = String.valueOf(number);
        int odd = 0;
        int even = 0;
        for (char i : num.toCharArray()) {
            if (Integer.parseInt(i + "") % 2 == 0) {
                odd += 1;
            } else {
                even += 1;
            }

        }
        return "Количество четных цифр: " + odd + ". Количество нечетных цифр: " + even;
    }

    /**
     * Метол для решения задачи 1.5.4.
     * Рекурсивный метод получения чисел Фибоначчи в заданном количестве. Рекурсию тут никто же не запрещал)
     * Возвращает String с заданным количестве числе Фибоначчи, можно также задать диапазон (начало, с которого будем считать)
     *
     * @param limit   Количество чисел Фибоначчи, которые необходимо вывести
     * @param preprev "Предпредыдущее число", должно быть 0, если начинаем с единицы
     * @param prev    "Предыдущее число", должно быть 1, если начинаем с единицы
     * @param cur     текущее число, должно быть 1, если начинаем с единицы
     * @return
     */

    public static String getFibonacci(int limit, int preprev, int prev, int cur) {

        cur = preprev + prev;
        preprev = prev;
        prev = cur;

        if (limit == 1)
            return cur + "";

        return cur + " " + getFibonacci(limit - 1, preprev, prev, cur);
    }


    /**
     * Метод для решения задачи 1.5.5.
     * Выводит числа в заданном мин и макс диапазоне с заданным шагом
     *
     * @param min  минимальное значение диапазона
     * @param max  максимальное значение диапазона
     * @param step шаг
     * @return String со всеми числами в заданных границах
     */
    public static String getNumbersInBorders(int min, int max, int step) {
        if (max < min) {
            return "Введенный максимум больше минимума, в таком диапазоне нет значений";
        }
        String res = "";

        for (; min <= max; min += step) {
            res = res + min + " ";

        }
        return res;
    }

    /**
     * Выводит принимаемое число задом на перед
     *
     * @param number принимаемое число
     * @return String число задом на перед
     */
    public static String getReversedNumber(int number) {
        String res = "";
        String operand = number + "";
        for (int i = operand.length() - 1; i >= 0; i--) {
            res = res + operand.charAt(i);

        }

        return res;


    }

    /**
     * Проверка на ввод пользователем  натурального (положительного) числа типа int
     * Запрашивает повторный ввод в случае, если введенное значение не соответствует условию
     *
     * @param console
     * @return натуральное число
     */
    public static int getPositiveInt(Scanner console) {
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (res <= 0) {
                System.out.println("Необходимо ввести  натуральное число");
                return getPositiveInt(console);
            } else {
                return res;
            }
        } else {
            System.out.println("Необходимо ввести натуральное число");
            console.next();
            return getPositiveInt(console);
        }
    }


}
