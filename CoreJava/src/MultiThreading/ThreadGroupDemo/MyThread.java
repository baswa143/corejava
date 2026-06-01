package MultiThreading.ThreadGroupDemo;

public class MyThread extends Thread{
     MyThread(ThreadGroup g,String name)
    {
        super(g,name);
    }
    public  void run()
    {
        try {
            System.out.println("Child Thread");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ThreadGroupDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        ThreadGroup pg=new ThreadGroup("Parent Group");
        ThreadGroup cg =new ThreadGroup(pg,"Child Group");
        MyThread t1=new MyThread(pg,"First Thread");
        MyThread t2=new MyThread(pg,"Second Thread");
        t1.start();
        t2.start();
        System.out.println(pg.activeCount());
        System.out.println(cg.activeGroupCount());
        pg.list();
        Thread.sleep(10000);
        System.out.println(pg.activeCount());
        System.out.println(cg.activeGroupCount());
        pg.list();
    }
}