package pattern;
// 11111
// 22222
// 33333

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
