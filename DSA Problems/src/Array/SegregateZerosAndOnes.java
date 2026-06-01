package Array;

import java.util.Arrays;
import java.util.Scanner;
//segregation 0's and 1's print o's first and 1's next
public class SegregateZerosAndOnes {
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
        int zeroes=0;
        for(int i=0;i<n;i++){
            if(ar[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<zeroes;i++){
           ar[i]=0;
        }
        for(int i=zeroes;i<n;i++){
            ar[i]=1;
        }
        System.out.println(Arrays.toString(ar));
    }
}
//Another way of solving the problem
class SegregateZerosAndOnes1{
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
        int i=0,j=n-1;
        while(i<j){
            if(ar[i]==0)i++;
           else if(ar[j]==1)j--;
           else if(ar[i]==1&&ar[j]==0) {
                ar[i] = 0;
                ar[j] = 1;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}