package home_work_6.utils;

import java.io.*;
import java.util.*;

public class WordsCollector {


    /**
     * Вовзращает количество уникальных слов в переданном текстовом файле
     * @param file файл для поиска количества уникальных слов
     * @return
     * @throws IOException
     */
    public static int getCountOfAllUniqueWords(File file) throws IOException {

        Set<String> allWords = getUniqueWords(getStringOfWorldsFromFile(file));
        return allWords.size();

    }


    /**
     * Возвращает топ-num слов в переданном файле в заданном формате
     * @param file файл для поиска топ-num слов
     * @param num сколько слов нужно искать в топе
     * @return строка с информацией о топ-num слов в файле
     * @throws IOException
     */
    public static String getTopOfWords(File file, int num) throws IOException {
        if (num < 1) {
            throw new IllegalArgumentException("Количетсво слов не может быть меньше 1");
        }

        StringBuilder sb = new StringBuilder("Топ " + num + " слов:\n");
        Map<String, Integer> map = new HashMap<>();

        String text = getStringOfWorldsFromFile(file);
        map = getMapWithCountOfAllWords(text);


        List<Map.Entry<String, Integer>> allEntries = getListOfAllWordsInDescendingCount(map);

        for (int i = 0; i < num; i++) {
            Map.Entry<String, Integer> entry = allEntries.get(i);
            sb.append(entry.getKey()).append(" -> ").append(entry.getValue()).append(" раз\n");
        }


        return sb.toString();
    }

    /**
     * Вовзвращает List<Map.Entry<String, Integer>> с отсортированными (по убыванию значений value) данными из
     * переданного Map<String, Integer> map
     * @param map
     * @return
     */
    public static List<Map.Entry<String, Integer>> getListOfAllWordsInDescendingCount(Map<String, Integer> map) {

        Set<Map.Entry<String, Integer>> allEntries = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        allEntries.addAll(map.entrySet());

        List<Map.Entry<String, Integer>> res = new ArrayList<>();
        res.addAll(allEntries);

        return res;

    }

    /**
     * Формирует Map<String, Integer>, где key является уникальные слова в переданном тексте, а value - количество
     * повторений данных слов
     * @param s текст для поиска количества повторений уникальных слов
     * @return
     * @throws IOException
     */
    public static Map<String, Integer> getMapWithCountOfAllWords(String s) throws IOException {

        Map<String, Integer> allWords = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = s.length();
        boolean noSkipping;

        while (start < end) {
            noSkipping = false;
            char cur = s.charAt(start);
            if (Character.isLetterOrDigit(cur)) {
                noSkipping = true;
            } else if (sb.length() != 0 && cur == '-') {
                noSkipping = true;
            }

            if (noSkipping) {
                sb.append(cur);
            }

            if (!noSkipping && sb.length() > 0) {
                String word = sb.toString();
                if (allWords.containsKey(word)) {
                    allWords.put(word, allWords.get(word) + 1);
                } else {
                    allWords.put(word, 1);
                }
                sb.delete(0, sb.length());

            }


            start++;
        }

        if (sb.length() > 0) {
            String word = sb.toString();
            if (allWords.containsKey(word)) {
                allWords.put(word, allWords.get(word) + 1);
            } else {
                allWords.put(word, 1);
            }
            sb.delete(0, sb.length());
        }

        return allWords;


    }


    /**
     * Анализирует текст и возвращает Set уникальных слов (т.е. набор слов, которые были использованы
     * для написания данного текста)
     * @param s текст для поиска набора слов
     * @return
     */
    public static Set<String> getUniqueWords(String s) {

        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = s.length();
        boolean noSkipping;
        Set<String> allWords = new HashSet<>();

        while (start < end) {
            noSkipping = false;
            char cur = s.charAt(start);
            if (Character.isLetterOrDigit(cur)) {
                noSkipping = true;
            } else if (sb.length() != 0 && cur == '-') {
                noSkipping = true;
            }

            if (noSkipping) {
                sb.append(cur);
            }

            if (!noSkipping && sb.length() > 0) {
                allWords.add(sb.toString());
                sb.delete(0, sb.length());

            }


            start++;
        }

        if (sb.length() > 0) {
            allWords.add(sb.toString());
            sb.delete(0, sb.length());
        }

        return allWords;


    }


    /**
     * Возвращает строку из всех символов введенного файла
     * @param file файл для чтения
     * @return Строка из всех символов введенного файла
     * @throws IOException
     */
    public static String getStringOfWorldsFromFile(File file) throws IOException {

        StringBuilder sb = new StringBuilder();

        try (Reader reader = new FileReader(file)) {

            int read;
            while ((read = reader.read()) != -1) {
                sb.append((char) read);

            }

        }

        return sb.toString();


    }

}
