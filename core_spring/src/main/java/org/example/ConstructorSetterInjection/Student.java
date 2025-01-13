package org.example.ConstructorSetterInjection;

public class Student {
    private int id;
    private String studentName;

    public Student(){};
    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }
    public void setId(int id) { this.id = id; }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public void displayInfo()
    {
        System.out.println("Student Name is " + studentName
                + " and Roll Number is " + id);
    }
}

