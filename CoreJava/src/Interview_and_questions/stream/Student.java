package Interview_and_questions.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    public static void main(String[] args) {
        List<Integer> marks=List.of(0,13,20,25,30);
        List<Integer> marks1 = marks;
        marks1.stream().map(i->i+5).collect(Collectors.toList());
        marks.stream().filter(m->m>35).forEach(System.out::println);
        List<Integer> collect = marks.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0).collect(Collectors.toList());
        List<Integer> collect1 = marks.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(collect1);
        List<String> names=List.of("shiva","rutivik","sumit","rushi");
        List<String> collect2 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(collect2);
    } 
}
