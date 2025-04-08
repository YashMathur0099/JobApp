package com.jobapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobapp.model.JobAppModel;

@Repository
public interface JobRepo extends JpaRepository<JobAppModel, Integer> {

    
}
