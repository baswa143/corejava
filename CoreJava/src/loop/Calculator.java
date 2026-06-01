package loop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter the operator"));

        int ans=0;
        while(true)
        {
            char ch=sc.next().trim().charAt(0);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
                if(ans==ch){

                }

            }

        }

    }
}
