

package dsaa;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("Top element: " + stack.peek());  // Cherry

        // Pop element
        System.out.println("Popped: " + stack.pop());        // Cherry

        System.out.println("After popping: " + stack);       // [Apple, Banana]

        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
