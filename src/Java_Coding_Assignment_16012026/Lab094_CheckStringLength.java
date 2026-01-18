package Java_Coding_Assignment_16012026;

// 2️⃣ Program Name: Check String Length
//
//Description:
//Write a Java program to check whether the length of a given string is greater than 10 or not and print the result.

public class Lab094_CheckStringLength {

    public static void main(String[] args) {

        String name = "Sekhar12345";

        if(name.length() > 10){
            System.out.println("The String Length is greater than 10");
        }else {
            System.out.println("The String length is NOT greater than 10");
        }
    }
}
