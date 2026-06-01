package Array;
import java.util.Scanner;
public class MinNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        int min=Integer.MAX_VALUE;
        for (int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println();
        System.out.println("Min"+min);
    }
}
