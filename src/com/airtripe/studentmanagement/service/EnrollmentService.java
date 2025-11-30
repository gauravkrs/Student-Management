package com.airtripe.studentmanagement.service;

import com.airtripe.studentmanagement.entity.Course;
import com.airtripe.studentmanagement.entity.Enrollment;
import com.airtripe.studentmanagement.entity.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EnrollmentService {

    private List<Enrollment> enrollments = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    private StudentService studentService;
    private CourseService courseService;

    public EnrollmentService(StudentService studentService, CourseService courseService){
        this.studentService = studentService;
        this.courseService = courseService;
    }

    // Enroll Student
    public void enrollStudent(){
        System.out.print("Enter Enrollment ID: ");
        int enrollmentId = scanner.nextInt();

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        Student student = studentService.getStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter Course ID: ");
        int courseId = scanner.nextInt();

        Course course = courseService.getCourseById(courseId);
        if (course == null) {
            System.out.println("Course not found!");
            return;
        }
        scanner.nextLine(); // consume leftover newline
        System.out.print("Enter Enrollment Status (active/completed/pending): ");
        String status = scanner.nextLine();
        Date enrollmentDate = new Date(); // current date

        Enrollment enrollment = new Enrollment(enrollmentId, student, course, enrollmentDate, status);

        enrollments.add(enrollment);

        System.out.println("Student successfully enrolled!");
    }

    // View Enrollments
    public void viewEnrollments(){
        if(enrollments.isEmpty()){
            System.out.println("No enrollments found!");
            return;
        }

        for (Enrollment e : enrollments){
            System.out.println("----------------------------------");
            System.out.println("Enrollment ID: " + e.getEnrollmentId());
            System.out.println("Student: " + e.getStudent().getName());
            System.out.println("Course: " + e.getCourse().getCourseName());
            System.out.println("Date: " + e.getEnrollmentDate());
            System.out.println("Status: " + e.getStatus());
        }
    }
}
