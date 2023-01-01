package home_work_6.utils;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile(
                "(?<!\\p{IsAlphabetic}|\\d|\\p{IsAlphabetic}-|\\d-)" + word +
                        "(?!\\p{IsAlphabetic}|\\d|-\\p{IsAlphabetic}|-\\d)"
        );

        Matcher matcher = pattern.matcher(text);
        long res = 0;
        while (matcher.find()) {
            res += 1;
        }
        return res;


    }

    /**
     * Ищет, сколько раз заданное слово встречается в заданном тексте. Если boolean toLowerCase
     * задан как true, делает поиск без учета регистра
     * @param text
     * @param word
     * @param toLowerCase
     * @return
     */
    public long search(String text, String word, boolean toLowerCase) {
        int flags = toLowerCase ? Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE : 0;

        Pattern pattern = Pattern.compile(
                "(?<!\\p{IsAlphabetic}|\\d|\\p{IsAlphabetic}-|\\d-)" + word +
                        "(?!\\p{IsAlphabetic}|\\d|-\\p{IsAlphabetic}|-\\d)",flags
        );

        Matcher matcher = pattern.matcher(text);
        long res = 0;
        while (matcher.find()) {
            res += 1;
        }
        return res;


    }
}
