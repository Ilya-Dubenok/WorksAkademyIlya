package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class Task2_3 {

    public static void main(String[] args) {
        int[] arr = ArraysUtils.arrayFromConsole();

        IArraysOperation one = new DoWhileOperation();

        one.eachElementToConsole(arr);
        one.everySecondElementToConsole(arr);
        one.reversedOrderToConsole(arr);

        System.out.println("__________________________________________");

        IArraysOperation two = new WhileOperation();

        two.eachElementToConsole(arr);
        two.everySecondElementToConsole(arr);
        two.reversedOrderToConsole(arr);

        System.out.println("__________________________________________");


        IArraysOperation three = new ForOperation();

        three.eachElementToConsole(arr);
        three.everySecondElementToConsole(arr);
        three.reversedOrderToConsole(arr);

        System.out.println("__________________________________________");


        IArraysOperation four = new ForEachOperation();

        four.eachElementToConsole(arr);
        four.everySecondElementToConsole(arr);
        four.reversedOrderToConsole(arr);


    }


}
