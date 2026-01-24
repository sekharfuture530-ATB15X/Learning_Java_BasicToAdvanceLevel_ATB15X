package ex_Lab018_RunTimePolymorphism;

public class Lab145_MethodOverriding {
    public static void main(String[] args) {

        Child s = new Child();
        s.home();

        System.out.println("==========================");
        father f = new father();
        f.home();

        System.out.println("==========================");

        father f1 = new Child(); // Dynamic Dispatch
        f1.home();


    }
}

class father {

    void home() {
        System.out.println("2BHK");
    }
}
class Child extends father{


        void home(){
            System.out.println("3BHK");
        }
    }

