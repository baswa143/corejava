import java.util.Scanner;

public class Factorial {
    static long fact=1;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){ //i=1 , i=2 , i=3, i=4, i=5
            fact = fact * i; //fact =1 i=1 fact =1*1 ,1*2, 2*3, 6*4, 24*5, 120*6,  720*7, 5040*8, 40320*9......
        }
        System.out.println(fact);
    }

}
