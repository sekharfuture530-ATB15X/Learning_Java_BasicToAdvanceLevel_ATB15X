package ex_Lab008_While_DoWhile;

import java.util.Random;
import java.util.Scanner;

public class Lab059_While_Guessing_Game {
    public static void main(String[] args) {

//        guess number from 1 to 100
//        n = 56
//        90, number<, 50, number>, 55, - 56 ,- times = 9

        Random random = new Random();
        int numbermyGuess = random.nextInt(100);
        System.out.println(numbermyGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attemps = 0;

        while(true){

            if(!scanner.hasNextInt()){
                System.out.println("Invalid input! Please Enter integer numbers only!");
                scanner.close();
                continue;
            }

            guess = scanner.nextInt();
            attemps++;
            if(guess < numbermyGuess) {
                System.out.println("Too low, Try again");
            } else if (guess> numbermyGuess) {
                System.out.println("Too High, Try again");

            }else {
                System.out.println("Correct! you have token"+attemps);
                break;
                
            }
        }
        }

        
    }

