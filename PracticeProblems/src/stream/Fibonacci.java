package stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> collect = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(10).map(t -> t[0]).collect(Collectors.toList());
        System.out.println(collect);

        Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]}).limit(10).map(t->t[0]).forEach(System.out::println);
        List<Integer> collect1 = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).limit(20).map(t -> t[0]).collect(Collectors.toList());
        System.out.println(collect1);

        //using the IntStream
//        int n=420;
//        int fib[]= new int[n];
//        fib[0]=0;
//        fib[1]=1;
//        IntStream.range(2,n).forEach(i->fib[i]=fib[i-1]+fib[i-2]);
//        IntStream.of(fib).forEach(x->System.out.println(x+" "));

    }
}
