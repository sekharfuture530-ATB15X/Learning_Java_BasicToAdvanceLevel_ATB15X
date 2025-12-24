package ex_Lab004_Operators;

public class Lab035_Assignment {

    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int max1 = (n1 > n2)
                ? (n1>n3 ? n1 : n3)
                :(n2 > n3 ? n2 : n3);
        System.out.println(max1);
    }
}
