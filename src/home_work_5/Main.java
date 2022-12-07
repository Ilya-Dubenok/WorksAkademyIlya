package home_work_5;


import home_work_5.containter.DataContainer;
import home_work_5.utils.NumberComparator;
import home_work_5.utils.StringLengthComparator;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


        DataContainer<String> dataContainerString1 =
                new DataContainer<>(new String[]{});

        //Просто проверяю работоспособность такого метода
        String text1 = fillDataContainer(dataContainerString1, "Привет", "Как дела", "Работаю", "Давай потом");
        System.out.println(text1);
        dataContainerString1.delete(dataContainerString1.get(0));
        System.out.println(dataContainerString1.get(0));


        //Образцы контейнеров для демонстрации работы
        DataContainer<Integer> dataContainerIntegerEtalon1 = new DataContainer<>(new Integer[]{9, null, -8, null, null, null});
        DataContainer<Integer> dataContainerIntegerEtalon2 = new DataContainer<>(new Integer[]{1, 2, 3, 6, -8, 16});
        DataContainer<Integer> dataContainerIntegerEtalon3 = new DataContainer<>(new Integer[]{});
        DataContainer<Double> dataContainerDoubleEtalon1 = new DataContainer<>(new Double[]{23.0, -15.12, 88.66, 656.999});
        DataContainer<String> dataContainerStringEtalon1 = new DataContainer<>(new String[]{"i", "hello", "1", "Как домашка", "А это я точно удалю"});
        DataContainer<String> dataContainerStringEtalon2 = new DataContainer<>(new String[]{"one", null, "does not", null, "simply", "walk", null, "into", "Mordor"});

        System.out.println("\nДемонстрация работы метода add()\n-----------------------");

        System.out.println(printOneData(dataContainerIntegerEtalon1) + " Добавили элемент на место: " + dataContainerIntegerEtalon1.add(777) +
                " Результат: " + printOneData(dataContainerIntegerEtalon1));
        System.out.println(printOneData(dataContainerIntegerEtalon2) + " Добавили элемент на место: " + dataContainerIntegerEtalon2.add(777) +
                " Результат: " + printOneData(dataContainerIntegerEtalon2));
        System.out.println(printOneData(dataContainerIntegerEtalon3) + " Добавили элемент на место: " + dataContainerIntegerEtalon3.add(777) +
                " Результат: " + printOneData(dataContainerIntegerEtalon3));
        System.out.println(printOneData(dataContainerIntegerEtalon3) + " Добавили элемент на место: " + dataContainerIntegerEtalon3.add(null) +
                " Результат: " + printOneData(dataContainerIntegerEtalon3));


        System.out.println("\nДемонстрация работы метода get()\n-----------------------");
        System.out.println("Текущий контейнер: " + printOneData(dataContainerStringEtalon1));

        System.out.println(dataContainerStringEtalon1.get(3));
        System.out.println(dataContainerStringEtalon1.get(8));


        System.out.println("\nДемонстрация работы метода delete() по индексу\n-----------------------");
        System.out.println("Текущий контейнер: " + printOneData(dataContainerIntegerEtalon2));
        System.out.println(dataContainerIntegerEtalon2.delete(6));
        System.out.println("Результат: " + printOneData(dataContainerIntegerEtalon2));
        System.out.println(dataContainerIntegerEtalon2.delete(6) + " " + dataContainerIntegerEtalon2.delete(-2));
        System.out.println("Результат: " + printOneData(dataContainerIntegerEtalon2));

        System.out.println("\nДемонстрация работы метода delete() по значению\n-----------------------");
        System.out.println("Текущий контейнер: " + printOneData(dataContainerStringEtalon1));
        System.out.println(dataContainerStringEtalon1.delete("Нету там такого значения"));
        System.out.println(dataContainerStringEtalon1.delete("А это я точно удалю"));
        System.out.println("Итоговый контейнер: " + printOneData(dataContainerStringEtalon1));

        System.out.println("\nДемонстрация работы метода toString()\n-----------------------");
        System.out.println("Текущий контейнер: " + printOneData(dataContainerStringEtalon2));
        System.out.println("Вывод: " + dataContainerStringEtalon2);
        dataContainerIntegerEtalon3 = new DataContainer<>(new Integer[]{});
        System.out.println("Пустой контейнер: " + printOneData(dataContainerIntegerEtalon3));
        System.out.println("Вывод: " + dataContainerIntegerEtalon3);

        System.out.println("\nДемонстрация работы НЕСТАТИЧЕСКОГО метода sort()\n-----------------------");
        System.out.print("Было: " + printOneData(dataContainerIntegerEtalon1) + " -> стало: ");
        dataContainerIntegerEtalon1.sort(new NumberComparator<Number>());

        System.out.println(printOneData(dataContainerIntegerEtalon1));
        System.out.print("Было: " + printOneData(dataContainerIntegerEtalon2) + " -> стало: ");
        dataContainerIntegerEtalon2.sort(new NumberComparator<Number>());
        System.out.println(printOneData(dataContainerIntegerEtalon2));

        System.out.print("Было: " + printOneData(dataContainerStringEtalon1) + " -> стало: ");
        dataContainerStringEtalon1.sort(new StringLengthComparator());
        System.out.println(printOneData(dataContainerStringEtalon1));

        System.out.println("\nДемонстрация работы CТАТИЧЕСКОГО метода sort(DataContainer<.............> container)\n-----------------------");
        System.out.print("Было: " + printOneData(dataContainerDoubleEtalon1) + " -> стало: ");
        DataContainer.sort(dataContainerDoubleEtalon1);
        System.out.println(printOneData(dataContainerDoubleEtalon1));

        System.out.println("\nДемонстрация работы CТАТИЧЕСКОГО метода sort(DataContainer<.............> container, Comparator<.......> comparator)\n-----------------------");
        System.out.print("Было: " + dataContainerStringEtalon2 + " -> стало: ");
        DataContainer.sort(dataContainerStringEtalon2, new StringLengthComparator());
        System.out.println(dataContainerStringEtalon2);


        System.out.println("\nДемонстрация работы итератора1\n-----------------------");

        System.out.println(printOneData(dataContainerDoubleEtalon1));
        System.out.println("Выведем в консоль каждый элемент в T[]data");

        for (Iterator<Double> it = dataContainerDoubleEtalon1.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        System.out.println(dataContainerDoubleEtalon1);


        System.out.println("\nДемонстрация работы итератора2\n-----------------------");
        DataContainer<String> example = new DataContainer<>(new String[]{"Только одно значение"});

        System.out.println("Имеется массив с одним значением: " + printOneData(example));

        for (Iterator<String> it = example.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        System.out.println(example);


        System.out.println("\nДемонстрация работы итератора3\n-----------------------");

        System.out.println("Имеется массив без значений" + printOneData(dataContainerIntegerEtalon3));

        for (Iterator<Integer> it = dataContainerIntegerEtalon3.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
        System.out.println(dataContainerIntegerEtalon3);

    }

    /**
     * Метод для заполнения T[]data в dataContainter и вывода String
     * @param dataContainer
     * @param args
     * @param <T>
     * @return
     */
    public static <T> String fillDataContainer(DataContainer<T> dataContainer, T... args) {
        for (T arg : args) {
            dataContainer.add(arg);
        }
        String res = "";

        for (int i = 0; i < args.length; i++) {
            res += dataContainer.get(i) + "\n";

        }

        return res;

    }


    /**
     * Метод для возврата строки с отображением T[]data методом toStrings
     * @param dataContainer
     * @param <T>
     * @return
     */
    public static <T> String printOneData(DataContainer<T> dataContainer) {
        return "Массив data: " + Arrays.toString(dataContainer.getItems());
    }


}
