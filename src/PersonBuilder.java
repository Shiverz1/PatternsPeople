public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String adress;

    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Incorrect name");
        } else
            this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Incorrect name");
        } else
            this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Incorrect age");
        } else
            this.age = age;
        return this;
    }

    public PersonBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }

    public Person build() throws IllegalStateException {
        Person person;
        if (name == null || surname == null)
            throw new IllegalStateException("Name or surname is not corrected");
        if (age < 0) {
            person = new Person(name, surname);
        } else
            person = new Person(name, surname, age);
        person.setAddress(adress);
        return person;
    }
}
