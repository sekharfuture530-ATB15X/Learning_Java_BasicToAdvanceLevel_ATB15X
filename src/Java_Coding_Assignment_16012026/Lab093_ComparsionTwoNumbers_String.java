package Java_Coding_Assignment_16012026;

//1️⃣ Program Name: Count Characters in a String
//
//Description:
//Write a Java program to count the total number of characters in a given string (excluding spaces).

public class Lab093_ComparsionTwoNumbers_String {

    public static void main(String[] args){

        String name = "Java Programming Language";
//        String result = name.subSequence();
        int count = name.replace(" ", " ").length();
        System.out.println("Total number of characters in a given string excluding spaces.:" +count);
    }

}
