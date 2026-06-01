package collections;

import java.util.*;

public class MapPractice1 {
    public static void main(String[] args) {
        Map<Integer,String> m1=new HashMap<>();

        m1.put(503207,"kotagiri");
        m1.put(500064,"Hyd");
        m1.put(600003,"Delhi");
        System.out.println(m1);
        System.out.println();

        Set<Integer> keys = m1.keySet();
        for(Integer key:keys){
            System.out.println(key+" "+m1.get(key));
        }
        System.out.println();

        Collection<String> values=m1.values();
        for(String value:values)
        {
            System.out.println(value);
        }
        System.out.println("_------------------__________-------_____-----");

        for(Integer key:keys)
        {
            System.out.println(key+" >>>>>>"+m1.get(key));
        }
        System.out.println("----------------------");
        Set<Map.Entry<Integer,String>> entries=m1.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.println(entry.getKey()+">...>..>"+entry.getValue());
        }
    }
}
