package ex_Lab_Part2_OOPs;

public class TestCase extends CommonToAllTest {

    void run1(){
        start();
        System.out.println("Running Tc1");
        close();
        readExcel();
        System.out.println("This Reading and Writing TC2");
        writeExcel();
    }


}
