package com.example.grademanagement.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Enrollment {
    @Id
    private int Id;
    private int studentId;
    private String courseCode;
    private String courseName;
    private float grade;
}
