package loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int num=2;num<n;num++){
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(num) ;i++)
            {
                if(num%i==0)
                {
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(num+" is prime");
            }
        }


    }
}

class B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        for(int i=2;i<=n-1;i++){
            if(n%i==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
