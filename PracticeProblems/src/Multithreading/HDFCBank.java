package Multithreading;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class HDFCBank {
    double amount=0;
//    public ReadWriteLock(double amount) {
//        this.amount = amount;
//    }
    ReentrantReadWriteLock l=new ReentrantReadWriteLock();
    public void deposite(double amount){
        l.writeLock().lock();
        amount=amount++;
        l.writeLock().unlock();
    }
    public void withdraw(int withdrawamount){
        l.writeLock().lock();
        amount-=withdrawamount;
        l.writeLock().unlock();
    }
    public void balanceInquiryFromUPI(){
        l.readLock().lock();
        System.out.println("Balance from UPI is "+amount);
        l.readLock().unlock();
    }
    public void balanceInquiryFromNetBanking(){
        l.readLock().lock();
        System.out.println("Balance from NetBanking is "+amount);
        l.readLock().unlock();
    }
    public void balanceInquiryFromMobileBanking(){
        l.readLock().lock();
        System.out.println("Balance from MobileBanking is "+amount);
        l.readLock().unlock();
    }

    public static void main(String[] args) {
        HDFCBank readWriteLock = new HDFCBank();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                readWriteLock.deposite(1000);
            }
        });
        Thread t2 = new Thread(()->readWriteLock.withdraw(100));
        Thread t3 = new Thread(()->readWriteLock.balanceInquiryFromUPI());
        Thread t4 = new Thread(()->readWriteLock.balanceInquiryFromMobileBanking());
        Thread t5 = new Thread(()->readWriteLock.balanceInquiryFromNetBanking());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }


}
