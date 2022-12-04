package home_work_5.utils;

import home_work_5.api.Comparator;

public class StringLengthComparator implements Comparator<String> {


    @Override
    public double compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

}
