package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ALAssignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  System.out.println("Enter the element you want to assign");
        //int size= sc.nextInt();
        //System.out.println("Enter the element");
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,3,4,5,6,6));
       // ArrayList<Integer>list=new ArrayList<>();
         int list1size=list.size()/2;
         int list2size=list.size()-list1size;
//         ArrayList<Integer> list1=new ArrayList<>();
//         ArrayList<Integer> list2=new ArrayList<>();
//         for(int i=0;i<list1size;i++){
//             list1.add(sc.nextInt());
//             list.add(list1.get(i));
//         }
//         for(int i=0;i<list2size;i++){
//             list2.add(sc.nextInt());
//             list.add(list2.get(i));
//         }
//        System.out.println(list1);
//        System.out.println(list2);
//

        ArrayList<Integer> list1=new ArrayList<>(list.subList(0,list1size));
        ArrayList<Integer> list2=new ArrayList<>(list.subList(list1size,list.size()));

        System.out.println(list1);

        System.out.println(list2);

        ArrayList<String> list3=new ArrayList<>();
        list3.add("gfhhhhhhf");
        list3.add("rutwik");
        list3.add("shivanand");
        list3.add("vijay");
        list3.add("Baswa");
        int list5size=list3.size()/2;


        ArrayList<String> list4=new ArrayList<>(list3.subList(0, list5size)) ;
        ArrayList<String> list7= new ArrayList<String>(list3.subList(list5size,list3.size()));
        System.out.println(list4);
        System.out.println(list7);




    }
}
