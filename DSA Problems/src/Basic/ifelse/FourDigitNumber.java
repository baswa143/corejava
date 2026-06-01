package Basic.ifelse;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();

        if(n>999 &&  n<10000)
        {
            System.out.println("4 digit number");
        }
        else {
            System.out.println("not 4 digit number ");
        }
    }
}
