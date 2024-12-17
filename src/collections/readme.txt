Iterable (I)
Collection(I) && Collections(C) Utility Class



    List(I)
        ArrayList(C)
        LinkedList(C)
        Vector(C)

    Set(I)
        HashSet(C)
        LinkedHashSet(C)

    Map(I)
        TreeMap(C)
        HashMap(C)

    Queue(I)
        1.Queue's implementation classes  doesn't allow null value
        2.Implementation classes of Queue(I) is
            LinkedList(Not ThreadSafe), ArrayDequeue, Priority Queue(Not ThreadSafe),
            ConcurrentLinkedQueue(ThreadSafe), PriorityBlocking Queue(ThreadSafe).
        3.Commonly used for Task Scheduling and buffer management in application and Message Passing
        4.Support iteration through elements and the order of iteration is depends on Implementation

    Dequeue(I) extends Queue(I)
        PriorityQueue(C) implements Queue(I)
        LinkedList(C) implements Dequeue(I)
        ArrayDequeue(C) implements Dequeue(I)


        add()  add the element to the queue,and throws exception if the queue is empty
        remove()  removes and return the firt element of the queue,and throws exception if the queue is empty
        element()  returns the element at the front of the queue., throws exception if queue is empty


        offer() returns null if the queue is empty, add the element to queue
        poll() returns null if the queue is empty, remove and returns the first element from the queue.
        peek() returns null if the queue is empty, return the element at the front of the queue.



