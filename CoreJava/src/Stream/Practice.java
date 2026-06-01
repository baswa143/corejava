package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.stream()
                .sorted()
                .filter(n->n%2==0)
                .forEach(System.out::println);

        ArrayList<String> l=new ArrayList<>(Arrays.asList("baswa","sandy","akash","shiva"));
        l.stream()
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );
        listOfLists.stream()

                .forEach(System.out::println);




    }
}
