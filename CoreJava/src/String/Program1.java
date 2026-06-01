package String;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Program1 p=new Program1();
        Scanner sc=new Scanner(System.in);
        System.out.println("please input the string");
        String str=sc.nextLine();
        System.out.println("please enter target char");
        char targetchar=sc.next().charAt(0);
       // System.out.println(str.split(" ").length);

       // System.out.println(str.length());

//        int count=0;
//        for (int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==targetchar)
//            {
//                count++;
//            }

        //}
        //System.out.println("character"+count);
//        char[] str1=str.toCharArray();
//        int count=0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==targetchar){
//                count++;
//            }
//        }
//        System.out.println("char"+count);

        String rev=" ";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println(rev);

        System.out.println(str.trim());
    }
}
