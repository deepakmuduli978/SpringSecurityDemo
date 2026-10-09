package com.example.SecurityFeatures.Repository;

import com.example.SecurityFeatures.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
