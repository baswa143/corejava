package Interview_and_questions.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2);
        Stream<Integer> stream2 = Stream.of(3, 4);
        List<Integer> collect = Stream.concat(stream1, stream2).distinct().collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> list1 = List.of(5, 1);
        List<Integer> list2 = List.of(3, 2);
        List<Integer> list3 = List.of(6, 4);
        List<Integer> collect1 = Stream.of(list1, list2, list3).flatMap(List::stream)
                .sorted().collect(Collectors.toList());
        System.out.println(collect1);


    }
}
