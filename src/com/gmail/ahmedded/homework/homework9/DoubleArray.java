package com.gmail.ahmedded.homework.homework9;

import java.util.Random;
import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sumEvenRows = 0;
        int sumOddRows = 0;
        int sumEvenColumns = 0;
        int sumOddColumns = 0;

        System.out.print("Whitch size in a column in array do you want ? Type only number : ");
        int sizeArrayColumn = scanner.nextInt();
        System.out.print("Whitch size in a row in array do you want ? Type only number : ");
        int sizeArrayRaw = scanner.nextInt();
        int[][] matrix = new int[sizeArrayColumn][sizeArrayRaw];

        System.out.print("What number will the random start in the array : ");
        int minArrayValue = scanner.nextInt();
        System.out.print("What number will the random end in the array : ");
        int maxArrayValue = scanner.nextInt();
        for (int i = 0; i < sizeArrayColumn; i++) {
            for (int j = 0; j < sizeArrayRaw; j++) {
                matrix[i][j] = random.nextInt(minArrayValue , maxArrayValue + 1);
            }
        }

        System.out.println("Your matrix - " + sizeArrayColumn + "x" + sizeArrayRaw);
        for (int i = 0; i < sizeArrayColumn; i++) {
            for (int j = 0; j < sizeArrayRaw; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < sizeArrayColumn; i++) {
            for (int j = 0; j < sizeArrayRaw; j++) {
                if(i % 2 == 0){
                    sumEvenRows += matrix[i][j];
                }
                if(i % 2 != 0){
                    sumOddRows += matrix[i][j];
                }
            }
        }
        System.out.println("Sum in Doubles column = " +  sumEvenRows);
        System.out.println("Sum in Unpaired column = " +  sumOddRows);

        for (int i = 0; i < sizeArrayColumn; i++) {
            for (int j = 0; j < sizeArrayRaw; j++) {
                if(j % 2 == 0){
                    sumEvenColumns += matrix[i][j];
                }
                if(j % 2 != 0){
                    sumOddColumns += matrix[i][j];
                }
            }
        }
        System.out.println("Sum in Doubles column = " +   sumEvenColumns);
        System.out.println("Sum in Unpaired column = " + sumOddColumns);

    }
}