package ex_Lab21_Abstraction;

abstract class Payment {
    abstract void pay(); // abstract method

    void receipt(){
        System.out.println("Payment receipt generated..");
    }
}

class GooglePay extends Payment {
    void pay(){
        System.out.println("Paid using Google Pay");
    }
}
class CreditCard extends Payment {
    void pay(){
        System.out.println("Paid using CreditCard");
    }
}
