package dsaa;
import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Offer elements
        queue.offer("Red");
        queue.offer("Green");
        queue.offer("Blue");

        System.out.println("Front element: " + queue.peek()); // Red

        // Poll (remove) element
        System.out.println("Removed: " + queue.poll());       // Red

        System.out.println("After polling: " + queue);        // [Green, Blue]

        System.out.println("Front element now: " + queue.peek()); // Green
    }
}
