package Interview_and_questions.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionStream {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6);

//        1. Filter Even Numbers from a List
        List<Integer>evennum =num.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(evennum);

   //     2.Find Maximum in a List
        int  maxnum = num.stream().max(Integer::compare).orElseThrow();
        System.out.println(maxnum);

        //3. Sort a List
        //Question: Sort a list of integers in descending order.

        List<Integer> num1 = List.of(3, 5, 1, 4, 2);
        List<Integer>desc = num1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(desc);

//        4. Count Strings with Specific Prefix
//        Question: Count strings starting with a specific prefix,and print name e.g., “A”.

        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
         long count=names.stream().filter(name->name.startsWith("A")).count();
        System.out.println(count);
        names.stream().filter(e->e.startsWith("A")).forEach(System.out::println);

//      5. Find First Non-Repeated Character in a String
//        Question: Find the first non-repeated character in a string.

        String input="swisss";
        Character nonRepeatedwords= input.chars().mapToObj(c->(char)c).filter(e->input.indexOf(e)==input.lastIndexOf(e)).findFirst().orElse(null);
        System.out.println("Repeat ->->->->->"+nonRepeatedwords);
        //6. Convert List of Strings to Uppercase
        //Question: Convert all strings in a list to uppercase.

        List<String> name = Arrays.asList("java", "stream", "api");
        List<String>words=name.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(words);

        //7. Sum of Numbers in a List
        //Question: Calculate the sum of all numbers in a list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum=numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //8. Check if Any String Matches a Condition
        //Question: Check if any string in a list contains “API”.
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        boolean match=strings.stream().anyMatch(s->s.contains("API"));
        System.out.println(match);

        //9. Find Duplicate Elements in a List
        //Question: Identify duplicate elements in a list.
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        number.stream().distinct().forEach(System.out::println);
        List<String> dnames = Arrays.asList("Alice", "Bob", "Annie", "Alice", "Charlie");
        HashSet<String>unique=new HashSet<>();
        dnames.stream().distinct().forEach(System.out::println);
        Set<String> duplicatess=dnames.stream().filter(e->unique.add(e)).collect(Collectors.toSet());
        System.out.println(duplicatess);

        //10. Group Strings by Length
        //Question: Group a list of strings based on their length.
        List<String> word = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer, List<String>> length=word.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(length);

        //11. Flatten a List of Lists
        //Question: Given a list of lists, flatten it into a single list.
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> flatted=listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatted);

        //12. Concatenate Strings
        //Question: Concatenate all strings in a list into a single string.
        List<String> wordss = Arrays.asList("Stream", "API", "is", "powerful");
        String concatenate=wordss.stream().reduce("", (s1,s2)->s1+" "+s2).trim();
        System.out.println(concatenate);
        String concatenation=wordss.stream().collect(Collectors.joining(" ") );
        System.out.println(concatenation);

        //13. Find the Longest String
        //Question: Find the longest string in a list.
        List<String> w = Arrays.asList("Java", "Stream", "API", "Development");
        String longest=  w.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).orElse(null);
        System.out.println(longest);

        //14. Count Frequency of Characters in a String
        //Question: Count the frequency of each character in a string.
        String input1="success";
        Map<Character, Long> freq=input1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(freq);

        //15. Parallel Stream to Compute Sum
        //Question: Use parallel streams to compute the sum of numbers.
        List<Integer> num2=Arrays.asList(1,4,3,2,5);
        int sum1=num2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);

        //17. Remove Null Values
        //Question: Remove null values from a list using filter.
        List<String> letter = Arrays.asList("Java", null, "Stream", null, "API");
        List<String> remove=letter.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(remove);
        letter.stream().filter(Objects::nonNull).forEach(System.out::println);

        //18. Calculate Average of Numbers
        //Question: Calculate the average of a list of integers.
        List<Integer> numbers1 = Arrays.asList(10, 20, 30, 40, 50);
        double avg=numbers1.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(avg);
       // numbers1.stream().mapToInt(Integer::intValue).average().isPresent(System.out::println);

        //19. Collect Map from List
        //Question: Convert a list of strings into a map with the string as the key and its length as the value.
        List<String> words1 = Arrays.asList("Java", "Stream", "API");
        Map<String,Integer>convert=words1.stream().collect(Collectors.toMap(e->e,String::length));
        System.out.println(convert);
        Map<String,Integer>convert1=words1.stream().collect(Collectors.toMap(Function.identity(),String::length,(e1,e2)->e1,HashMap::new));

        //20. Partition Numbers into Even and Odd
        //Question: Partition a list of numbers into even and odd.
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partition=numbers3.stream().collect(Collectors.partitioningBy(e->e%2==0));
        System.out.println(partition);

        //21. Find Nth Largest Element in a List
        //Question: Find the 3rd largest element in a list.
        List<Integer> numbers4 = Arrays.asList(10, 20, 50, 40, 30);
        int res = numbers4.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(0);
        System.out.println(res);

        //22. Find All Palindromic Strings
        //Question: Find all strings that are palindromes in a list.
        List<String> words4 = Arrays.asList("radar", "level", "world", "java");
        List<String> palin=words4.stream().filter(e->e.equals(new StringBuilder(e).reverse().toString())).collect(Collectors.toList());
        System.out.println(palin);
        Map<Boolean,List<String>> palindrome=words4.stream().collect(Collectors.partitioningBy(e->e.equals(new StringBuilder(e).reverse().toString())));
        System.out.println(palindrome);

        //23. Reverse Each String in a List
        //Question: Reverse each string in a list.
        List<String> words5 = Arrays.asList("Java", "Stream", "API");
        List<String> rev=words5.stream().map(e->new StringBuilder(e).reverse().toString()).collect(Collectors.toList());
        System.out.println(rev);

        //24. Filter and Convert Map to List
        //Question: Given a map, filter entries with values greater than 10 and collect keys into a list.
        Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);

//        map.entrySet().forEach(System.out::println);
//        List<String> list=map.entrySet().stream().map(e->e.getKey()+"->"+ e.getValue()).toList();
//        System.out.println(list);
//        map.entrySet().stream().filter(e->e.getKey()>10).map(Map.Entry::getKey).collect(Collectors.toList());

        List<String> collect = map.entrySet().stream().filter(e -> e.getValue() > 10).map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> i = map.entrySet().stream().filter(e->e.getKey().equals("C"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        System.out.println(i);

        //31. Find the Longest Word from a Sentence
        //Question: Find the longest word in a sentence using Streams.
        String sentence = "Java Stream API is very powerful";
        String longword=Arrays.stream(sentence.split(" ")).max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(longword);
        //remove the longest word
        String longest_word=Arrays.stream(sentence.split(" ")).filter(e->!e.equals(longword))
                .reduce((e1,e2)->e1+" "+e2).orElse(null);
        System.out.println(longest_word);

        //61. Sort a List Based on Frequency of Elements
        //Question: Sort a list based on the frequency of elements in descending order.
        List<Integer> numbers2 = Arrays.asList(4, 5, 6, 5, 4, 3);
        List<Integer>resu =numbers2.stream().sorted(Comparator.comparingInt(e->Collections.frequency(numbers2,e))).distinct().collect(Collectors.toList());


    }
}
