package functions;

import java.util.Scanner;

public class Factorial {

    public static void calculateFactorial(int n)
    {
        if(n<0){
            System.out.println("Invalid Input");
            return;
        }
        int fact=1;
        for(int i=n;i>1;i--){
            fact=fact*i;
            System.out.println(fact+"*"+i+" = "+fact);
        }
    }
    public static void prime(int n){
        int temp=0;
        for(int i=2;i<n-1;i++){

            if(n%i==0){
                temp++;
            }
        }
        if(temp>0){
            System.out.println("It is not a prime number");
        }
        else {
            System.out.println("prime number");
        }
    }
    public static void even(int n)
    {
        if(n%2==0){
            System.out.println("It is an even number");
        }
        else {
            System.out.println("It is not an even number");
        }
//        if(n%2==0?true:false);
//
    }
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
//        even(n);
       // table(n);
        calculateFactorial(n);

//        prime(n);
    }
}
