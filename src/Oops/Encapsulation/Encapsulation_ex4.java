package Oops.Encapsulation;

class Bank1  {
    private double balance;


    public Bank1(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance>=0){
            this.balance = balance;

        }
        else {
            System.out.println("Balance can't negative");

        }

    }
}


public class Encapsulation_ex4 {
    public static void main(String[] args) {
        Bank1 bank1 = new Bank1(4000);
        System.out.println("Current balance" +" "+ bank1.getBalance());
        bank1.setBalance(10000);
        System.out.println("updated balance" + " " + bank1.getBalance());
        bank1.setBalance(-3322);
        System.out.println(bank1.getBalance());


    }}
