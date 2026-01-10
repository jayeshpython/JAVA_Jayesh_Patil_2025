
import java.util.*;

public class ArrayDequeueDemo{
    public static void main(String[] args) {
        
        ArrayDeque<String> courses = new ArrayDeque<>();
        
        //---- queue operations -----
        System.out.println("\n ----- Queue Operations (FIFO) ------");
        courses.offer("Java");
        courses.offer("Python");
        courses.offer("C++");
        System.out.println("Queue: " + courses);

        System.out.println("Peek(head): " + courses.peek());
        System.out.println("Poll (Remove head): " + courses.poll());
        System.out.println("After Poll: " + courses);

        //------ Stack Operations -------
        System.out.println("\n ----- Stack Operations (LIFO) ------");
        courses.push("React");
        courses.push("Spring Boot");
        System.out.println("Stack: " + courses);

        System.out.println("Peek (top): " + courses.peek());
        System.out.println("Pop (Removed top): " + courses.pop());
        System.out.println("After Pop: " + courses);
        
        //------ Other Methods ------
        courses.addFirst("Golang");
        courses.addLast("Machine Learning");

        System.out.println("\nAfter addFirst and addLast: " + courses);
        System.out.println("Remove First: " + courses.removeFirst());
        System.out.println("Remove Last: " + courses.removeLast());

        System.out.println("\nFinal Dequeue: " + courses);
        System.out.println("Contains Python ?: " + courses.contains("Python"));
        System.out.println("Size: " + courses.size());
    }
}