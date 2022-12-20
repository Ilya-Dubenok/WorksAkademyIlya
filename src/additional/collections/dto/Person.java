package additional.collections.dto;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String nick;
    private String password;
    private String name;
    private int passwordLength;


    /**
     *
     * @param nick
     * @param password длиной от 5 до 10
     * @param name
     * @throws IllegalArgumentException
     */
    public Person(String nick, String password, String name) throws IllegalArgumentException {
        this.nick = nick;
        if (password.length() < 5 || password.length() > 10) {

            throw new IllegalArgumentException("Неподходящая длина пароля");
        } else {

            this.password = password;
        }
        this.name = name;
        this.passwordLength = password.length();
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }

    @Override
    public int compareTo(Person o) {
        return this.password.length()-o.password.length();
    }
}
