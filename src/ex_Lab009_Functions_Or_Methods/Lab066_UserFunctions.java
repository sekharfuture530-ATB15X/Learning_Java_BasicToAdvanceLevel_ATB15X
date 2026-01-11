package ex_Lab009_Functions_Or_Methods;

// Methods Without Return Type & With Parameters
public class Lab066_UserFunctions {
    static void greet(int a, int b){
        System.out.println("This is Method without return type & with parameters");
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        greet(10,20);
    }
}
