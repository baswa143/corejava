package Inheritance;

public class Driver {
    public static void main(String[] args) {
        Son s = new Son();
        s.working();
        s.playing();
        System.out.println("**********  Father details  **************");
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.Bike);
        System.out.println("***********  son details  **************");
        System.out.println(s.son_Bike);
        System.out.println(s.son_name);
        System.out.println(s.son_age);
    }
}
