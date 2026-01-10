
import java.util.*;

enum CourseType{
    FRONTEND, BACKEND, DATABASE, DEVEOPS, CLOUD, AI
}

class EnumSetDemo{
    public static void main(String[] args) {
        
        //----- of() -------
        EnumSet<CourseType> set1 = EnumSet.of(CourseType.FRONTEND, CourseType.BACKEND);

        //----- allof() -----
        EnumSet<CourseType> set2 = EnumSet.allOf(CourseType.class);

        //----- noneof() -----
        EnumSet<CourseType> set3 = EnumSet.noneOf(CourseType.class);

        set3.add(CourseType.DEVEOPS);
        set3.add(CourseType.DATABASE);

        //----- rangeof() ------
        EnumSet<CourseType> set4 = EnumSet.range(CourseType.BACKEND, CourseType.CLOUD);

        //----- complementof() -----
        EnumSet<CourseType> set5 = EnumSet.complementOf(set3);

        System.out.println("\n----- EnumSet Example -----");
        System.out.println("Set1 (of): " + set1);
        System.out.println("Set2 (allof): " + set2);
        System.out.println("Set3 (noneof): " + set3);
        System.out.println("Set4 (range): " + set4);
        System.out.println("Set5 (complementof): " + set5);

        //Other operations
        System.out.println("\nContains AI ?: " + set2.contains(CourseType.AI));
        set1.remove(CourseType.BACKEND);
        System.out.println("After Remove: " + set1);

        set1.add(CourseType.DATABASE);
        System.out.println("After add operation: "+ set1);

        set1.clear();
        System.out.println("After clear: " + set1);
    }
}