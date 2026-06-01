package Constructor;

public class Mobile {
    String name;
    String color;
    double price;
    String version;

    public Mobile() {
        System.out.println("mobile constructor");
    }
    public Mobile(String name, String color)
    {
        this();
        this.name = name;
        this.color = color;
        System.out.println("mobile constructor2");

    }
    public Mobile(String name, String color,String version, double price)
    {
        this(name, color);
        this.version = version;
        this.price = price;
        System.out.println("mobile constructor3");
    }

    public static void main(String[] args) {
        Mobile m=new Mobile("Samsung galaxy M31","blue","Galaxy M31",15000);
        //Mobile m1=new Mobile("Samsung galaxy M31","blue");
        //Mobile m2=new Mobile("Galaxy M31",15000);
        System.out.println(m.name);
        System.out.println(m.color);
        System.out.println(m.price);
        System.out.println(m.version);
    }

}
