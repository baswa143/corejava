package Multithreading;

import java.util.concurrent.Callable;

public class BankAccount {
    int balance =100;
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()+"attempting withdraw"+amount);
        if (balance>=amount) {
            System.out.println(Thread.currentThread().getName()+"Processing the withdraw");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+"complete withdraw - balance amount"+balance);
        }
        else {
            System.out.println("Insufficient balance");
        }

    }
}

class Main{
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
//        sbi.withdraw(50);

        Runnable task = ()-> sbi.withdraw(50);



        Thread thread1 = new Thread(task);
        thread1.start();



    }
}
