package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Spliterator;

public class Binary {
    public static void main(String[] args) {
        int ar[]={22,45,56,76,78,34};
        Arrays.sort(ar);
        int key=76;
        System.out.println(Arrays.toString(ar));

        System.out.println(key+" found at index: "+Arrays.binarySearch(ar,key));

        //cumulative sum of the ar
        //cumulative sum (prefix sum)
        Arrays.parallelPrefix(ar,(x,y)->(x+y));
        System.out.println(Arrays.toString(ar));

        // It in normal array cumulative sum
        for (int i=1;i<ar.length;i++) {
            ar[i]=ar[i]+ar[i-1];
        }
    }
}

class Split{
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
//        usually a collection (like ArrayList, HashSet, etc.)
//        spliterator() creates a Spliterator for that collection

        //Before
        //si → [1,2,3,4,5,6]
        //After split:
        //
        //si1 → [1,2,3]
        //si  → [4,5,6]
//        Spliterator<Integer> si=ar.spliterator();
//
//        Spliterator<Integer> si1=si.trySplit();
//
//        System.out.println(si.estimateSize());
//
//        si1.forEachRemaining(System.out::print);
//        System.out.println();
//        si.forEachRemaining(System.out::print);
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(23);
        set.add(32);
        set.add(34);
        set.add(15);
        set.add(4);
        System.out.println(set);

    }
}

//for example for the

