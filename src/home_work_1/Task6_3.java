package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_3 implements ICommunicationPrinter{

    public static void main(String[] args) {



    }


    private Scanner console = new Scanner(System.in);
    private String name;
    private String message;

    /**
     * Конструктор для работы без запроса имени из консоли. Нужен для тестов
     * @param name
     */
    public Task6_3(String name) {
        this.name = name;
        formMessage();
        bringMessageToConsole();

    }

    /**
     * Конструктор для введения имени через консоль. Невозможно работать с консолью в тестах
     */
    public Task6_3() {
        setName();
        formMessage();
        bringMessageToConsole();

    }

    /**
     * Задается имя через консоль
     */
    private void setName() {
        System.out.println("Введите ваше имя");
        this.name = console.next();
    }


    private void bringMessageToConsole() {
        System.out.println(message);
    }

    private void formMessage() {
        this.message = welcom(this.name);
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String welcom(String name) {


        switch (name) {
            case "Вася":
                return "Привет!\nЯ тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }

    }
}
