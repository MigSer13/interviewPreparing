package ru.home.builder;

public class PersonBuiderImp implements PersonBuilder{
    Person person = new Person();

    @Override
    public PersonBuilder getFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    @Override
    public PersonBuilder getLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @Override
    public PersonBuilder getMiddleName(String middleName) {
        person.setMiddleName(middleName);
        return this;
    }

    @Override
    public PersonBuilder getCountry(String country) {
        person.setCountry(country);
        return this;
    }

    @Override
    public PersonBuilder getAddress(String address) {
        person.setAddress(address);
        return this;
    }

    @Override
    public PersonBuilder getPhone(String phone) {
        person.setPhone(phone);
        return this;
    }

    @Override
    public PersonBuilder getAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder getGender(String gender) {
        person.setGender(gender);
        return this;
    }

    @Override
    public Person builder() {
        return person;
    }
}
