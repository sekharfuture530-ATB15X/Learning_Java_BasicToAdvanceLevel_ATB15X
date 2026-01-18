package Java_Coding_Assignment_16012026;
// 5️⃣ Program Name: Reverse a String
//
//Description:
//Write a Java program to reverse a given string using a loop.

import java.util.Scanner;

public class Lab097_Reverse_String {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String name = scanner.next();
//        String name = "Sekhar";
        String reverse_string = "";

        for(int i=name.length()-1; i>=0; i--){
            reverse_string = reverse_string+name.charAt(i);
        }
        System.out.println(reverse_string);
    }
}
