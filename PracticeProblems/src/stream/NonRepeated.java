package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeated {
    public static void main(String[] args) {
        String str="aabbcdde";
        Character c1 = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println(c1);

        Character c2 = str.chars().mapToObj(c -> (char) c).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().orElse(null);
        System.out.println(c2);
        Boolean b = str.chars().mapToObj(c -> (char) c).map(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst().orElse(null);
        System.out.println(b);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> unique = new HashSet<>();
        Set<Integer> collect = numbers.stream().filter(n -> numbers.indexOf(n) != numbers.lastIndexOf(n)).collect(Collectors.toSet());
        System.out.println(collect);

        Set<Integer> collect1 = numbers.stream().filter(n -> unique.add(n)).collect(Collectors.toSet());
        System.out.println(collect1);

        //10. Group Strings by Length
        //Question: Group a list of strings based on their length.

        List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer, List<String>> collect2 = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect2);

    }
}
