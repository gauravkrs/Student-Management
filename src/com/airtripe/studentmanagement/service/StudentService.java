package com.airtripe.studentmanagement.service;

import com.airtripe.studentmanagement.entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add student
    public void addStudent(){
        System.out.print("Enter Student Id");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(id, name, age, email, course, grade);
        students.add(student);

        System.out.println("Student added successfully");
    }

    // View Students
    public void viewStudents(){
        if (students.isEmpty()) {
            System.out.println("No students available!");
            return;
        }

        for (Student s : students) {
            System.out.println("----------------------------");
            System.out.println("ID: " + s.getStudentId());
            System.out.println("Name: " + s.getName());
            System.out.println("Age: " + s.getAge());
            System.out.println("Email: " + s.getEmail());
            System.out.println("Course: " + s.getCourse());
            System.out.println("Grade: " + s.getGrade());
        }
    }

    // Update Students
    public void updateStudents(){
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Student s = getStudentById(id);
        if (s == null) {
            System.out.println("Student not found!");
            return;
        }
        System.out.print("Enter New Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Enter New Age: ");
        s.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter New Email: ");
        s.setEmail(scanner.nextLine());
        System.out.print("Enter New Course: ");
        s.setCourse(scanner.nextLine());
        System.out.print("Enter New Grade: ");
        s.setGrade(scanner.nextLine());

        System.out.println("Student updated successfully!");
    }

    // Delete Student
    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        Student s = getStudentById(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Search by ID
    public void searchById() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        Student s = getStudentById(id);
        if (s != null) {
            System.out.println("Student Found: " + s.getName());
        } else {
            System.out.println("Student not found!");
        }
    }

    // Search by Name
    public void searchByName() {
        System.out.print("Enter Student Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found, ID: " + s.getStudentId());
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public Student getStudentById(int id){
        for(Student s : students){
            if(s.getStudentId() == id){
                return s;
            }
        }
        return null;
    }
}
