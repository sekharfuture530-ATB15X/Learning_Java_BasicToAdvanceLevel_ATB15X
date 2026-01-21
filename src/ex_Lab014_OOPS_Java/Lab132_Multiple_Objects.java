package ex_Lab014_OOPS_Java;

public class Lab132_Multiple_Objects {

    String name;
    int age;

    void show(){
        System.out.println(name+ " "+age);
    }

    public static void main(String[] args) {
        Lab132_Multiple_Objects obj = new Lab132_Multiple_Objects();// Object creation

        obj.name = "Sekhar";
        obj.age = 36;

        Lab132_Multiple_Objects object = new Lab132_Multiple_Objects();// Object creation
        object.name = "Veena";
        object.age = 28;

        object.show();
        obj.show();
    }
}
