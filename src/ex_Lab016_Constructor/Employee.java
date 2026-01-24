package ex_Lab016_Constructor;

public class Employee {

    Employee() {
        this(1001);
        System.out.println("Default constructor");
    }

    Employee(int id) {
        this(id, "Tester");
        System.out.println("ID constructor");
    }

    Employee(int id, String role) {
        System.out.println("ID: " + id + ", Role: " + role);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
    }
}
