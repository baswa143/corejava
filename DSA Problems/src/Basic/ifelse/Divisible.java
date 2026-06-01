package Basic.ifelse;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();

        if(n%5==0 || n%3==0)
        {
            System.out.println("Divisible by 5 or 3");
        }
        else {
            System.out.println("Not Divisible by 3 or 5 ");
        }
    }
}
