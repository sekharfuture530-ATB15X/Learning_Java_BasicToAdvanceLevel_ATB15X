package ex_Lab016_Constructor;

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
}

public class Lab139_Constructor_Parant {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}