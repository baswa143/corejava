package Interview_and_questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*List<String> list = List.of("apple", "banana", "apple", "grapes");
Notice "apple" appears twice.
        🔹 Problem Without Merge Function
Map<String, Integer> res = list.stream()
        .collect(Collectors.toMap(Function.identity(), String::length));
This will throw:
java.lang.IllegalStateException: Duplicate key apple

because the same key "apple" appears more than once.*/

public class Converting {
    public static void main(String[] args) {
        List<String> list = List.of("Banana","apple","orange","grapes","apple");
        HashMap<String,Integer> res=  list.stream()
                .collect(Collectors
                        .toMap(Function.identity(),
                                String::length,
                                (e1, e2)->e1,
                                HashMap::new));
        System.out.println(res);
  //two-way we can slove
//        Map<String,Integer> result=list.stream()
//                .collect(Collectors.
//                        toMap(Function.identity()
//                                ,String::length));
//        System.out.println(result);
        HashMap<String, Integer> collect = list.stream().collect(Collectors
                .toMap(Function.identity(), String::length, (e1, e2) -> e1, HashMap::new));

        String value="fkdsjlajdlsjaldjlaie";
        Map<Character, Long> aeiou = value.chars().mapToObj(c -> (char) c).filter(e -> "aeiou".indexOf(e)!=-1)
                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(aeiou);

    }
}
//*/
/*
* palindrome -done
* vowels
* duplicate values
* sorted order
* count the vowels
* character of vowels
* armstrong number
* table employee
* fibonacci series
* prime number
*
*
* */
