package Multithreading.Deadlock;

public class Pen {
    public synchronized void writewithPenAndPaper(int paper){
        System.out.println(Thread.currentThread().getName()+" using a pen"+this+"and trying to write");
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" using a pen"+this+"and trying to write");
    }

}
