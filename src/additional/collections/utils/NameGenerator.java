package additional.collections.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Random;

public class NameGenerator {

    /**
     * Массив чаров русского алфавита
     */
    private static char[] rusChars = new char[(int) ('\u044F' + 3 - '\u0410')];
    private static char[] engChars = new char[(int) ('Z'-'A'+'z'-'a'+2)];
    private static String[] realNames = {
            "Алексадр", "Александра", "Алексей", "Владимир", "Виктор", "Виктория", "Евгений", "Илья",
            "Николай", "Даздраперма", "Владлена"};
    private static String[] realPseudoNames = {
            "Курама", "Итачи", "Мадара", "Саске", "Урачимару", "Сакура", "Ли", "Джирайа"
    };

    /**
     * Заполняет массив русскими буквами, включая ё и Ё (они вне скоупа '\u044F' -'\u0410')
     * P.S. Я же обещал, что ты это увидишь)
     */
    static {

        int start = '\u0410';
        for (int i = 0; i < rusChars.length - 2; i++) {
            rusChars[i] = (char) start;
            start++;
        }


        rusChars[rusChars.length - 2] = 'ё';
        rusChars[rusChars.length - 1] = 'Ё';



        for (int i = 0, begin = 'a', end ='z'; begin <= end; i++,begin++) {

            engChars[i] = (char) begin;

            start = i;
        }

        for (int i = start+1, begin = 'A', end ='Z'; begin <= end; i++,begin++) {

            engChars[i] = (char) begin;


        }


    }

    /**
     * Генерырует имя с рандомными символами
     * @param length
     * @return строка с радномными символами
     */
    public static String randomName(int length) {

        Random rnd = new Random();


        StringBuilder sb = new StringBuilder();

        while (sb.length() < length) {
            sb.append((char) rnd.nextInt());
        }

        return sb.toString();

    }

    /**
     * Генерирует  кличку с рандомными символами
     * @param length
     * @return
     */
    public static String randomPseudoName(int length) {
        return randomName(length);
    }

    /**
     * Генерирует  никнейм с рандомными символами
     * @param length
     * @return
     */
    public static String randomNickName(int length) {
        return randomName(length);
    }


    /**
     * Генерирует строку с рандомными символами из русского алфавита
     * @param length
     * @return строка с радномными символами из русского алфавита
     */
    public static String randomRusName(int length) {

        Random rnd = new Random();

        StringBuilder sb = new StringBuilder();

        while (sb.length() < length) {
            sb.append(rusChars[rnd.nextInt(rusChars.length)]);

        }

        return sb.toString();

    }



    /**
     * Генерирует случайную кличку с рандомными символами из русского алфавита
     * @param length
     * @return
     */
    public static String randomRusPseudoName(int length) {
        return randomRusName(length);
    }


    /**
     * Генерирует строку с рандомными символами из английского алфавита
     * @param length
     * @return строка с радномными символами из английского алфавита
     */
    public static String randomEngNickName(int length) {

        Random rnd = new Random();

        StringBuilder sb = new StringBuilder();

        while (sb.length() < length) {
            sb.append(engChars[rnd.nextInt(engChars.length)]);

        }

        return sb.toString();

    }

    /**
     * Генерирует рандомное настоящее имя из массива realNames класса
     * @return
     */
    public static String randomRealName() {

        Random rnd = new Random();

        return realNames[rnd.nextInt(realNames.length)];


    }

    /**
     * Генерирует рандомную настоящуу кличку из массива realPseudoNames класса
     * @return
     */
    public static String randomRealPseudoName() {

        Random rnd = new Random();

        return realPseudoNames[rnd.nextInt(realPseudoNames.length)];


    }

    /**
     * Генерирует рандомное настоящее имя из файла
     * @return
     */
    public static String randomRealNameFromFile(String filePath) {

        Random rnd = new Random();

        ArrayList<String> names = new ArrayList<>();
        StringBuilder allChars = new StringBuilder();


        try {

            Reader reader = new FileReader(filePath);
            int a;
            do {
                a = reader.read();
                if (a != -1) {
                    if (a == '\r') {
                        names.add(allChars.toString());
                        allChars = new StringBuilder();
                    } else if (a != '\n') {
                        allChars.append((char) a);
                    }
                }
                if (a == -1 && allChars.length() > 0) {
                    names.add(allChars.toString());
                }

            } while (a != -1);
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return names.get(rnd.nextInt(names.size()));


    }

    /**
     * Генерирует рандомную кличку из файла
     * @return
     */
    public static String randomRealPseudoNameFromFile(String filePath) {

        return randomRealNameFromFile(filePath);


    }


    public static String randomRealNickNameFromFile(String filePath) {

        return randomRealNameFromFile(filePath);


    }




}
