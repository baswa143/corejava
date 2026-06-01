package Multithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample1 {
    Lock l=new ReentrantLock(true);
    public void display(LockExample1 d){
        l.lock();
        System.out.println("Hi 1");
        System.out.println("Hi 2");
        System.out.println("Hi 3");
        System.out.println("Hi 4");
        l.unlock();
    }

    public static void main(String[] args) {
        LockExample1 d=new LockExample1();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                d.display(d);
            }
        });
        Thread t2 = new Thread(()->d.display(d));
        Thread t3 = new Thread(()->d.display(d));
        Thread t4 = new Thread(()->d.display(d));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
