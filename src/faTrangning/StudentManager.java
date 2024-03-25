package faTrangning;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
    }

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public boolean isScholarshipEligible(){
        return students.getLast().getAverageScore() >= 8;
    }
    public void updateStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student code you want to edit");
        String codeStudent = scanner.nextLine();
        for (Student student : students) {
            if (codeStudent.equals(student.getCodeStudent())){
                System.out.println("Select the information to edit");
                System.out.println("1. edit codeStudent");
                System.out.println("2. edit name");
                System.out.println("2. edit averageScore");
                System.out.println("3. edit age");
                System.out.println("4. edit className");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("import new codeStudent");
                        student.setCodeStudent(scanner.nextLine());
                        System.out.println("Student information has been corrected");
                        break;
                    case 2:
                        System.out.println("import new name");
                        student.setName(scanner.nextLine());
                        System.out.println("Student information has been corrected");
                        break;
                    case 3:
                        System.out.println("import new averageScore");
                        student.setAverageScore(scanner.nextDouble());
                        System.out.println("Student information has been corrected");
                        break;
                    case 4:
                        System.out.println("import new age");
                        student.setAge(scanner.nextInt());
                        System.out.println("Student information has been corrected");
                        break;
                    case 5:
                        System.out.println("import new className");
                        student.setClassName(scanner.nextLine());
                        System.out.println("Student information has been corrected");
                        break;
                    default:
                        System.out.println("finish");
                }
            }else {
                System.out.println("The student code you are looking for is not available");
            }
        }
    }
    public void deleteStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name you want to delete");
        String name = scanner.nextLine();
        for (Student student : students) {
            if (name.equals(student.getName())){
                students.remove(student);
                System.out.println("Deleted successfully");
            }
            else {
                System.out.println("Could not find the name you want to edit");
            }
        }
        displayAllStudents();
    }
    public void searchStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name you want to search for");
        String name = scanner.nextLine();
        for (Student student : students){
            if (name.equals(student.getName())){
                System.out.println(student);
            }
            else {
                System.out.println("The name you want to search for is not available");
            }
        }
    }
    public void arrangeStudent(){

    }
}
