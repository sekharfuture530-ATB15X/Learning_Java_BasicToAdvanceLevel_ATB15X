package ex_Lab006_Switch_Statments;

import java.util.Scanner;

public class Lab049_Stch_Automation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Browser name:");


        String browser = scanner.next();
         browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Started chrome browser");
                break;
            case "firefox":
                System.out.println("Started Firefox browser");
                break;
            case "edge":
                System.out.println("Stared Edge browser");
                break;
            default:
                System.out.println("Invalid browsers");
                break;
        }
    }
}
