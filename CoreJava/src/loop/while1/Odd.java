package loop.while1;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int start = sc.nextInt();
        System.out.println("enter a end number");
        int end = sc.nextInt();
       if(start%2==0) {//200 199
            start--;

            while (start>=end) {//start =200>25
                System.out.println(start);
                start-=2;

            }
        }
   }


}
