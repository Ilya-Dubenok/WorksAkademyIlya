package home_work_6.utils;

import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {


    @Override
    public long search(String text, String word) {
        long res = 0;
        int start;
        int offSet = 0;
        int textLength = text.length();
        while ((start = text.indexOf(word, offSet)) != -1) {
            int previous = start - 1;
            int following = start + word.length();

            if (previous != -1) {
                char c = text.charAt(previous);
                if (Character.isLetterOrDigit(c)) {
                    offSet = start + word.length();
                    continue;
                }
                if (c == '-') {
                    if (previous-- > 0) {
                        c = text.charAt(previous);
                        if (Character.isLetterOrDigit(c)) {
                            offSet = start + word.length();
                            continue;
                        }

                    }
                }


            }

            if (following < textLength) {
                char c = text.charAt(following);
                if (Character.isLetterOrDigit(c)) {
                    offSet = start + word.length();
                    continue;
                }
                if (c == '-') {
                    if (following++ < textLength) {
                        c = text.charAt(following);
                        if (Character.isLetterOrDigit(c)) {
                            offSet = start + word.length();
                            continue;
                        }
                    }

                }


            }
            res += 1;
            offSet = start + word.length();
        }


        return res;
    }
}
