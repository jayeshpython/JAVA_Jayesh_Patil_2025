
package com.cipherAcademy.DemoProject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

/*sets base url as /students
-all methods inside this class work under /students */
@RequestMapping("/students")
public class StudentController{
    
    private List<Student> students=new ArrayList<>();

    public StudentController(){
        students.add(new Student(1, "Sanket", 20));
        students.add(new Student(2, "Rupesh", 20));
        students.add(new Student(3, "Raju", 20));
    }

    /*it handles the getrequest for /students */
    @GetMapping
    public List<Student> getAllStudents(){
        return students;
    }

    /* handles the getrequest for /students/id */
    /*example) /students/1  */

     @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream()              /*it starts the stream processing on list */
                .filter(s -> s.getId() == id)   //finds the student whose id matches
                .findFirst()              //returns the first matching student
                .orElse(null);            //if no student found it returns null
                
    }

    // POST: add new student
    /*handles post request for students */
    @PostMapping
    public String addStudent(@RequestBody Student student) { //reads json request body
        students.add(student);
        return "Student added!";
    }


    // PUT: update student by ID
    @PutMapping("/{id}")    //handles the put request for updating the student 
    /*2pathVariavble int id ->takes id from url
    -RequestBody ->takes updated data from request body */
    public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .map(s -> {
                    s.setName(updatedStudent.getName());
                    s.setAge(updatedStudent.getAge());
                    return "Student updated!";
                })
                .orElse("Student not found!");
    }
    /* handles the delete request when the id matches */
     @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        boolean removed = students.removeIf(s -> s.getId() == id);
        return removed ? "Student deleted!" : "Student not found!";
    }
}

/*-this controller handles student related API request and it has responsibilities:
    -getAllStudent()
    -getOneStudentById()
    -addAStudent()
    -updateAStudent()
    -deleteAstudent() */