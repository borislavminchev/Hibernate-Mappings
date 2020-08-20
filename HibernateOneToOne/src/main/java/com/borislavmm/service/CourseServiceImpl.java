package com.borislavmm.service;

import com.borislavmm.entity.Course;
import com.borislavmm.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course getCourseById(long id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courseRepository.delete(course);
    }

    @Override
    public void deleteCourseById(long id) {
        courseRepository.deleteById(id);
    }
}
