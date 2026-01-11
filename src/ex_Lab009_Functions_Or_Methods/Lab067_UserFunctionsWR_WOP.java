package ex_Lab009_Functions_Or_Methods;

// Method with return type & without parameters

public class Lab067_UserFunctionsWR_WOP {
    static int greet(){
        System.out.println("This is Method with return type & without parameters");
        return 10;
    }
    public static void main(String[] args) {
        int x =greet();
        System.out.println(x);
//        greet(); // Method called
    }
}
