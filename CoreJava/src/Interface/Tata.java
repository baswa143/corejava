package Interface;

import org.w3c.dom.ls.LSOutput;

public class Tata {
    public static void main(String[] args) {

    }
}

class Users  {
    public static void main(String[] args) {
        Punch p=(speed,name)-> {
                System.out.println("Speed: " + speed +" Car: "+name);
            System.out.println("car is moving fastly");

        };
        p.speed(100,"punch");

    }

}



@FunctionalInterface
interface Punch{
    void speed(int speed,String name);
}