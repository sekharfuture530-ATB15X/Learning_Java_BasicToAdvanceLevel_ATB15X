package ex_Lab21_Abstraction;

public class Base {

    Base(){
        System.out.println("Base Constructor");
    }
}

class Child extends Base{
    Child(){
        super();
        System.out.println("Child Constructor");
    }
}

class ConstructorParent{
    public static void main(String[] args) {
        Child c = new Child();
    }
}
