package MultiThreading;

public class Brick implements Runnable  {
    public static void main(String[] args) throws InterruptedException {
        BrickDiary bd=new BrickDiary();
        Runnable r1 =()->{
            for(int i=0;i<10000;i+=+50){
                bd.incrementbrickcount();

            }
            Runnable r4=()-> {


            };
        };
        Runnable r2 =()->{
            for(int i=0;i<10000;i+=+50){
                bd.incrementbrickcount();

            }

        };
        Runnable r3 =()->{
            for (int i=0;i<10000;i+=+50){
                bd.incrementbrickcount();

            }
        };
        Thread t6=new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);
        Thread t4=new Thread(()-> {
            for (int i=0;i<1000;i++){
                bd.incrementbrickcount();
            }


        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t6.start();
//In Java, a race condition occurs when two or more threads
// access shared data and try to change it at the same time.
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(bd.brickcount);
        System.out.println(bd.brickcount2);
        Brick b=new Brick();
        Thread t5=new Thread(b);
        t5.start();


    }


    @Override
    public void run() {
        for(int j=0;j<10;j++){
            System.out.println(j);

        }
    }
}


class BrickDiary {
    volatile int brickcount=0;
    volatile int brickcount2=0;
    public synchronized void incrementbrickcount(){
        brickcount+=50;
     //   synchronized (this){
            brickcount2+=50;
        //}
    }
}
