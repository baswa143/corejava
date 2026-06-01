package loopproblems;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while(n>0){
            n=n/10;
            sum++;
        }
        System.out.println("number of digits is "+sum);
    }
}

// Find the sum of digits in a given number n

class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
           int rem=n%10;
           n=n/10;
            sum+=rem;
        }

        System.out.println("sum of the digits is "+sum);
        sc.close();
    }
}

//Reverse the digits of a number
class ReversedDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while (n>0){
            sum=sum*10+n%10;
            n=n/10;
        }
        System.out.println("sum of the digits is "+sum);
    }
}
//find the sum of the following series
 class series{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0)
                sum-=i;
            else
                sum+=i;
        }
        System.out.println("sum of the digits is "+sum);
    }
}

//  factorial
class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
            System.out.println("factorial is "+i+" "+fact);
        }

    }
}

//Given 2 numbers a and b.find a raise to the power b.
class Power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();

        int ans=1;
        for(int i=1;i<=b;i++)
        {
            ans=ans*a;
            System.out.println("power is"+a+" "+ans);
        }
    }
}