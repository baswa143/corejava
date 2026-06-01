package Stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(10,20,33,40,50);
        list.stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
