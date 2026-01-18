package Java_Coding_Assignment_11_01_2026;

// 5) Positive, Negative or Zero
//
//Description:
//Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.

public class Lab099_P_N_Z_Numbers {
    public static void main(String[] args) {

        int number = 5;

        String result = (number > 0) ? "Positive"
                     :(number < 0) ? "Negitive"
                     : "zero";
        System.out.println("Number is :" +result);
    }
}
