package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>(Arrays.asList("baswa","sandy","bandu","vini","vikas"));
        list.forEach(System.out::println);
        list.stream()
//                .filter(x->x=="baswa")
                .filter(n->((String) n).startsWith("s"))
                .map(n->n.toUpperCase())
                .forEach(System.out::println);
        list.stream()
                .filter(x->x.startsWith("v"))
                .forEach(System.out::println);


    }
}

class GFG{

    public static void main(String[] args){

        List<String> names = Arrays.asList(
                "Alice", "Bob", "Charlie", "Adam");

        System.out.println("All names:");
        names.forEach(name -> System.out.println(name));

        System.out.println("\nNames starting with 'A':");
        names.stream()
                .filter(str->Character.isUpperCase(str.charAt(0)))
                .peek(System.out::println)
                .filter(n -> n.startsWith("A"))
                .map(n -> n.toUpperCase())
                .map(String::toLowerCase)
                .map(n->n.length())
                .forEach(System.out::println);

    }
}

class Division{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,45,7,5,3,23,55));
        list.parallelStream()
                .filter(num->num%5==0)
                .map(n->n*3)
                .forEach(System.out:: println);
    }
}
