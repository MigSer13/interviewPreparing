package ru.home.lesson1.builder_1;

public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuiderImp()
                .setFirstName("Ivan").
                setLastName("Belinov")
                .setAge(24)
                .builder();
    }
}
