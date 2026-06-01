package collections;

import java.util.*;

public class EnumPractice {
    public static void main(String[] args) {
        Vector<Integer>v=new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        Enumeration<Integer>e=v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        System.out.println();
        Stack<String> s=new Stack<>();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        Enumeration<String> e1=s.elements();
        while(e1.hasMoreElements())
        {
            System.out.println(e1.nextElement());
        }
        Hashtable<Integer,String> h=new Hashtable<>();
        h.put(1,"a");
        h.put(2,"b");
        h.put(3,"c");
        Enumeration<String>e3=h.elements();
        while(e3.hasMoreElements())
        {
            System.out.println(e3.nextElement());
        }

        Properties p=new Properties();
        p.setProperty("url","http://localhost:8080");
        p.setProperty("username","admin");
        Enumeration<Object>e4=p.elements();

    }
}
