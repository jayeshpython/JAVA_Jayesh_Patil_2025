

import java.util.*;

public class CourseSetComparison {
    public static void main(String[] args){

        //Same list of course name with dublicates and one null

        List<String> courses=Arrays.asList("Java Fundamentals","Python for Beginners","Data Structures","Java Fundamentals"); 
        //HashSET-No order ,Allows null
        Set<String> hashSet=new HashSet<>(courses);
        //LinkedHashSet-maintains insertion,allows null
        Set<String> linkedHashSet=new LinkedHashSet<>(courses);

        Set<String> treeSet=new TreeSet<>();
        for(String course:courses){
            try{
                treeSet.add(course);
            }catch(NullPointerException e){
                System.out.println("TreeSet cannot store null values");
            }
        }
        System.out.println(hashSet);

        System.out.println("\n====TreeSet(Sorted order,No null=====)");

        System.out.println("====HashSet(Unordered ,allow null)====");
        System.out.println(hashSet);

        System.out.println("\n===== LinkedHashSet (Insetion order)====");
        System.out.println(linkedHashSet);

        System.out.println("\n====TreeSet(Stored ordermNo null====)");
        System.out.println(treeSet);

        //Demostrate some common operations
        System.out.println("\n----Common Operations----");

        System.out.println("Contains 'Data Structures' in HashSet?"+hashSet.contains("Data Structures"));
        System.out.println("Contains 'Data Structures' in LinkedHashSet?"+linkedHashSet.contains("Data Structures"));
        System.out.println("Contains 'Data Structures' in TreeSet?"+treeSet.contains("Data Structures"));

        System.out.println("\n Removing 'Web Development' from all sets.....");
        hashSet.remove("web Development");
        linkedHashSet.remove("Web Development");
        treeSet.remove("Web Development");

        System.out.println("\nAfter Removal: ");
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedListSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);

        //Display Size
        System.out.println("\nSizes: ");
        System.out.println("HashSet Size: " + hashSet.size());
        System.out.println("LinkedHashSet Size: " + linkedHashSet.size());
        System.out.println("TreeSet Size: " + treeSet.size());

        //Clear all sets
        hashSet.clear();
        linkedHashSet.clear();
        treeSet.clear();

        System.out.println("\nAfter clear: ");
        System.out.println("HashSet empty ? : " + hashSet.isEmpty());
        System.out.println("LinkedHashSet empty ? : " + linkedHashSet.isEmpty());
        System.out.println("TreeSet empty ? : " + treeSet.isEmpty());

    }
}