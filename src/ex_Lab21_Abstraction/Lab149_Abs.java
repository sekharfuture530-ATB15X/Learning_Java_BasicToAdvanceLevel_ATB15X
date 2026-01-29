package ex_Lab21_Abstraction;

public class Lab149_Abs {
    public static void main(String[] args) {

        Payment p = new GooglePay();
        p.pay();
        p.receipt();

        System.out.println("========================");

        Payment p1 = new CreditCard();
        p1.receipt();
        p1.pay();
    }
}
