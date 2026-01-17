
import java.util.*;

class Student{
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return name + "(" + marks + ")";
    }
}

public class VectorDemo{
    public static void main(String[] args) {
        
        Vector<Student> students = new Vector<>();

        //add(), addElement()
        students.add(new Student("Jayesh Patil", 96));
        students.add(new Student("Rupesh Dighe", 94));
        students.addElement(new Student("Sanket Musale", 92));
        students.addElement(new Student("Saksham Ratnaparkhi", 88));

        System.out.println("Initial Vector: " + students);

        //add(int, element)
        students.add(1, new Student("Kirti", 66));
        System.out.println("After insert at index 1: " + students);

        //get(), firstElement(), lastElement()
        System.out.println("First: " + students.firstElement());
        System.out.println("Last: " + students.lastElement());
        System.out.println("At index 2: " + students.get(2));

        //set(replace)
        students.set(2, new Student("Samruddhi", 72));
        System.out.println("After set at index 2: "+ students);

        //contains(), containsAll()
        System.out.println("Conatains Kirti? : " + students.contains(new Student("Kirti", 66)));

        System.out.println("IsEmpty ? : " + students.isEmpty());

        //Remove(), removeElement()
        students.remove(3);
        students.removeElement(new Student("Random", 0));      //False internaly
        System.out.println("After Removal: " + students);

        //size(), capacity()
        System.out.println("Size: " + students.size());
        System.out.println("Capacity: " + students.capacity());

        //ensureCapacity(), trimToSize()
        students.ensureCapacity(20);
        System.out.println("Capacity after ensure: " + students.capacity());

        students.trimToSize();
        System.out.println("Capacity after trim: " + students.capacity());

        //indexOf(), lastIndexOf()
        students.add(new Student("Pooja", 88));     //duplicate object
        System.out.println("Index of Pooja(88): " + students.indexOf(new Student("Pooja", 88)));
        System.out.println("Last index of Pooja(88): " + students.lastIndexOf(new Student("Pooja", 88)));

        //toArray()
        Object[] arr = students.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        //iteration (iterator)
        System.out.println("\nIterator: ");
        Iterator<Student> itr = students.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        //enumeration (Vector specific)
        System.out.println("\nEnumeration: ");
        Enumeration<Student> e = students.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

        //clear()
        students.clear();
        System.out.println("\nAfter clear: " + students);

    }
}