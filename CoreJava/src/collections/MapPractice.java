package collections;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        //creation of a map
        //<Integer> <> it is call generic
        Map<Integer,String> m =new HashMap<>();

        //Addition of elements into the map
        m.put(503207,"kotagiri");
        m.put(500004,"prem nagar");
        m.put(500012,"Khairatabad");
        m.put(123465,"Chennai");

//      Retrieval of keys from the map
        Set<Integer> keys = m.keySet();
        for(Integer key:keys){
            System.out.println(key);
        }
        for(Integer i=0;i<keys.size();i++){
            System.out.println(i);
        }

        System.out.println();
        //Retrival of values from the map
        Collection<String> values =m.values();
        for(String value:values){
            System.out.println(value);
        }
        System.out.println();

        m.remove(500004);

        for(Integer key: keys){
            System.out.println(key+" >>>>> "+m.get(key));
        }
        m.put(234534,"Bangalore");

        // Retrival of value from the map based on a key
        System.out.println(m.get(503207));
        System.out.println(m);
        System.out.println();
        System.out.println(m.containsKey(503207));
        System.out.println(m.containsValue("Delhi"));
        System.out.println();
        m.replace(503207,"pothangal");
        System.out.println(m);

        Set<Map.Entry<Integer,String>> entries=m.entrySet();
        for(Map.Entry<Integer,String> entry:entries)
        {
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+">>>>>>> "+value);
        }






    }
}
