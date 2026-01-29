package ex_Lab21_Abstraction;

public class Browser {

    String name ="Chrome";
}

class TestBrowser extends Browser {
    String name ="Firefox";

    void print(){
        System.out.println(super.name);
    }
}

class Test {
    public static void main(String[] args) {
        TestBrowser t = new TestBrowser();
        t.print();
    }
}
