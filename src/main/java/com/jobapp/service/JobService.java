

package com.jobapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobapp.model.JobAppModel;
import com.jobapp.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public List<JobAppModel> getAllJobs() {
        return repo.findAll();
    }

    public JobAppModel getJob(int postId) {
        return repo.findById(postId).orElse(new JobAppModel());
    }

    public void addJob(JobAppModel job) {
        repo.save(job);
    }

    public void updateJob(JobAppModel job) {
        repo.save(job);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }
    
}