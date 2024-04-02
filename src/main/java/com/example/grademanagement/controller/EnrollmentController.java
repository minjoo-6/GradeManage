package com.example.grademanagement.controller;

import com.example.grademanagement.domain.Enrollment;
import com.example.grademanagement.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollment")
@RequiredArgsConstructor
public class EnrollmentController {
    private final EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> findAllEnroll(){
        return enrollmentService.findAllEnroll();
    }

    @GetMapping("/{studentId}")
    public List<Enrollment> findByIdEnroll(@PathVariable Long studentId){
        return enrollmentService.findByIdEnroll(studentId);
    }

    @PostMapping
    public void addEnroll(@RequestBody Enrollment enrollment){
        enrollmentService.addEnroll(enrollment);
    }

    @GetMapping("/course/{courseName}")
    public List<Enrollment> findGradeByCourse(@PathVariable String courseName){
        return enrollmentService.findGradeByCourse(courseName);
    }

    @PutMapping("/{student_id}/{courseName}")
    public void updateCourse(@RequestBody Enrollment enrollment){
        enrollmentService.updateGrade(enrollment);
    }
}
