package Encapsulation;

public class Teacher {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRoll_no(1);
        student.setName("Baswaraj");
        student.getName();
        student.getRoll_no();
        System.out.println(student.getName());
        System.out.println(student.getRoll_no());

    }
}
