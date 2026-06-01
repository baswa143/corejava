package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Practice1 {
    public static void main(String[] args) {
        List<Integer>numbers = List.of(1,4,2,0,5,7,4,8);


//        Predicate<Integer> pred=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return (integer%2==0);
//            }
//        };
        Predicate<Integer>isEven=n->n%2==0;
        //without terminal we cannot execute
        numbers.stream()
                .filter(n->n%2==0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        long count = numbers.stream()
                .filter(n->n%2==0)
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println).count();
        System.out.println("Total even number is: "+count);
    }
}


//MAP
class Practice2{
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,2,0,5,7,4,8);
//        Function<Integer,Integer> function=new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return (int) Math.pow(integer,2);
//            }
//        };
//        Function<Integer,Integer> function=integer -> (int) Math.pow(integer,2);
//        int count=(int)numbers.stream()
//                .filter(integer->integer%2==0)
//                .sorted()
//                .map(function)
//                .peek(System.out::println)
//                .count();
//        System.out.println("Total  number is: "+count);

        //pattern
        //for even number (eg:- num is 2 = * *)
                                //num is 4 =****
        Function<Integer,Integer> function2=integer1 -> (int) Math.pow(integer1,2);
       long count =numbers.stream()
               .filter(integer -> integer%2==0)
               .sorted()
               .map(integer -> {
                   String s="";
                   for(int i=1;i<=integer;i++)
                       s+="*";
                    return s;
               })
               .peek(System.out::println)
               .count();
       System.out.println("Total even number is: "+count);

    }
}
