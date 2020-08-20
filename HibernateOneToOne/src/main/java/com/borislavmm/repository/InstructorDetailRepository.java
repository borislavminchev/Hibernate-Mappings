package com.borislavmm.repository;

import com.borislavmm.entity.InstructorDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailRepository extends JpaRepository<InstructorDetail, Long> {
}
