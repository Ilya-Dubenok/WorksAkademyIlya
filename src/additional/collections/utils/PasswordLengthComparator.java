package additional.collections.utils;

import additional.collections.dto.Person;

import java.util.Comparator;

public class PasswordLengthComparator implements Comparator<Person> {
    /**
     * Стравнивает Persons по длине пароля
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPassword().length()-o2.getPassword().length();
    }
}
