package collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<Integer,String> map =new Hashtable<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");

        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for(Map.Entry<Integer,String> entry:entries)
        {
            System.out.println(entry.getKey()+" >>>>>>___...>>>.  "+entry.getValue());
        }
        System.out.println(map.get(1));

        System.out.println("_--_--_--_--_--_--_-_");

        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            System.out.println(key+" >>>>>>___...>>>.  "+map.get(key));
        }
        System.out.println("_--_--_--_--_--_--_-_");

        Collection<String> values=map.values();
        for(String value:values)
        {
            System.out.println(value);
        }

    }
}
