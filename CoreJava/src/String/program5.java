package String;

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Input"+str);
        String arr[]=str.split(" ");
        String  Maxword=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(Maxword.length()<arr[i].length())
                Maxword=arr[i];
        }
        System.out.println("Maxword  "+Maxword);
    }
}
