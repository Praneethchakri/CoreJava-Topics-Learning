package collections;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class CollectionTopic_Day1 {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
            queue.add("Praneeth");
            queue.add("Suresh");
            queue.add("Harish");
            queue.add("Kumar");
            queue.add("Arjun");
            queue.add("Prem");
            queue.offer("Chakravarthi");
            queue.offer("Diguvapalem");
            queue.add("Error");
            queue.offer("Sushma");



        /**
         * add() method throws error if the queue is full while trying to add element
         * offer() method returns false if the queue is full,
         *
         * remove() method Removes and return the element at the front of the queue, and throws error if the queue is empty
         * poll() method return null if the queue is empty, Removes and returns the element at the front of the queue.
         */

//            Iterator<String> itr = queue.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
        System.out.println(queue);
        System.out.println("Removed Header Element "+queue.remove());
        System.out.println("Removed Header Element "+queue.remove());
        queue.clear();
        System.out.println(queue);
        System.out.println("poll Header element "+queue.poll());
//        System.out.println("Remove Header element "+queue.remove());




        queue.add("Dhoni");
        queue.add("Sachin");
        queue.add("Ganguly");
        queue.remove();
        System.out.println(queue);
        System.out.println("queue.element() "+queue.element());

        queue.add("Virat");
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.element());


        queue.clear();

        System.out.println(queue);

        queue.offer("Surya");
        queue.offer("Pant");
        queue.offer("Shreyans");
        queue.offer("Chehal");

        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());


//        add()
//        remove()
//        element()
//
//        offer()
//        poll()
//        peek()










    }
}
