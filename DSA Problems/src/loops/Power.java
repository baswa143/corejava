package loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of a");
        int a=sc.nextInt();
        System.out.println("Enter the number b");
        int b=sc.nextInt();
        int pow=1;
        for(int i=1;i<=b;i++)
        {
            pow*=a;
        }
        System.out.println(a+"a raised the power b "+b+" is "+pow);

    }
}
