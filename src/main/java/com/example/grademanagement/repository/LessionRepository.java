package com.example.grademanagement.repository;

import com.example.grademanagement.domain.Enrollment;

import java.util.List;

public interface LessionRepository {
    List<Enrollment> getAllCourses();

    List<Enrollment> getCourseById(Long studentId);

    List<Enrollment> getGradeByCourse(String courseName);

    void addCourse(Enrollment course);

    void updateCourse(Enrollment course, Long studentId);
}
