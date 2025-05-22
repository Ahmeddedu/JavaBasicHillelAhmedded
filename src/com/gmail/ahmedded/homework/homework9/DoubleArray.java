package com.gmail.ahmedded.homework.homework9;

import java.util.Random;
import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int sumArrayDoublesColumn = 0;
        int sumArrayUnpairedColumn = 0;
        int sumArrayDoublesRow = 0;
        int sumArrayUnpairedRow = 0;

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
                    sumArrayDoublesColumn += matrix[i][j];
                }
                if(i % 2 != 0){
                    sumArrayUnpairedColumn += matrix[i][j];
                }
            }
        }
        System.out.println("Sum in Doubles column = " +  sumArrayDoublesColumn);
        System.out.println("Sum in Unpaired column = " +  sumArrayUnpairedColumn);

        for (int i = 0; i < sizeArrayColumn; i++) {
            for (int j = 0; j < sizeArrayRaw; j++) {
                if(j % 2 == 0){
                    sumArrayDoublesRow += matrix[i][j];
                }
                if(j % 2 != 0){
                    sumArrayUnpairedRow += matrix[i][j];
                }
            }
        }
        System.out.println("Sum in Doubles column = " +   sumArrayDoublesRow);
        System.out.println("Sum in Unpaired column = " + sumArrayUnpairedRow);

    }
}