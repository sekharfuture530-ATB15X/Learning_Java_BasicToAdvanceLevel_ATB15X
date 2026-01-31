package ex_Lab22_Static;

public class Lab152_Static_Variable {

    public static void main(String[] args) {
        Employee emp = new Employee("Sekhar");
        emp.display();
        System.out.println(Employee.companyName);

    }
//    Employee emp = new Employee("Google");

}

class Employee {
    static String companyName = "Google";
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void display(){
        System.out.println(companyName+ " "+ name);
    }
}