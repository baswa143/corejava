package MultiThreading;

public class YieldProblem extends Thread {
  public void run(){

   for(int i=1;i<=5;i++){
       System.out.println(Thread.currentThread().getName()+" "+i);
   }
  }
    public static void main(String[] args) {
      YieldProblem obj = new YieldProblem();
      obj.start();
      Thread.yield();
      for(int i=1;i<=5;i++){
          System.out.println(Thread.currentThread().getName()+" "+i);
      }

    }
}
