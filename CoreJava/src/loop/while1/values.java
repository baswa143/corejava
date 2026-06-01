package loop.while1;

import java.util.Scanner;

public class values {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int i =sc.nextInt();
        while (i<=100){ //i=0 :true
            System.out.println(i);
            i++;

        }
    }
}
