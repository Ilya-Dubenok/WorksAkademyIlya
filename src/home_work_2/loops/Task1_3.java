package home_work_2.loops;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task1_3 {

    public double base;
    public int stage;
    public String message = "";
    public double result;


    public Task1_3(String base, String stage) {
        try {
            Double.parseDouble(base);
        } catch (Exception e) {
            message = "Введено не число";
            displayMessage();
            return;

        }
        try {
            Double.parseDouble(stage);
        } catch (Exception e) {
            message = "Введено не число";
            displayMessage();
            return;
        }

        try {
            Integer.parseInt(stage);
        } catch (Exception e) {
            message = "Введено дробное число";
            displayMessage();
            return;

        }


        if (Integer.parseInt(stage) < 0) {
            message = "Введено отрицательное число!";
        } else {
            this.base = Double.parseDouble(base);
            this.stage = Integer.parseInt(stage);
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

        result = base;
        if (stage == 0) {
            result = 1;
        } else {
            for (int i = 2; i <= stage; i++) {
                result = result * base;

            }
        }
        message = base + " ^ " + stage + " = " + result;
    }


    /**
     * Проверка на ввод пользователем целого положительного числа типа int
     * Запрашивает повторный ввод в случае, если введенное значение не соовтетствует
     * условию
     * @param console
     * @return целое положительное число типа int
     */
    public int getPositiveInt(Scanner console) {
        if (console.hasNextInt()) {
            int res = console.nextInt();
            if (res < 0) {
                System.out.println("Необходимо ввести целое положительное число int");
                return getPositiveInt(console);
            } else {
                return res;
            }
        } else {
            System.out.println("Необходимо ввести целое положительное число int");
            console.next();
            return getPositiveInt(console);
        }
    }

    /**
     * Метод для принятия от сканера дробного числа
     * Заправшивает повторный ввод, если введенное
     * значение не является числом
     * @param console
     * @return double значение из сканера
     */
    public double getDouble(Scanner console) {
        if (console.hasNextDouble()) {
            return console.nextDouble();
        } else {
            System.out.println("Необходимо ввести число, можно дробное и отрицательное");
            console.next();
            return getDouble(console);
        }
    }

}


