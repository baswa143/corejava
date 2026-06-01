package Array;

import java.util.Scanner;

public class Second_Largest {
    public static void sMax(int ar[])
    {

        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max) max=ar[i];
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]>smax && ar[i]!=max) smax=ar[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }


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
        sMax(ar);

    }
}
