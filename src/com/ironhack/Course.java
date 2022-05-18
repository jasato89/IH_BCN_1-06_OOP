package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private int id;
    private static int counterId = 1;
    private String courseName;
    private String teacherName;
    private int studentCount;
    private final int MAX_CAPACITY = 20;
    private static List<String> courses = new ArrayList<>();

    public Course(String courseName, String teacherName, int studentCount) {
        setId();
        setCourseName(courseName);
        setTeacherName(teacherName);
        setStudentCount(studentCount);
        courses.add(courseName);


    }
    
    public Course(String courseName) {
        setId();
        setCourseName(courseName);
        setStudentCount(0);
    }

    private void setId() {
        this.id = counterId;
        this.counterId++;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setStudentCount(int studentCount) {
        if (studentCount > MAX_CAPACITY) {
            System.out.println("ERROR");
        } else {

        this.studentCount = studentCount;
        }
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public static List<String> getMostPopularCourses() {
        return courses;
    }

}
