package ex_Lab006_Switch_Statments;

import java.util.Scanner;

public class Lab044_Switch_Statments {
    public static void main(String[] args) {

        Scanner screen = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7 days");

        int days = screen.nextInt();
        switch (days){
            case 1:
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");

            default:
                System.out.println("Invalid Number");

        }
    }
}
