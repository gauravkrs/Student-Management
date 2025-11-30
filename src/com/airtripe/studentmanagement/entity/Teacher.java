package com.airtripe.studentmanagement.entity;

public class Teacher extends User{
    private int teacherId;

    public void displayUserDetails() {
        super.displayInfo();
        System.out.println("Teacher ID: " + teacherId);
    }
}
