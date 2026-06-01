package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_interview {
    public static void reverse(int[] ar)
    {

        int start=0;
        int end=ar.length-1;
        for(int i=start;i<=end;i++){
            int temp=ar[i];
            ar[start]=ar[end];
            ar[end]=temp;
        }
        System.out.println(Arrays.toString(ar));


    }
    public static int[] array()

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array");
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        return ar;

    }

    public static void main(String[] args) {
        array();
        int[] ar=array();

        reverse(ar);
    }


}
