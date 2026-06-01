package collections;
import Practice.College;

import java.util.*;

public class ALpractice {
    public static void main(String[] args) {
        Integer []ar=new Integer[]{1,3,4,5,6,6,7};
        ArrayList<Integer> all=new ArrayList<>(Arrays.asList(ar));
        ArrayList arr=new ArrayList();
        all.add(4);
        all.add(3);
        System.out.println(all);
        arr.add("vas");
        arr.add("vin");
        arr.add("van");
        arr.add("run");
        System.out.println(Collections.synchronizedList(arr));
    }

}
