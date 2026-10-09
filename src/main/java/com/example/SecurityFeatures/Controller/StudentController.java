package com.example.SecurityFeatures.Controller;

import com.example.SecurityFeatures.Entity.Student;
import com.example.SecurityFeatures.Service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService Service;
    public StudentController(StudentService Service){
        this.Service=Service;
    }

    @PostMapping
    public Student res(@RequestBody Student req){
            return Service.CreateStudent(req);
    }
    @GetMapping("{id}")
    public Student res(@PathVariable int id){
        return Service.FindDetails(id);
    }
}
