package Encapsulation;

public class vehicle {
    public static void main(String[] args) {
        Car c= new Car("BMW","RED",500000);
        System.out.println(c.getName()+" "+c.getColor()+" "+c.getPrice());
        System.out.println("************* update the vehicle ***********");
        c.setName("tata");
        c.setColor("blue");
        c.setPrice(50000);
        System.out.println(c.getName()+" "+c.getColor()+" "+c.getPrice());

    }
}
