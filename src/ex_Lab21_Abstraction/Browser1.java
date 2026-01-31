package ex_Lab21_Abstraction;

interface Browser1 {
    void open();
}

abstract class BaseTest1 {
    protected String url ="https://test.com";

    abstract void executeTest();

    void report(){
        System.out.println("Test Completed");
    }
}

class ChromeTest extends BaseTest1 implements Browser1 {
    public void open(){
        System.out.println("Chrome Opened");
    }


    void executeTest() {
        open();
        System.out.println("Execute Test on"+url);
        report();
    }
}

class Main{
    public static void main(String[] args) {
        ChromeTest ct = new ChromeTest();
//        ct.open();
        ct.executeTest();
//        ct.report();

    }
}