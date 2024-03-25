package faTrangning;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        StudentManager studentManager = new StudentManager(students);
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. isScholarshipEligible");
            System.out.println("4. updateStudent");
            System.out.println("5. deleteStudent");
            System.out.println("6. searchStudent");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String codeStudent;
                    while(true){
                        System.out.println("Enter codeStudent (must be 8 characters)");
                        String input = scanner.nextLine();
                        if (input.length() == 8){
                            codeStudent = input;
                            break;
                        }
                        else {
                            System.out.println("Invalid input. Please enter exactly 8 characters.");
                        }
                    }
                    System.out.println("Enter student name");
                    String name = scanner.nextLine();
                    double averageScore;
                    while (true) {
                        System.out.print("Enter student averageScore (0.0 - 10.0): ");
                        averageScore = Double.parseDouble(scanner.nextLine());
                        if (averageScore >= 0.0 && averageScore <= 10.0) {
                            break;
                        } else {
                            System.out.println("Invalid input. Average score must be between 0.0 and 10.0.");
                        }
                    }
                    int age;
                    while (true){
                        System.out.print("Enter student age:");
                        int input = Integer.parseInt(scanner.nextLine());
                        if (input >= 18){
                            age = input;
                            break;
                        }
                        else {
                            System.out.println("Invalid age. Age must be 18 or older.");
                        }
                    }
                    String className;
                    while (true){
                        System.out.println("Enter student className");
                        String input = scanner.nextLine();
                        if (input.startsWith("A") || input.startsWith("C") ){
                            className = input;
                            break;
                        }
                        else {
                            System.out.println("Invalid input. Class name must start with 'A' or 'C'.");
                        }
                    }
                    Student student = new Student(codeStudent,name, averageScore, age, className);
                    students.add(student);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    studentManager.displayAllStudents();
                    break;
                case 3:
                    if (studentManager.isScholarshipEligible()){
                        System.out.println("college Student");
                    }
                    else {
                        System.out.println("student do not get scholarship");
                    }
                    break;
                case 4:
                    studentManager.updateStudent();
                    break;
                case 5:
                    studentManager.deleteStudent();
                    break;
                case 6:
                    studentManager.searchStudent();
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
