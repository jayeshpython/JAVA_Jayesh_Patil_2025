
import java.util.*;

class PriorityQueueDemo{
    public static void main(String[] args) {
        
        //Priority queue always gives highest priority element first(smalllest value based on comparator)


        PriorityQueue<Course> pq = new PriorityQueue<>(Comparator.comparingInt(c->c.deadlineDays));  
        /*Comparator.comparingInt(c->c.deadlineDays));  this is lambda expression for each course object c use
        its deadline day fields as the sorting key
        */
        //Comparator.comparingInt() Creates a comparator that compare int values
        
        //add(), offer() and both insert elements
        //add() throws an exception for bounded queue
        //offer() return false instead of exception
        //In  normal priority queue (both work the same)
        pq.add(new Course("Java", 5));
        pq.add(new Course("c++", 3));
        pq.offer(new Course("Python", 2));
        pq.offer(new Course("Web Development", 7));

        System.out.println("\n----- Priority Queue Elements ------");
        System.out.println(pq);             //Order not guaranteed

        //------- peek() -------
        System.out.println("\nNext Course to complete: " + pq.peek());
        //peek() return the head element(smallest deadline) but does not remove

        //------ poll() ------
        //poll() returns and remove the head element
        //removes in priority queue
        System.out.println("\nRemoving elements based on priority: ");
        while(!pq.isEmpty()){
            System.out.println("Completed: " + pq.poll());
        }

        //------ contains() -------
        //contains() use equals to compare objects
        pq.add(new Course("DSA", 4));
        System.out.println("\nContaind DSA question ? " + pq.contains(new Course("DSA", 4)));

        //------ size() -------
        System.out.println("\nSize: " + pq.size());

        //------ clear() -------
        pq.clear();
        System.out.println("Empty ? " + pq.isEmpty());
    }
}

class Course{
    String name;
    int deadlineDays;

    Course(String n, int d){
        name = n;
        deadlineDays = d;
    }

    @Override
    public String toString(){
        return name + "(" + deadlineDays + " days)";
    }
}