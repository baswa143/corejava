package Constructor;

public class Laptop {
    String name;
    String color="Red";
    double price;
    String version="window 11";

    public Laptop() {
        System.out.println("Laptop 1st Constructor");
    }
    // non-static variable are store in heap area
    //object is created in heap area

    public Laptop(String name,double price)  // Using this keyword we can call the another
                                               // constructor with in same class
    {
        //this is having  address of the object
        this();
        this.name=name;
        this.price=price;
        System.out.println("Laptop 2nd Constructor");
    }

    public static void main(String[] args) {
       // Laptop l=new Laptop();
        Laptop l1=new Laptop("Dell",60000);
        System.out.println(l1.name);
        System.out.println(l1.color);
    }
}
