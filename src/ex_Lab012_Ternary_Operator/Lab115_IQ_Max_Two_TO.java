package ex_Lab012_Ternary_Operator;

public class Lab115_IQ_Max_Two_TO {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int max = a > b ? a:b;
        int min = a > b ? b:a;
        System.out.println(min);
        System.out.println(max);
    }
}
