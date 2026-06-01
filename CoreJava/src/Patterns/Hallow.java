package Patterns;

import java.util.Scanner;

public class Hallow {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if( i==1 ||i==5||j==1||j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class Hallow1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n number");
        int n=sc.nextInt();
        System.out.println("Enter the m number");
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if( i==1 ||i==n||j==1||j==m){
                    System.out.print("*");
                }
                else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}