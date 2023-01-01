package home_work_6.test;

import home_work_6.utils.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tests {

    EasySearch easySearch = new EasySearch();
    RegExSearch regExSearch = new RegExSearch();
    SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(easySearch);
    SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizer2 = new SearchEnginePunctuationNormalizer(regExSearch);
    SearchEngineToLowerCaseNormalizer searchEngineToLowerCaseNormalizer = new SearchEngineToLowerCaseNormalizer(easySearch);
    SearchEngineToLowerCaseNormalizer searchEngineToLowerCaseNormalizer2 = new SearchEngineToLowerCaseNormalizer(regExSearch);

    @Test
    @DisplayName("Тестируем существование файла")
    public void test1() {
        File file = new File("src/home_work_6/Война и мир_книга.txt");
        Assertions.assertTrue(file.exists());

    }

    @Test
    @DisplayName("Тестируем ошибку при вводе файла")
    public void test2() {
        File file = new File("src/home_work_6/Вой.txt");
        Assertions.assertThrows(FileNotFoundException.class, () -> WordsCollector.getStringOfWorldsFromFile(file));

    }

    @Test
    @DisplayName("Тестируем, что файл что-то читает")
    public void test3() {
        File file = new File("src/home_work_6/Война и мир_книга.txt");

        try {

            String s = WordsCollector.getStringOfWorldsFromFile(file);
            Assertions.assertTrue(s.length() > 0);
        } catch (IOException e) {
            throw new RuntimeException();

        }

    }


    @Test
    @DisplayName("Тестируем разбивание на строки на 1 слово со знаком препинания")
    public void test4() {
        String s = "Привет.";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        HashSet<String> result = new HashSet<>(List.of("Привет"));
        Assertions.assertEquals(allWords, result);

    }

    @Test
    @DisplayName("Тестируем разбивание на строки на 2 слова с пробелом")
    public void test5() {
        String s = "Привет привет";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        HashSet<String> result = new HashSet<>(List.of("Привет", "привет"));
        Assertions.assertEquals(allWords, result);

    }

    @Test
    @DisplayName("Тестируем разбивание на строки на 2 слова с пробелом и знаком препинания")
    public void test6() {
        String s = "Привет привет?";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        HashSet<String> result = new HashSet<>(List.of("Привет", "привет"));
        Assertions.assertEquals(allWords, result);

    }


    @Test
    @DisplayName("Тестируем разбивание на 3 слова")
    public void test7() {
        String s = "Привет, как дела!";
        Set<String> allWords = WordsCollector.getUniqueWords(s);

        HashSet<String> result = new HashSet<>(List.of("Привет", "как", "дела"));
        Assertions.assertEquals(allWords, result);

    }


    @Test
    @DisplayName("Тестируем разбивание на 2 слова слитно")
    public void test8() {
        String s = "Привет,какдела!";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        HashSet<String> result = new HashSet<>(List.of("Привет", "какдела"));
        Assertions.assertEquals(allWords, result);

    }


    @Test
    @DisplayName("Тестируем разбивание на 2 слова слитно2")
    public void test9() {
        String s = "Привет;какдела!";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        Assertions.assertEquals(2, allWords.size());
        HashSet<String> result = new HashSet<>(List.of("Привет", "какдела"));
        Assertions.assertEquals(allWords, result);

    }

    @Test
    @DisplayName("Тестируем разбивание на 4 слова слитно")
    public void test10() {
        String s = "как дела!.Что делаешь?";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        HashSet<String> result = new HashSet<>(List.of("как", "дела", "Что", "делаешь"));
        Assertions.assertEquals(allWords, result);

    }


    @Test
    @DisplayName("Тестируем разбивание на 1 слово с дефисом")
    public void test11() {
        String s = "Привет-привет";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        HashSet<String> result = new HashSet<>(List.of("Привет-привет"));
        Assertions.assertEquals(allWords, result);

    }

    @Test
    @DisplayName("Тестируем разбивание на 2 слова c дефисом")
    public void test12() {
        String s = "Привет -привет";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        HashSet<String> result = new HashSet<>(List.of("Привет", "привет"));
        Assertions.assertEquals(allWords, result);

    }


    @Test
    @DisplayName("Тестируем разбивание на 1 слово c дефисом")
    public void test13() {
        String s = "4-х";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        HashSet<String> result = new HashSet<>(List.of("4-х"));
        Assertions.assertEquals(allWords, result);

    }

    @Test
    @DisplayName("Тестируем разбивание на 3 слова ")
    public void test15() {
        String s = "один и 1";
        Set<String> allWords = WordsCollector.getUniqueWords(s);
        HashSet<String> result = new HashSet<>(List.of("один", "и", "1"));
        Assertions.assertEquals(allWords, result);

    }


    @Test
    @DisplayName("Тестируем на работе с война и мир ")
    public void test16() {
        File file = new File("src/home_work_6/Война и мир_книга.txt");
        try {
            String s = WordsCollector.getStringOfWorldsFromFile(file);
            Map<String, Integer> map = WordsCollector.getMapWithCountOfAllWords(s);

            int i = WordsCollector.getCountOfAllUniqueWords(file);

            Assertions.assertEquals(i, map.size());


        } catch (IOException e) {
            throw new RuntimeException();

        }
    }

    @Test
    @DisplayName("Тестируем все на заданном примере")
    public void test_all_1() {
        String text = "привет, как дела!";
        long res1 = easySearch.search(text,"привет")+easySearch.search(text,"как")+ easySearch.search(text,"дела");
        long res2 = regExSearch.search(text,"привет")+regExSearch.search(text,"как")+ regExSearch.search(text,"дела");
        long res3 = searchEnginePunctuationNormalizer.search(text,"привет")+searchEnginePunctuationNormalizer.search(text,"как")+ searchEnginePunctuationNormalizer.search(text,"дела");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"привет")+searchEnginePunctuationNormalizer2.search(text,"как")+ searchEnginePunctuationNormalizer2.search(text,"дела");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"привет")+ searchEngineToLowerCaseNormalizer.search(text,"как")+ searchEngineToLowerCaseNormalizer.search(text,"дела");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"привет")+ searchEngineToLowerCaseNormalizer2.search(text,"как")+ searchEngineToLowerCaseNormalizer2.search(text,"дела");
        Assertions.assertEquals(3,res1);
        Assertions.assertEquals(3,res2);
        Assertions.assertEquals(3,res3);
        Assertions.assertEquals(3,res4);
        Assertions.assertEquals(3,res5);
        Assertions.assertEquals(3,res6);

    }


    @Test
    @DisplayName("Тестируем все на заданном примере2")
    public void test_all_2() {
        String text = "привет,какдела!";
        long res1 = easySearch.search(text,"привет")+easySearch.search(text,"какдела");
        long res2 = regExSearch.search(text,"привет")+regExSearch.search(text,"какдела");
        long res3 = searchEnginePunctuationNormalizer.search(text,"привет")+searchEnginePunctuationNormalizer.search(text,"какдела");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"привет")+searchEnginePunctuationNormalizer2.search(text,"какдела");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"привет")+ searchEngineToLowerCaseNormalizer.search(text,"какдела");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"привет")+ searchEngineToLowerCaseNormalizer2.search(text,"какдела");
        Assertions.assertEquals(2,res1);
        Assertions.assertEquals(2,res2);
        Assertions.assertEquals(2,res3);
        Assertions.assertEquals(2,res4);
        Assertions.assertEquals(2,res5);
        Assertions.assertEquals(2,res6);

    }

    @Test
    @DisplayName("Тестируем все на заданном примере3")
    public void test_all_3() {
        String text = "привет;какдела!";
        long res1 = easySearch.search(text,"привет")+easySearch.search(text,"какдела");
        long res2 = regExSearch.search(text,"привет")+regExSearch.search(text,"какдела");
        long res3 = searchEnginePunctuationNormalizer.search(text,"привет")+searchEnginePunctuationNormalizer.search(text,"какдела");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"привет")+searchEnginePunctuationNormalizer2.search(text,"какдела");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"привет")+ searchEngineToLowerCaseNormalizer.search(text,"какдела");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"привет")+ searchEngineToLowerCaseNormalizer2.search(text,"какдела");
        Assertions.assertEquals(2,res1);
        Assertions.assertEquals(2,res2);
        Assertions.assertEquals(2,res3);
        Assertions.assertEquals(2,res4);
        Assertions.assertEquals(2,res5);
        Assertions.assertEquals(2,res6);

    }


    @Test
    @DisplayName("Тестируем все на заданном примере4")
    public void test_all_4() {
        String text = "как дела!.Что делаешь?";
        long res1 = easySearch.search(text,"дела")+easySearch.search(text,"как")+easySearch.search(text,"Что")+easySearch.search(text,"делаешь");
        long res2 = regExSearch.search(text,"дела")+regExSearch.search(text,"как")+regExSearch.search(text,"Что")+regExSearch.search(text,"делаешь");
        long res3 = searchEnginePunctuationNormalizer.search(text,"дела")+searchEnginePunctuationNormalizer.search(text,"как")+searchEnginePunctuationNormalizer.search(text,"Что")+searchEnginePunctuationNormalizer.search(text,"делаешь");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"дела")+searchEnginePunctuationNormalizer2.search(text,"как")+searchEnginePunctuationNormalizer2.search(text,"Что")+searchEnginePunctuationNormalizer2.search(text,"делаешь");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"дела")+ searchEngineToLowerCaseNormalizer.search(text,"как")+ searchEngineToLowerCaseNormalizer.search(text,"Что")+ searchEngineToLowerCaseNormalizer.search(text,"делаешь");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"дела")+ searchEngineToLowerCaseNormalizer2.search(text,"как")+ searchEngineToLowerCaseNormalizer2.search(text,"Что")+ searchEngineToLowerCaseNormalizer2.search(text,"делаешь");
        Assertions.assertEquals(4,res1);
        Assertions.assertEquals(4,res2);
        Assertions.assertEquals(4,res3);
        Assertions.assertEquals(4,res4);
        Assertions.assertEquals(4,res5);
        Assertions.assertEquals(4,res6);

    }


    @Test
    @DisplayName("Тестируем все на заданном примере5")
    public void test_all_5() {
        String text = "Привет-привет";
        long res1 = easySearch.search(text,"Привет-привет");
        long res2 = regExSearch.search(text,"Привет-привет");
        long res3 = searchEnginePunctuationNormalizer.search(text,"Привет-привет");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"Привет-привет");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"Привет-привет");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"Привет-привет");
        Assertions.assertEquals(1,res1);
        Assertions.assertEquals(1,res2);
        Assertions.assertEquals(1,res3);
        Assertions.assertEquals(1,res4);
        Assertions.assertEquals(1,res5);
        Assertions.assertEquals(1,res6);

    }


    @Test
    @DisplayName("Тестируем все на заданном примере6")
    public void test_all_6() {
        String text = "Привет -привет";
        long res1 = easySearch.search(text,"Привет")+easySearch.search(text,"привет");
        long res2 = regExSearch.search(text,"Привет")+regExSearch.search(text,"привет");
        long res3 = searchEnginePunctuationNormalizer.search(text,"Привет")+searchEnginePunctuationNormalizer.search(text,"привет");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"Привет")+searchEnginePunctuationNormalizer2.search(text,"привет");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"Привет");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"Привет");
        Assertions.assertEquals(2,res1);
        Assertions.assertEquals(2,res2);
        Assertions.assertEquals(2,res3);
        Assertions.assertEquals(2,res4);
        Assertions.assertEquals(2,res5);
        Assertions.assertEquals(2,res6);

    }


    @Test
    @DisplayName("Тестируем все на заданном примере7")
    public void test_all_7() {
        String text = "4-х";
        long res1 = easySearch.search(text,"4-х");
        long res2 = regExSearch.search(text,"4-х");
        long res3 = searchEnginePunctuationNormalizer.search(text,"4-х");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"4-х");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"4-х");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"4-х");
        Assertions.assertEquals(1,res1);
        Assertions.assertEquals(1,res2);
        Assertions.assertEquals(1,res3);
        Assertions.assertEquals(1,res4);
        Assertions.assertEquals(1,res5);
        Assertions.assertEquals(1,res6);

    }



    @Test
    @DisplayName("Тестируем все на заданном примере8")
    public void test_all_8() {
        String text = "один и 1";
        long res1 = easySearch.search(text,"один")+easySearch.search(text,"и")+ easySearch.search(text,"1");
        long res2 = regExSearch.search(text,"один")+regExSearch.search(text,"и")+ regExSearch.search(text,"1");
        long res3 = searchEnginePunctuationNormalizer.search(text,"один")+searchEnginePunctuationNormalizer.search(text,"и")+ searchEnginePunctuationNormalizer.search(text,"1");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"один")+searchEnginePunctuationNormalizer2.search(text,"и")+ searchEnginePunctuationNormalizer2.search(text,"1");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"один")+ searchEngineToLowerCaseNormalizer.search(text,"и")+ searchEngineToLowerCaseNormalizer.search(text,"1");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"один")+ searchEngineToLowerCaseNormalizer2.search(text,"и")+ searchEngineToLowerCaseNormalizer2.search(text,"1");
        Assertions.assertEquals(3,res1);
        Assertions.assertEquals(3,res2);
        Assertions.assertEquals(3,res3);
        Assertions.assertEquals(3,res4);
        Assertions.assertEquals(3,res5);
        Assertions.assertEquals(3,res6);

    }


    @Test
    @DisplayName("Тестируем все на заданном примере9")
    public void test_all_9() {

        String text = "бабушка бабушке бабушку";
        long res1 = easySearch.search(text,"бабушка")+easySearch.search(text,"бабушке")+ easySearch.search(text,"бабушку");
        long res2 = regExSearch.search(text,"бабушка")+regExSearch.search(text,"бабушке")+ regExSearch.search(text,"бабушку");
        long res3 = searchEnginePunctuationNormalizer.search(text,"бабушка")+searchEnginePunctuationNormalizer.search(text,"бабушке")+ searchEnginePunctuationNormalizer.search(text,"бабушку");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"бабушка")+searchEnginePunctuationNormalizer2.search(text,"бабушке")+ searchEnginePunctuationNormalizer2.search(text,"бабушку");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"бабушка")+ searchEngineToLowerCaseNormalizer.search(text,"бабушке")+ searchEngineToLowerCaseNormalizer.search(text,"бабушку");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"бабушка")+ searchEngineToLowerCaseNormalizer2.search(text,"бабушке")+ searchEngineToLowerCaseNormalizer2.search(text,"бабушку");
        Assertions.assertEquals(3,res1);
        Assertions.assertEquals(3,res2);
        Assertions.assertEquals(3,res3);
        Assertions.assertEquals(3,res4);
        Assertions.assertEquals(3,res5);
        Assertions.assertEquals(3,res6);

    }


    @Test
    @DisplayName("Тестируем все на заданном примере10")
    public void test_all_10() {

        String text = "мама мыла раму";
        long res1 = easySearch.search(text,"мыл");
        long res2 = regExSearch.search(text,"мыл");
        long res3 = searchEnginePunctuationNormalizer.search(text,"мыл");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"мыл");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"мыл");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"мыл");
        Assertions.assertEquals(0,res1);
        Assertions.assertEquals(0,res2);
        Assertions.assertEquals(0,res3);
        Assertions.assertEquals(0,res4);
        Assertions.assertEquals(0,res5);
        Assertions.assertEquals(0,res6);

    }

    @Test
    @DisplayName("Тестируем все на кастомном примере1")
    public void test_all_11() {

        String text = "!-привет- .*^как%#@?ты?^^?";
        long res1 = easySearch.search(text,"привет")+easySearch.search(text,"как")+ easySearch.search(text,"ты");
        long res2 = regExSearch.search(text,"привет")+regExSearch.search(text,"как")+ regExSearch.search(text,"ты");
        long res3 = searchEnginePunctuationNormalizer.search(text,"привет")+searchEnginePunctuationNormalizer.search(text,"как")+ searchEnginePunctuationNormalizer.search(text,"ты");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"привет")+searchEnginePunctuationNormalizer2.search(text,"как")+ searchEnginePunctuationNormalizer2.search(text,"ты");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"привет")+ searchEngineToLowerCaseNormalizer.search(text,"как")+ searchEngineToLowerCaseNormalizer.search(text,"ты");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"привет")+ searchEngineToLowerCaseNormalizer2.search(text,"как")+ searchEngineToLowerCaseNormalizer2.search(text,"ты");
        Assertions.assertEquals(3,res1);
        Assertions.assertEquals(3,res2);
        Assertions.assertEquals(3,res3);
        Assertions.assertEquals(3,res4);
        Assertions.assertEquals(3,res5);
        Assertions.assertEquals(3,res6);

    }


    @Test
    @DisplayName("Тестируем все на кастомном примере2")
    public void test_all_12() {

        String text = "4 -х";
        long res1 = easySearch.search(text,"4")+easySearch.search(text,"х");
        long res2 = regExSearch.search(text,"4")+regExSearch.search(text,"х");
        long res3 = searchEnginePunctuationNormalizer.search(text,"4")+searchEnginePunctuationNormalizer.search(text,"х");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"4")+searchEnginePunctuationNormalizer2.search(text,"х");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"4")+ searchEngineToLowerCaseNormalizer.search(text,"х");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"4")+ searchEngineToLowerCaseNormalizer2.search(text,"х");
        Assertions.assertEquals(2,res1);
        Assertions.assertEquals(2,res2);
        Assertions.assertEquals(2,res3);
        Assertions.assertEquals(2,res4);
        Assertions.assertEquals(2,res5);
        Assertions.assertEquals(2,res6);

    }


    @Test
    @DisplayName("Тестируем все на кастомном примере3")
    public void test_all_13() {

        String text = "^%#4%$#-! !-х#%!";
        long res1 = easySearch.search(text,"4")+easySearch.search(text,"х");
        long res2 = regExSearch.search(text,"4")+regExSearch.search(text,"х");
        long res3 = searchEnginePunctuationNormalizer.search(text,"4")+searchEnginePunctuationNormalizer.search(text,"х");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"4")+searchEnginePunctuationNormalizer2.search(text,"х");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"4")+ searchEngineToLowerCaseNormalizer.search(text,"х");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"4")+ searchEngineToLowerCaseNormalizer2.search(text,"х");
        Assertions.assertEquals(2,res1);
        Assertions.assertEquals(2,res2);
        Assertions.assertEquals(2,res3);
        Assertions.assertEquals(2,res4);
        Assertions.assertEquals(2,res5);
        Assertions.assertEquals(2,res6);

    }


    @Test
    @DisplayName("Тестируем все на кастомном примере4")
    public void test_all_14() {

        String text = "приветт";
        long res1 = easySearch.search(text,"привет");
        long res2 = regExSearch.search(text,"привет");
        long res3 = searchEnginePunctuationNormalizer.search(text,"привет");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"привет");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"привет");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"привет");
        Assertions.assertEquals(0,res1);
        Assertions.assertEquals(0,res2);
        Assertions.assertEquals(0,res3);
        Assertions.assertEquals(0,res4);
        Assertions.assertEquals(0,res5);
        Assertions.assertEquals(0,res6);

    }


    @Test
    @DisplayName("Тестируем все на кастомном примере5")
    public void test_all_15() {

        String text = "1привет";
        long res1 = easySearch.search(text,"привет");
        long res2 = regExSearch.search(text,"привет");
        long res3 = searchEnginePunctuationNormalizer.search(text,"привет");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"привет");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"привет");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"привет");
        Assertions.assertEquals(0,res1);
        Assertions.assertEquals(0,res2);
        Assertions.assertEquals(0,res3);
        Assertions.assertEquals(0,res4);
        Assertions.assertEquals(0,res5);
        Assertions.assertEquals(0,res6);

    }

    @Test
    @DisplayName("Тестируем все на кастомном примере6")
    public void test_all_16() {

        String text = "привет\nкак ты\n";
        long res1 = easySearch.search(text,"привет")+easySearch.search(text,"как")+easySearch.search(text,"ты");
        long res2 = regExSearch.search(text,"привет")+regExSearch.search(text,"как")+regExSearch.search(text,"ты");
        long res3 = searchEnginePunctuationNormalizer.search(text,"привет")+searchEnginePunctuationNormalizer.search(text,"как")+searchEnginePunctuationNormalizer.search(text,"ты");
        long res4 = searchEnginePunctuationNormalizer2.search(text,"привет")+searchEnginePunctuationNormalizer2.search(text,"как")+searchEnginePunctuationNormalizer2.search(text,"ты");
        long res5 = searchEngineToLowerCaseNormalizer.search(text,"привет")+searchEngineToLowerCaseNormalizer.search(text,"как")+searchEngineToLowerCaseNormalizer.search(text,"ты");
        long res6 = searchEngineToLowerCaseNormalizer2.search(text,"привет")+searchEngineToLowerCaseNormalizer2.search(text,"как")+searchEngineToLowerCaseNormalizer2.search(text,"ты");
        Assertions.assertEquals(3,res1);
        Assertions.assertEquals(3,res2);
        Assertions.assertEquals(3,res3);
        Assertions.assertEquals(3,res4);
        Assertions.assertEquals(3,res5);
        Assertions.assertEquals(3,res6);

    }








}
