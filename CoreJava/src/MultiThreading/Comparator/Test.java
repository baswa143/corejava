package MultiThreading.Comparator;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Integer> l= Arrays.asList(21,32,434,12,43,53);
        Comparator<Integer>c=(I1,I2)->(I1<I2)?-1:(I1>I2)?+1:0;
        Collections.sort(l,c);
        System.out.println(l);
        l.stream().forEach(System.out::println);
    }
}
