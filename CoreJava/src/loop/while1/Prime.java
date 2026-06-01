package loop.while1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a first number");
        int start=sc.nextInt();
        System.out.println("enter a end number");
        int end=sc.nextInt();
         //write a prime numbers = 1,2,3,5,7,11,13.....
        int num=start;
        while(num<=end){
            boolean isprime=true;
            if(num!=1 && num!=2){
                int i=2;
                while(i<num)
                {
                    if(num%i==0){
                        isprime=false;
                        break;
                    }
                    i++;
                }
            }
            else
                isprime=false;
            if(isprime)
                System.out.println(num+" is prime");
            num++;

        }


    }
}
