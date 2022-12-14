package home_work_2.arrays;

public interface IArraysOperation {

    /**
     * Вывод всех элементов массива в консоль
     *
     * @param nums массив значений для вывода
     */
    String eachElementToConsole(int[] nums);

    /**
     * Вывод каждого второго элемента массива в консоль
     *
     * @param nums массив значений для вывода
     */
    String everySecondElementToConsole(int[] nums);

    /**
     * Вывод всех элементов массива в консоль в обратном порядке
     *
     * @param nums массив значений для вывода
     */
    String reversedOrderToConsole(int[] nums);

}
