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
    }
}

