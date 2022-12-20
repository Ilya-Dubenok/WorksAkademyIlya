package additional.collections.utils;

import additional.collections.dto.Animal;

public class AnimalAgeAndNickNameComparator extends AnimalAgeComparator {

    /**
     * Сравнивает Animals по возрасту, если возраст одинаковый - по кличке
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Animal o1, Animal o2) {
        int ageComp = super.compare(o1, o2);
        if (ageComp == 0) {
            return o1.getNick().compareTo(o2.getNick());
        }
        return ageComp;
    }
}
