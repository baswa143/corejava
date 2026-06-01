package Interview_and_questions.stream;

import java.util.Optional;

public class FirstNonRepeated {


    public static void main(String[] args) {
        String input="swiss";
        Optional<Character> firstNonRepeated= input.chars()
                .mapToObj(c->(char)c)
                .filter(c->input.indexOf(c)==input.lastIndexOf(c))
                .findFirst();
        System.out.println(firstNonRepeated.orElse(null));
                }
                String str="Rushi";
    String vowels="aeiouAEIOU";
}
/*
Optional<Character> notrepeatedletter=input.chars()
.mapToObj(c->input.indexOf(c)==input.lastIndexOf(c))
.first
 */