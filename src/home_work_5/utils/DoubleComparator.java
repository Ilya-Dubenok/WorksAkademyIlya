package home_work_5.utils;

import home_work_5.api.Comparator;

public class DoubleComparator implements Comparator<Double> {


    @Override
    public double compare(Double o1, Double o2) {
        return o1 - o2;
    }


}
