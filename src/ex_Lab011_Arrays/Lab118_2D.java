package ex_Lab011_Arrays;

public class Lab118_2D {
    public static void main(String[] args) {

        String[] names = new String[5];
        names[1]= "Sekhar";
        names[2] = "Veena";
        names[3] = "Bishwajit";
        names[4] = "Greeshma";

        System.out.println(names[1]);

        System.out.println("===================");
        for (String name:names){
            System.out.println(name);
        }
    }
}
