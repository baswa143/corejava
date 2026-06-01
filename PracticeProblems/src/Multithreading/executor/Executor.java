package Multithreading.executor;

public interface Executor {
    void execute(Runnable command);
}
class Invoker implements Executor {
    public void execute(Runnable r){
        r.run();
    }
    public void execute(){
        Executor exe=new Invoker();
//        exe.execute(()->
//        {});
        exe.execute(new Runnable() {
            @Override
            public void run() {

            }
        });


    }



}

class Task implements Runnable{
    public static void main(String[] args) {
        Runnable r1 =new Task();
    }

    @Override
    public void run() {

    }
}
