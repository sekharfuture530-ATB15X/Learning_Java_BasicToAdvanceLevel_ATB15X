package ex_Lab23_Collection_Framework;

import java.util.Vector;

public class Lab159_Vector {
    public static void main(String[] args) {

        Vector v = new Vector(); //Array

        v.add("Sekhar");
        v.add("Veena");
        v.add("Bishwajit");
        System.out.println(v);
        v.remove("Sekhar");
        System.out.println(v);
        System.out.println(v.contains("Veena"));
    }
}
