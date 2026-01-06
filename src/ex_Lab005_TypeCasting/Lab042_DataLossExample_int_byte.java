package ex_Lab005_TypeCasting;

public class Lab042_DataLossExample_int_byte {

    public static void main(String[] args) {

        /*
        Interview Explanation:
Byte range = -128 to 127 → overflow occurs.
         */
        int value = 130;
        byte b= (byte)value;

        System.out.println(value);
        System.out.println(b);
    }
}
