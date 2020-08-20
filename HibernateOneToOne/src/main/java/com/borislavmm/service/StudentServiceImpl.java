package com.borislavmm.service;

import com.borislavmm.entity.Student;
import com.borislavmm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student getStudentById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(Student student) {
        repository.delete(student);
    }

    @Override
    public void deleteStudentById(long id) {
        repository.deleteById(id);
    }
}
