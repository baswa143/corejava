package ExceptionHanding;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a number which will divide: ");
        int num2 = sc.nextInt();

        int sum=0;
       try {
           sum=num/num2;
       }
       catch (ArithmeticException ae){
           System.out.println(ae.toString());
          // throw ae;
       }
        System.out.println("the value of sum is "+sum);



    }
}
