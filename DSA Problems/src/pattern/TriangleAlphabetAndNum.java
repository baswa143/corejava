package pattern;

import java.util.Scanner;

public class TriangleAlphabetAndNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++ ){
               if(j%2!=0){
                   System.out.print(i+" ");
               }
               else {
                   System.out.print((char)(j+64)+" ");
               }
            }
            System.out.println();
        }
    }
}
