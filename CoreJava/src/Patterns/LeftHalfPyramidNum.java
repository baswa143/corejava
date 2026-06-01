package Patterns;

import java.util.Scanner;

public class LeftHalfPyramidNum {
    public void num()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  pattern num");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new LeftHalfPyramidNum().num();

    }
}
