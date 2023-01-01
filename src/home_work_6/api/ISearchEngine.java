package home_work_6.api;

public interface ISearchEngine {

    /**
     * Возвращает кол-во раз, сколько заданное слово встречается в заданном тексте
     * @param text текст, в котором ищем
     * @param word слово(текст), который ищем
     * @return
     */
    long search(String text, String word);

}
