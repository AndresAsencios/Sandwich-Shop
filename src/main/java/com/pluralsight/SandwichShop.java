package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String size1 = "Medium";
        String size2 = "Large";
        double mediumPrice = 5.95;
        double largePrice = 7.95;
        double seniorDiscount = 0.20;
        double studentDiscount = 0.15;



        System.out.println("Welcome to the sandwich shop!");
        System.out.println("Choose sandwich size: Med or Large");
        System.out.println("1." + size1);
        System.out.println("2." + size2);
        System.out.print("Enter your choice: ");
        int option = read.nextInt();

        System.out.println("How old are you?");
        int age = read.nextInt();


        System.out.println("Are you a student? true/false");
        boolean isStudent = read.nextBoolean();


        if (age >= 65) {
            System.out.println("You qualify for a 20% discount!");
        } else if (isStudent){
            System.out.println("You qualify for a 15% discount!");
        }

        double discountAmount = mediumPrice * seniorDiscount;
        double finalPrice = mediumPrice - discountAmount;





        if (option == 1) {
            System.out.println("Price of sandwich is $" + mediumPrice);
        } else if (option == 2){
            System.out.println("Price of sandwich is $" + largePrice);

        } else {
            System.out.println("Invalid sandwich, Only two sizes.");
        }

        System.out.println("Your final total is $" + finalPrice);



        read.close();


    }
}
