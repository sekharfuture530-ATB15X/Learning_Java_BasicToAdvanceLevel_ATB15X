package ex_Lab002_Variables_DataTypes;

public class Lab009_Variables {
    int a = 10; // Instance Variable-Inside the class but outside the method
    static int b = 62; // Static Variable-Variable are declared has Static Variable and it cannot be local variable

    public void test_local(){
        int c = 200; // Local variable-inside the method
    }
    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
