package com.gmail.ahmedded.homework.homework8;

import java.util.Random;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.print("Whitch size array do you want ? Type only number : ");
        int sizeArrayScaner = scanner.nextInt();
        if (sizeArrayScaner > 0) {
            sizeArrayScaner = sizeArrayScaner;
        } else {
            System.out.println("You type number under 0 type only number upper zero restart program");
        }

        System.out.print("What number will the random start in the array : ");
        int firstRandomNumber = scanner.nextInt();
        System.out.print("What number will the random end in the array : ");
        int endRandomNumber = scanner.nextInt();

        int[] array = new int[sizeArrayScaner];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(firstRandomNumber, endRandomNumber);
        }

        System.out.println(" ");
        System.out.println("Your array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + ") - " + array[i]);
        }

        for (int i = 1; i < array.length; i++) {
            int curren = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > curren) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = curren;
        }
        System.out.println(" ");
        System.out.println("Your sort array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + ") - " + array[i]);
        }

        System.out.print("What variant of sort array do you want type 1) to Liner search or 2) Binar search : ");
        int variantSearch = scanner.nextInt();
        if (variantSearch == 1) {
            System.out.print("What number you want to find in array : ");
            int numberArrayFound = scanner.nextInt();

            for (int i = 0; i < array.length; i++) {
                if (numberArrayFound == array[i]) {
                    System.out.println("element " + i + ") - " + numberArrayFound);
                }
            }
        } else if (variantSearch == 2) {
            System.out.print("What number you want to find in array : ");
            int numberArrayFound = scanner.nextInt();

            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (array[mid] == numberArrayFound) {
                    System.out.println("element " + mid + ") found your namber at index : " + numberArrayFound);
                    break;
                } else if (array[mid] < numberArrayFound) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        } else {
            System.out.println("You type number not 1 and 2 restart program");
        }


    }
}
