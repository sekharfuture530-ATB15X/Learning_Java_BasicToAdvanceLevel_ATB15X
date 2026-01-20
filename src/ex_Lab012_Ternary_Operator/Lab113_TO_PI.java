package ex_Lab012_Ternary_Operator;

import java.util.Scanner;

public class Lab113_TO_PI {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int result = scanner.nextInt();
//        int number =5;
        String status = result>0 ? "+ve":"-ve";
        System.out.println(status);
    }
}
