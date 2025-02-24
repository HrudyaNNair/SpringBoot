package com.college.college;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String coursetaken;
    @Column
    private int marks;
    @ManyToOne
    @JoinColumn(name = "collegeId")
    @JsonBackReference
    private College college;

    public void setId(long id) {
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCoursetaken() {
        return coursetaken;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setCoursetaken(String coursetaken) {
        this.coursetaken = coursetaken;
    }
    public  College getCollege(){
        return college;
    }
    public void setCollege(College college){
        this.college = college;
    }
}
