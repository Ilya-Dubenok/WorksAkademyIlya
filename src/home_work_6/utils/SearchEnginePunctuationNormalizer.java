package home_work_6.utils;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String normalText = normalize(text);
        return searchEngine.search(normalText, word);
    }


    public void setSearchEngine(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * Возвращает строку, где убраны лишние пробелы, переносы строки, все знаки препинания в переданном тексте
     * @param text
     * @return
     */
    public String normalize(String text) {

        text = trimRemoveSpacesLines(text);
        text = unSplit(text);
        text = splitDefis(text);
        text = removeSigns(text);


        return text;


    }

    /**
     * Возвращает строку, из которой два и более пробела подряд, а также переносы строк и перевод каретки заменены
     * на один пробел, убраны пробелы в начале и конце строки
     * @param text строка для обработки
     * @return новая строка, без ненужных пробелов и переносов
     */
    public String trimRemoveSpacesLines(String text) {

        Pattern pattern = Pattern.compile("(\\s{2,}|\r|\n)");

        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll(" ").trim();

    }

    /**
     * Возвращает строку, в которой случай буква-знак_препинания-буква
     * заменен на буква-пробел-буква (к примеру, фраза "привет.как дела?" будет возвращена
     * как "привет как дела?", презимюруюя, что в первоначальной фразе была опечатка)
     * @param text строка для обработки
     * @return новая строка, без ненужных пробелов и переносов
     */
    public String unSplit (String text) {

        Pattern pattern = Pattern.compile("(?<=(?:\\p{IsAlphabetic}))[\"#$%&'()*+,./:;<=>!?@\\[\\]^_`{|}~]+(?=(?:\\p{IsAlphabetic}|\\d))");

        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll(" ");

    }


    /**
     * Возвращает строку, в которой случай пробел-дефис-буква заменен на пробел-буква
     * к примеру, фраза "Привет -привет" будет преобразована в фразу "Привет привет"
     * @param text строка для обработки
     * @return новая строка, без ненужных пробелов и переносов
     */
    public String splitDefis (String text) {

        Pattern pattern = Pattern.compile("(?<=\\s)-(?=\\p{IsAlphabetic})|(?<=\\p{IsAlphabetic})-(?=\\s)");

        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll("");

    }


    /**
     * Возвращает строку, в которой удалены все знаки препинания
     * @param text строка для обработки
     * @return новая строка, без ненужных пробелов и переносов
     */
    public String removeSigns (String text) {

        Pattern pattern = Pattern.compile("[\"#$%&'()*+,./:;<=>!?@\\[\\]^_`{|}~]");

        Matcher matcher = pattern.matcher(text);

        return matcher.replaceAll("");

    }

}
