package com.airtripe.studentmanagement.entity;

public class Student extends User {
    /*--------------student data fields----------------*/
    private int studentId;
    private String course;
    private String grade;

    // Default constructor
    public Student(){
        System.out.println("Default constructor called");
    }

    @Override
    public void displayUserDetails() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + ", Course: " + course + ", Grade: " + grade);
    }

    // Parameterized constructor
    public Student(int studentId, String name, int age, String email, String course, String grade){
        super(name, age, email);
        this.studentId = studentId;
        this.course = course;
        this.grade = grade;
    }

    // Copy constructor
    public Student(Student studentDetails){
        super(studentDetails.getName(), studentDetails.getAge(), studentDetails.getEmail());
        this.studentId = studentDetails.studentId;
        this.course = studentDetails.course;
        this.grade = studentDetails.grade;
    }

    /*--------------Getters and Setters----------------*/
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
