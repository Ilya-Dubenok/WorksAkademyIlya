package home_work_6.run;

import home_work_6.utils.*;

import java.io.File;
import java.io.IOException;

public class Tasks_2_And_5 {

    public static void main(String[] args) {


        RegExSearch regExSearch = new RegExSearch();
        EasySearch easySearch = new EasySearch();

        SearchEnginePunctuationNormalizer searchEnginePunctuationNormalizer = new SearchEnginePunctuationNormalizer(regExSearch);
        SearchEngineToLowerCaseNormalizer searchEngineToLowerCaseNormalizer = new SearchEngineToLowerCaseNormalizer(regExSearch);


        File file = new File("src/home_work_6/Война и мир_книга.txt");

        System.out.print("Количество слов в тексте: ");
        try {

            System.out.println(WordsCollector.getCountOfAllUniqueWords(file));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }


        System.out.print("Топ 15 слов в тексте: ");
        try {

            System.out.println(WordsCollector.getTopOfWords(file, 15));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        String text = "";

        try {
            text = WordsCollector.getStringOfWorldsFromFile(file);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());

        }

        System.out.println("Результаты поиска в EasySearch:\n");
        long voyna = easySearch.search(text, "война");
        long i = easySearch.search(text, "и");
        long mir = easySearch.search(text, "мир");
        System.out.printf("война: %d, и: %d, мир: %d\n", voyna, i, mir);

        System.out.println("Результаты поиска в RegExSearch:\n");
        voyna = regExSearch.search(text, "война");
        i = regExSearch.search(text, "и");
        mir = regExSearch.search(text, "мир");
        System.out.printf("война: %d, и: %d, мир: %d\n", voyna, i, mir);

        System.out.println("Результаты поиска в SearchEnginePunctuationNormalizer:\n");
        voyna = searchEnginePunctuationNormalizer.search(text, "война");
        i = searchEnginePunctuationNormalizer.search(text, "и");
        mir = searchEnginePunctuationNormalizer.search(text, "мир");
        System.out.printf("война: %d, и: %d, мир: %d\n", voyna, i, mir);

        System.out.println("Результаты поиска в SearchEngineCaseNormalizer:\n");
        voyna = searchEngineToLowerCaseNormalizer.search(text, "война");
        i = searchEngineToLowerCaseNormalizer.search(text, "и");
        mir = searchEngineToLowerCaseNormalizer.search(text, "мир");
        System.out.printf("война: %d, и: %d, мир: %d\n", voyna, i, mir);


    }
}
