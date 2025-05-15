package com.gmail.ahmedded.homework.homework7;

import java.util.Random;
import java.util.Scanner;

public class WorkWithAllFunctionalArray {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int income = scanner.nextInt();
        int[] numbersArray = new int[income];

        boolean havenegative = false;
        int countLessZero = 0;
        int IdxNumbersArrayLessZero = 0;
        int SumNumbersLessZero = 0;
        int QuantityDoubles = 0;
        int sumUnpaired = 0;
        int IdxMaxNumber = numbersArray[0];
        int IdxMinNumber = numbersArray[0];
        int MaxIndex = 0;
        int MinIndex = 0;
        int MidlNumber1or2 = 0;
        int MidlNumberAll = 0;
        int MidlNumberAllEnd = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = random.nextInt(-100, 101);
        }

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] < 0) {
                havenegative = true;
                countLessZero++;
                SumNumbersLessZero = SumNumbersLessZero + numbersArray[i];
            }
        }

        int[] numbers2 = new int[countLessZero];
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] < 0) {
                numbers2[IdxNumbersArrayLessZero] = numbersArray[i];
                IdxNumbersArrayLessZero = IdxNumbersArrayLessZero + 1;
            }
        }

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(i + ") " + numbers2[i]);
        }

        System.out.println("If you want see Doubles and Unpaired nuber in not queue type 1 or in queue type 2");
        int incomeparn = scanner.nextInt();
        if (incomeparn == 1) {
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] % 2 == 0) {
                    System.out.println("Doubles" + numbersArray[i]);
                    QuantityDoubles = QuantityDoubles + 1;
                } else {
                    System.out.println("Unpaired" + numbersArray[i]);
                    sumUnpaired = sumUnpaired + 1;
                }
            }
        } else if (incomeparn == 2) {
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] % 2 == 0) {
                    System.out.println("Doubles" + numbersArray[i]);
                    QuantityDoubles = QuantityDoubles + 1;
                } else {
                }
            }
            for (int i = 0; i < numbersArray.length; i++) {
                if (numbersArray[i] % 2 == 0) {
                } else {
                    System.out.println("Unpaired" + numbersArray[i]);
                    sumUnpaired = sumUnpaired + 1;
                }
            }
        } else {
            System.out.println("You dont type 1 or 2");
        }

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] > IdxMaxNumber) {
                IdxMaxNumber = numbersArray[i];
                MaxIndex = i;
            }
            if (numbersArray[i] < IdxMinNumber) {
                IdxMinNumber = numbersArray[i];
                MinIndex = i;
            }
        }

        System.out.println("Max element: " + IdxMaxNumber + " index - " + MaxIndex);
        System.out.println("Min element: " + IdxMinNumber + " index -  " + MinIndex);

        if (havenegative == false) {
            System.out.println("No number under 0 if you want to enter type 1 for enter program or 2 to enter program without midle number");
            MidlNumber1or2 = scanner.nextInt();
        } else {
            MidlNumber1or2 = 1;
        }

        if (MidlNumber1or2 == 1) {
            for (int i = 0; i < numbersArray.length; i++) {
                MidlNumberAll = (MidlNumberAll + numbersArray[i]);
                MidlNumberAllEnd = MidlNumberAll / numbersArray.length;
            }
            System.out.println("Midl number = " + MidlNumberAll);
        } else if (MidlNumber1or2 == 2) {
            System.out.println("You chose 2");
        } else {
            System.out.println("You dont chose 1 or 2");
        }

        scanner.close();
    }
}
