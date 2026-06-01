package Basic.ifelse;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int l=sc.nextInt();
        System.out.println("enter the breadth");
        int b=sc.nextInt();
        int areaOFRectangle=l*b;
        System.out.println("The area of the rectangle is "+areaOFRectangle);
        int perimeter =2*(l+b);
        System.out.println("The perimeter of the rectangle is "+perimeter);
        if(areaOFRectangle>perimeter){
            System.out.println("The area of the rectangle is greater than perimeter ");
        }
        else {
            System.out.println("The area of the rectangle is less than perimeter ");
        }

    }
}
