package ex_Lab017_Ploymorphism_Compile_Time_Polymorphism;

public class Lab144_MethodOverLoading01 {

    public static void main(String[] args) {

        MathOperation m = new MathOperation();
       int r = m.add(10,20);
        double r1 = m.add(10.0,50.5);
       String r2 =  m.add("Sekhar","Veena");
        int r3 = m.add(10,20,30);

        System.out.println(r+" "+r1+" "+r2+" "+r3);
    }
}

class  MathOperation{

    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a , double b){
        return a+b;
    }
    String add(String a, String b){
        return a+b;
    }
        }
