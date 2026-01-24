package ex_Lab017_Ploymorphism_Compile_Time_Polymorphism;

public class compileTimePolymorphism {

    int add(){
        System.out.println("This is DF");
        return 0;
    }

    int add(int a, int b){
        System.out.println("This parameters"+(a+b));
        return a+b;
    }
    int add(int a, int b, int c){
        System.out.println("This is three parameters"+(a+b+c));
        return a+b+c;
    }
}
