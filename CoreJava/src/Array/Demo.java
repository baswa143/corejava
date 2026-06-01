package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo
{
    public void shows()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size=sc.nextInt();
        System.out.println("array size is "+size);
        System.out.println("enter "+size+" String elements");

        String ar[]=new String[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.next();
        }
        System.out.println(Arrays.toString(ar));
//        for(int i=0;i<ar.length;i++)
//        {
//
//        }

    }
    public void show() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size array");
        int size = sc.nextInt();
        System.out.println("array size is " + size);

        System.out.println("String " + size + " String elements");

        String ar[] = new String[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.next();
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
        public static void main(String[] args)
    {
       Demo demo=new Demo();
       demo.shows();
    }
}
