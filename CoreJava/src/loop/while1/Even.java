package loop.while1;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        System.out.println("enter a starting number");
        int start= sc.nextInt();
        System.out.println("enter a ending number");
        int end=sc.nextInt();
        while (start<=end)
        {
            System.out.println(start);
            start+=2;
        }
    }
}
