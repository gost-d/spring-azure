package com.example.demo.student;

import java.util.ArrayList;
import java.util.List;

public class DAOstudent {

    public static List<Student> studentsList;

    public DAOstudent() {
        this.studentsList = new ArrayList();
    }

    public static List<Student> getStudentList(){
        return studentsList;
    }

    public static void addStudent(Student student) {
        studentsList.add(student);
    }
}
