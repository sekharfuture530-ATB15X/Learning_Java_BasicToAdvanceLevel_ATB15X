package ex_Lab006_Switch_Statments;

import java.util.Scanner;

public class Lab046_Switch_Mutiple_Break {

    public static void main(String[] args) {

        Scanner screen = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7 days");


        int days = screen.nextInt();
        switch (days) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;

            default:
                System.out.println("Invalid Number");
                break;
        }
    }
}
