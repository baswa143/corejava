package Pattern;

import java.util.Scanner;

public class RightHalfPyramid {
    public static void rightHalfPyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int cols = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        rightHalfPyramid();
    }
}
