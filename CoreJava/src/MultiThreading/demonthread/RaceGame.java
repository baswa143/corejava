package MultiThreading.demonthread;

public class RaceGame {
    public static void main(String[] args) {
        System.out.println("READY... SET... GO!\n");

        Car car1 = new Car("Tesla");
        Car car2 = new Car("Ferrari");
        Car car3 = new Car("Bugatti");

        car1.start();
        car2.start();
        car3.start();
    }
}