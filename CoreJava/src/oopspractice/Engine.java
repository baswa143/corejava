package oopspractice;

public interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Petrol Engine");
    }
}
class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Electric Engine");
    }
}

class Car1 {
    private Engine engine;
    public Car1(Engine engine) {
        this.engine = engine;
    }
    void drive(){
        engine.start();
    }

    public static void main(String[] args) {
        ElectricEngine e = new ElectricEngine();
        Car1 c = new Car1(e);
        c.drive();
    }



}

class Car2 {
    void drive(){

    }

    public static void main(String[] args) {
        PetrolEngine petrolEngine = new PetrolEngine();
        Car1 c = new Car1(petrolEngine);
        c.drive();
    }

}
