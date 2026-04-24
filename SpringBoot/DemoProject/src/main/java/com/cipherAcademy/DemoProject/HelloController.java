
package com.cipherAcademy.DemoProject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //It marks this class as a REST Controller
//It means this class handles HTTP request and returns data directly
public class HelloController{

    @GetMapping("/hello")  //Maps getRequest to /hello

    public String sayHello(){  //This method returns the string msg
        return "Hello Cipher Coding Academy";
    }
}

/*
This is the controller handles the \hello end point
when users open the this url() -> this comntroller return the message
 */