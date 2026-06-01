package Inheritance;

public class Dog extends Animal {
    Dog(){
        this(10);
        System.out.println("Dog constructor");
    }
    Dog(int a){
        super();
        System.out.println("Dog constructor1");
    }

    public static void main(String[] args) {
        new Dog();
    }

}
