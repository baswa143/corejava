package Patterns;

import java.util.Scanner;

public class patterns2 {
    public void pattern()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patterns2 p = new patterns2();
        p.pattern();

    }
}
