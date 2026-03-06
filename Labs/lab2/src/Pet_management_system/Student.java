package Pet_management_system;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String getOccupation() {
        return "Student: " + major;
    }
}