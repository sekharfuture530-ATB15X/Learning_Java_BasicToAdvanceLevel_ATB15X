package ex_Lab011_Arrays;

public class Lab119_Arrays {

    public static void main(String[] args) {

        int[] a = {45,50,89,87,89,52};

        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
        System.out.println(a[0]);

        System.out.println(a.length);

        System.out.println("=================");

        for(int num:a){
            System.out.println(num);
        }

        System.out.println("===================");

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
