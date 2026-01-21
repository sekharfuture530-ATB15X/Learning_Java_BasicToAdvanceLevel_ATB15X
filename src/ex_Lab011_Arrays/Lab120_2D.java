package ex_Lab011_Arrays;

import java.util.Scanner;

public class Lab120_2D {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the Array Numbers:");
        int size = scanner.nextInt();

        int[] numbers_marks = new int[size];


        for(int i =0; i<numbers_marks.length; i++){
            System.out.println("Enter the marks!");
            numbers_marks[i] = scanner.nextInt();
        }

        System.out.println("===============");

        for(int i = 0; i< numbers_marks.length; i++){
            System.out.println(numbers_marks[i]);
        }

        System.out.println("==============");

        for(int a:numbers_marks){
            System.out.println(a);
        }
    }
}
