package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
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
       int sum=0;
       for(int i=0;i<ar.length;i++){
           sum+=ar[i];
       }
       System.out.println(sum);
    }
}
