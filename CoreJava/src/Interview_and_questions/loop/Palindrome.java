package Interview_and_questions.loop;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.valueOf;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        int original = n;
        int reverse=0;
        while(n!=0)
        {
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        System.out.println("reversed "+reverse);
        if(original==reverse){
            System.out.println("palindrome number");
        }
        else {
            System.out.println("Not a palindrome number");
        }
          //using the java8 solving the palindrome
        System.out.println("__-----__------__-----__-------");
        String str= valueOf(original);
        boolean ispalindrome = IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
        System.out.println(ispalindrome?"palindrome number":"not a palindrome");
        System.out.println("__-----__------__-----__-------");
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
        System.out.println(str.equals(reversed)?"palindrome ":"not a palindrome");

        System.out.println("__-----__------__-----__-------");
       // Partition strings into palindromes and non-palindromes. in the list

        List<String> words = Arrays.asList("radar", "level", "java", "stream");
        String partitioned = words.stream()
                .collect(Collectors.partitioningBy(word->word.equals(new StringBuilder(word).reverse().toString()))).toString();
        System.out.println(partitioned);





    }

}

//Armstrong number
class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int m=n;
        String str= String.valueOf(n);
        int st= str.length();
        int add=0;
        while (n!=0){
            int rem=n%10;
            add=(int)(add+Math.pow(rem,st));
            n=n/10;
        }
        System.out.println(add==m?"Armstrong number":"not a Armstrong number");

        System.out.println("___-------___-----____-------__-----");


       int sum=String.valueOf(m)
               .chars()
               .map(c->Character.getNumericValue(c))
               .map(d->(int) Math.pow(d, st))
               . sum();
        System.out.println(m==sum?"Armstrong number":"not a Armstrong number");
    }
}

class words{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your words");
        String n= sc.next();
       // String m=String.valueOf(n);
        String reversed = new StringBuilder(n).reverse().toString();
        System.out.println(n.equals(reversed)?"palindrome":"not a palindrome");
    }
}

