package Innerclass;

public class College {
    public static void main(String[] args) {
        Student1 student1=new Student1(){ //anonymous classes we call
            public void chair(){
                System.out.println(" This is my updated chair");
            }
        };
        student1.chair();

    }
}

class Student1{
    public void chair(){
        System.out.println("This is my chair");
    }
    public void table(){
        System.out.println("This is my table");
    }
}