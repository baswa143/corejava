package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LLpractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> ll =new LinkedList<>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        list.add("e");
        list.add("f");
        ll.addAll(list);
        System.out.println(list);
        System.out.println(ll);
    }
}
