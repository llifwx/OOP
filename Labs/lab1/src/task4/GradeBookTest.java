package task4;

import Practice2.Student;
import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {

        Course course = new Course(
                "CS101 OOP",
                "Introduction to Object Oriented Programming",
                5,
                "None"
        );

        GradeBook gradeBook = new GradeBook(course);

        Scanner sc = new Scanner(System.in);

        gradeBook.displayMessage();

        System.out.println("\nEnter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent name:");
            String name = sc.nextLine();

            System.out.println("Student ID:");
            String id = sc.nextLine();

            Student student = new Student(name, id);

            System.out.println("Grade (0-100):");
            int grade = sc.nextInt();
            sc.nextLine();

            gradeBook.addRecord(student, grade);
        }

        System.out.println();
        gradeBook.displayGradeReport();
    }
}

