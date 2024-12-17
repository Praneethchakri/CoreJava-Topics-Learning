package collections.queue_dequeu;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class ArrayDequeu_Class {
    public static void main(String[] args) {


        System.out.println("ArrayDequeue can be used as Queue functionalies like add(),remove(),element() \n" +
                "And also as a Stack with push(),pop(),peek() \n" +
                "ArrayDequeue behaves a Queue and Stack, and it gives better performance as Stack.\n" +
                "" +
                "ArrayDequeue as Stack behave as LastInFirstOut \n" +
                "ArrayDequeue as Stack performs well as compared to Stack \n" +
                "ArrayDequeue is not thread Safe, if multiple threads are accessing it concurrently , proper synchonization is required.");

        Deque<String> arrayDequeue = new ArrayDeque<>();

        arrayDequeue.offer("Praneeth");
        arrayDequeue.offer("Sushma");
        arrayDequeue.offer("PrajnaSri");
        arrayDequeue.offer("ChandraSekhar");
        arrayDequeue.offer("Nagamani");
        arrayDequeue.add("USing Add MEthod");
        arrayDequeue.push("Using Push Method to use as Stack");
        arrayDequeue.push(null); // ArrayDequeu doesn't allow null as a Stack

        System.out.println(arrayDequeue);
        System.out.println(arrayDequeue.element());
        while (!arrayDequeue.isEmpty()) {
            System.out.println("ArrayDequeue " + arrayDequeue.poll() + " \n");
        }

        System.out.println("Stack is a legacy class..");
        Stack<String> stack = new Stack<>();
        stack.push("Praneeth");
        stack.push("Diguvapalem");
        stack.push("Chakravarthi");
        stack.push(null); // Stack allows null
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
    }
