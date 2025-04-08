
package com.jobapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jobapp.model.JobAppModel;
import com.jobapp.service.JobService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class JobAppController {

    @Autowired
    private JobService service;

    @GetMapping("getAllJobs")
    public List<JobAppModel> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("getJob/{postId}")
    public JobAppModel getJob(@PathVariable int postId) {
        return service.getJob(postId);
    }

    @PostMapping("addJob")
    public JobAppModel addJob(@RequestBody JobAppModel job) {
        service.addJob(job);
        return service.getJob(job.getPostId());
    }

    @PutMapping("updateJob")
    public JobAppModel updateJob(@RequestBody JobAppModel job) {
        service.updateJob(job);
        return service.getJob(job.getPostId());
    }

    @DeleteMapping("deleteJob/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "Deleted";
        
    }
}