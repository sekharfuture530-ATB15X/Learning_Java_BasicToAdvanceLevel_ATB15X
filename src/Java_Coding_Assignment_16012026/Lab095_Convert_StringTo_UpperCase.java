package Java_Coding_Assignment_16012026;

// ️⃣ Program Name: Convert String to Uppercase
//
//Description:
//Write a Java program to convert a given string into uppercase and print the result.

import java.util.Scanner;

public class Lab095_Convert_StringTo_UpperCase {

    public static void main(String[] args) {

//        String name_uppercase = "sekharVeena";
//
//        System.out.println("Convert to given string into uppercase: " +name_uppercase.toUpperCase());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lowerCase String");
        String result = scanner.next();

        System.out.println("Uppercase String:"+result.toUpperCase());
    }
}
