package Multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class FairnessLock {
    private final ReentrantLock fairlock =  new ReentrantLock(true);
    public void accessResources() {
        fairlock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+"acquired lock");
            Thread.sleep(50);
        }
        catch (InterruptedException e){
              Thread.currentThread().interrupt();
        }
        finally {
            System.out.println(Thread.currentThread().getName()+"released lock");
            fairlock.unlock();
        }
    }

}

class Main1 {
    public static void main(String[] args) {
        FairnessLock fairnessLock = new FairnessLock();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                fairnessLock.accessResources();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.start();
        t2.start();
        t3.start();

    }
}

