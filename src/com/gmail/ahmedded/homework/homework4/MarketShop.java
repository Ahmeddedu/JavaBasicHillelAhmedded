package com.gmail.ahmedded.homework.homework4;

public class MarketShop {
    public static void main(String[] args) {
        String product = "smartphone";
        int quantity = 150;
        double price = 90;
        int days = 5;

        double totalSales = quantity * price;
        double dailySales = totalSales / days;
        totalSales = Math.round(totalSales * 100) / 100.0;
        dailySales = Math.round(dailySales * 100) / 100.0;

        System.out.println("Product: " + product);
        System.out.println("Total sales for " + days + " days in EUR: " + totalSales);
        System.out.println("Sales per day in EUR: " + dailySales);

        System.out.println();

        product = "laptop";
        quantity = 70;
        price = 120;
        days = 7;

        totalSales = quantity * price;
        dailySales = totalSales / days;
        totalSales = Math.round(totalSales * 100) / 100.0;
        dailySales = Math.round(dailySales * 100) / 100.0;

        System.out.println("Product: " + product);
        System.out.println("Total sales for " + days + " days in EUR: " + totalSales);
        System.out.println("Sales per day in EUR: " + dailySales);
    }
}