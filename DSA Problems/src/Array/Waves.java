package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Waves {
    public static void swap(int ar[],int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
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
        System.out.println();
        for(int j=0;j<n-1;j+=2){
            int temp=ar[j];
            ar[j]=ar[j+1];
            ar[j+1]=temp;
        }
        System.out.println(Arrays.toString(ar));

    }
}
