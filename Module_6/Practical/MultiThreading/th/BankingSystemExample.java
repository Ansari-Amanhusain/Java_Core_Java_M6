package com.th;

class BankAccount
{
    private int balance = 0;

    public synchronized void deposit(int amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
        notify(); // Notify the waiting withdrawal thread
    }

    public synchronized void withdraw(int amount) 
    {
        while (balance < amount) 
        {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try {
                wait(); // Wait for sufficient balance
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + ", Current Balance: " + balance);
    }
}

public class BankingSystemExample 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount();

        
        Thread depositor = new Thread(() -> 
        {
            int[] deposits = {500, 300, 400};
            for (int amount : deposits)
            {
                account.deposit(amount);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

     
        Thread withdrawer = new Thread(() -> 
        {
            int[] withdrawals = {700, 500, 300};
            for (int amount : withdrawals) 
            {
                account.withdraw(amount);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        depositor.start();
        withdrawer.start();
    }
}

