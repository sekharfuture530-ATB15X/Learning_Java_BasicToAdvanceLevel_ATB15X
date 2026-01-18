package ex_Lab011_Arrays;

import java.util.Scanner;

public class Lab098_Arrays {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Array numbers & Will Find Largest_Number and Second Largest Number");
//        int numbers1 = scanner.nextInt();
        int largest = 0;
        int secondLargest = 0;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
        }
    }

