package additional.collections.utils;

import additional.collections.dto.Animal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    /**
     * Сравнивает Animals по возрасту
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge()-o2.getAge();
    }
}
