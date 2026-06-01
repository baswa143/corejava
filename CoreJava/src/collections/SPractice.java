package collections;

import java.util.Stack;

public class SPractice {
    public static void main(String[] args) {
        Stack<String>s=new Stack<>();
        s.add("White");
        s.add("Black");
        s.add(0,"Red");
        s.push("Yellow");
        System.out.println(s.peek());
    System.out.println(s.search("Red"));
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);
    }
}
