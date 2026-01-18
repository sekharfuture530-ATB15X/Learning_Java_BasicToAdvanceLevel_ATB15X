package Java_Coding_Assignment_11_01_2026;

// 6) Day of the Week
//
//Description:
//Write a Java program to print the name of the day based on a number (1–7) using a switch statement.

import java.util.Scanner;

public class Lab100_DayOf_Week {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter week days number:");
        int week = scanner.nextInt();
//        int week = 5;

        switch (week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thuesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
