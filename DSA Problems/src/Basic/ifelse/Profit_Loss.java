package Basic.ifelse;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cost price");
        int cp=sc.nextInt();
        System.out.println("enter the selling price");
        int sp=sc.nextInt();
         if(sp>cp){
             System.out.println("profit "+(sp-cp));
             } else if (sp>=cp) {
             System.out.println("no profit -no loss");
         }
         else  {
             System.out.println("Loss "+(cp-sp));
    }

    }
}
