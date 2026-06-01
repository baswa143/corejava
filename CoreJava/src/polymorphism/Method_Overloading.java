package polymorphism;

public class Method_Overloading {
    public void m1( int a, int b) {
        System.out.println("adding the number" +a+" "+b);
    }
    public void m1(int a, int b, int c) {
        System.out.println("add this number"+a+" "+b+" "+c);
    }

    public static void main(String[] args) {
        Method_Overloading obj = new Method_Overloading();
        obj.m1(22,3,4);
        obj.m1(22,3);
    }
}
