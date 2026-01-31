package ex_Lab23_Collection_Framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab162_ArrayList_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String continueInput = "Y";
        ArrayList<String> names = new ArrayList<String>();
        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the Name");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("Do you want to enter another name Y/N");
            continueInput = scanner.nextLine();
        }

        System.out.println("==================================");

        for (String name: names){
            System.out.println(name);
        }
    }
}
