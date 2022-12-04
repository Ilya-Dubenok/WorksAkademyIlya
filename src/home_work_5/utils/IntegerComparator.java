package home_work_5.utils;

import home_work_5.api.Comparator;

public class IntegerComparator implements Comparator<Integer> {


    @Override
    public double compare(Integer o1, Integer o2) {
        return o1 - o2;
    }


}
