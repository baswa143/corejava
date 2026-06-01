package loops;

import java.util.Scanner;

public class Arthematic_Operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        int a=4, d=6;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            a+=d;
        }

    }
}
//print this series - 99,95,91,87 ...up terms which are positive
class HW{
    public static void gp(int n){
        int r=2,b=1;
        for(int i=1;i<=n;i++){
            System.out.println(b);
            b*=r;

        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
//        int a=99, d=4;
//        for(int i=n;i>=0;i--){
//            System.out.println(a+" ");
//            a-=d;
//
//        }
        gp(n);
    }
}

