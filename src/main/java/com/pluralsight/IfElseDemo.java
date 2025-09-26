package com.pluralsight;

import java.util.Objects;
import java.util.Scanner;

public class IfElseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult yet.");
        }

        // STEP 3

        System.out.println("Enter your grade (A-F):");
        String grade = scanner.next();

        if (grade.equals("A")) {
            System.out.println("Excellent!");
        } else if (grade.equals(("B"))) {
            System.out.println("Good job!");
        } else if (grade.equals("C")) {
            System.out.println("You passed.");
        } else if (grade.equals("D")) {
            System.out.println("Barely passed.");
        } else if (grade.equals("F")) {
            System.out.println("Failed.");
        }



        // Example: Compare strings using == and .equals()
        String word1 = "hello";
        String word2 = new String("hello");


        System.out.println(word1 == word2);

        System.out.println(word1.equals((word2)));

        // Observe the difference. Which one is correct for comparing string content?
        // o_O


        // Ask for username
        System.out.print("Enter username: ");
        String username = scanner.next();

        // Ask for password
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (username.equals("Admin") && password.equals("1234")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }




}

