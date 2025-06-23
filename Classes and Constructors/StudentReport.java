import java.util.Scanner;

class Student {
    // Attributes
    private String name;
    private int rollNumber;
    private int marks;
    private String grade;

    // Constructor
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    // Method to calculate grade
    private String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Report:");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + grade);
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input  details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        // Create object
        Student student = new Student(name, rollNumber, marks);

        // Display details
        student.displayDetails();
        
        scanner.close();
    }
}
