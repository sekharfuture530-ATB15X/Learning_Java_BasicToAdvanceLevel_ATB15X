package ex_Lab017_Ploymorphism_Compile_Time_Polymorphism;

public class Lab141_CompileTimePoly_DiffDataTypes {

    public static void main(String[] args) {

        DifferentDataTypes_DP dp = new DifferentDataTypes_DP();

        System.out.println(dp.add(10,20));
        System.out.println(dp.add(10.0,20.5));
        System.out.println(dp.add("Sekhar",35));
    }
}
