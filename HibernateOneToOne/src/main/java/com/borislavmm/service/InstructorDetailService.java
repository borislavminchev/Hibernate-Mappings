package com.borislavmm.service;

import com.borislavmm.entity.Course;
import com.borislavmm.entity.InstructorDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstructorDetailService {

    InstructorDetail getInstructorDetailById(long id);

    List<InstructorDetail> getAllInstructorDetails();

    InstructorDetail saveInstructorDetail(InstructorDetail instructorDetail);

    void deleteInstructorDetail(InstructorDetail instructorDetail);

    void deleteInstructorDetailById(long id);
}
