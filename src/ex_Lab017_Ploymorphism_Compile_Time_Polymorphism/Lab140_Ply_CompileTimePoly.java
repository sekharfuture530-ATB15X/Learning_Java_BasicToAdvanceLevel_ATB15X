package ex_Lab017_Ploymorphism_Compile_Time_Polymorphism;

public class Lab140_Ply_CompileTimePoly {

    public static void main(String[] args) {
        compileTimePolymorphism com = new compileTimePolymorphism();

        System.out.println(com.add());
        System.out.println(com.add(10,20));
        com.add(10,20,30);
    }
}
