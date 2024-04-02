package com.example.grademanagement.service;

import com.example.grademanagement.domain.Student;
import com.example.grademanagement.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public void add(Student student) {
       studentRepository.add(student);
    }


}
