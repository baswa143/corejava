package FuncitonalInterface;
@FunctionalInterface
public interface Car {
    public void driver(); //function interface which has one abstract method
    // and unabstract method we can create multiple
    private void hook( ){

    }
    static  void run(){
    }
    default  void driver1(){
    }
    default void driver2(){
    }


}
