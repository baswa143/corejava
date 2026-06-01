package Basic.ifelse;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double n=sc.nextDouble();
        int x=(int) n;

        if(n-x>0){
            System.out.println("it is not a integer");
        }
        else{
            System.out.println("it is a integer");
        }
    }
}
