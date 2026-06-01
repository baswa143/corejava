package MultiThreading;

public class TestMultiThreading {
    public static void main(String[] args) {
        Emp t1=new Emp("t1");
        Thread t2= new Thread(t1);
        t1.start();
        t2.start();
        System.out.println(Thread.activeCount());
        //-----------------------------------------------------//
        Manager m1=new Manager("t2");
        Thread t3= new Thread(m1);
        t3.start();
        m1.start();
        System.out.println(Thread.activeCount());
        //-----------------------------------------------------//
        System.out.println();
        Employee e1=new Employee(){
            public void run(){
                System.out.println("Good bye"+">>>>"+Thread.currentThread().getName());
            }
        };
        e1.run();
       Runnable r1=()-> {
           System.out.println("Good Morning"+">>>>"+Thread.currentThread().getName());
       };
        r1.run();
        //------------------------------------------------------------------------------//
       Runnable  b1=()->{
         //  System.out.println("Good Evening"+">>>>"+Thread.currentThread().getName());

       };
       Bike b=new Bike();
        System.out.println( b.tvs());
    }
}


class Emp extends Thread{
    public Emp(String tname) {
        super(tname);
        //System.out.println("Emp Constructor");
    }
    @Override
    public void run() {
        System.out.println("Hello"+Thread.currentThread().getName());
    }
}

class Manager extends Thread{
    public Manager(String tname ) {
        super(tname);
    }
    @Override
    public void run() {
        System.out.println("Hii");
    }
}

class Employee implements Runnable{
    public void  run() {
        System.out.println("Hello"+Thread.currentThread().getName());
    }

}

class Bike implements Runnable{
    public void run() {
        System.out.println("bike"+Thread.currentThread().getName());
    }
    public double tvs(){
        return 30;

    }
}
