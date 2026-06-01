package String;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println("Input:"+" "+str);
        int upperCaseLetterCount=0;
        int lowerCaseLetterCount=0;
        int digitCount=0;
        int specialCharCount=0;
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.append(str.toUpperCase()));
        System.out.println(sb.append(str.toLowerCase()));

        char[] characters = str.toCharArray();

        for(char ch:characters)
        {
            if(Character.isUpperCase(ch))
            {
                upperCaseLetterCount++;
            }
            else if(Character.isLowerCase(ch))
            {
                lowerCaseLetterCount++;
            }
            else if(Character.isDigit(ch))
            {
                digitCount++;
            }
            else {
                specialCharCount++;
            }
        }
        System.out.println("upper case:"+upperCaseLetterCount);
        System.out.println("lower case:"+lowerCaseLetterCount);
        System.out.println("digit count:"+digitCount);
        System.out.println("special char:"+specialCharCount);
    }
}
