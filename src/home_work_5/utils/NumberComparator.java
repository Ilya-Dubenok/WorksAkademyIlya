package home_work_5.utils;

import home_work_5.api.Comparator;


/**
 * Попробовал сделать такой общий компаратор на все Numbers.
 * @param <T>
 */
public class NumberComparator<T extends Number> implements Comparator<T> {



    @Override
    public double compare(T o1, T o2) {
        return o1.doubleValue() - o2.doubleValue();
    }
}
