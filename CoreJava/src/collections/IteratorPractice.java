package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class IteratorPractice {
    public static void main(String[] args) {
        //Iterator-Interface
        //Introduced for iterating the all collection objects
        //legacy classes - v1.0 +new classes -v1.2
        //one direction, read-only with special permission for removing
//        ArrayList<Integer> al = new ArrayList<>();
        Vector al=new Vector();
        al.add(1);
        al.add(2);
        al.add(3);

        Iterator<Integer> i = al.iterator();
        //i.hasNext()
        //i.next()
        while (i.hasNext()){
            i.next();
            i.remove();
        }
        System.out.println(al);
        HashMap<String,Integer> hm=new HashMap();
        hm.put("India",500);
        hm.put("China",600);
        hm.put("USA",1000);

        //Map does not allow the iterator

        hm.keySet().iterator();
        hm.values().iterator();
        hm.entrySet().iterator();
    }
}
