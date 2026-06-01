package pojo;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        Emp e=new Emp();
        e.setID(121);
        e.getID(12);
        e.name="baswa";
        e.salary=1000;
//        System.out.println(e.name);
//        System.out.println(e.salary);
//        System.out.println(e.getID(12));

        System.out.println("---------emp2 details--------------");
        Emp e1=new Emp();
        e1.setID(123);
        e1.name="sandy";
        e1.salary=2000;
//        System.out.println(e1.name);
//        System.out.println(e1.salary);
//        System.out.println(e1.getID(122));
        System.out.println("---------emp3 details--------------");
        Emp e2=new Emp();
        e2.setID(122);
        e2.name="sandy";
        e2.salary=2000;
//        System.out.println(e2.name);
//        System.out.println(e2.salary);
//        System.out.println(e2.getID(122));
        Emp[]emps=new Emp[]{e,e1,e2};
        System.out.println(Arrays.toString(emps));
        Student s=new Student();
        s.setID(12);
        s.getID();
        s.setName("sandy");
        s.setSalary(2000);

        Student s1=new Student();
        s1.setID(12);
        s1.getID();
        s1.setName("Baswa");
        s1.setSalary(30000);

        Student[]st=new Student[]{s,s1};
        System.out.println(Arrays.toString(st));

    }

}
