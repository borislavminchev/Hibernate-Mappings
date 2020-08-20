package com.borislavmm.service;

import com.borislavmm.entity.Course;
import com.borislavmm.entity.Instructor;
import com.borislavmm.entity.InstructorDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstructorService {

    Instructor getInstructorById(long id);

    List<Instructor> getAllInstructors();

    List<Course> getAllCoursesOfInstructor(long id);

    Instructor saveInstructor(Instructor instructor);

    void deleteInstructor(Instructor instructor);

    void deleteInstructorById(long id);

    void connectInstructorToCourse(Instructor instructor, Course... courses);

    void connectInstructorToDetail(Instructor instructor, InstructorDetail instructorDetail);
}
