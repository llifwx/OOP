package task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1) Add person");
            System.out.println("2) Print all");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1" -> addPersonMenu(people, sc);
                case "2" -> printAll(people);
                case "0" -> {
                    System.out.println("Bye 👋");
                    return;
                }
                default -> System.out.println("Unknown option.");
            }
        }
    }

    private static void addPersonMenu(Set<Person> people, Scanner sc) {
        System.out.println("\nAdd: 1) Person  2) Student  3) Staff");
        System.out.print("Type: ");
        String type = sc.nextLine().trim();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        Person p;

        switch (type) {
            case "1" -> p = new Person(name, address);

            case "2" -> {
                System.out.print("Program: ");
                String program = sc.nextLine();

                System.out.print("Year (int): ");
                int year = Integer.parseInt(sc.nextLine().trim());

                System.out.print("Fee (double): ");
                double fee = Double.parseDouble(sc.nextLine().trim());

                p = new Student(name, address, program, year, fee);
            }

            case "3" -> {
                System.out.print("School: ");
                String school = sc.nextLine();

                System.out.print("Pay (double): ");
                double pay = Double.parseDouble(sc.nextLine().trim());

                p = new Staff(name, address, school, pay);
            }

            default -> {
                System.out.println("Wrong type.");
                return;
            }
        }

        boolean added = people.add(p);
        System.out.println(added ? "Added ✅" : "Not added (duplicate in HashSet) ⚠️");
    }

    private static void printAll(Set<Person> people) {
        if (people.isEmpty()) {
            System.out.println("No people yet.");
            return;
        }
        System.out.println("\n--- People ---");
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
