package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorPractice1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer>i=list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
          //  i.remove();
        }
        System.out.println(list.size());

        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(500,"India");
        hm.put(200,"USA");
        hm.put(300,"USA");

    }



}
