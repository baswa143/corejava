package collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test {
    public static void main(String []args){
        TreeSet st = new TreeSet();
        st.add("a");
        st.add("b");
        st.add("c");
        st.add("D");
        System.out.println(st);
        System.out.println(st.first());
        System.out.println(st.last());
        System.out.println(st.headSet("D"));
        System.out.println(st.tailSet("D"));
        System.out.println(st.subSet("a", "d"));
    }

}
