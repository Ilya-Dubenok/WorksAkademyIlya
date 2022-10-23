package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = console.next();
        if (Objects.equals(name,"Вася") || Objects.equals(name,"Анастасия")) {
            if (Objects.equals(name,"Вася")) {
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Я тебя так долго ждал");
            }
        } else {
            System.out.println("Добрый день, а вы кто?");
        }

    }
}
