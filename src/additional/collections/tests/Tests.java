package additional.collections.tests;

import additional.collections.dto.Animal;
import additional.collections.dto.Person;
import additional.collections.utils.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.*;


public class Tests {

    @Test
    @DisplayName("Тестируем длину имени")
    public void test1() {

        String res = NameGenerator.randomName(5);
        Assertions.assertEquals(5, res.length());

    }

    @RepeatedTest(20)
    @DisplayName("Тестируем генератор радномного русского бессмысленного имени")
    public void test2() {


        String res = NameGenerator.randomRusName(50);
        for (int i = 0; i < res.length(); i++) {
            char a = res.charAt(i);

            Assertions.assertTrue((a >= '\u0410' && a <= '\u044F') || a == 'ё' || a == 'Ё');
        }


    }

    @RepeatedTest(20)
    @DisplayName("Тестируем генератор радномного английского бессмысленного имени")
    public void test2_1() {


        String res = NameGenerator.randomEngNickName(50);
        for (int i = 0; i < res.length(); i++) {
            char a = res.charAt(i);

            Assertions.assertTrue((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z'));
        }


    }

    @RepeatedTest(10)
    @DisplayName("Тестируем генератор радномного русского реального имени")
    public void test3() {


        String res = NameGenerator.randomRealName();

        String[] realNames = {
                "Алексадр", "Александра", "Алексей", "Владимир", "Виктор", "Виктория", "Евгений", "Илья",
                "Николай", "Даздраперма", "Владлена",
        };

        boolean match = false;

        for (String realName : realNames) {
            if (Objects.equals(res, realName)) {
                match = true;
                break;
            }
        }

        Assertions.assertTrue(match);


    }

    @RepeatedTest(10)
    @DisplayName("Тестируем генератор радномного русского реального имени из файла")
    public void test4() {

        String[] realNames = {
                "Алексадр", "Александра", "Алексей", "Владимир", "Виктор", "Виктория", "Евгений", "Илья",
                "Николай", "Даздраперма", "Владлена",
        };

        String name = NameGenerator.randomRealNameFromFile("src\\additional\\collections\\real_names.txt");


        boolean match = false;

        for (String realName : realNames) {
            if (Objects.equals(name, realName)) {
                match = true;
                break;
            }
        }

        Assertions.assertTrue(match);


    }


    @RepeatedTest(10)
    @DisplayName("Тестируем генератор реальной клички из файла")
    public void test4_1() {

        String[] realNames = {
                "Курама",
                "Итачи",
                "МадараСаске",
                "Урачимару",
                "Сакура",
                "Ли",
                "Джирайа",
        };

        String name = NameGenerator.randomRealPseudoNameFromFile("src\\additional\\collections\\pseudo_names.txt");


        boolean match = false;

        for (String realName : realNames) {
            if (Objects.equals(name, realName)) {
                match = true;
                break;
            }
        }

        Assertions.assertTrue(match);


    }


    @RepeatedTest(10)
    @DisplayName("Тестируем генератор  реального никнейма из файла")
    public void test4_2() {

        String[] realNames = {
                "Johnny",
                "WestDragon",
                "Skinny",
                "m_ustache",
                "!lev!",
                "_usatAya_kok3tk4"
        };

        String name = NameGenerator.randomRealNickNameFromFile("src\\additional\\collections\\nick_names.txt");


        boolean match = false;

        for (String realName : realNames) {
            if (Objects.equals(name, realName)) {
                match = true;
                break;
            }
        }

        Assertions.assertTrue(match);


    }

    @Test
    @DisplayName("Тестируем ошибку в длине пароля1")
    public void test5() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person("dfdf", "", "dfdf"));

    }

    @Test
    @DisplayName("Тестируем ошибку в длине пароля2")
    public void test5_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person("dfdf", "656565656dfdfdfdfdfdfdf", "dfdf"));

    }

    @Test
    @DisplayName("Тестируем отсутствие ошибки в длине пароля")
    public void test5_2() {
        Assertions.assertDoesNotThrow(() -> new Person("dfdf", "656565", "dfdf"));

    }


    @Test
    @DisplayName("Тестируем ошибку в возрасте1")
    public void test6() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Animal("dfdf", 0));

    }

    @Test
    @DisplayName("Тестируем ошибку в возрасте2")
    public void test6_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Animal("dfdf", 16));

    }


    @Test
    @DisplayName("Тестируем отсутствие ошибки в возрасте")
    public void test6_2() {
        Assertions.assertDoesNotThrow(() -> new Animal("dfdf", 15));

    }


    @Test
    @DisplayName("Тестируем компаратор по длине пароля1")
    public void test7_1() {

        Person person1 = new Person("", "55555", "");
        Person person2 = new Person("", "555555", "");

        Comparator<Person> comparator = new PasswordLengthComparator();


        Assertions.assertTrue(comparator.compare(person1, person2)< 0);

    }

    @Test
    @DisplayName("Тестируем компаратор по длине пароля2")
    public void test7_2() {

        Person person1 = new Person("A", "5555555", "");
        Person person2 = new Person("B", "555555", "");

        Comparator<Person> comparator = new PasswordLengthComparator();


        Assertions.assertTrue(comparator.compare(person1, person2) > 0);

    }

    @Test
    @DisplayName("Тестируем компаратор по длине пароля3")
    public void test7_3() {

        Person person1 = new Person("", "5555555", "");
        Person person2 = new Person("", "5555555", "");

        Comparator<Person> comparator = new PasswordLengthComparator();


        Assertions.assertTrue(comparator.compare(person1, person2) == 0);

    }


    @Test
    @DisplayName("Тестируем компаратор по имени при равном пароле1")
    public void test7_4() {

        Person person1 = new Person("Azaza", "5555555", "");
        Person person2 = new Person("Buya",  "5555555", "");

        Comparator<Person> comparator = new PasswordLengthAndNickComparator();


        Assertions.assertTrue(comparator.compare(person1, person2) < 0);

    }


    @Test
    @DisplayName("Тестируем компаратор по имени при равном пароле2")
    public void test7_5() {

        Person person1 = new Person("Azaza", "5555555", "");
        Person person2 = new Person("Abaza",  "5555555", "");

        Comparator<Person> comparator = new PasswordLengthAndNickComparator();


        Assertions.assertTrue(comparator.compare(person1, person2) > 0);

    }

    @Test
    @DisplayName("Тестируем компаратор по имени при равном пароле3")
    public void test7_6() {

        Person person1 = new Person("Azaza", "5555555", "");
        Person person2 = new Person("Azaza",  "5555555", "");

        Comparator<Person> comparator = new PasswordLengthAndNickComparator();


        Assertions.assertTrue(comparator.compare(person1, person2) == 0);

    }

    @Test
    @DisplayName("Тестируем сортировку (пробно) над введнными вручную данными1")
    public void test8_1() {

        Animal animal1 = new Animal("Владислав", 5);
        Animal animal2 = new Animal("Владислава",  5);
        Animal animal3 = new Animal("Виктор",  5);
        Animal animal4 = new Animal("Пример",  6);
        Animal animal5 = new Animal("Фарук",  13);
        Animal animal6 = new Animal("Арик",  15);


        ArrayList<Animal> animalsSorted = new ArrayList<>(List.of(animal3, animal1, animal2, animal4, animal5, animal6));
        ArrayList<Animal> toSort = new ArrayList<>(List.of(animal6, animal4, animal5, animal3, animal1, animal2));


        toSort.sort(new AnimalAgeAndNickNameComparator());

        boolean flag = true;
        for (int i = 0; i < toSort.size(); i++) {
            if (!toSort.get(i).equals(animalsSorted.get(i))) {
                flag = false;
            }
        }

        Assertions.assertTrue(flag);

    }


    @Test
    @DisplayName("Тестируем сортировку (пробно) над введнными вручную данными2")
    public void test8_2() {

        Person person1 = new Person("Владислав", "55555","");
        Person person2 = new Person("Владислава", "666666","" );
        Person person3 = new Person("Виктор",  "666666","" );
        Person person4 = new Person("Пример",  "7777777","" );
        Person person5 = new Person("Фарук",  "55555","" );
        Person person6 = new Person("Арик",  "999999999","" );


        ArrayList<Person> personsSorted = new ArrayList<>(List.of(person1, person5, person3, person2, person4, person6));
        ArrayList<Person> toSort = new ArrayList<>(List.of(person6, person3, person1, person2, person5, person4));


        toSort.sort(new PasswordLengthAndNickComparator());

        boolean flag = true;
        for (int i = 0; i < toSort.size(); i++) {
            if (!toSort.get(i).equals(personsSorted.get(i))) {
                flag = false;
            }
        }

        Assertions.assertTrue(flag);

    }


    @Test
    @DisplayName("Тестируем стандартную сортировку над сгенерированными данными")
    public void test8_3() {

        ArrayList<Person> persons = new ArrayList<>();
        CollectionsUtils.personFiller(persons, 100);

        CollectionsUtils.defaultPersonPasswordAndNameSort(persons);

        boolean flag = true;

        for (int i = 0; i < persons.size()-1; i++) {
            int passLengthOfLower = persons.get(i).getPassword().length();
            int passLengthOfHigher = persons.get(i+1).getPassword().length();
            String nickOfLower = persons.get(i).getNick();
            String nickOfHigher = persons.get(i+1).getNick();

            if (passLengthOfLower==passLengthOfHigher) {
                if (nickOfLower.compareTo(nickOfHigher) > 0) {

                    flag = false;
                }
            } else {
                if (passLengthOfLower > passLengthOfHigher) {
                    flag = false;
                }
            }

        }

        Assertions.assertTrue(flag);



    }


    @Test
    @DisplayName("Тестируем кастомную сортировку над сгенерированными данными")
    public void test8_4() {

        ArrayList<Person> persons = new ArrayList<>();
        CollectionsUtils.personFiller(persons, 100);

        CollectionsUtils.customPersonPasswordSort(persons);

        boolean flag = true;

        for (int i = 0; i < persons.size()-1; i++) {
            int passLengthOfLower = persons.get(i).getPassword().length();
            int passLengthOfHigher = persons.get(i+1).getPassword().length();


                if (passLengthOfLower > passLengthOfHigher) {
                    flag = false;
                }
            }



        Assertions.assertTrue(flag);



    }


    @Test
    @DisplayName("Тестируем кастомную сортировку над сгенерированными данными")
    public void test8_5() {

        ArrayList<Person> persons = new ArrayList<>();
        CollectionsUtils.personFiller(persons, 10);

        CollectionsUtils.customPersonPasswordAndNickSort(persons);

        boolean flag = true;

        for (int i = 0; i < persons.size()-1; i++) {
            int passLengthOfLower = persons.get(i).getPassword().length();
            int passLengthOfHigher = persons.get(i+1).getPassword().length();
            String nickOfLower = persons.get(i).getNick();
            String nickOfHigher = persons.get(i+1).getNick();

            if (passLengthOfLower==passLengthOfHigher) {
                if (nickOfLower.compareTo(nickOfHigher) > 0) {

                    flag = false;
                }
            } else {
                if (passLengthOfLower > passLengthOfHigher) {
                    flag = false;
                }
            }

        }

        Assertions.assertTrue(flag);



    }


    @Test
    @DisplayName("Тестируем удаление данных при помощи итератора1")
    public void test9_1() {

        ArrayList<Person> persons = new ArrayList<>();
        CollectionsUtils.personFiller(persons, 100);

        CollectionsUtils.clearCollectionWithIterator(persons);


        Assertions.assertEquals(0, persons.size());



    }

    @Test
    @DisplayName("Тестируем удаление данных при помощи итератора2")
    public void test9_2() {

        TreeSet<Person> persons = new TreeSet<>();
        CollectionsUtils.personFiller(persons, 100);

        CollectionsUtils.clearCollectionWithIterator(persons);


        Assertions.assertEquals(0, persons.size());



    }

}
