package additional.collections.dto;

import java.util.Objects;

public class Animal implements Comparable<Animal> {

    private String nick;
    private int age;

    /**
     *
     * @param nick
     * @param age от 1 до 15
     * @throws IllegalArgumentException
     */
    public Animal(String nick, int age) throws IllegalArgumentException {
        this.nick = nick;
        if (age < 1 || age > 15) {

            throw new IllegalArgumentException("Неподходящий возраст");
        } else {

            this.age = age;
        }
    }

    public String getNick() {
        return nick;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, age);
    }

    @Override
    public int compareTo(Animal o) {
        return this.age - o.getAge();
    }
}
