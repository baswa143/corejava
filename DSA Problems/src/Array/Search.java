package Array;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    int ar[]=new int[size];
        System.out.println("Enter elements of array");
    int n = ar.length;
        for(int i=0;i<n;i++){
        ar[i]=sc.nextInt();
    }
        for(int i=0;i<n;i++){
        System.out.print(ar[i]+" ");
    }
        System.out.println();
        System.out.println("Enter element to search");
        int k = sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(ar[i]==k){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Element found at index "+k);
        }
        else{
            System.out.println("Element not found");
        }

    }
}
