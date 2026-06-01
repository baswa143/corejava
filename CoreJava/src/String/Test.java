package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s1="  hello world ";
        String s2=new  String("hello");
        String s3="hello^^world";
        String s4="HELLO";
        String s5="1234";
        int j=12332;
        int i=Integer.valueOf(s5);
        String s6 =String.valueOf(j);
        System.out.println(s1==s2);//when we use == it take only address
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));//when we use .equal
        System.out.println(s1.contains("l"));
        System.out.println(s1.startsWith("H"));
        System.out.println(s1.endsWith("l"));
        System.out.println(s1.length());
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.trim().length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.charAt(s1.length()-1));
        System.out.println(s1.indexOf("H"));
        System.out.println(s1.lastIndexOf("o"));
        System.out.println(Arrays.toString(s1.split(" ")));
        System.out.println(Arrays.toString(s2.split("//^^ ")));
        System.out.println(s1.replace("h", "g"));
        System.out.println();

    }
}
