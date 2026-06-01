package String;

import java.util.Scanner;

public class Reverse {
    //arr can change in word to word
    public static void main(String[] args) {
     String str= "Java is good programming language";
//        String arr[]=str.split(" ");
//        String rev =" ";
        //StringBuffer sb = new StringBuffer(str);
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the string");
       String str1=sc.nextLine();
//        int len=arr.length;
//        for(int i=len-1;i>=0;i--)
//        {
//            rev=rev+(arr[i]+" ");
//        }
//        System.out.println(rev +" ");


//char can change the letter to letter
       // String str1="java is secure ";
        //String charAt=str1.split("");// we can use the split() only  in array to string .
        String rev1=" ";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            //using + (string concatenation) operater
            rev1=rev1 + ch;
        }
        System.out.println(rev1+" ");

//      Using the StringBuffer class
        //it will make the char word in rev
      //  StringBuffer st=new StringBuffer(str);
        //System.out.println(st.reverse());
    }
}

class Reverse1{
    public static void main(String[] args) {
        String str="Java is good programming language";
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the string");
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}

