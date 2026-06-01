package Multithreading.Deadlock;

public class Thread1 extends Thread {
   Object obj1=null;
   Object obj2=null;
   Thread1 (Object obj1,Object obj2){
       this.obj1=obj1;
       this.obj2=obj2;
   }
   public void run(){
       System.out.println("Thread1 about to acquired the Lock on object 1");
       synchronized(obj1){
           System.out.println("Thread1 acquired the Lock on object 1");
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("Thread1 about to acquired the Lock on object 1");
           synchronized (obj2){
               System.out.println("Thread2 acquired the Lock on object 2");
           }
           System.out.println("Thread1 released the Lock on object 2");
       }
       System.out.println("Thread1 released the Lock on object 1");
   }
}
