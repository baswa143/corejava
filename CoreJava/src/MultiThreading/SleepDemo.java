package MultiThreading;

public class SleepDemo {
    public static void main(String[] args) {
        try
        {
            for(int i=1;i<10;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        t1.start();

    }
}
