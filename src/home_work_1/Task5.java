package home_work_1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите true, если сейчас рабочий день и false, если выходной: ");
        boolean isWeekDay = getBoolean(console);
        System.out.println("Введите true, если вы в отпуске, и false, если нет: ");
        boolean isVacation = getBoolean(console);
        if (sleepIn(isWeekDay, isVacation)) {
            System.out.println("Можно спать дальше.");
        } else {
            System.out.println("Пора на работу!");
        }
    }

    /*принимает два boolean параметра weekday и vacation
     возвращает true если weekday==false или vacation==true*/
    public static boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday||vacation;
    }

    /*Принмиает значения сканнер для ввода пользовательских данных
    * допускается только boolean
    * включает проверку на правильность ввода данных*/
    public static boolean getBoolean (Scanner console){
        if (console.hasNextBoolean()) {
            return console.nextBoolean();
        } else {
            System.out.println("Можно вводить только true или false: ");
            console.next();
            return getBoolean(console);
        }
    }
}
