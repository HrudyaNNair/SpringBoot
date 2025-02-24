package com.college.college;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "College")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long collegeId;
    @Column
    private  String name;

    @OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Student> students;
    @Column
    public long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(long collegeId) {
        this.collegeId = collegeId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getCollegeName() {

        return name;
    }

    public void setCollegeName(String name) {

        this.name = name;
    }
}
