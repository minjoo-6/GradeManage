package com.example.grademanagement.controller;

import com.example.grademanagement.domain.Student;
import com.example.grademanagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.add(student);
    }

}
