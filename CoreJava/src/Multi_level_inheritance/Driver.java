package Multi_level_inheritance;

public class Driver {
    public static void main(String[] args) {
        Son s=new Son();
        s.working();
        s.bike();
        s.Bicycle();
        System.out.println("********** GrandFather Details ***********");
        System.out.println(s.G_name);
        System.out.println(s.G_age);
        System.out.println("********** Father Details ***********");
        System.out.println(s.F_name);
        System.out.println(s.F_age);
        System.out.println(s.F_job);
        System.out.println("********* Son Details **********");
        System.out.println(s.sonName);
        System.out.println(s.sonAge);
        System.out.println(s.soncollege);
    }
}
