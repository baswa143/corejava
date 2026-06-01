package ExceptionHanding;

import java.util.Scanner;

public class VoteHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age=input.nextInt();

        System.out.println("you are eligible for after 18 years");
        vote(age);
    }
    public static void vote(int age){
        try{
            if(age<18){
                throw new ArithmeticException("not eligible for vote");
            }
            else {
                System.out.println("eligible for vote");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
