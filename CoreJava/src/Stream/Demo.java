package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(List.of("baswa","sandy","bandu"));
        for(String name:list){
            System.out.println(name);
        }
        System.out.println("_________--------__________");
        list.forEach(name-> System.out.println(name));
        System.out.println("_________--------__________");
        list.forEach(System.out::println);
        System.out.println("_________--------__________");

       Optional<String> result= list.stream()
                .filter(e->e.startsWith("b"))
                .findFirst();
//                .findAny();
                result.ifPresent(System.out::println);
        System.out.println("_________--------__________");

        List<Integer> num=List.of(1,4,5,3,6,7,8);
        num.stream()
                .filter(e->e%2==0)
                .peek(System.out::println)
                .map(e->e%2==0)

                .forEach(System.out::println);


    }

}
