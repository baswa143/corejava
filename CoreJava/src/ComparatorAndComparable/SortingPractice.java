package ComparatorAndComparable;

import java.util.*;

public class SortingPractice {
    public static void main(String[] args) {
        Integer []arr={2,3,1,7,4};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
//        List<Integer> list=new ArrayList<>(Arrays.asList(arr));
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        Student[] students={
                new Student(105,"baswa",400),
                new Student(102,"sandy",300),
                new Student(103,"bandu",300),
                new Student(104,"Sweety",400)
        };
        Comparator<Student> comparator=new  Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return (o1.name.compareTo(o2.name));
            }
        };
        Comparator<Student> namecomparator=( s1,  s2)->s1.name.compareTo(s2.name);


        Arrays.sort(students ,namecomparator.reversed());
        System.out.println(Arrays.toString(students));

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }
}
