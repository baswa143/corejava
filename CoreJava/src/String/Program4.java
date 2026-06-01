package String;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Input"+str);

        char firstRepeatedchar=' '; // space we can't declare as a char
        char firstNonceRepeatedchar=' ';

        for(int i=0;i<str.length();i++){
            char tempchar = str.charAt(i);
            if(tempchar!=' '){
                if(str.indexOf(tempchar)==str.lastIndexOf(tempchar))
                firstNonceRepeatedchar=tempchar;
                //incomplete program
            }
            {}
        }
    }
}
