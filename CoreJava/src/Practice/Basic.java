package Practice;

import java.util.*;

public class Basic {
    //non parameter / static method
    public static void goodmorning(){
        System.out.println("hello shivanand Good morning");
    }
    //non-static method
    public void goodnight(){
        System.out.println("hello shivanand Good night");
    }

    public static void main(String[] args) {
        goodmorning();
        // every method need a obj to call the method function when it is non-static
        //Basic a = new Basic();

         new Basic().goodnight();
    }
}

class ArrayList1{
    public static void main(String[] args) {
//        List <Integer> list =new ArrayList<>();
//        list.add(2);
//        list.add(9);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(1);
//        //insorting order
//        Collections.sort(list);
//        System.out.println(list);
//        List<String> list1= new ArrayList<>();
//        list1.add("v");
//        list1.add("s");
//        list1.add("b");
//        list1.add("p");
//      //  list.addAll((list));
////        System.out.println(list1);
//        System.out.println("++++++++++++----------------------");
////        System.out.println(list);
//        System.out.println("??????????????=========");
//
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//        ListIterator li=list1.listIterator();
//        while (li.hasNext()){
//            System.out.println(li.next());
//        }
//        while (li.hasPrevious()){
//            System.out.println(li.previous());
//        }
//
////        Set<Integer> set= new HashSet<>(list);
////        set.add(1);
////        set.add(2);
////       // System.out.println(set);
////        System.out.println(">>>>===___............======");
////        //Iterating set
////        for(Integer i:set){
////            System.out.println(i);
////        }
////        System.out.println("///======================>>>>>>>>>>>>>>>");
////        //iterating in foreach reference
////        set.forEach(System.out::println);
////        System.out.println("_________---------_________-------_______--------");
////        set.forEach(s-> System.out.println(s));
//
//        Vector<Integer>v=new Vector<>();
//        v.add(1);
//        v.add(2);
//        v.add(3);
//        v.add(4);
//        v.add(5);
//
//        Enumeration e=v.elements();
//        while (e.hasMoreElements()){
//            System.out.println(e.nextElement());
//        }

        HashMap<String,Integer> map=new HashMap<>();
        map.put("v",1);
        map.put("s",2);
        map.put("b",3);
        map.put("p",4);
        System.out.println(map.size());
        //Iterating
        for(String i:map.keySet()){
            System.out.println(i);
        }

        for(Map.Entry me:map.entrySet()){
            System.out.println(me.getKey()+"-->>"+me.getValue());
        }

        map.forEach((K,V)-> System.out.println(K+">>>>"+V));



    }
}
