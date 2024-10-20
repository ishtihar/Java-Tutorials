package Oops;
//Bank Balance encapsulation example
class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>=0){
            this.balance = balance;
        }
        else {
            System.out.println("Balance can't negative");
        }
    }
}

public class Encapsulation_ex1 {
    public static void main(String[] args) {
        Bank bank=new Bank(5000);
        System.out.println("current balance "+ bank.getBalance());
           bank.setBalance(25000);
        System.out.println("Update balance "+ bank.getBalance());
        bank.setBalance(-3527);
        System.out.println(bank.getBalance());
           }
}
