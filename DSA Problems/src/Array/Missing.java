package Array;

import java.util.Scanner;

public class Missing {
    public static void missing(int[]ar){
        int n=ar.length+1;
        int sum=n*(n+1)/2;
        int arraysum=0;
        for(int element:ar){
            arraysum+=element;
        }
        arraysum=sum-arraysum;
        System.out.println("Missing "+arraysum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int ar[]=new int[size];
        int n = ar.length;
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        missing(ar);
    }
}
