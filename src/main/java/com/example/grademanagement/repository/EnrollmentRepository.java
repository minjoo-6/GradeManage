package com.example.grademanagement.repository;

import com.example.grademanagement.domain.Enrollment;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EnrollmentRepository {
    private final JdbcTemplate jdbcTemplate;

    public List<Enrollment> findAllEnroll(){
        String sql = "select * from enrollment";
        return jdbcTemplate.query(sql, EnrollRowMapper());
    }
    public List<Enrollment> findByIdEnroll(Long studentId) {
        String sql = "Select * from enrollment where student_id = ? ";
        return jdbcTemplate.query(sql, new Object[]{studentId}, EnrollRowMapper());
    }

    public void addEnroll(Enrollment enrollment) {
        String sql = "insert into enrollment(id, student_id, course_code, course_name, grade) values (?,?,?,?,?)";
        jdbcTemplate.update(sql, enrollment.getId(), enrollment.getStudentId(), enrollment.getCourseCode(), enrollment.getCourseName(), enrollment.getGrade());
    }

    public List<Enrollment> findGradeByCourse(String courseName){
        String sql = "select * from enrollment where course_name = ?";
        return jdbcTemplate.query(sql, EnrollRowMapper(), courseName);
    }

    public void updateGrade(Enrollment enrollment) {
        String sql = "update enrollment set grade = ? where course_name = ? and student_id = ?";
        jdbcTemplate.update(sql, enrollment.getGrade(), enrollment.getCourseName(), enrollment.getStudentId());
    }

    private RowMapper<Enrollment> EnrollRowMapper() {
        return (rs, rowNum) -> {
            Enrollment enrollment = new Enrollment();
            enrollment.setId(rs.getInt("id"));
            enrollment.setStudentId(rs.getInt("student_id"));
            enrollment.setCourseCode(rs.getString("course_code"));
            enrollment.setCourseName(rs.getString("course_name"));
            enrollment.setGrade(rs.getFloat("grade"));
            return enrollment;
        };
    }


}
