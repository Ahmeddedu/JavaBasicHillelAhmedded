package com.gmail.ahmedded.homework.homework12;

public class Inks {
    private String fullName;
    private String profession;
    private String email;
    private String phone;
    private int age;

    public Inks(String fullName, String profession, String email, String phone, int age) {
        this.fullName = fullName;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getProfession() {
        return profession;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("ПІБ : " + fullName);
        System.out.println("Провесія : " + profession);
        System.out.println("Email : " + email);
        System.out.println("Телефон : " + phone);
        System.out.println("Вік : " + age);
    }
}
