package Array;

import java.util.Arrays;
import java.util.Scanner;



public class Rotation {
    public static int [] rotate(int[] ar,int k) {
        int n = ar.length;
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++) {
            ans[j++]=ar[i];
        }
        for(int i=0;i<n-k;i++) {
            ans[j++]=ar[i];
        }

        return ans;
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
        System.out.println("Enter the K value to rotate");
        int k=sc.nextInt();
         int ans[]=rotate(ar,k);
        System.out.println(Arrays.toString(ans));


    }
}

class Rotate1{
    public static void reverse(int[] ar ,int i,int j){
        while(i<j){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }
    }
    //This is another method to make  reverse
    public static void reverse1(int[] ar,int i,int j){
        int n=ar.length;
        for(int m=0;m<n/2;m++)

        {
            int temp=ar[m];
            ar[m]=ar[n-1-m];
            ar[n-1-m]=temp;
        }
    }
    public static void rotate(int[] ar,int k){
        int n = ar.length;
        k=k%n;
        reverse(ar,0,n-k-1);
        reverse1(ar,n-k,n-1);
        reverse(ar,0,n-1);
        System.out.println(Arrays.toString(ar));
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int ar[]=new int[size];
        int n = ar.length;
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println("Enter the k values");
        int k=sc.nextInt();

        rotate(ar,k);
    }
}
