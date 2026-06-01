package Array;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        int prod=1;
        for(int i=0;i<ar.length;i++){
            prod=prod*ar[i];
        }
        System.out.println(prod);
    }
}
