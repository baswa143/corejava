package String;

import java.util.Arrays;
import java.util.Scanner;

public class Progam6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        System.out.println("Input: "+str);

        String arr[]=str.split(" ");
        String [] outputarr = new String[arr.length/2];
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2!=0){
                outputarr[index]=arr[i];
                index++;
            }
        }
        System.out.println("Output: "+ Arrays.toString(outputarr) );
        sc.close();
    }
}
