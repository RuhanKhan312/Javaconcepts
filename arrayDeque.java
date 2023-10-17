import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String args[]) {
//
//        ArrayDeque<String> animals = new ArrayDeque<>();
//        animals.add("dog");
//
//        animals.addFirst("Tiger");
//
//        animals.addLast("Horse");
//        System.out.println("Array Deque: " + animals);

        //offer is same as add. offer was not available in linked list but it can be used in array deque


        ArrayDeque<String> animals = new ArrayDeque<>();
        animals.offer("dog");

        animals.offerFirst("Tiger");

        animals.offerLast("Horse");
        System.out.println("Array Deque: " + animals);

        System.out.println("First element: " + animals.getFirst());

        System.out.println("Last element: " + animals.getLast());

//        peek() - returns the first element of the array deque
//        peekFirst() - returns the first element of the array deque (equivalent to peek())
//        peekLast() - returns the last element of the array deque


//        remove() - returns and removes an element from the first element of the array deque
//        remove(element) - returns and removes the specified element from the head of the array deque
//        removeFirst() - returns and removes the first element from the array deque (equivalent to remove())
//        removeLast() - returns and removes the last element from the array deque

        animals.remove("dog");
        System.out.println("Array Deque: " + animals);

        //poll() was not available for linked list but can be used in array deque
//        poll() - returns and removes the first element of the array deque
//        pollFirst() - returns and removes the first element of the array deque (equivalent to poll())
//        pollLast() - returns and removes the last element of the array deque

        animals.add("cat");
        animals.add("dog");

        animals.poll();
        System.out.println("Array Dequeue: " + animals);

        animals.pollFirst();
        System.out.println("Array Dequeue: " + animals);

//        To remove all the elements from the array deque, we use the clear() method. For example,

//        animals.clear();
//        System.out.println("Array Dequeue: " + animals);


    }
}


















