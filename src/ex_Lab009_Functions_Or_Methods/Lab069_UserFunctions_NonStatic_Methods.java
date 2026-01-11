package ex_Lab009_Functions_Or_Methods;
// Here we are not applying static methods
public class Lab069_UserFunctions_NonStatic_Methods {

    int getNumbers(int a, int b){
        System.out.println("This with int parameters");
        return a * b;
    }

    public static void main(String[] args) {
        Lab069_UserFunctions_NonStatic_Methods lab = new Lab069_UserFunctions_NonStatic_Methods();
        int result = lab.getNumbers(10,90);
        System.out.println(result);
    }
}
