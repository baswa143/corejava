package Block;

public class Test {
    Test()
    {
        System.out.println("0 args constructor");
    }
    Test(int a,int b)
    {
        System.out.println("1 args constructor");
    }
    {
        System.out.println("instance 1 block");
    }
    static
    {
        System.out.println("static 1 block");
    }

    public static void main(String[] args) {
       new Test();
       new Test(1,3);
    }


}
