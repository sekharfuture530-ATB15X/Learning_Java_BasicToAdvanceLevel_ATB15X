package ex_Lab011_Arrays;

public class Lab122_SumOfArrays {

    public static void main(String[] args) {

        int[] numbers = {2,3,4,5,6,7,8,9};
        int sum = 0;

        for(int i = 0; i<numbers.length; i++){

            sum = sum+numbers[i];


        }
        System.out.println(sum);
    }
}
