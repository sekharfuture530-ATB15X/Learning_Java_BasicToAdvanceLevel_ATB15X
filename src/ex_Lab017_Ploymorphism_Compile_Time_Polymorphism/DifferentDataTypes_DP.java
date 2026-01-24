package ex_Lab017_Ploymorphism_Compile_Time_Polymorphism;

public class DifferentDataTypes_DP {

    int add(int a, int b){
        System.out.println("This is int DataType");
        return a+b;
    }
    String add(String name,int age){
        System.out.println(name+ " "+age);
        return "sekhar";
    }
    double add(double a, double b){
        System.out.println(a+ " "+b);
        return 0;
    }

}
