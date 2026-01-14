package Java_Coding_Assignment_11_01_2026;

//10) Print Even Numbers
//
//Description:
//Write a Java program to print all even numbers between 1 and 50 using a do-while loop.

import java.util.Scanner;

public class Lab076_Do_WhileUsing_PrintEven_Odd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int result = scanner.nextInt();

        int i = 2;
        do{
            System.out.println(i);
            i =i+2;
        }while (i<=50);
    }
}
