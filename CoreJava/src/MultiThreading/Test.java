package MultiThreading;

public class Test extends Thread{
   // @Override
//    public void run(){
//        System.out.println("thread task");
//        System.out.println(currentThread().getName());
//    }
    int i=10;
    int j=20;
    String name="baswa";

    public static void main(String[] args) {
        System.out.println("hello is printed by"+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        Test t = new Test();
        t.start();
        System.out.println("i+j");
        System.out.println(t.name+t.i+t.j);
    }
}
