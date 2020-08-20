package com.borislavmm.repository;

import com.borislavmm.entity.Course;
import com.borislavmm.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    @Query("from Course c where c.instructor.id = ?1")
    public List<Course> getAllCoursesOfInstructor(long id);
}
