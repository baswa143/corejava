package collections;
import java.util.*;
//vector
public class Vpractice {
    public static void main(String[] args) {
        //size-no of elements present in list
        //capacity - Array capacity
        //generics 1.5 (IMP Interview Point)
        //vector java 1.0
        //collections 1.2
        //it defaults synchronized
        Vector v= new Vector();
        v.add("baswa");
        v.add("sandy");
        v.add(0,"bandu");
        v.add("rutwik");
        v.add("ram");

        Vector v2 = new Vector();
        v2.add("baskar");
        v2.add("sandesh");
        //in vector, we can add duplicate value can  add.
//        v.addAll(v2);// it v2 data is added all in v
//        System.out.println(v);
//       // v.remove(1);
//        v.set(1,"vikas");
//        v.removeAll(v2);
       // v.clear();
//        System.out.println(v);
//        System.out.println(v.contains("rutwik"));
       // System.out.println("size:"+v.size());
        //System.out.println("Capacity:"+v.capacity());
//        Object[]arr=v.toArray();
//        System.out.println(Arrays.toString(arr));
        Object[] arr= new Object[]{1,4,2,4,5,5};
       // Vector v3= new Vector(Arrays.asList(arr));
        Vector<Integer> v3= new Vector<>();//Generics //generics applicable out the collections all so
        v3.add(13);
        int sum=0;
        for(int i=0;i<v3.size();i++)
        {
            sum+=v3.get(i);
        }
        System.out.println();

        //topic point pin

        //What is the default capacity? //10
        //What us the initial capacity? //10
        //does it allow duplicate elements?yes
        //does it allow null values? //yes
        //does it maintain the insertion order?//yes
        //does it maintain the sorted order?//No
        //does it offer the random access of elements? //yes
        //Is it synchronised ?//yes// it does not encourage multithread at once it will  one by one
        //what is it good at?//Multi threading, data is increased exponentially

//
    }
}
//1. Synchronization & Thread SafetyVector: Every method in Vector is synchronized.
// This means it is thread-safe; multiple threads can access it without data corruption.

// ArrayList: It is non-synchronized. It is not thread-safe by default.
// If multiple threads access an ArrayList simultaneously, you must handle synchronization
// externally.

// 2. PerformanceVector: Slower. Because it is synchronized, there is an overhead
// of acquiring a "lock" every time a method is called, which slows down execution.

// ArrayList: Faster. Since there is no locking mechanism, it performs operations
// much more quickly in a single-threaded environment.

// 3. Data Growth (Resizing Logic)When the internal array becomes full, both classes
// resize automatically, but by different amounts
// :Vector: By default, it doubles (100%) its size. If the current capacity is 10,
// it grows to 20.ArrayList: It grows by 50% of its current size.
// If the current capacity is 10, it grows to 15.
// 4. Legacy vs. ModernVector: It is a Legacy class. It was part of the original
// Java (JDK 1.0) before the Collection Framework existed.
// It was later retrofitted to implement the List interface
// .ArrayList: It is a Modern class. It was introduced in JDK 1.2 as a standard
// part of the Collection Framework.

// 5. Iteration (Traversal)Vector: Can use both Iterator and Enumeration
// to move through the elements.ArrayList: Can only use Iterator (or ListIterator).


// Summary Table for Quick RecallFeatureArrayListVectorThread SafetyNoYesPerformanceHigh
// (Fast)Low (Slow)ResizingGrows by 50%Grows by 100%Legacy?NoYesRecommended?
// Yes (for most cases)No (use CopyOnWriteArrayList instead)Interview
// "Pinpoint" Tip:If the interviewer asks: "When should I use Vector?
// "The modern answer is: "Almost never." If you need thread safety, it is better
// to use Collections.synchronizedList() or CopyOnWriteArrayList, as Vector is
// considered obsolete in modern Java development.Would you like me to explain how
// LinkedList differs from these two? This completes the "List Interface" trio
// often asked in interviews.