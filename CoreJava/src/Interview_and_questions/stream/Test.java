package Interview_and_questions.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str="abcandabcliipoooo";
        Map<Character,Long> fre=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(e->e,Collectors.counting()));
        List<Integer> list=List.of(1,2,3,4,8,5,1,5,4,5,9);

    }
}
