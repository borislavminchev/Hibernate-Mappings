package com.borislavmm.service;

import com.borislavmm.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    Course getCourseById(long id);

    List<Course> getAllCourses();

    Course saveCourse(Course course);

    void deleteCourse(Course course);

    void deleteCourseById(long id);
}
