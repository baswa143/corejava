package ForEachMethod;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachMethodPractice {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4);
        Set<Integer> set=new HashSet<>(list);
        Queue<Integer> queue=new PriorityQueue<>(list);


//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//        System.out.println();
//
//        for(Integer i:list){ //for each Method
//            System.out.println(i);
//        }
//        Consumer<Integer> consumer=new Consumer<Integer>() { //using anoynmous
//            @Override
//            public void accept(Integer integer) {
//
//                System.out.println(integer);
//            }
//        };
//        Consumer<Integer> consumer=(integer)-> System.out.println(integer); // if we are
//        list.forEach(consumer);
        list.forEach((integer)-> System.out.println(integer));
        queue.forEach(integer -> System.out.println(integer));
        list.forEach(integer -> {//it is called has internal looping
            if(integer%2==0)
                System.out.println("It is an even number");
            else
                System.out.println("It is a odd number");
        }
        );
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"baswa");
        map.put(102,"bandu");
        map.put(103,"sandy");

//        BiConsumer<Integer, String> biConsumer=new BiConsumer<Integer, String>(){
//          public void accept(Integer key,String value){
//              System.out.println(key+" "+value);
//          }
//
//        };
//        map.forEach(biConsumer);
        BiConsumer<Integer,String>biConsumer=(key,value) -> System.out.println(key+" "+value);
        map.forEach(biConsumer);
       // map.forEach((key,value) -> System.out.println(key+" "+value));

    }
}
