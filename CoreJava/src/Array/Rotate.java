package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
static int[] rotate(int ar[],int k){
    int n=ar.length;
    k = k%n;
    int ans[]=new int[n]; //new array to store the value
    int j=0;
    for(int i=n-k;i<n;i++){
        ans[j++]=ar[i];
    }
    for(int i=0;i<n-k;i++){
        ans[j++]=ar[i];
    }
    return ans;
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int ar[]=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the k");
        int k=sc.nextInt();
        System.out.println("original array");
        System.out.println(Arrays.toString(ar));
        int ans[]=rotate(ar,k);
        System.out.println("rotated array");
        System.out.println(Arrays.toString(ans));

    }
}

//same code practice done

class Rotate1{
    static int[] rotate(int[] ar,int k)
    {
        int n=ar.length;
        k= k % n;
        int ans[]=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++)
        {
            ans[j++]=ar[i];
        }
        for(int i=0;i<n-k;i++)
        {
            ans[j++]=ar[i];
        }
        return ans;

    }

    static void arr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] ar=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("enter the k");
        int k=sc.nextInt();
        int []ans=rotate(ar,k);
        System.out.println("original array");
        System.out.println(Arrays.toString(ar));

        System.out.println("rotated array");
        System.out.println(Arrays.toString(ans));

    }

    public static void main(String[] args) {
        arr();

    }
}

//rotate at same place
class Rotate2{
    static void reverse(int[] ar,int i,int j){
        while(i<j){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            i++;
            j--;
        }

    }
    static void rotate(int[] ar,int k)
    {
        int n=ar.length;
        k = k % n;
        reverse(ar,0,n-k-1);
        reverse(ar,n-k,n-1);
        reverse(ar,0,n-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] ar=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("enter the k");
        int k=sc.nextInt();
        System.out.println("original array");
        System.out.println(Arrays.toString(ar));

        rotate(ar,k);
        System.out.println("rotated array");
        System.out.println(Arrays.toString(ar));

    }
}