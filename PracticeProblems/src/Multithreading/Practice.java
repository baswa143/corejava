package Multithreading;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int ar[] = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            ar[i] =sc.nextInt();

        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println("------------------------------");
        Arrays.sort(ar);
        System.out.println(ar[ar.length-1]);

    }
}
