package Encapsulation;

public class Student {
   private int roll_no;
   private String name;
   private boolean isAttendance;



    public int getRoll_no() {
        return roll_no;

    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
        System.out.println("Student setRoll_no");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Student setName");
    }

    public boolean isAttendance() {
        return isAttendance;
    }

    public void setAttendance(boolean attendance) {
        isAttendance = attendance;
    }
}
