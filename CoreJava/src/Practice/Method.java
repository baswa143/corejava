package Practice;

public class Method {
    //parameter program
    public static int add(int a,int b)
    {
        int c = a+b;
        return c;
    }
    public static int multi(int x,int y)
    {
        int z = x*y;
        return z;

    }
    public static int div(int d,int e)
    {
        int f = d/e;
        return f;
    }
    public static int sub(int g,int h)
    {
        int j = g-h;
        return j;
    }



    public static void main(String[] args) {
       add(10,20);
       //Method calling statement
        System.out.println(add(10,20));
        multi(10,20);
        System.out.println(multi(10,20));
        System.out.println(div(30,10));
        System.out.println(sub(30,10));
    }

}
