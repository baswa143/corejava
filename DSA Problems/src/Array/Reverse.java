package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter size of array");
        int ar[]=new int[size];
        int n = ar.length;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        //This is the one way of solving the problem
//        int i=0, j=n-1;
//        while(i<j){
//            int temp=ar[i];
//            ar[i]=ar[j];
//            ar[j]=temp;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(ar));

        for(int i=0;i<n/2;i++)
        {
            int temp=ar[i];
            ar[i]=ar[n-1-i];
            ar[n-1-i]=temp;
        }
        System.out.println(Arrays.toString(ar));
    }
}
