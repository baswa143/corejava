package MultiThreading;

public class TotalEarnings extends  Thread{
    int total=0;
  public void run(){
      synchronized (this) {

          for (int i = 1; i <= 10; i++) {
              total += 100;
          }
         this.notify();
      }
  }
}


class MovieBoking{
    public static void main(String[] args) throws InterruptedException {
        TotalEarnings te = new TotalEarnings();
        te.start();
       //  System.out.println("Total earning "+te.total +" Rs");
        synchronized (te){
            te.wait();
            System.out.println("Total earning "+te.total +" Rs");
        }
    }
}
