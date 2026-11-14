import java.util. *;
public class arraydeque1 {
    public static void main(String[] args) {
        /*
        FASTER 
        Heterogenous - Allows mutliple types of data
        Null not allowed
        Duplicates are allowed
        Follows insertion order - returns element as per inserted order
        Queue uses FIFO, Deque(FIFO+LIFO) -> STACK + QUEUE
        */
        ArrayDeque <Integer> a = new ArrayDeque<>(); 
            a.add(10);
            a.add(8);
            a.add(1);
            System.out.println(a);

        //Diiferent methods practice

            //add methods
            a.addFirst(99);
            a.addLast(44);
            System.out.println(a);

            a.offerFirst(101);
            a.offerLast(777);
            System.out.println(a);

            //remove methods
            a.removeFirst();
            a.removeLast();
            System.out.println(a);

            //peek and poll
            a.peekFirst();
            a.peekLast();
            System.out.println("PEEK first and last: "+a);
            a.pollFirst();
            a.pollLast();
            System.out.println("POLL: "+a);

            //get - a linked list method
            System.out.println(a.getFirst());
            System.out.println(a.getLast());


    }
}































/*
Difference between PriorityQueue and ArrayDeque:

1. Ordering:
   - PriorityQueue removes elements according to priority (natural ordering by
     default, or a supplied Comparator). Its head is the least element by
     default; it does not preserve insertion order.
   - ArrayDeque preserves the order of elements from front to back. Elements
     are added to and removed from either end.

2. Main use:
   - PriorityQueue is useful when the highest- or lowest-priority element must
     be processed first.
   - ArrayDeque can be used as a FIFO queue or a LIFO stack.

3. Operations:
   - PriorityQueue offers insertion and priority-based removal/inspection
     (offer/add, poll/remove, peek/element). It does not provide efficient
     access to arbitrary elements by index.
   - ArrayDeque offers operations at both ends (addFirst/addLast,
     removeFirst/removeLast, peekFirst/peekLast), plus queue and stack methods.

4. Performance:
   - PriorityQueue insertion and removal are generally O(log n); inspecting
     the head is O(1).
   - ArrayDeque insertion and removal at either end are amortized O(1).

5. Common behavior:
   - Both allow duplicate elements and do not allow null elements.
   - Neither is synchronized/thread-safe by default.
*/

