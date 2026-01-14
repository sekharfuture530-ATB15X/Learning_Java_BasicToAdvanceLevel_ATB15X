package Java_Coding_Assignment_11_01_2026;

//4) Maximum of Two Numbers
//
//Description:
//Write a Java program to find the maximum of two numbers using the ternary operator.

import java.util.Scanner;

public class Lab082_Max_TwoNumbers_TernayOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}
