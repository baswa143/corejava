package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMethod {
    private final ReentrantLock lock = new ReentrantLock();
    public void outerMethod(){
        lock.lock();
       try {
           System.out.println("outer method");
           interMethod();
       }
       finally {
           lock.unlock();
       }

    }
    public void interMethod(){
        lock.lock();
        try {
           System.out.println("inter Method");
        }
        finally {
            lock.unlock();
        }
    }
    public static void main(String[] args) {
        ReentrantLockMethod reentrantLockMethod = new ReentrantLockMethod();
        reentrantLockMethod.outerMethod();

    }
}
