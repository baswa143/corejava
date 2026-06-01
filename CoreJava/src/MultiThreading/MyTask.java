package MultiThreading;

public class MyTask implements Runnable {
    public void run() {
        for(int j=0;j<10;j++){
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        MyTask task=new MyTask();
        Thread thread=new Thread(task);
        thread.start();
    }

}
