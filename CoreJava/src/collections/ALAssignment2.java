package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ALAssignment2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        System.out.println("Enter the first element");
        int n1=sc.nextInt();
        System.out.println("enter the element");
        for(int i=0;i<n1;i++){
            list1.add(sc.nextInt());
        }
        System.out.println(list1);
        System.out.println("Enter the second element");
        int n2=sc.nextInt();
        System.out.println("enter the element");
        for(int i=0;i<n2;i++)
        {
            list2.add(sc.nextInt());
        }
        System.out.println(list2);
        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println("Merged the list1 and the list2:");
        System.out.println(list3);

        ArrayList<String> list4=new ArrayList<>(Arrays.asList("baswa","sandy","swarupa","vikas","vini"));
        ArrayList<String> list5=new ArrayList<>(Arrays.asList("Bandu","sai","pallu","sony"));
        System.out.println(list4);
        System.out.println(list5);
        list4.addAll(list5);
        System.out.println(list4);

    }
}
