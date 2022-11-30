package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class Task2_3 {

    public static void main(String[] args) {
        int[] arr = ArraysUtils.arrayFromConsole();

        IArraysOperation one = new DoWhileOperation();

        System.out.println(one.eachElementToConsole(arr));
        System.out.println(one.everySecondElementToConsole(arr));
        System.out.println(one.reversedOrderToConsole(arr));

        System.out.println("__________________________________________");

        IArraysOperation two = new WhileOperation();

        System.out.println(two.eachElementToConsole(arr));
        System.out.println(two.everySecondElementToConsole(arr));
        System.out.println(two.reversedOrderToConsole(arr));

        System.out.println("__________________________________________");


        IArraysOperation three = new ForOperation();

        System.out.println(three.eachElementToConsole(arr));
        System.out.println(three.everySecondElementToConsole(arr));
        System.out.println(three.reversedOrderToConsole(arr));

        System.out.println("__________________________________________");


        IArraysOperation four = new ForEachOperation();

        System.out.println(four.eachElementToConsole(arr));
        System.out.println(four.everySecondElementToConsole(arr));
        System.out.println(four.reversedOrderToConsole(arr));


    }


}
