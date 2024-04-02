package com.example.grademanagement.repository;

import com.example.grademanagement.domain.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CourseRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<Course> findAllCourse(){
        String sql = "select * from course";
        return jdbcTemplate.query(sql, coursesRowMapper());
    }

    public void addCourse(Course course) {
        String sql = "insert into course(course_code, course_name) values (?,?)";
        jdbcTemplate.update(sql, course.getCourseCode(), course.getCourseName());
    }

    private RowMapper<Course> coursesRowMapper() {
        return (rs, rowNum) -> {
            Course course = new Course();
            course.setCourseCode(rs.getString("course_code"));
            course.setCourseName(rs.getString("course_name"));
            return course;
        };
    }
}
