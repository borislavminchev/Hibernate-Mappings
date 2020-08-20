package com.borislavmm.bootstrap;

import com.borislavmm.service.CourseService;
import com.borislavmm.service.InstructorDetailService;
import com.borislavmm.service.InstructorService;
import com.borislavmm.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;


@Component
@Transactional
public class BootstrapData implements CommandLineRunner {

    @Autowired
    private InstructorService instructorService;

    @Autowired
    private InstructorDetailService detailService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;


    @Override
    public void run(String... args) throws Exception {
//        Instructor instructor = new Instructor("bobby", "b", "abcd@kffk.com");
//        InstructorDetail detail = new InstructorDetail("a", "b");
//        instructorService.connectInstructorToDetail(instructor, detail);
//        instructorService.saveInstructor(instructor);
//        System.out.println("done");
//        Instructor instructor = instructorService.getInstructorById((long) 1);
//        Course c1 = new Course("x");
//        Course c2 = new Course("y");
//        Course c3 = new Course("c");
//
//        instructorService.connectInstructorToCourse(instructor, c1, c2, c3);
//
//
//        courseService.saveCourse(c1);
//        courseService.saveCourse(c2);
//        courseService.saveCourse(c3);

//        Course course = courseService.getCourseById(14);
//        courseRepository.delete(course);
//        System.out.println("done");

//        System.out.println(instructorService.getAllCoursesOfInstructor(1));

//        Instructor instructor = new Instructor("test", "test", "test");
//        InstructorDetail detail = new InstructorDetail("test", "test");
//        instructor.setInstructorDetail(detail);
//        instructorService.saveInstructor(instructor);
//        Course course = new Course("b");
//        Instructor instructor = instructorService.getInstructorById(1);
//        instructorService.connectInstructorToCourse(instructor, course);
//        course.addReview(new Review("wow1"));
//        course.addReview(new Review("wow2"));
//        course.addReview(new Review("wow3"));
//        courseService.saveCourse(course);


//        Course c1 = courseService.getCourseById(10);
//        Course c2 = courseService.getCourseById(11);
//        Student s1 = new Student("st1", "st", "s@s.com");
//        Student s2 = new Student("st2", "stt", "st@st.com");
//        Student s3 = new Student("st3", "sttt", "stt@stt.com");
//
//        s1.addCourse(c1);
//        s1.addCourse(c2);
//        s2.addCourse(c1);
//        s3.addCourse(c2);
//        s3.addCourse(c1);
//        studentService.saveStudent(s1);
//        studentService.saveStudent(s2);
//        studentService.saveStudent(s3);
//        System.out.printf("done");

    }
}
