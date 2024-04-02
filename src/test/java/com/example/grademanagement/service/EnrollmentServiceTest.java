package com.example.grademanagement.service;

import com.example.grademanagement.domain.Enrollment;
import com.example.grademanagement.repository.LessionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EnrollmentServiceTest {
    private CourseService courseService;

    @BeforeEach
    void setUp() {
        LessionRepository lessionRepository = new LessionRepository() {
            List<Enrollment> courses = new ArrayList<>();
            @Override
            public List<Enrollment> getAllCourses() {
                return null;
            }

            @Override
            public List<Enrollment> getCourseById(Long studentId) {
                return null;
            }

            @Override
            public List<Enrollment> getGradeByCourse(String courseName) {
                return null;
            }

            @Override
            public void addCourse(Enrollment course) {

            }

            @Override
            public void updateCourse(Enrollment course, Long studentId) {

            }
        };
    }

    @Test
    void getAllCoursesTest() {

    }

}