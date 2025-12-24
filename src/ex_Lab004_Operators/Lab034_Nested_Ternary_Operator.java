package ex_Lab004_Operators;

public class Lab034_Nested_Ternary_Operator {

    public static void main(String[] args) {

//        Nested Ternay operator means one ternay operator inside another one

/*        syntax: condition1 ?:
        (condition2 ? value1 : value2)
                : value3; */

        int n = 10;

        String status = (n>0) ? "Positive":
                (n<0) ? "Negitive":
                        "zero";
        System.out.println(status);
    }
}
