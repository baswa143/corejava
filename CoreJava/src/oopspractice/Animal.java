package oopspractice;

public class Animal {
    void sound(){
        System.out.println("Animal");
    }

}

class Cat extends Animal{
    void sound(){
        System.out.println("cat");
    }
}
class Main{
    public static void main(String[] args) {
        Animal a = new Cat();//Dynamic dispatch //object type
        a.sound();
        Animal b=new Animal();//reference type
        b.sound();
    }
}


class Engine1{
    void start(){
        System.out.println("Engine started");

    }

}
class Car3{
    Engine1 e = new Engine1(); // HAS - A relationship
    void drive(){
        e.start();
        System.out.println("car is running");
    }
}

class Main2{
    public static void main(String[] args){
        Car3 c = new Car3();
        c.drive();
    }
}
