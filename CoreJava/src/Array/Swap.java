package Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int a=3;
        int b=4;
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("a "+a);
         System.out.println("b "+b);
    }
}

class Reverse{
    static void swapInArray(int arr[],int k,int l){
        int temp=arr[k];
        arr[k]=arr[l];
        arr[l]=temp;
        System.out.println(Arrays.toString(arr));


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int ans[]=new int[n];
        int j=0;
//        for(int i=n-1;i>=0;i--){
//            ans[j++]=arr[i];
//        }
//        System.out.println(Arrays.toString(ans));


        //reverse the array using only one array
        int k=0;
        int l=arr.length-1;
        while (k<l){
            k++;
            l--;

        }
        swapInArray(arr,k,l);

    }
}