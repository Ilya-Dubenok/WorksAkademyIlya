package home_work_1;

import java.util.Scanner;

public class Task4_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //не знаю, нужно ли в этом задании делать проверку на ввод данных, сделал на всякий случай
        //пока просто привел к double
        System.out.println("Введите первое число:");
        double first = getDouble(console);
        System.out.println("Введите второе число:");
        double second = getDouble(console);
        System.out.println("Введите третье число:");
        double third = getDouble(console);
        System.out.println("Вы ввели числа: "+first+",f "+second+" "+third);
        double result = 0;
        if ((first >= second && second >= third) || (third >= second && second >= first)) {
            result = second;
        } else if ((second >= third && third >= first) || (first >= third && third >= second)) {
            result = third;
        } else result = first;

        System.out.println("Среднее из них: "+result);

    }

    public static double getDouble (Scanner console){
        if (console.hasNextDouble()) {
            return console.nextDouble();
        } else {
            System.out.println("Я сказал Введите.Число:");
            console.next();
            return getDouble(console);
        }
    }

}
