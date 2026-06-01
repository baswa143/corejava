package MultiThreading.demonthread;

public class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("child Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

class Test2{
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().isDaemon());
        MyThread1 t1 = new MyThread1();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main Thread");
    }
}