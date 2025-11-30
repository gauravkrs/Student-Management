package com.airtripe.studentmanagement.service;

import com.airtripe.studentmanagement.entity.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseService {

    private List<Course> courses = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add Course
    public void addCourse(){
        System.out.print("Enter Course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Course Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course description");
        String description = scanner.nextLine();

        System.out.print("Enter Course Duration: ");
        int duration = scanner.nextInt();
        scanner.nextLine();

        Course course = new Course(id, name, description, duration);
    }

    // View All Courses
    public void viewCourses(){
        if(courses.isEmpty()){
            System.out.println("No courses available");
            return;
        }

        for(Course c : courses){
            System.out.println("-------------------------");
            System.out.println("ID: " + c.getCourseId());
            System.out.println("Name: " + c.getCourseName());
            System.out.println("Name: " + c.getDescription());
            System.out.println("Duration: " + c.getDuration());
        }
    }

    // Update Course
    public void updateCourse(){
        System.out.print("Enter course id to update");
        int id = scanner.nextInt();
        scanner.nextLine();

        Course c = getCourseById(id);

        if (c == null) {
            System.out.println("Course not found!");
            return;
        }
        System.out.print("Enter New Name: ");
        c.setCourseName(scanner.nextLine());
        System.out.print("Enter New Description: ");
        c.setCourseName(scanner.nextLine());
        System.out.print("Enter New Duration: ");
        c.setDuration(Integer.parseInt(scanner.nextLine()));

        System.out.println("Course updated successfully!");
    }

    // Delete Course
    public void deleteCourse(){
        System.out.print("Enter Course ID to delete: ");
        int id = scanner.nextInt();

        Course c =getCourseById(id);

        if (c != null) {
            courses.remove(c);
            System.out.println("Course deleted successfully!");
        } else {
            System.out.println("Course not found!");
        }
    }

    // Search by id (used in EnrollmentService)
    public Course getCourseById(int id){
        for (Course c : courses) {
            if (c.getCourseId() == id)
                return c;
        }
        return null;
    }
}
