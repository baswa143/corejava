package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// print only the even and add sum of them
public class ListSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to add?");
        int listSize = sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        System.out.println("please enter the elements:");
        int sum=0;
        for(int i=0;i<listSize;i++)
        {
            al.add(sc.nextInt());
//sum=sum+al.get(i);

        }
        //int avg=sum/listSize;
        //System.out.println(sum);
        //System.out.println(avg);

        for(int i=0;i<listSize;i++)
        {
            if(al.get(i)%2==0)
            {
                System.out.println(al.get(i));
                sum+=al.get(i);
            }

        }


        System.out.println(sum);
        sc.close();


    }
}
