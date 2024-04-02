package com.example.grademanagement.repository;

import com.example.grademanagement.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository{
    private final JdbcTemplate jdbcTemplate;

    public List<Student> findAll(){
        String sql = "select * from student";
        return jdbcTemplate.query(sql, studentsRowMapper());
    }

    public void add(Student student) {
        String sql = "insert into student(student_id, name) values (?, ?)";
        jdbcTemplate.update(sql, student.getStudentId(), student.getName());
    }

    private RowMapper<Student> studentsRowMapper(){
        return (rs, rowNum) -> {
            Student student = new Student();
            student.setStudentId(rs.getInt("student_id"));
            student.setName(rs.getString("name"));
            return student;
        };
    }
}
