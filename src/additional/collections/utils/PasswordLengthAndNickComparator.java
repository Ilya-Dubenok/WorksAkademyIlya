package additional.collections.utils;

import additional.collections.dto.Person;

public class PasswordLengthAndNickComparator extends PasswordLengthComparator {


    /**
     * Сравнивает Persons по длине пароля и (если длина пароля равна) по нику
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Person o1, Person o2) {
        int passCompare = super.compare(o1, o2);

        if (passCompare == 0) {
            return o1.getNick().compareTo(o2.getNick());
        } else {
            return passCompare;

        }
    }
}
