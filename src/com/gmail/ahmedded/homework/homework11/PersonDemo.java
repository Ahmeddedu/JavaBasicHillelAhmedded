package com.gmail.ahmedded.homework.homework11;

public class PersonDemo {
    public static void main(String[] args){
        Person[] persons = { new Person("Abdul", "Ahmedovich", 22 , "Colector"),
                new Person("Georgi", "Danonovich", 46 , "Teacher"),
                new Person("Lenin", "Klovenski", 345 , "Povar"),};

        for (Person person : persons){
            person.allWarkers();
        }

        persons[2].remakeProfession("TopMenager");
        persons[2].remakeAge(359);
        persons[0].remakeFirstName("Ahmed");
        persons[1].remakeLastName("Vodni");

        System.out.println("Remade comand");
        for (Person person : persons){
            person.allWarkers();
        }

    }
}
