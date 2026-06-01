package MultiThreading;

public class Interrupted extends Thread {
    public void run(){

        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try {
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e) {
            System.out.println("Thread interrupted"+e);
        }
    }
    public static void main(String[] args) {
        Interrupted  interrupted = new Interrupted();
        interrupted.start();
        interrupted.interrupt();
       // interrupted.isInterrupted();


    }
}
