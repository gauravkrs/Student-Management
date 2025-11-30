package com.airtripe.studentmanagement.entity;

import java.util.Date;

public class Enrollment{

    private int enrollmentId;
    private Student student;
    private Course course;
    private Date enrollmentDate;
    private String status;

    // Default constructor
    public Enrollment() {
        System.out.println("Enrollment object created!");
    }

    public Enrollment(int enrollmentId, Student student, Course course, Date enrollmentDate, String status) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    // Copy constructor
    public Enrollment(Enrollment enrollment) {
        this.enrollmentId = enrollment.enrollmentId;
        this.student = enrollment.student;
        this.course = enrollment.course;
        this.enrollmentDate = enrollment.enrollmentDate;
        this.status = enrollment.status;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
