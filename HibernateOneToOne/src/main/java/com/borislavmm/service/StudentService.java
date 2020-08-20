package com.borislavmm.service;

import com.borislavmm.entity.Review;
import com.borislavmm.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student getStudentById(long id);

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    void deleteStudent(Student student);

    void deleteStudentById(long id);
}
