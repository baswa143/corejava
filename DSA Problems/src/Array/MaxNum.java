package Array;

import java.util.Scanner;

public class MaxNum {
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
        int max=Integer.MIN_VALUE;
        for (int i=0;i<ar.length;i++){
                if(ar[i]>max){
                    max=ar[i];
                }
        }
        System.out.println();
        System.out.println( "Max num = "+max);
    }
}
