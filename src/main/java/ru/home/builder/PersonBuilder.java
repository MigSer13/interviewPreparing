package ru.home.builder;

interface PersonBuilder {
    PersonBuilder getFirstName(String firstName);
    PersonBuilder getLastName(String lastName);
    PersonBuilder getMiddleName(String middleName);
    PersonBuilder getCountry(String country);
    PersonBuilder getAddress(String address);
    PersonBuilder getPhone(String phone);
    PersonBuilder getAge(int age);
    PersonBuilder getGender(String gender);

    Person builder();
}
