package MultiThreading;

public class Demo{
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println(Thread.currentThread().getName());
            }

            public static void main(String[] args) {
                System.out.println(Thread.currentThread().getName());
                Thread t2 = new Thread();
                t2.start();
            }

        };

    }


}
 class Demo1{

 }