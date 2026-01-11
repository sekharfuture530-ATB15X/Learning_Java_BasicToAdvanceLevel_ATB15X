package ex_Lab009_Functions_Or_Methods;

// Method with return type & With parameters
public class Lab068_UserFunctionsWR_WP {
    static int getSum(int a, int b){
        System.out.println("This is Method with return type & with parameters");
        return a+b;
    }
    public static void main(String[] args) {
        int x = getSum(10,900);
        System.out.println(x);
        getSum(10,90);
    }
}
