package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorPractice {
    public static void main(String[] args) {
        //listItreator - Interface
        // Introduced for iterating the only list type of collection object
        //legacy classes -v1.0 + new classes -v1.2
        //bi direction,read and write

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(4);
        list1.add(5);
        ListIterator<Integer>li= list1.listIterator();
        while (li.hasNext())
        {
            System.out.println(li.next());//forword direction
        }
        li.add(3);

        System.out.println();
        while(li.hasPrevious()){ //backward direction
            System.out.println(li.previous());
        }
        li.remove();
        System.out.println(list1);
       // System.out.println(li);
    }
}
