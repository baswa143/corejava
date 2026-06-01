package Array;

import java.util.Scanner;

public class Practice1 {
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+ size+ "elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        printArray(arr);
        System.out.println("original array");
        int []arr2=arr;
        System.out.println("copied array");
        printArray(arr2);
    }
}
