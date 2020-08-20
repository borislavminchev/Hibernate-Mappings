package com.borislavmm.service;

import com.borislavmm.entity.InstructorDetail;
import com.borislavmm.repository.InstructorDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorDetailServiceImpl implements InstructorDetailService {

    @Autowired
    InstructorDetailRepository repository;

    @Override
    public InstructorDetail getInstructorDetailById(long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<InstructorDetail> getAllInstructorDetails() {
        return repository.findAll();
    }

    @Override
    public InstructorDetail saveInstructorDetail(InstructorDetail instructorDetail) {
        return repository.save(instructorDetail);
    }

    @Override
    public void deleteInstructorDetail(InstructorDetail instructorDetail) {
        repository.delete(instructorDetail);
    }

    @Override
    public void deleteInstructorDetailById(long id) {
        repository.deleteById(id);
    }
}
