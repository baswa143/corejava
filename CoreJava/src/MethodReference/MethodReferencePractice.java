package MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferencePractice {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mounika","pooja","sreela","karunya");
        Collections.sort(names,(s1,s2) -> s1.compareTo(s2));
        Collections.sort(names,String::compareTo);//arbitrary object non-static method called
        names.forEach(System.out::println);
        List<Integer> num = Arrays.asList(1,2,3,4,5);
       // names.forEach(name -> greeting(name));
       // names.forEach(MethodReferencePractice::greeting );//with static we have to use this way
//        names.forEach(new MethodReferencePractice()::greeting);//without static, we have used this method
//
//    public  void greeting(String name){
//        System.out.println("Hey hello My name is: "+name);
//    }
//    public void rollno(Integer num){
//        System.out.println("Roll no is: "+num.toString());
    }
}
