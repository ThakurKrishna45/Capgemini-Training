package Syncronisation;

public class BankAccount {
    int balance=1000;
    public synchronized void withdraw(int amount) throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" entered withdraw() and acquired Lock on BankAccount");
        if(balance<amount){
            System.out.println("Insufficient balance...");
            System.out.println(Thread.currentThread().getName()+" is going to WAIT");
            wait();
            System.out.println(Thread.currentThread().getName()+" got NOTIFIED and reacquired LOCK");
        }
        balance=balance-amount;
        System.out.println(Thread.currentThread().getName()+" completed withdraw");
        System.out.println("Remaining balance = "+ balance);
    }
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName()+" entered deposit()");
        System.out.println(Thread.currentThread().getName()+" acquired LOCK on BankAccount");

        balance=balance+amount;
        System.out.println(Thread.currentThread().getName()+ " deposited amount");
        System.out.println("Updated Balance = "+ balance);
        notify();
        System.out.println(Thread.currentThread().getName()+" sent NOTIFY singal");
        System.out.println(Thread.currentThread().getName()+ " releasing LOCK");
    }
}
