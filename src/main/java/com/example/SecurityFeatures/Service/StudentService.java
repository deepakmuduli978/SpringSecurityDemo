package com.example.SecurityFeatures.Service;

import com.example.SecurityFeatures.Entity.Student;
import com.example.SecurityFeatures.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository repo;
    public StudentService(StudentRepository repo){
        this.repo=repo;
    }
    public Student CreateStudent(Student req){
        return repo.save(req);
    }
    public Student FindDetails(int id){
       Optional<Student> isexist=repo.findById(id);
       if(isexist.isEmpty()){
           return null;
       }
       return isexist.get();
    }
}
