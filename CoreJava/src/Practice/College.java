package Practice;

import org.w3c.dom.ls.LSOutput;

public class College {
    //parameter
    public static String college( String college) {
        return college;
    }

    public static int age( int a)
    {
        return a;
    }
    public void student_no(){
        System.out.println("student_no");
    }

    public static void main(String[] args) {
        College c=new College();
        college("sathyabama");
       // c.college();
        System.out.println(college("sathyabama"));
        System.out.println(age(20));
        c.student_no();

    }




}
