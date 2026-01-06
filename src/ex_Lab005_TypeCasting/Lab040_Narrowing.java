package ex_Lab005_TypeCasting;

public class Lab040_Narrowing {
/*
Narrowing Casting (Explicit / Manual)

📌 You must explicitly specify the target type.
 */
    public static void main(String[] args) {

        long l = 256;
        int value = (int) l; // this explicitly we are doing


        System.out.println(l);
        System.out.println(value);
    }
}
