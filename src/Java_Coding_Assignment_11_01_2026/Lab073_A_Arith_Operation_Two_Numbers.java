package Java_Coding_Assignment_11_01_2026;


import java.util.Scanner;

// 1) Arithmetic Operations on Two Numbers
//
//Description:
//Write a Java program that takes two integer numbers and prints their sum, difference, multiplication, division, and remainder.
public class Lab073_A_Arith_Operation_Two_Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numbers :");
        int results1 = scanner.nextInt();
        System.out.println("Enter b number :");
        int results = scanner.nextInt();

    }
        void sumNumbers(int a, int b){
            System.out.println(a+b);

        }
        void subNumbers(int a, int b){
            System.out.println(a-b);
        }

        void mulNumbers(int a, int b){
            System.out.println(a*b);
        }

        void divNumbers(int a, int b){
            System.out.println(a/b);
        }

          void modNumbers(int a, int b){
            System.out.println(a%b);
        }



    }

