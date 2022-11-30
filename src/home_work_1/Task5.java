package home_work_1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println(getMessage(getBooleanWeekday(console), getBooleanVacation(console)));;
    }

    public static String getMessage(boolean weekday, boolean vacation) {
        if (sleepIn(weekday, vacation)) {
            return "Можно спать дальше";
        } else {
            return "Пора на работу!";
        }
    }

    /**
     * Возвращает true, если сейчас не выходной или в отпуске
     * @param weekday
     * @param vacation
     * @return
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday||vacation;
    }

    /**
     * Метод для получения из консоли, является ли сейчас рабочий день
     * @param console
     * @return
     */
    public static boolean getBooleanWeekday (Scanner console){
        System.out.println("Введите true, если сейчас рабочий день и false, если выходной: ");
        if (console.hasNextBoolean()) {
            return console.nextBoolean();
        } else {
            System.out.println("Можно вводить только true или false: ");
            console.next();
            return getBooleanWeekday(console);
        }
    }

    /**
     * Метод для получения из консоли, является ли сейчас отпуск
     * @param console
     * @return
     */
    public static boolean getBooleanVacation (Scanner console){
        System.out.println("Введите true, если вы в отпуске, и false, если нет: ");
        if (console.hasNextBoolean()) {
            return console.nextBoolean();
        } else {
            System.out.println("Можно вводить только true или false: ");
            console.next();
            return getBooleanVacation(console);
        }
    }
}
