package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

public class EnumerationPractice {
    public static void main(String[] args) {
       //Enumeration - Interface
       //Introduced for iterating the legacy collection objects
       //Legacy classes v1.0 hashtable, stack, vector, Dictionary and properties
       // New classes -v1.2
        Vector<String> v=new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");
        Enumeration<String> e= v.elements();
        //Enumeration as two ways
        //to find the next element are there are not to make the iteration
        //and access the elements
        //e.hasmoreElements() //
        //e.nextElement()
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        Hashtable<String,Integer> h=new Hashtable<>();
        h.put("a",1);
        h.put("b",2);
        h.put("c",3);

        Enumeration<Integer> e1=h.elements();
        while(e1.hasMoreElements()){
            System.out.println(e1.nextElement());
        }
        Properties prop=new Properties();
        prop.setProperty("url","localhost:8080");
        prop.setProperty("user","admin");

        Enumeration<Object> e2=prop.elements();
        while (e2.hasMoreElements()){
            System.out.println(e2.nextElement());
        }
        prop.elements().asIterator();


        }

}
