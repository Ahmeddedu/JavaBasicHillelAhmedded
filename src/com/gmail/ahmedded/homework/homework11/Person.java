package com.gmail.ahmedded.homework.homework11;

public class Person {
    String firstName;
    String lastName;
    int age;
    String profession;

    public Person(String firstName, String lastName, int age, String profession){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
    }

    public void remakeFirstName(String remakeFirstName){
        this.firstName = remakeFirstName;
    }
    public void remakeLastName(String remakeLastName){
        this.lastName = remakeLastName;
    }
    public void remakeAge(int remakeAge){
        this.age = remakeAge;
    }
    public void remakeProfession(String remakeProfession){
        this.profession = remakeProfession;
    }

    public void allWarkers(){
        System.out.println("Имя : " + firstName + " Фамилия : " + lastName + " Возраст : " + age + " Професия : " + profession);
    }
}
