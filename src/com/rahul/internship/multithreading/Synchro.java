package com.rahul.internship.multithreading;

class Account {
    public int balance;
    public int accNo;
    void displayBal() {
        System.out.println("Account No.: "+accNo+"\nBalance: "+balance);
    }
    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println(amount+" deposited.");
        displayBal();
    }
    synchronized void withdraw(int amount) {
        balance = balance - amount;
        System.out.println(amount+" withdrawn.");
        displayBal();
    }
}

class TransactionDeposit implements Runnable {
    int amount;
    Account acc;
    TransactionDeposit(Account a, int amount) {
        acc = a;
        this.amount = amount;
        new Thread(this).start();
    }
    public void run() {
        acc.deposit(amount);
    }
}

class TransactionWithdraw implements Runnable {
    int amount;
    Account acc;
    TransactionWithdraw(Account a, int amount) {
        acc = a;
        this.amount = amount;
        new Thread(this).start();
    }
    public void run() {
        acc.withdraw(amount);
    }
}

public class Synchro {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.balance = 1000;
        ac.accNo = 123;
        TransactionDeposit t1;
        TransactionWithdraw t2;
        t1 = new TransactionDeposit(ac, 500);
        t2 = new TransactionWithdraw(ac, 900);
    }
}
