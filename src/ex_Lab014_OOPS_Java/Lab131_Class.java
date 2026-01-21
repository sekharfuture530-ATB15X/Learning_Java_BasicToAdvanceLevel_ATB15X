package ex_Lab014_OOPS_Java;

public class Lab131_Class {

    String name;
    int id;

    void display(){
        System.out.println(name+ " "+id);
    }

    public static void main(String[] args) {

        Lab131_Class obj = new Lab131_Class();
        obj.id = 101;
        obj.name = "Sekhar";
        obj.display();
    }
}
