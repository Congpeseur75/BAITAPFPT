package faTrangning;

import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    private String codeStudent;
    private String name;
    private double averageScore;
    private int age;
    private String className;

    public Student() {
    }

    public Student(String codeStudent, String name, double averageScore, int age, String className) {
        this.codeStudent = codeStudent;
        this.name = name;
        this.averageScore = averageScore;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "codeStudent='" + codeStudent + '\'' +
                ", averageScore=" + averageScore +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }
}
