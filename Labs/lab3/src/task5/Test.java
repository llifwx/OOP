package task5;

public class Test {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
                new Chocolate(45.5, "Twix"),
                new Chocolate(20.0, "Mars"),
                new Chocolate(60.3, "Snickers"),
                new Chocolate(35.7, "Bounty")
        };

        Time[] times = {
                new Time(10, 20, 30),
                new Time(8, 15, 10),
                new Time(23, 0, 5),
                new Time(10, 20, 29)
        };

        Employee[] employees = {
                new Employee("Alice", 50000),
                new Employee("Bob", 70000),
                new Employee("Charlie", 45000),
                new Employee("Diana", 70000)
        };

        System.out.println("=== Chocolates before Bubble Sort ===");
        Sort.printArray(chocolates);
        Sort.bubbleSort(chocolates);
        System.out.println("=== Chocolates after Bubble Sort ===");
        Sort.printArray(chocolates);

        System.out.println("=== Times before Merge Sort ===");
        Sort.printArray(times);
        Sort.mergeSort(times);
        System.out.println("=== Times after Merge Sort ===");
        Sort.printArray(times);

        System.out.println("=== Employees before Bubble Sort ===");
        Sort.printArray(employees);
        Sort.bubbleSort(employees);
        System.out.println("=== Employees after Bubble Sort ===");
        Sort.printArray(employees);
    }
}