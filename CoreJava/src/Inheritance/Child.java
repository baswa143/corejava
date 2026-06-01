package Inheritance;

public class Child extends Parent {
    void show1(){
        System.out.println("show1 method is present in child ");
    }
    void show2(){
        //this.show1(); // this keyword will call the same class method
       super.show1();//super keyword will call the parent class method
    }

    public static void main(String[] args) {
        new Child().show2();
        Parent p = new Child();
        p.show1();
       // Child c=(Child)new Child();  //ClassCastException

    }
}
