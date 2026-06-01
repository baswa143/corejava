package ExceptionHanding;


import java.util.Scanner;

public class Program1 {
    public void show()
    {
        Scanner sc=new Scanner(System.in);
       try
       {

           System.out.println("Enter the value of a num");
           int i = sc.nextInt();
           System.out.println("enter the value of i : "+i);
           int j=sc.nextInt();
           System.out.println("enter the value of j:"+j);
           int sum = i/j;
           System.out.println("the sum is "+sum);
       }
       catch (ArithmeticException e){
           System.out.println("Error: number can't be divided by zero");
       }
       catch (Exception e)
       {
           System.out.println("Something went wrong"+e.toString());;
           throw e;
       }
       finally {
           System.out.println("closing the source");
       }
    }
    public static void main(String[] args)
    {
        Program1 p=new Program1();
        p.show();


    }

}
