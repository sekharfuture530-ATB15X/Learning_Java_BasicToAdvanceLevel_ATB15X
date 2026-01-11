package ex_Lab009_Functions_Or_Methods;

public class Lab071_Calculator {

    int sum(int a, int b){
        System.out.println("Sum of two numbers");
        return a+b;
    }
    int mul(int x, int y){
        System.out.println("mul of two numbers");
        return x*y;
    }
    int sub(int p, int q){
        System.out.println("sub of two numbers");
        return p-q;
    }
    int div(int a, int z){
        System.out.println("div of two numbers");
        return a/z;
    }
    int module(int a, int z){
        System.out.println("module of two numbers");
        return a%z;
    }
    public static void main(String[] args) {

        Lab071_Calculator calculator = new Lab071_Calculator();
        System.out.println(calculator.sum(10,20));
        System.out.println(calculator.sub(10,20));
        System.out.println(calculator.mul(10,20));
        System.out.println(calculator.div(10,20));
        System.out.println(calculator.module(10,20));


    }
}
