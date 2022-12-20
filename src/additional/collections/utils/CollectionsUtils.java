package additional.collections.utils;

import additional.collections.dto.Animal;
import additional.collections.dto.Person;

import java.util.*;
import java.util.function.Consumer;

public class CollectionsUtils {

    /**
     * Заполняет коллекцию 100_000 Persons, генерирая случайный псевдоним (англ), пароль (от 5 до 10 англ случайных
     * символов) случайное имя (рандомный набор русских символов)
     * @param collection
     */
    public static void personFiller(Collection<Person> collection) {

        Random rnd = new Random();

        for (int i = 0; i < 100_000; i++) {
            Person person = new Person(NameGenerator.randomEngNickName(1 + rnd.nextInt(15)),
                    NameGenerator.randomNickName(5 + rnd.nextInt(6)),
                    NameGenerator.randomRusName(1 + rnd.nextInt(10)));
            collection.add(person);

        }


    }

    /**
     * Заполняет коллекцию count Persons, генерирая случайный псевдоним (англ), пароль (от 5 до 10 англ случайных
     * символов) случайное имя (рандомный набор русских символов)
     * @param collection
     * @param count
     */
    public static void personFiller(Collection<Person> collection, int count) {

        Random rnd = new Random();

        for (int i = 0; i < count; i++) {
            Person person = new Person(NameGenerator.randomEngNickName(1 + rnd.nextInt(15)),
                    NameGenerator.randomNickName(5 + rnd.nextInt(6)),
                    NameGenerator.randomRusName(1 + rnd.nextInt(10)));
            collection.add(person);

        }


    }

    /**
     * Заполняет коллекцию 100_000 Animals, генерирая рандомную кличку (англ),
     * рандомный возраст (от 1 до 15)
     * @param collection
     */
    public static void animalFiller(Collection<Animal> collection) {

        Random rnd = new Random();

        for (int i = 0; i < 100_000; i++) {
            Animal animal = new Animal(NameGenerator.randomEngNickName(1 + rnd.nextInt(15)),
                    1+rnd.nextInt(15));
            collection.add(animal);

        }


    }


    /**
     * Метод для замера времени выполнения операции и вывода отформатированного результата в формате String
     * @param consumer Операция, которая будет выполняться
     * @param collection коллекция, над которой будет выполняться операция
     * @param message Наменование операции, которая будет выполняться
     * @return
     * @param <C>
     */
    public static <C extends Collection> String testTimeMeasurer(Consumer <C> consumer, C collection, String message){
        long start = System.currentTimeMillis();

        consumer.accept(collection);
        long end = System.currentTimeMillis();

        long time = end-start;

        String res = "Операция: " + message + ". Заняла " + time + " мс";
        return res;
    }


    /**
     * Сортировка стандартным jdk методом sort по длине пароля
     * @param list
     */
    public static void defaultPersonPasswordSort(List<Person> list) {
        list.sort(new PasswordLengthComparator());

    }

    /**
     * Сортировка стандартным jdk методом sort по длине пароля и имени
     * @param list
     */
    public static void defaultPersonPasswordAndNameSort(List<Person> list) {
        list.sort(new PasswordLengthAndNickComparator());

    }

    /**
     * Сортировка стандартным jdk методом sort по возрасту
     * @param list
     */
    public static void defaultAnimalAgeSort(List<Animal> list) {
        list.sort(new AnimalAgeComparator());

    }

    /**
     * Сортировка стандартным jdk методом sort по возрасту и кличке
     * @param list
     */
    public static void defaultAnimalAgeAndNameSort(List<Animal> list) {
        list.sort(new AnimalAgeAndNickNameComparator());

    }

    /**
     * Кастомный метод сортировки по длине пароля
     * @param list
     */
    public static void customPersonPasswordSort(List<Person> list) {

        if (list.size() < 2) {
            return;
        }

        PasswordLengthComparator comparator = new PasswordLengthComparator();

        Person choice = list.get(0);
        ArrayList<Person> equals = new ArrayList<>();

        List<Person> left = new ArrayList<>();
        List<Person> right = new ArrayList<>();

        for (Person person1 : list) {
            if (person1 == choice) {
                continue;
            }
            if (comparator.compare(choice, person1) > 0) {
                left.add(person1);
            } else if (comparator.compare(choice, person1) < 0) {
                right.add(person1);
            } else {
                equals.add(person1);
            }
        }
        equals.add(choice);

        customPersonPasswordSort(left);
        left.addAll(equals);
        customPersonPasswordSort(right);
        left.addAll(right);
        list.clear();
        list.addAll(left);
    }


    /**
     * Кастомный метод сортировки по возрасту
     * @param list
     */
    public static void customAnimalAgeSort(List<Animal> list) {

        if (list.size() < 2) {
            return;
        }

        AnimalAgeComparator comparator = new AnimalAgeComparator();

        Animal choice = list.get(0);
        ArrayList<Animal> equals = new ArrayList<>();

        List<Animal> left = new ArrayList<>();
        List<Animal> right = new ArrayList<>();

        for (Animal animal : list) {
            if (animal == choice) {
                continue;
            }
            if (comparator.compare(choice, animal) > 0) {
                left.add(animal);
            } else if (comparator.compare(choice, animal) < 0) {
                right.add(animal);
            } else {
                equals.add(animal);
            }
        }
        equals.add(choice);

        customAnimalAgeSort(left);
        left.addAll(equals);
        customAnimalAgeSort(right);
        left.addAll(right);
        list.clear();
        list.addAll(left);
    }


    /**
     * Кастомный метод сортировки по возрасту и кличке
     * @param list
     */
    public static void customAnimalAgeAndNickNameSort(List<Animal> list) {

        if (list.size() < 2) {
            return;
        }

        AnimalAgeAndNickNameComparator comparator = new AnimalAgeAndNickNameComparator();

        Animal choice = list.get(0);
        ArrayList<Animal> equals = new ArrayList<>();

        List<Animal> left = new ArrayList<>();
        List<Animal> right = new ArrayList<>();

        for (Animal animal : list) {
            if (animal == choice) {
                continue;
            }
            if (comparator.compare(choice, animal) > 0) {
                left.add(animal);
            } else if (comparator.compare(choice, animal) < 0) {
                right.add(animal);
            } else {
                equals.add(animal);
            }
        }
        equals.add(choice);

        customAnimalAgeAndNickNameSort(left);
        left.addAll(equals);
        customAnimalAgeAndNickNameSort(right);
        left.addAll(right);
        list.clear();
        list.addAll(left);
    }


    /**
     * Кастомный метод сортировки по длине пароля и имени
     * @param list
     */
    public static void customPersonPasswordAndNickSort(List<Person> list) {

        if (list.size() < 2) {
            return;
        }


        PasswordLengthAndNickComparator comparator = new PasswordLengthAndNickComparator();

        Person choice = list.get(0);
        ArrayList<Person> equals = new ArrayList<>();

        List<Person> left = new ArrayList<>();
        List<Person> right = new ArrayList<>();

        for (Person person1 : list) {
            if (person1 == choice) {
                continue;
            }
            if (comparator.compare(choice, person1) > 0) {
                left.add(person1);
            } else if (comparator.compare(choice, person1) < 0) {
                right.add(person1);
            } else {
                equals.add(person1);
            }
        }
        equals.add(choice);

        customPersonPasswordAndNickSort(left);
        left.addAll(equals);
        customPersonPasswordAndNickSort(right);
        left.addAll(right);
        list.clear();
        list.addAll(left);
    }

    /**
     * Метод для итерации над переданной коллекцией при помощи итератора
     * @param collection
     * @param <T>
     */
    public static <T> void iterateWithIterator(Collection<T> collection) {

        Iterator<T> iterator = collection.iterator();
        T item;

        while (iterator.hasNext()) {
             item = iterator.next();
        }


    }


    /**
     * Метод для итерации над переданной коллекцией без итератора
     * @param list
     * @param <T>
     */
    public static <T> void iterateWithoutIterator(List<T> list) {

        int size = list.size();
        T item;
        for (int i = 0; i < size; i++) {
            item = list.get(i);
        }


    }

    /**
     * Метод для очистки коллекции (удаления всех элементов) при помощи итератора
     * @param collection
     * @param <T>
     */
    public static <T> void clearCollectionWithIterator(Collection<T> collection) {

        Iterator<T> iterator = collection.iterator();

        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }


    }






}
