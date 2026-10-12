package com.example.SecurityFeatures.Service;

import com.example.SecurityFeatures.Entity.Student;
import com.example.SecurityFeatures.Repository.StudentRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    private StudentRepository repo;
    private PasswordEncoder passwordEncoders;
 //   private PasswordEncoder passwordEncoder;
    public StudentService(StudentRepository repo,PasswordEncoder passwordEncoder){
        this.passwordEncoders=passwordEncoder;
        this.repo=repo;
    }
    public Student CreateStudent(Student req){
        String password=passwordEncoders.encode(req.getPassword());
        req.setPassword(password);
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
