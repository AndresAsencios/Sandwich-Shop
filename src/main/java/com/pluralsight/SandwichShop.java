package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String size1 = "Medium";
        String size2 = "Large";
        double mediumPrice = 5.95;
        double largePrice = 8.95;
        double seniorDiscount = 0.20;
        double studentDiscount = 0.10;

        // Welcome to Sandwich store
        System.out.println("Welcome to the sandwich shop!");
        System.out.println("Choose sandwich size: Med or Large");
        System.out.println("1." + size1);
        System.out.println("2." + size2);
        System.out.print("Enter your choice: ");
        int option = read.nextInt();
        // Age verification
        System.out.println("How old are you?");
        int age = read.nextInt();


        System.out.println("Are you a student? true/false");
        boolean isStudent = read.nextBoolean();
        double sandwichPrice = 0;
        double discountAmount = 0;

        // Price of sandwich options
        if (option == 1) {
            sandwichPrice = mediumPrice;
            System.out.println("Price of sandwich is $" + sandwichPrice);
        } else if (option == 2){
            sandwichPrice = largePrice;
            System.out.println("Price of sandwich is $" + sandwichPrice);

        } else {
            System.out.println("Invalid sandwich, Only two sizes.");
        }

//        if (isLoaded)
        System.out.println("Would you like it loaded? (yes/no)");
        System.out.println("Medium: +$1");
        System.out.println("Large: +$1.75");
        String loadedChoice = read.next();
        if (loadedChoice.equalsIgnoreCase("yes")){
            System.out.println("Yes, I want it loaded!");
            if (option == 1) {
                sandwichPrice = sandwichPrice +1.00;
            } else if (option == 2){
                sandwichPrice = sandwichPrice + 1.75;
            }

        } else {
            System.out.println("No, I don't want it loaded.");
        }

        if (age >= 65) {
            discountAmount = sandwichPrice * seniorDiscount;
            System.out.println("You qualify for a 20% discount!");
        } else if (isStudent) {
            discountAmount = sandwichPrice * studentDiscount;
            System.out.println("You qualify for a 10% discount!");
        }

        double finalPrice = sandwichPrice - discountAmount;

        System.out.printf("Your final total is $%.2f%n", finalPrice);



        read.close();


    }
}
