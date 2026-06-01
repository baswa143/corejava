package Patterns;

import java.util.Scanner;

public class RevRightHalfPyramid {
    public void pattern()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){  //i=1 1<=8
            for(int j=1;j<=n-i;j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RevRightHalfPyramid r = new RevRightHalfPyramid();
        r.pattern();


    }
}
