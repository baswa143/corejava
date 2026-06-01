package Innerclass;

public class TC21 {
    public int marks(){
        return 10;
    }

    public static void main(String[] args) {
        TestClass.TestClass1 tc=new TestClass().new TestClass1();
        tc.marks();
    }

}
