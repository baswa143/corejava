package Array;

import java.util.Scanner;


public class PresentQuery {
    static int[] makeFrequencyArray(int[] ar) {
        int[] freq = new int[100005];
        for(int i=0;i<ar.length;i++) {
            freq[ar[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int ar[]= new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
        int[] freq=makeFrequencyArray(ar);

        System.out.println("enter number of queries");
        int q = sc.nextInt();

        while (q>0){
            System.out.println("Enter the number to be searched");
            int x = sc.nextInt();
            if(freq[x]>0)
            {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            q--;
        }
    }
}
