package Practice;

public class School {
    static  String name="baswa";
    static  int age=23;
    long mobile_no=9905906518l;
    int roll_no=40110161;

    public void  teaching(String name)
    {
        System.out.println("I am teaching history");
        System.out.println(name);
    }


    public static void main(String[] args) {
        System.out.println(name+" "+age);
        School s=new School();
        System.out.println(s.mobile_no);
        System.out.println(s.roll_no);
        s.teaching("uday");
        //System.out.println(s.name);

    }
}
