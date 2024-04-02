package com.example.grademanagement.service;

import com.example.grademanagement.domain.Course;
import com.example.grademanagement.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public List<Course> findAllCourse() {
        return courseRepository.findAllCourse();
    }

    public void addCourse(Course course) {
        courseRepository.addCourse(course);
    }
}
