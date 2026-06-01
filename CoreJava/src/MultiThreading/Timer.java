package MultiThreading;

public class Timer extends Thread {
    public void run(){
        try
        {
            int time=0;
            for(int i=1;i<=60;i++){
                for(int j=1;j<=60;j++){
                    Thread.sleep(10);
                    System.out.println("this run has milli sec"+j);
                }
                System.out.println("min"+i);
                time++;
            }
            System.out.println("min"+time);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args)throws InterruptedException {
        Timer time=new Timer();
        time.start();


    }
}
