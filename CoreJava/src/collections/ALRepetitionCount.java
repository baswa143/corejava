package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ALRepetitionCount {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements names");
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        ArrayList<String> list1=new ArrayList<>();
        for(int i=0;i< list.size();i++){
           if(!list1.contains(list.get(i)))
                list1.add(list.get(i));
        }
        for(String uni:list1)
        {
            int count=0;
            for(int i=0;i<list.size();i++){
                if(list.get(i).equals(uni))
                    count++;
            }
            System.out.println(uni+">>>"+count);
        }



        System.out.println(list);
        System.out.println(list1);
    }
}
