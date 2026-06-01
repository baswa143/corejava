package loop;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        int a = 1224;
        int count=0;
        while(count<a){
            int rem=a%10;
            if(rem==2){
                count++;
            }
             a=a/10; //1224/10 =122

        }
        System.out.println(count);

    }
}

//Armstrong number
class Armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String st= String.valueOf(num);

    }
}

