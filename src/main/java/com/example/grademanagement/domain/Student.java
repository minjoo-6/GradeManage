package com.example.grademanagement.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Student {
    @Id
    private int studentId;
    private String name;
}
