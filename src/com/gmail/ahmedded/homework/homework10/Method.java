package com.gmail.ahmedded.homework.homework10;

import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        printSquare(number);

        System.out.print("Введіть радіус: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту: ");
        double height = scanner.nextDouble();
        double volume = cylinderVolume(radius, height);
        System.out.println("  Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume);

        System.out.print("Введіть розір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введіть елем маисву: ");
        for (int i = 0; i < size; i++) {
            System.out.print("   Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int sum = sumArray(array);
        System.out.println("Сума всього масиву : " + sum);

        scanner.nextLine();
        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("Рядок наоборот: " + reversed);

        System.out.print("Введіть число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть у яку степінь: ");
        int b = scanner.nextInt();
        int result = power(a, b);
        System.out.println("Результ " + a + "/" + b + " дорівнюе " + result);

        scanner.nextLine();
        System.out.print("Введіть ціле чисо : ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть рядок: ");
        String text = scanner.nextLine();
        repeatText(n, text);

        scanner.close();
    }

    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " дорівнює " + square + ".");
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        return reversed;
    }

    public static int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
