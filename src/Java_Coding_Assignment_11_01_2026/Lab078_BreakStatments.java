package Java_Coding_Assignment_11_01_2026;

//12) Break Statement Example
//
//Description:
//Write a Java program to print numbers from 1 to 10, but stop the loop when the number becomes 5 using the break statement.

public class Lab078_BreakStatments {
    public static void main(String[] args) {


        for(int i = 1; i<=10; i++){
            if(i==5){
            break;
        }
            System.out.println(i);
    }
}
}
