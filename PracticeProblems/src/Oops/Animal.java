package Oops;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    public void sound() {
        System.out.println("Some generic sound");
    }
    private void sleep() {
        System.out.println("Animal sleeps");
    }

}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        List<Animal>an = new ArrayList<>();
        an.add(new Cat());
        an.add(new Dog());

//        for (Animal a :an){
//            a.sound();
//        }
        for(int i=0;i<an.size();i++){
            an.get(i).sound();
        }
    }
}

class Result{
    public static void main(String[] args) {
        Animal animal = new Cat();
        Animal animal1 = new Dog();
        animal.sound();


    }
}

