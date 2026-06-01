package Multithreading;


//The CPU often referred to as the brain of the computer is responsible
// for executing instructions from programs.It performs basic arithmetic ,
//logic, control, and input/output operations specified by the instructions.
// Example :- A  modern CPU like the Intel Core i7 orAMD Ryzen7

// CORE
// a

import javax.sound.midi.Soundbank;

public class Basic implements Runnable {

    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Basic());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
class Counter{
    int counter=0;
    void increment(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }

}


class MyThread extends Thread {
    private final Counter counter;
    public MyThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for(int i=0;i<1000;i++){
            synchronized (counter){  //block synchronized
            counter.increment();
        }
        }

    }


}
class Test{
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        MyThread t1=new MyThread(counter);
        MyThread t2=new MyThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCounter());

    }
}
