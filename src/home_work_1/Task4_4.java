package home_work_1;

import java.util.Scanner;

public class Task4_4 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int a = getInt(console);
        boolean bytesOrKiloBytes = getBytesOrKiloBytes(console);
        System.out.println(getMessage(bytesOrKiloBytes,a));
    }

    /**
     * Возщает приятое значение в байтах (умнож на 1024) если введно inBytes = true,
     * иначе в килобайтах (раздел на 1024)
     * @param inBytes
     * @param number
     * @return
     */
    public static double getNumber(boolean inBytes, int number) {
        if (inBytes) {
            return number * 1024;

        } else {
            return number / 1024.0;
        }
    }

    public static String getMessage(boolean inBytes, int number) {

        double resNum = getNumber(inBytes, number);

        if (inBytes) {
            return String.format(number + " КБ равняется %.0f Б",resNum);
        } else {
            return String.format(number + " Б равняется %.0f КБ", resNum);

        }

    }


    /**
     * Принимает косноль. Возвращает true, если введено через консоль b.
     * @param console
     * @return
     */
    public static boolean getBytesOrKiloBytes(Scanner console) {
        System.out.println("Если хотите перевести в байты, введите b, если в килобайты, введите kb: ");
        String choice = getStringWithCheck(console);
        return choice.equals("b");
    }

    /**
     * Проверка, введено ли в консколь b|kb или другое. Конгда введено b|kb, возвращает введенное
     * значение
     * @param console
     * @return
     */
    public static String getStringWithCheck(Scanner console) {
        String answer = console.next();
        if (!(answer.equals("b") || answer.equals("kb"))) {
            System.out.println("Введены неверные данные. Если хотите перевести в байты, " +
                    "введите b, если в килобайты, введите kb:");
            return getStringWithCheck(console);
        }
        return answer;

    }

    /*принмиает сканнер, возвращет введенное пользователем
     число (допускается только целое положительное число)
     типа int, включает проверку на правильность ввода данных
     */
    public static int getInt(Scanner console) {
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (res >= 0) {
                return res;
            } else {
                System.out.println("Введено целое, но отрицательное число. Нужно положительное");
                return getInt(console);
            }
        } else {
            System.out.println("Нужно ввести целое положительное число: ");
            console.next();
            return getInt(console);
        }
    }

}
