package com.gmail.ahmedded.homework.homework5;

import java.util.Scanner;

public class TaxService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your profit: ");

        double income = scanner.nextDouble();
        double tax;

        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = income * 0.043;
        } else {
            tax = income * 0.06;
        }

        System.out.printf("Your end bill with tax is: ", tax);
    }
}
