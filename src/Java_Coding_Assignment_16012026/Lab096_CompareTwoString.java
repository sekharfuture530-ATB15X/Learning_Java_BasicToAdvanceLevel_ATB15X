package Java_Coding_Assignment_16012026;

// ️⃣ Program Name: Compare Two Strings
//
//Description:
//Write a Java program to compare two strings and check whether they are equal or not.

public class Lab096_CompareTwoString {

    public static void main(String[] args) {

        String s = "Java";
        String s1 = "Java";

//        System.out.println((s==s1));
        if(s.equals(s1)){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are NOT equal.");
        }
    }
}
