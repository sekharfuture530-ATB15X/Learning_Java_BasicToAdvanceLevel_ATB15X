package Java_Coding_Assignment_11_01_2026;

// 8) Month Name Finder
//
//Description:
//Write a Java program to print the month name based on the month number (1–12) using a switch statement.

import java.util.Scanner;

public class Lab101_FindMonthName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month Name to Finder:");
        int monthName = scanner.nextInt();

        switch (monthName){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febuary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Auguest");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Month...");
                break;



        }
    }
}
