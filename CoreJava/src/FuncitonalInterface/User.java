package FuncitonalInterface;

public class User {
    public static void main(String[] args) {
        Car c = new Car() {
            @Override
            public void driver() {
                System.out.println("Audi driver..");
            }
        };
        c.driver();
    }
}
