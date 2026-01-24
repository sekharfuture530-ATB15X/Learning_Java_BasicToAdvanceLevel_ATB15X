package ex_Lab015_Constructor;

public class Constructor {

    Constructor(){
        System.out.println("Default Constructor.....");
    }
    Constructor(int a, int b){
        System.out.println("Parameterized Constructor with same datatype"+(a+b));
    }
    Constructor(String name, int age){
        System.out.println("Parameterized Constructor with different datatype"+name+ " "+age);
    }
}
