package loop;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();                             //Three-Digit Example: 371 Number of digits:
                                                        // 3Calculation: 3^3 + 7^3 + 1^3 =27 + 343 + 1 = 371
                                                        //   $Result: 371 is an Armstrong number
         int m=n;
       //  String size=Integer.toString(n);
       //  int constsize=size.length();
        String str=new String(String.valueOf(n));
        int st=str.length();
         int add=0;
         while(n !=0){
            int rem=n%10;
            add=(int) (add+Math.pow(rem,st));
            n=n/10;
         }
         if(add==m){
             System.out.println("Armstrong");
         }
         else{
             System.out.println("Not Armstrong");
         }
    }
}
