package home_work_2.loops;

import java.util.Scanner;

public class Task1_2 {

    public Scanner console = new Scanner(System.in);

    public String message = "";

    public long result = 1;

    public String number;

    public Task1_2(int number) {
        if (number < 0) {
            message = "Отрицательное число";
        } else {
            this.number = ""+number;
            formMessage();

        }
        displayMessage();

    }

    /**
     * Выводит сообщение в консоль
     */
    private void displayMessage() {
        System.out.println(message);
    }


    /**
     * Формирует сообщение о ходе вычислений
     */
    public void formMessage() {
        boolean flag = false;
        for (int i = 0; i < number.length(); i++){
            int digit = Integer.parseInt(number.charAt(i) + "");
            if (flag) {

                message = message + " * ";

            } else {
                flag = true;
            }

            result = result * digit;
            message = message + digit;
        }
        message = message + " = " + result;
    }

    /**
     * Проверка на ввод пользователем целого положительного числа типа лонг
     * принимает также цифры, начинающиеся с нуля (к примеру, можно ввести 056)
     * запрашивает повторный ввод в случае, если введенное значение не соответствует
     * условию (ялвяется дробным, отрицательным, не числом)
     * @param console
     * @return String с целым положительным числом
     */
    public String getPositiveLong(Scanner console) {

        if (console.hasNextLong()) {
            String res = console.next();
            if (Long.valueOf(res) < 0) {
                System.out.println("Введено отрицательное число: ");
                return getPositiveLong(console);
            } else {
                return res;
            }
        } else if (console.hasNextDouble()) {
            double res = console.nextDouble();
            if (res < 0) {
                System.out.println("Введено не целое отрицательное число: ");
                return getPositiveLong(console);
            } else {
                System.out.println("Введено не целое число: ");
                return getPositiveLong(console);
            }
        } else {
            System.out.println("Введено не число");
            console.next();
            return getPositiveLong(console);
        }
    }


}
