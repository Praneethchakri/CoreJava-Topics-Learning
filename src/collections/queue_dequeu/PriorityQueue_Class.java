package collections.queue_dequeu;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Class {

    public static void main(String[] args) {
        System.out.println("Priorty Queue feature: \n" +
                "1. Grows Dynamically \n" +
                "2. Follow Natual Sorting order while polling  the elements \n" +
                "3.As Not Synchronised/Not Thread Safe, not suitable for Concurrent environement and functionalites, \n" +
                "    To use it need make externally synchornized. use of Synchronized key word");

        System.out.println("add()--to Add \n" +
                "remove() -- to remove \n" +
                "element() -- to get");
        System.out.println("offer() -- to Add \n" +
                "poll() -- to remove\n" +
                "peek() -- to get/read");
        Queue<String> stringQueue = new PriorityQueue<>();
            stringQueue.offer("Praneeth");
            stringQueue.offer("Sushma");
            stringQueue.offer("PrajnaSri");
            stringQueue.offer("ChandraSekharRao");
            stringQueue.offer("Nagamani");

            System.out.println("Queue Data "+stringQueue);

            System.out.println(stringQueue.peek());
            System.out.println("After Peek"+stringQueue);
            System.out.println("After Poll "+stringQueue.poll());
            System.out.println("After Poll :Queue Data "+stringQueue);

            stringQueue.add("ChandraSekharRao");

            System.out.println("After Add :: Queue Data "+stringQueue);

        /**
         * Prioirty Queue follows the natural sorting order /Comparator provided at queue construction Time ordering
         */

        Queue<Integer>  integersQueue = new PriorityQueue<>();
            integersQueue.offer(1);
            integersQueue.offer(21);
            integersQueue.offer(11);
            integersQueue.offer(31);
            integersQueue.offer(111);
            integersQueue.offer(122);
            integersQueue.offer(21);
            integersQueue.offer(11);
//            integersQueue.stream().sorted().forEach(System.out::println);
        System.out.println("Queue Data "+integersQueue);
        /**
         * Just simple iteration
         */
        for (Integer i: integersQueue) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        /**
         * The priority Queue internally use the  Binary Heap structure to store the data and internally it will not maintain the sorted order.
         * while poll the elements . it will fetch the natual (object,String)/Ascending order of integers
         * the order of elements internally does not gurentee , but the first and least number will be the first element in queue.
         */
        while(!integersQueue.isEmpty()){
            System.out.print(integersQueue.poll()+" ");
        }
        System.out.println("\n");
        System.out.println("After Polling :: "+integersQueue);


        integersQueue.offer(4);
        integersQueue.offer(3);
        integersQueue.offer(1);
        integersQueue.offer(2);
        integersQueue.offer(0);
        integersQueue.offer(-1);

        System.out.println("Integer first Element Check "+integersQueue);


    }
}
