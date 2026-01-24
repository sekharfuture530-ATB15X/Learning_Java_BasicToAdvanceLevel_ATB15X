package ex_Lab018_RunTimePolymorphism;

public class RunTimePolymorphism {

    void test(){
        System.out.println("This is Parent Perperty..");
    }

    class child extends RunTimePolymorphism{

        void test(){
            System.out.println("This is Child Perperty...");
        }
    }
}
