package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Madina", 3.5));
        students.add(new Student("Aruzhan", 3.9));
        students.add(new Student("Dias", 3.2));
        students.add(new Student("Alina", 3.7));

        System.out.println("Original list:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);
        System.out.println("\nSorted by GPA:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}