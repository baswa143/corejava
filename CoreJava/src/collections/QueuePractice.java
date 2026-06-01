package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueuePractice {
    public static void main(String[] args) {
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>();

        System.out.println("_--_--_--_--_--_--_--_--_");
        //addition offer, add
        priorityQueue.offer(5);
        priorityQueue.offer(3);
        priorityQueue.add(4);
        priorityQueue.add(2);
        // retrieval peek
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.contains(5));
        //removed = remove ,pop
        while (!priorityQueue.isEmpty())
        {
            System.out.println(priorityQueue.poll());
        }

        ArrayDeque<String> arrayDeque=new ArrayDeque<>();
        //Addition addfirst, addlast, offerfirst, offerlast, addAll
        arrayDeque.offer("baswaraj");
        arrayDeque.addFirst("sandesh");
        arrayDeque.addLast("bandu");
        arrayDeque.offerFirst("srikanth");
        arrayDeque.offerLast("sarah");
        System.out.println(arrayDeque);
        System.out.println("_--__--__--__--__--__--__--__--__---__--__--__");
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque);

    }

}
