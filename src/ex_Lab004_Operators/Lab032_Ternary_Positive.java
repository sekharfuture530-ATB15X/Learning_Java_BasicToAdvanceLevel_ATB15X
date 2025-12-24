package ex_Lab004_Operators;

public class Lab032_Ternary_Positive {

    public static void main(String[] args) {

        int num = 5;

        String status = (num > 0) ? "Positive" : (num < 0) ? "Negetive": "Zero";

        System.out.println(status);
    }
}
