package ex_Lab011_Arrays;

public class Lab117_2D {

    public static void main(String[] args) {

        int a = 10;

        int[] marks = {56,89,98,78,87,96};
        int[] marks1 = {89,58,78,86,98,78};

        boolean[] bool_Value = {true,false,true};
        String[] names = {"Sekhar","Veena","Bishwajit","Greeshma"};

        float[] values = new float[5];
        values[0] = 3.14f;
        values[1] = 3.587f;
        values[2] = 3.256f;
        values[3] = 3.58f;

        for(int mark:marks){
            System.out.print(mark+ " ");
        }
    }
}
