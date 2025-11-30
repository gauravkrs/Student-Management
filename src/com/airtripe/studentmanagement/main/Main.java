package com.airtripe.studentmanagement.main;

import com.airtripe.studentmanagement.service.CourseService;
import com.airtripe.studentmanagement.service.EnrollmentService;
import com.airtripe.studentmanagement.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService(studentService, courseService);

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student by ID");
            System.out.println("6. Search Student by Name");
            System.out.println("7. Add Course");
            System.out.println("8. View Courses");
            System.out.println("9. Update Course");
            System.out.println("10. Delete Course");
            System.out.println("11. Enroll Student");
            System.out.println("12. View Enrollments");
            System.out.println("13. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.viewStudents();
                    break;
                case 3:
                    studentService.updateStudents();
                    break;
                case 4:
                    studentService.deleteStudent();
                    break;
                case 5:
                    studentService.searchById();
                    break;
                case 6:
                    studentService.searchByName();
                    break;
                case 7:
                    courseService.addCourse();
                    break;
                case 8:
                    courseService.viewCourses();
                    break;
                case 9:
                    courseService.updateCourse();
                    break;
                case 10:
                    courseService.deleteCourse();
                    break;
                case 11:
                    enrollmentService.enrollStudent();
                    break;
                case 12:
                    enrollmentService.viewEnrollments();
                    break;
                case 13:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}