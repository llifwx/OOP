package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 50000, new Date(120, 5, 10), "INS001");
        Employee e2 = new Employee("Bob", 60000, new Date(119, 3, 20), "INS002");
        Employee e3 = new Employee("Charlie", 45000, new Date(121, 7, 15), "INS003");

        Manager m1 = new Manager("Diana", 80000, new Date(118, 1, 1), "INS010", 10000);
        Manager m2 = new Manager("Edward", 80000, new Date(117, 2, 5), "INS011", 15000);

        m1.addEmployeeToTeam(e1);
        m1.addEmployeeToTeam(e2);

        m2.addEmployeeToTeam(e3);

        System.out.println("=== toString() test ===");
        System.out.println(e1);
        System.out.println(m1);

        System.out.println("\n=== equals() test ===");
        Employee e1Copy = new Employee("Alice", 50000, new Date(120, 5, 10), "INS001");
        System.out.println("e1 equals e1Copy: " + e1.equals(e1Copy));

        Manager m1Copy = m1.clone();
        System.out.println("m1 equals m1Copy: " + m1.equals(m1Copy));

        System.out.println("\n=== clone() test ===");
        Employee clonedEmployee = e2.clone();
        Manager clonedManager = m1.clone();
        System.out.println("Original employee: " + e2);
        System.out.println("Cloned employee:   " + clonedEmployee);
        System.out.println("Original manager:  " + m1);
        System.out.println("Cloned manager:    " + clonedManager);

        System.out.println("\n=== Comparable test (salary, then bonus for managers) ===");
        List<Employee> staff = new ArrayList<>();
        staff.add(e1);
        staff.add(e2);
        staff.add(e3);
        staff.add(m1);
        staff.add(m2);

        Collections.sort(staff);
        for (Employee emp : staff) {
            System.out.println(emp);
        }

        System.out.println("\n=== Sort by name ===");
        Collections.sort(staff, new NameComparator());
        for (Employee emp : staff) {
            System.out.println(emp);
        }

        System.out.println("\n=== Sort by hire date ===");
        Collections.sort(staff, new HireDateComparator());
        for (Employee emp : staff) {
            System.out.println(emp);
        }
    }
}