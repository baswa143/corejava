package String;

import java.util.Scanner;

public class Exam1
{

    public static void main(String[] args) {
    String name="baswaraj";
    int count=0;
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
                System.out.print(ch+(" "));
            }
        }
        System.out.println("count = "+count);
    }
}

// Given a string s, print all the substring of s.
// input s= "abcd"
//Output : a ab abc abcd b bc bcd c cd d

class PrintAllSubString{
    public static void main(String[] args) {
        String str = "abcd";
        for (int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}

//interning and new topic
class interning{
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.substring(0,2)+"y"+str.substring(3));
        System.out.println(str);
    }
}

//given a string the task is to toggle all the characters of the
//string i.e to convert Uppercase to lower case and vice versa
// input- PhysICS
// output- pHYSics

class Toggle{
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        StringBuilder sb=new StringBuilder(sc.nextLine());
//        System.out.println(sb);
//        //toggle
//        //pHYSics
//        for(int i=0;i<sb.length();i++){
//            //P ->p
//            //check - > alphabet - small, capital
//            boolean flag = true;
//            char ch=sb.charAt(i);
//            int asci = (int)ch;
//            if (flag == true) {
//                asci+=32;
//                char dh = (char)asci;
//            }
//
//        }

//        String str = "PhysICS";
//        String str1 = " ";
//        for(int i=0;i<str.length();i++){
//            char ch= str.charAt(i);
//            if(Character.isUpperCase(ch)){
//               str1= str1+Character .toLowerCase(ch);

//            }
//            else if(Character.isLowerCase(ch)){
//                str1= str1+ Character .toUpperCase(ch);
//            }
//
//        }
//        System.out.print(str1);



    }
}

class Reverse{
    public static void main(String[] args) {

        String str = "I love my India";
//        StringBuilder sb=new StringBuilder(str);
//        sb.reverse();
        String arr[] = str.split(" ");
        for(String word:arr){
            String reversed=" ";
            for(int i=word.length()-1;i>=0;i--){

            reversed+=word.charAt(i);
            }
            System.out.print(reversed.trim() +" ");
        }


    }

}

class Fatorial {
    public static void fatorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println(fact);
        }
    }

    public static void main(String[] args) {
        fatorial(5);
    }

}

class Even{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
            if(i%2==0?true:false){
                System.out.println(i);
            }
        }
    }
}

class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<=str.length()-1;i++){
            for(int j=i;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }

    }
}

class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int str=sc.nextInt();
        int original=str;
       int num=0;
       while(str!=0){
           int rem=str%10;
           num=num*10+rem;
           str=str/10;
       }
        System.out.println(num);
//       if(original==num){
//           System.out.println("It is Palindrome number");
//       }
//       else {
//           System.out.println("It is not Palindrome number");
//       }
        System.out.println(original==num?"It is Palindrome number":"It is not Palindrome number");
    }
}











