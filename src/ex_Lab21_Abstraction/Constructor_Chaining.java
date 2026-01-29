package ex_Lab21_Abstraction;

public class Constructor_Chaining {

    Constructor_Chaining(){
        this(10);
    }

    Constructor_Chaining(int a){
        System.out.println(a);
    }

}
