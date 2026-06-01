package MultiThreading;

public class Demo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("child thread");
    }
}
class Result{
    public static void main(String[] args) {
        Runnable r=()->{
            for(int i=0;i<=10;i++)
            {
                System.out.println("child Thread");
            }
        };
        Thread t=new Thread(r);
        t.start();
        for (int i=0;i<=10;i++){
            System.out.println("main Thread");
        }

    }
}

