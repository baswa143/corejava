package Innerclass;

public class OutClass {
    public static void main(String[] args) {
        class Class1    //local classes
                       // in local classes we cannot use  access the public, static
                       //we can access only abstract, and finally
                       //we can only access in the main method only in another class we can't be call
        {
            public void chair()
            {
                System.out.println("chair");
            }
        }
        //OutClass oc=new OutClass();
        Class1 c= new Class1();
        c.chair();
    }
}
