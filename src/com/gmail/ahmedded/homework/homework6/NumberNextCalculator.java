package com.gmail.ahmedded.homework.homework6;

import java.util.Scanner;

public class NumberNextCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number : ");
        int income = scanner.nextInt();
        if (income <= 0) {
            System.out.println("No you can type more than zero 0 :) pls restart program");
            return;
        }

        int sum = 0;
        for (int i = 1; i <= income; i++) {
            sum += i;
            System.out.println("Num is " + i + " sum is " + sum);
        }
        System.out.println("Sum of numbers is " + sum);
        System.out.println("");

        sum = 0;
        int i = 1;
        while (i <= income) {
            sum += i;
            System.out.println("Num is " + i + " sum is " + sum);
            i++;
        }
        System.out.println("Sum of numbers is " + sum);
        System.out.println("");

        sum = 0;
        i = 1;
        do {
            sum += i;
            System.out.println("Num is " + i + " sum is " + sum);
            i++;
        } while (i <= income);
        System.out.println("Sum of numbers is " + sum);
        System.out.println("");
    }
}
