package com.college.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeController {
    @Autowired
    CollegeService service;

    @PostMapping("/Colleges")
    public ResponseEntity<College> createCollege(@RequestBody College college){
        College collegeCreated = service.createCollege(college);
        return new ResponseEntity<>(collegeCreated, HttpStatus.CREATED);
    }
    @PostMapping("/Colleges/{collegeId}")
    public ResponseEntity<Student> createStudent(@PathVariable Long collegeId, @RequestBody Student student){
        Student studentCreated = service.createStudent(collegeId,student);
        return new ResponseEntity<>(studentCreated,HttpStatus.CREATED);
    }

    @GetMapping("/colleges")
    public ResponseEntity<List<College>> getAllColleges(College college){
        List<College> colleges = service.getAllColleges();
        return new ResponseEntity<>(colleges,HttpStatus.OK);
    }
    @GetMapping("/colleges/{collegeId}/students")
    public ResponseEntity<List<Student>> getStudentsByCollegeName(@RequestParam String collegeName){
        List<Student> students = service.getStudentsByCollegeName(collegeName);
        return new ResponseEntity<>(students,HttpStatus.OK);
    }



}
