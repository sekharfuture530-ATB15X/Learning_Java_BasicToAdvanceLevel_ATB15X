package Java_Coding_Assignment_11_01_2026;


import java.util.Scanner;

// 1) Arithmetic Operations on Two Numbers
//
//Description:
//Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.
public class Lab073_A_Arith_Operation_Two_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        System.out.println("\nSum = " + (num1 + num2));
        System.out.println("Difference = " + (num1 - num2));
        System.out.println("Multiplication = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division = " + (num1 / num2));
            System.out.println("Remainder = " + (num1 % num2));
        } else {
            System.out.println("Division = Not possible (division by zero)");
            System.out.println("Remainder = Not possible (division by zero)");
        }

        sc.close();
    }

    }

