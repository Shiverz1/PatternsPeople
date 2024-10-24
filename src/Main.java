public class Main {
    public static void main(String[] args) {
        Person dad = new PersonBuilder()
                .setName("Sergey")
                .setSurname("Ivanov")
                .setAge(50)
                .setAdress("Kazan")
                .build();
        Person daughter = dad.newChildBuilder()
                .setName("Anna")
                .build();
        System.out.println("Отец " + dad + " Дочь " + daughter);

        // Не все поля
        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        // Некорректный возраст
        try {
            new PersonBuilder().setAge(-1).build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
