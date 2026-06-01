package MultiThreading.demonthread;

import java.util.function.Consumer;

public class DemonThread  {

    public static void main(String[] args) throws InterruptedException  {
        System.out.println(Thread.currentThread().isDaemon());
        Test test = new Test();
        test.setDaemon(true);
        test.start();
        test.join();
    }
}

class Test extends Thread{
    public void run(){
        System.out.println("Starting test thread.....");
        MyThread mt=new MyThread();
        mt.start();
        System.out.println("Test thread....");
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread is demon:"+Thread.currentThread().isDaemon());
    }
}

class Practice{
    public static void main(String[] args){
        Consumer<Integer> con= interger->System.out.println();
    }
}
