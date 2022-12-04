package home_work_5.api;

public interface Comparator <T>{

    /**
     * Cравнение переданных o1 и o2 порядке
     * @param o1 первый объект для сравнения
     * @param o2 второй объект для сравнения для сравнения
     * @return double результат o1-o2
     */
    double compare(T o1, T o2);



}
