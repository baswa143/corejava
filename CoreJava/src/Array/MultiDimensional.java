package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
      //  System.out.println(arr.length);//no of rows
        //input
        for(int row=0;row< n;row++){
            arr[row]=sc.nextInt();
        }
        for(int row=0;row< n;row++){
            System.out.print(arr[row]+" ");
        }


    }
}
