import java.util.OptionalInt;

import static java.util.Objects.hash;


public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String adress;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return adress != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return adress;
    }

    public String setAddress(String address) {
        this.adress = address;
        return this.adress;
    }

    public void happyBirthday() {
        if (hasAge()) age += 1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("name = ").append(name)
                .append(", surname = ").append(surname)
                .append(", age = ").append(age)
                .append(", adress = ").append(adress).append(".");
        return builder.toString();
    }

    @Override
    public int hashCode() {
        return Object.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAdress(adress);
    }


}
