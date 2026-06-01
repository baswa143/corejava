package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiAndAdd {
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
            if(ar[i]%2==0){
                ar[i]+=10;
            }
            else{
                ar[i]*=2;
            }
        }
        System.out.println(Arrays.toString(ar));

    }
}
