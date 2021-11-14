package ru.home.builder_1;

public class PersonBuiderImp implements PersonBuilder{
    Person person = new Person();

    @Override
    public PersonBuilder setFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @Override
    public PersonBuilder setMiddleName(String middleName) {
        person.setMiddleName(middleName);
        return this;
    }

    @Override
    public PersonBuilder setCountry(String country) {
        person.setCountry(country);
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    @Override
    public PersonBuilder setPhone(String phone) {
        person.setPhone(phone);
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    @Override
    public PersonBuilder setGender(String gender) {
        person.setGender(gender);
        return this;
    }

    @Override
    public Person builder() {
        return person;
    }
}
