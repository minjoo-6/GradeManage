package com.example.grademanagement.service;

import com.example.grademanagement.domain.Enrollment;
import com.example.grademanagement.repository.EnrollmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;

    public List<Enrollment> findAllEnroll() {
        List<Enrollment> result = enrollmentRepository.findAllEnroll();
        return result;
    }

    public List<Enrollment> findByIdEnroll(Long studentId) {
        return enrollmentRepository.findByIdEnroll(studentId);
    }

    public List<Enrollment> findGradeByCourse(String courseName) {
        return enrollmentRepository.findGradeByCourse(courseName);
    }

    public void addEnroll(Enrollment enrollment) {
        enrollmentRepository.addEnroll(enrollment);
    }

    public void updateGrade(Enrollment enrollment) {
        enrollmentRepository.updateGrade(enrollment);
    }
}


