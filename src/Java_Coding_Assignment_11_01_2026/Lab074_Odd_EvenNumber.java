package Java_Coding_Assignment_11_01_2026;

//2) Even or Odd Number
//
//Description:
//Write a Java program to check whether a given number is even or odd using arithmetic operators.

import java.util.Scanner;

public class Lab074_Odd_EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to check Odd or Even Number:");
        int result = scanner.nextInt();


        if(result%2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

}
