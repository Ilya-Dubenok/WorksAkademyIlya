package additional.collections.run;

import additional.collections.dto.Animal;
import additional.collections.dto.Person;
import additional.collections.utils.CollectionsUtils;


import java.util.*;

import static additional.collections.utils.CollectionsUtils.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Person> linkedListOfPersons = new LinkedList<>();
        ArrayList<Person> arrayListOfPersons = new ArrayList<>();
        HashSet<Person> hashSetOfPersons = new HashSet<>();
        TreeSet<Person> treeSetOfPersons = new TreeSet<>();

        LinkedList<Animal> linkedListOfAnimals = new LinkedList<>();
        ArrayList<Animal> arrayListOfAnimals = new ArrayList<>();
        HashSet<Animal> hashSetOfAnimals = new HashSet<>();
        TreeSet<Animal> treeSetOfAnimals = new TreeSet<>();

        System.out.println("----------------------------\n         ЗАПОЛНЕНИЕ\n----------------------------");

        System.out.println(testTimeMeasurer(CollectionsUtils::personFiller,
                linkedListOfPersons, "заполнение LinkedList 100_000 Persons"));
        System.out.println(testTimeMeasurer(CollectionsUtils::personFiller,
                arrayListOfPersons, "заполнение ArrayList 100_000 Persons"));
        System.out.println(testTimeMeasurer(CollectionsUtils::personFiller,
                hashSetOfPersons, "заполнение HashSet 100_000 Persons"));
        System.out.println(testTimeMeasurer(CollectionsUtils::personFiller,
                treeSetOfPersons, "заполнение TreeSet 100_000 Persons"));

        System.out.println(testTimeMeasurer(CollectionsUtils::animalFiller,
                linkedListOfAnimals, "заполнение LinkedList 100_000 Animals"));
        System.out.println(testTimeMeasurer(CollectionsUtils::animalFiller,
                arrayListOfAnimals, "заполнение ArrayList 100_000 Animals"));
        System.out.println(testTimeMeasurer(CollectionsUtils::animalFiller,
                hashSetOfAnimals, "заполнение HashSet 100_000 Animals"));
        System.out.println(testTimeMeasurer(CollectionsUtils::animalFiller,
                treeSetOfAnimals, "заполнение TreeSet 100_000 Animals"));

        LinkedList<Person> linkedListOfPersons2 = new LinkedList<>(linkedListOfPersons);
        LinkedList<Person> linkedListOfPersons3 = new LinkedList<>(linkedListOfPersons);
        LinkedList<Person> linkedListOfPersons4 = new LinkedList<>(linkedListOfPersons);
        ArrayList<Person> arrayListOfPersons2 = new ArrayList<>(arrayListOfPersons);
        ArrayList<Person> arrayListOfPersons3 = new ArrayList<>(arrayListOfPersons);
        ArrayList<Person> arrayListOfPersons4 = new ArrayList<>(arrayListOfPersons);


        LinkedList<Animal> linkedListOfAnimals2 = new LinkedList<>(linkedListOfAnimals);
        LinkedList<Animal> linkedListOfAnimals3 = new LinkedList<>(linkedListOfAnimals);
        LinkedList<Animal> linkedListOfAnimals4 = new LinkedList<>(linkedListOfAnimals);
        ArrayList<Animal> arrayListOfAnimals2 = new ArrayList<>(arrayListOfAnimals);
        ArrayList<Animal> arrayListOfAnimals3 = new ArrayList<>(arrayListOfAnimals);
        ArrayList<Animal> arrayListOfAnimals4 = new ArrayList<>(arrayListOfAnimals);


        System.out.println("----------------------------\n         СОРТИРОВКА PERSONS\n----------------------------");


        System.out.println(testTimeMeasurer(CollectionsUtils::defaultPersonPasswordSort,
                linkedListOfPersons, "сортировка LinkedList of Persons стандартным методом только по длине пароля"));
        System.out.println(testTimeMeasurer(CollectionsUtils::customPersonPasswordSort,
                linkedListOfPersons2, "сортировка LinkedList of Persons кастомным методом только по длине пароля"));

        System.out.println(testTimeMeasurer(CollectionsUtils::defaultPersonPasswordSort,
                arrayListOfPersons, "сортировка ArrayList of Persons стандартным методом только по длине пароля"));
        System.out.println(testTimeMeasurer(CollectionsUtils::customPersonPasswordSort,
                arrayListOfPersons2, "сортировка ArrayList of Persons кастомным методом только по длине пароля"));

        System.out.println(testTimeMeasurer(CollectionsUtils::defaultPersonPasswordAndNameSort,
                linkedListOfPersons3, "сортировка LinkedList of Persons стандартным методом по длине пароля и псевдониму"));
        System.out.println(testTimeMeasurer(CollectionsUtils::customPersonPasswordAndNickSort,
                linkedListOfPersons4, "сортировка LinkedList of Persons кастомным методом по длине пароля и псевдониму"));

        System.out.println(testTimeMeasurer(CollectionsUtils::defaultPersonPasswordAndNameSort,
                arrayListOfPersons3, "сортировка ArrayList of Persons стандартным методом по длине пароля и псевдониму"));
        System.out.println(testTimeMeasurer(CollectionsUtils::customPersonPasswordAndNickSort,
                arrayListOfPersons4, "сортировка ArrayList of Persons кастомным методом по длине пароля и псевдониму"));

        System.out.println("----------------------------\n         СОРТИРОВКА ANIMALS\n----------------------------");


        System.out.println(testTimeMeasurer(CollectionsUtils::defaultAnimalAgeSort,
                linkedListOfAnimals, "сортировка LinkedList of Animals стандартным методом только по возрасту"));
        System.out.println(testTimeMeasurer(CollectionsUtils::customAnimalAgeSort,
                linkedListOfAnimals2, "сортировка LinkedList of Animals кастомным методом только по возрасту"));

        System.out.println(testTimeMeasurer(CollectionsUtils::defaultAnimalAgeSort,
                arrayListOfAnimals, "сортировка ArrayList of Animals стандартным методом только по возрасту"));
        System.out.println(testTimeMeasurer(CollectionsUtils::customAnimalAgeSort,
                arrayListOfAnimals2, "сортировка ArrayList of Animals кастомным методом только по возрасту"));

        System.out.println(testTimeMeasurer(CollectionsUtils::defaultAnimalAgeAndNameSort,
                linkedListOfAnimals3, "сортировка LinkedList of Animals стандартным методом по возрасту и имени"));
        System.out.println(testTimeMeasurer(CollectionsUtils::customAnimalAgeAndNickNameSort,
                linkedListOfAnimals4, "сортировка LinkedList of Animals кастомным методом по возрасту и имени"));

        System.out.println(testTimeMeasurer(CollectionsUtils::defaultAnimalAgeAndNameSort,
                arrayListOfAnimals3, "сортировка ArrayList of Animals стандартным методом по возрасту и имени"));
        System.out.println(testTimeMeasurer(CollectionsUtils::customAnimalAgeAndNickNameSort,
                arrayListOfAnimals4, "сортировка ArrayList of Animals кастомным методом по возрасту и имени"));

        System.out.println("----------------------------\n         ИТЕРИРОВАНИЕ\n----------------------------");


        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithIterator,
                linkedListOfPersons, "итерирование LinkedList of Persons при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithoutIterator,
                linkedListOfPersons, "итерирование LinkedList of Persons без итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithIterator,
                linkedListOfAnimals, "итерирование LinkedList of Animals при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithoutIterator,
                linkedListOfAnimals, "итерирование LinkedList of Animals без итератора"));

        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithIterator,
                arrayListOfPersons, "итерирование ArrayList of Persons при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithoutIterator,
                arrayListOfPersons, "итерирование ArrayList of Persons без итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithIterator,
                arrayListOfAnimals, "итерирование ArrayList of Animals при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithoutIterator,
                arrayListOfAnimals, "итерирование ArrayList of Animals без итератора"));

        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithIterator,
                hashSetOfPersons, "итерирование HashSet of Persons при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithIterator,
                treeSetOfPersons, "итерирование TreeSet of Persons при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithIterator,
                hashSetOfAnimals, "итерирование HashSet of Animals при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::iterateWithIterator,
                treeSetOfAnimals, "итерирование TreeSet of Animals при помощи итератора"));

        System.out.println("----------------------------\n         ОЧИСТКА\n----------------------------");


        System.out.println(testTimeMeasurer(CollectionsUtils::clearCollectionWithIterator,
                linkedListOfPersons, "очиста LinkedList of Persons при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::clearCollectionWithIterator,
                arrayListOfPersons, "очиста ArrayList of Persons при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::clearCollectionWithIterator,
                hashSetOfPersons, "очиста HashSet of Persons при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::clearCollectionWithIterator,
                treeSetOfPersons, "очиста TreeSet of Persons при помощи итератора"));

        System.out.println(testTimeMeasurer(CollectionsUtils::clearCollectionWithIterator,
                linkedListOfAnimals, "очиста LinkedList of Animals при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::clearCollectionWithIterator,
                arrayListOfAnimals, "очиста ArrayList of Animals при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::clearCollectionWithIterator,
                hashSetOfAnimals, "очиста HashSet of Animals при помощи итератора"));
        System.out.println(testTimeMeasurer(CollectionsUtils::clearCollectionWithIterator,
                treeSetOfAnimals, "очиста TreeSet of Animals при помощи итератора"));

    }


}
