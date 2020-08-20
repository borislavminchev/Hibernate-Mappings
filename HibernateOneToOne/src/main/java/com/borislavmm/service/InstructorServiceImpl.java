package com.borislavmm.service;

import com.borislavmm.entity.Course;
import com.borislavmm.entity.Instructor;
import com.borislavmm.entity.InstructorDetail;
import com.borislavmm.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorServiceImpl implements InstructorService {
    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public Instructor getInstructorById(long id) {
        return instructorRepository.findById(id).get();
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    public List<Course> getAllCoursesOfInstructor(long id) {
        return instructorRepository.getAllCoursesOfInstructor(id);
    }

    @Override
    public Instructor saveInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public void deleteInstructor(Instructor instructor) {
        instructorRepository.delete(instructor);
    }

    @Override
    public void deleteInstructorById(long id) {
        instructorRepository.deleteById(id);
    }

    @Override
    public void connectInstructorToCourse(Instructor instructor, Course... courses) {
        instructor.addAllCourses(List.of(courses));
    }

    @Override
    public void connectInstructorToDetail(Instructor instructor, InstructorDetail instructorDetail) {
        instructor.setInstructorDetail(instructorDetail);
    }
}
