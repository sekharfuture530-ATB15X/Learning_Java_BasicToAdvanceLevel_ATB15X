package ex_Lab004_Operators;

public class Lab030_Ternary_Operator {

    public static void main(String[] args) {

//        Ternay Operator is short term is like (if_Else)

//        Syntax: condition: expression1 ? expression2;
//        if condition is true: first expression runs
//        if conditions is false : second expression runs

        int a = 10;
        int b = 20;

        int max = (a>b) ? a : b;
        System.out.println(max);

    }
}
