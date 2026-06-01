package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Assignment1 {
    public static void main(String[] args) {
        Integer[] arr = {3, 6, 1, 8, 5, 10, 7};
        Function<Integer, Integer> fun = integer -> (int) Math.pow(integer, 2);
        int count = (int) Arrays.stream(arr)
                .filter(integer -> integer % 2 == 0)
                .map(integer -> (int) Math.pow(integer, 2))
                .peek(System.out::println)
                .count();
        System.out.println("total number of even numbers is:" + count);

    }
}


class A {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 1, 5, 1, 2);
        list.stream()
                .filter(e -> e % 2 == 0)
                //.collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

class B {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2, 54, 3, 32, 54, 15, 5);
        list1.stream()
                .distinct()
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println);

    }
}
