package ex_Lab21_Abstraction;

public class BaseTest {

    void setup(){
        System.out.println("browser setup");
    }
}
class LoginTest extends BaseTest {
    void setup(){
        super.setup();
        System.out.println("Login setup");
    }
}

class MethodTest{
    public static void main(String[] args) {
        LoginTest lt = new LoginTest();

        lt.setup();
    }
}
