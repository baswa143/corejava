package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice {
    public static <linkedHashSet> void main(String[] args) {
//        Hashset ->Hashmap ->Array of nodes(key,value)
//          new Object(); dummy object
        HashSet<Integer>hashSet=new HashSet<>();
//        HashSet<Integer> hashSet1 = hashSet;
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(2);
        System.out.println("hs"+hashSet);
        //LinkedHashSet -> LinkedHashMap ->link of nodes(key, value)
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(8);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);
        linkedHashSet.remove(1);
        System.out.println(linkedHashSet.contains(5));
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet);

        for(Integer element:linkedHashSet){
            System.out.println(element);

        }
//        Treeset ->TreeMap ->binary tree
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);
        System.out.println(treeSet);
       LinkedHashSet l=new LinkedHashSet();
       l.add(1);
       l.add(5);
       l.add(4);
       l.add(3);
       l.add(2);
        System.out.println("l"+l);


    }

}
