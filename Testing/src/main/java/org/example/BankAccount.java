package org.example;

public class BankAccount {
    private int balance;
    public BankAccount(int balance){
        this.balance=balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }

    public void withdraw(int amount){
        if(amount<=0){
            throw new IllegalArgumentException("Withdraw amount must " +
                    "be greater then zero");
        }
        if(amount>balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance-=amount;
    }
    public int getBalance(){
        return balance;
    }
}
