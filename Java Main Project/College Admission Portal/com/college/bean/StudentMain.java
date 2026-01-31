
package com.college.bean;

import java.util.*;

public class StudentMain {
    private static int id=1;
    private HashMap<Integer,Student> studentsList;

    public StudentMain(Student s){
        studentsList=new HashMap<>();
        studentsList.put(id,s);
        id++;
    }
}