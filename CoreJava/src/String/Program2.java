package String;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the input string");
        String str=sc.nextLine();
        System.out.println("Input: "+ str);
        String []arr=str.split(" ");

        String OutputStr="";
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
            {
                OutputStr+= arr[i].toUpperCase();
            }
            else{
                OutputStr+=getReverseString(arr[i]+" ");

            }
        }
        System.out.println(OutputStr+" ");

    }

    private static String getReverseString(String s) {
        return s;
    }
}
