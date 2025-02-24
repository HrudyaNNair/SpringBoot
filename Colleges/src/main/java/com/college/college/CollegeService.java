package com.college.college;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CollegeService {
    @Autowired
    CollegeRepository collegeRepository;
    @Autowired
    StudentRepository studentRepository;

    public College createCollege(College college){
        return collegeRepository.save(college);
    }
    public Student createStudent(Long collegeId ,Student student){
        College college =  collegeRepository.findById((collegeId))
                .orElseThrow(()-> new EntityNotFoundException("College not found with id: " + collegeId));
        student.setCollege(college);
        return studentRepository.save(student);

    }
    public List<College> getAllColleges(){
        return collegeRepository.findAll();
    }
    public List<Student> getStudentsByCollegeName(String collegeName){
        return studentRepository.findByCollegeNameOrderByNameDesc(collegeName);
    }


}
