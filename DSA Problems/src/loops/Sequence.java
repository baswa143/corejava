package loops;

import java.util.Scanner;

//Take 'n' as input from user and print the following sequence
// 1, n, 2, n-1, 3, n-2 .....
public class Sequence {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
            System.out.println("n ="+(n-i));
        }
        for(char ch='A';ch<='Z';ch++){
            System.out.println(ch+" = "+(int)ch);
        }
        for(char ch='a';ch<='z';ch++){
            System.out.println(ch+" = "+(int)ch);
        }

    }
}
