package ex_Lab004_Operators;

public class Lab026_Unary_Operator {

    public static void main(String[] args) {

//        Unary operators work on a single operand (one variable/value).

        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        boolean flag = true;
        System.out.println(!flag);
        System.out.println(~a);
//        System.out.println(++a);
//        System.out.println(a+); // java: illegal start of expression
//        System.out.println(+a);
//        System.out.println(a++);
//        System.out.println(-a);
//        Pre_Increment
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
//        Post-Increment
        System.out.println("-----Post-Increment---------------");
        System.out.println(b++);
        System.out.println(b);

        System.out.println("----------Pre-Decrement-------------");

        System.out.println(c);
        System.out.println(--c);
        System.out.println(c);

        System.out.println("---------Post-Decrement--------------");

        System.out.println(d);
        System.out.println(d--);
        System.out.println(d);

        System.out.println("****************");



    }
}
