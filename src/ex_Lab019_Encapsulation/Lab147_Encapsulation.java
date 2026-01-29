package ex_Lab019_Encapsulation;

public class Lab147_Encapsulation {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

       ba.deposit(10000);
        System.out.println(ba.getBalance());

    }
}

class BankAccount{

    private double balance;// hidden data


    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){

        if(amount>0){
            balance +=amount;
        }

    }

}
