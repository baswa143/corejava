package Array;

import java.util.Arrays;
import java.util.Scanner;

//sorted the array only 0's and 1's
public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int [] ar = new int[size];
        int n = ar.length;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        int zeroes=0;
        for (int i = 0; i < n; i++) {
            if(ar[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                ar[i]=0;
            }
            else {
                ar[i]=1;
            }

        }
        System.out.println(Arrays.toString(ar));
    }
}

class Sorted2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements"+size+" of the array");
        int [] ar = new int[size];
        for(int i=0;i< ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        int zeroes=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<ar.length;i++){
            if(i<zeroes){
                ar[i]=0;
            }
            else {
                ar[i]=1;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}