package oopspractice;

public class Vehicle {
    int max_speed=200;
    public static void drive(){
        System.out.println("vehicle Driving");
    }
    public void race(){
        System.out.println("race Driving"+max_speed);
    }

}

class Car extends Vehicle{
    int max_speed=100;
    public static void drive(){
        System.out.println("car Driving");
    }
    public void race(){
        System.out.println("race Driving  "+max_speed);
    }

    public static void main(String[] args) {
        Vehicle v=new Car();
        v.drive();
        v.race();
        System.out.println(v.max_speed);
    }
}